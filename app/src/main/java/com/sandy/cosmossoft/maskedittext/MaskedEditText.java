package com.sandy.cosmossoft.maskedittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.sandy.cosmossoft.C0330R;

public class MaskedEditText extends AppCompatEditText implements TextWatcher {
    public static final String SPACE = " ";
    private String allowedChars;
    private char charRepresentation;
    private char[] charsInMask;
    private String deniedChars;
    private boolean editingAfter;
    private boolean editingBefore;
    private boolean editingOnChanged;
    /* access modifiers changed from: private */
    public OnFocusChangeListener focusChangeListener;
    private boolean ignore;
    private boolean initialized;
    private int lastValidMaskPosition;
    private String mask;
    private int[] maskToRaw;
    protected int maxRawLength;
    /* access modifiers changed from: private */
    public RawText rawText;
    private int[] rawToMask;
    private int selection;
    /* access modifiers changed from: private */
    public boolean selectionChanged;

    public MaskedEditText(Context context) {
        super(context);
        if (!isInEditMode()) {
            init();
        }
    }

    public MaskedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init();
        }
        TypedArray attributes = context.obtainStyledAttributes(attrs, C0330R.styleable.MaskedEditText);
        this.mask = attributes.getString(3);
        this.allowedChars = attributes.getString(0);
        this.deniedChars = attributes.getString(2);
        String representation = attributes.getString(1);
        if (representation == null) {
            this.charRepresentation = '#';
        } else {
            this.charRepresentation = representation.charAt(0);
        }
        if (!isInEditMode()) {
            cleanUp();
        }
    }

    public void setOnFocusChangeListener(OnFocusChangeListener listener) {
        this.focusChangeListener = listener;
    }

    private void cleanUp() {
        this.initialized = false;
        generatePositionArrays();
        this.rawText = new RawText();
        this.selection = this.rawToMask[0];
        this.editingBefore = true;
        this.editingOnChanged = true;
        this.editingAfter = true;
        if (hasHint()) {
            setText((CharSequence) null);
        } else {
            setText(this.mask.replace(this.charRepresentation, ' '));
        }
        this.editingBefore = false;
        this.editingOnChanged = false;
        this.editingAfter = false;
        this.maxRawLength = this.maskToRaw[previousValidPosition(this.mask.length() - 1)] + 1;
        this.lastValidMaskPosition = findLastValidMaskPosition();
        this.initialized = true;
        super.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (MaskedEditText.this.focusChangeListener != null) {
                    MaskedEditText.this.focusChangeListener.onFocusChange(v, hasFocus);
                }
                if (!MaskedEditText.this.hasFocus()) {
                    return;
                }
                if (MaskedEditText.this.rawText.length() > 0 || !MaskedEditText.this.hasHint()) {
                    boolean unused = MaskedEditText.this.selectionChanged = false;
                    MaskedEditText maskedEditText = MaskedEditText.this;
                    maskedEditText.setSelection(maskedEditText.lastValidPosition());
                }
            }
        });
    }

    private int findLastValidMaskPosition() {
        for (int i = this.maskToRaw.length - 1; i >= 0; i--) {
            if (this.maskToRaw[i] != -1) {
                return i;
            }
        }
        throw new RuntimeException("Mask contains only the representation char");
    }

    /* access modifiers changed from: private */
    public boolean hasHint() {
        return getHint() != null;
    }

    public MaskedEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (!isInEditMode()) {
            init();
        }
    }

    public void setMask(String mask2) {
        this.mask = mask2;
        cleanUp();
    }

    public String getMask() {
        return this.mask;
    }

    public void setCharRepresentation(char charRepresentation2) {
        this.charRepresentation = charRepresentation2;
        cleanUp();
    }

    public char getCharRepresentation() {
        return this.charRepresentation;
    }

    private void generatePositionArrays() {
        int[] aux = new int[this.mask.length()];
        this.maskToRaw = new int[this.mask.length()];
        String charsInMaskAux = "";
        int charIndex = 0;
        for (int i = 0; i < this.mask.length(); i++) {
            char currentChar = this.mask.charAt(i);
            if (currentChar == this.charRepresentation) {
                aux[charIndex] = i;
                this.maskToRaw[i] = charIndex;
                charIndex++;
            } else {
                String charAsString = Character.toString(currentChar);
                if (!charsInMaskAux.contains(charAsString)) {
                    charsInMaskAux = charsInMaskAux.concat(charAsString);
                }
                this.maskToRaw[i] = -1;
            }
        }
        if (charsInMaskAux.indexOf(32) < 0) {
            charsInMaskAux = charsInMaskAux + SPACE;
        }
        this.charsInMask = charsInMaskAux.toCharArray();
        this.rawToMask = new int[charIndex];
        for (int i2 = 0; i2 < charIndex; i2++) {
            this.rawToMask[i2] = aux[i2];
        }
    }

    private void init() {
        addTextChangedListener(this);
    }

    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (!this.editingBefore) {
            this.editingBefore = true;
            if (start > this.lastValidMaskPosition) {
                this.ignore = true;
            }
            int rangeStart = start;
            if (after == 0) {
                rangeStart = erasingStart(start);
            }
            Range range = calculateRange(rangeStart, start + count);
            if (range.getStart() != -1) {
                this.rawText.subtractFromString(range);
            }
            if (count > 0) {
                this.selection = previousValidPosition(start);
            }
        }
    }

    private int erasingStart(int start) {
        while (start > 0 && this.maskToRaw[start] == -1) {
            start--;
        }
        return start;
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        int currentPosition;
        if (!this.editingOnChanged && this.editingBefore) {
            this.editingOnChanged = true;
            if (!this.ignore && count > 0) {
                int startingPosition = this.maskToRaw[nextValidPosition(start)];
                int count2 = this.rawText.addToString(clear(s.subSequence(start, start + count).toString()), startingPosition, this.maxRawLength);
                if (this.initialized) {
                    int i = startingPosition + count2;
                    int[] iArr = this.rawToMask;
                    if (i < iArr.length) {
                        currentPosition = iArr[startingPosition + count2];
                    } else {
                        currentPosition = 1 + this.lastValidMaskPosition;
                    }
                    this.selection = nextValidPosition(currentPosition);
                }
            }
        }
    }

    public void afterTextChanged(Editable s) {
        if (!this.editingAfter && this.editingBefore && this.editingOnChanged) {
            this.editingAfter = true;
            if (this.rawText.length() != 0 || !hasHint()) {
                setText(makeMaskedText());
            } else {
                this.selection = 0;
                setText((CharSequence) null);
            }
            this.selectionChanged = false;
            setSelection(this.selection);
            this.editingBefore = false;
            this.editingOnChanged = false;
            this.editingAfter = false;
            this.ignore = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.initialized) {
            if (!this.selectionChanged) {
                if (this.rawText.length() != 0 || !hasHint()) {
                    selStart = fixSelection(selStart);
                    selEnd = fixSelection(selEnd);
                } else {
                    selStart = 0;
                    selEnd = 0;
                }
                setSelection(selStart, selEnd);
                this.selectionChanged = true;
            } else if ((!hasHint() || this.rawText.length() != 0) && selStart > this.rawText.length() - 1) {
                setSelection(fixSelection(selStart), fixSelection(selEnd));
            }
        }
        super.onSelectionChanged(selStart, selEnd);
    }

    private int fixSelection(int selection2) {
        if (selection2 > lastValidPosition()) {
            return lastValidPosition();
        }
        return nextValidPosition(selection2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int nextValidPosition(int r4) {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.lastValidMaskPosition
            if (r4 >= r0) goto L_0x000e
            int[] r1 = r3.maskToRaw
            r1 = r1[r4]
            r2 = -1
            if (r1 != r2) goto L_0x000e
            int r4 = r4 + 1
            goto L_0x0000
        L_0x000e:
            if (r4 <= r0) goto L_0x0013
            int r0 = r0 + 1
            return r0
        L_0x0013:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.maskedittext.MaskedEditText.nextValidPosition(int):int");
    }

    private int previousValidPosition(int currentPosition) {
        while (currentPosition >= 0 && this.maskToRaw[currentPosition] == -1) {
            currentPosition--;
            if (currentPosition < 0) {
                return nextValidPosition(0);
            }
        }
        return currentPosition;
    }

    /* access modifiers changed from: private */
    public int lastValidPosition() {
        if (this.rawText.length() == this.maxRawLength) {
            return this.rawToMask[this.rawText.length() - 1] + 1;
        }
        return nextValidPosition(this.rawToMask[this.rawText.length()]);
    }

    private String makeMaskedText() {
        char[] maskedText = this.mask.replace(this.charRepresentation, ' ').toCharArray();
        for (int i = 0; i < this.rawToMask.length; i++) {
            if (i < this.rawText.length()) {
                maskedText[this.rawToMask[i]] = this.rawText.charAt(i);
            } else {
                maskedText[this.rawToMask[i]] = ' ';
            }
        }
        return new String(maskedText);
    }

    private Range calculateRange(int start, int end) {
        int newStart;
        Range range = new Range();
        int i = start;
        while (i <= end && i < this.mask.length()) {
            if (this.maskToRaw[i] != -1) {
                if (range.getStart() == -1) {
                    range.setStart(this.maskToRaw[i]);
                }
                range.setEnd(this.maskToRaw[i]);
            }
            i++;
        }
        if (end == this.mask.length()) {
            range.setEnd(this.rawText.length());
        }
        if (range.getStart() == range.getEnd() && start < end && (newStart = previousValidPosition(range.getStart() - 1)) < range.getStart()) {
            range.setStart(newStart);
        }
        return range;
    }

    private String clear(String string) {
        String str = this.deniedChars;
        if (str != null) {
            for (char c : str.toCharArray()) {
                string = string.replace(Character.toString(c), "");
            }
        }
        if (this.allowedChars == null) {
            return string;
        }
        StringBuilder builder = new StringBuilder(string.length());
        char[] charArray = string.toCharArray();
        for (char c2 : string.toCharArray()) {
            if (this.allowedChars.contains(String.valueOf(c2))) {
                builder.append(c2);
            }
        }
        return builder.toString();
    }
}
