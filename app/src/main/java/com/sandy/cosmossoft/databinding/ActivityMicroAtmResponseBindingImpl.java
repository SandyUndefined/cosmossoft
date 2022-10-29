package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.data.model.MicroAtmModel;

public class ActivityMicroAtmResponseBindingImpl extends ActivityMicroAtmResponseBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView1;
    /* access modifiers changed from: private */
    public final TextView mboundView10;
    private InverseBindingListener mboundView10androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView11;
    private InverseBindingListener mboundView11androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView12;
    private InverseBindingListener mboundView12androidTextAttrChanged;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView3;
    private InverseBindingListener mboundView3androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView4;
    private InverseBindingListener mboundView4androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView5;
    private InverseBindingListener mboundView5androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView6;
    private InverseBindingListener mboundView6androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView7;
    private InverseBindingListener mboundView7androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView8;
    private InverseBindingListener mboundView8androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView9;
    private InverseBindingListener mboundView9androidTextAttrChanged;

    public ActivityMicroAtmResponseBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    private ActivityMicroAtmResponseBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView1);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setMessage(callbackArg_0);
                }
            }
        };
        this.mboundView10androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView10);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setCardNumber(callbackArg_0);
                }
            }
        };
        this.mboundView11androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView11);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setTerminalId(callbackArg_0);
                }
            }
        };
        this.mboundView12androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView12);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setBankName(callbackArg_0);
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView2);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setResponse(callbackArg_0);
                }
            }
        };
        this.mboundView3androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView3);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setTransAmount(callbackArg_0);
                }
            }
        };
        this.mboundView4androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView4);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setBalAmount(callbackArg_0);
                }
            }
        };
        this.mboundView5androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView5);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setBalRrn(callbackArg_0);
                }
            }
        };
        this.mboundView6androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView6);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setTxnId(callbackArg_0);
                }
            }
        };
        this.mboundView7androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView7);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setTransType(callbackArg_0);
                }
            }
        };
        this.mboundView8androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView8);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setType(callbackArg_0);
                }
            }
        };
        this.mboundView9androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMicroAtmResponseBindingImpl.this.mboundView9);
                MicroAtmModel microAtmData = ActivityMicroAtmResponseBindingImpl.this.mMicroAtmData;
                if (microAtmData != null) {
                    microAtmData.setCardType(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        TextView textView = bindings[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = bindings[10];
        this.mboundView10 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = bindings[11];
        this.mboundView11 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = bindings[12];
        this.mboundView12 = textView4;
        textView4.setTag((Object) null);
        TextView textView5 = bindings[2];
        this.mboundView2 = textView5;
        textView5.setTag((Object) null);
        TextView textView6 = bindings[3];
        this.mboundView3 = textView6;
        textView6.setTag((Object) null);
        TextView textView7 = bindings[4];
        this.mboundView4 = textView7;
        textView7.setTag((Object) null);
        TextView textView8 = bindings[5];
        this.mboundView5 = textView8;
        textView8.setTag((Object) null);
        TextView textView9 = bindings[6];
        this.mboundView6 = textView9;
        textView9.setTag((Object) null);
        TextView textView10 = bindings[7];
        this.mboundView7 = textView10;
        textView10.setTag((Object) null);
        TextView textView11 = bindings[8];
        this.mboundView8 = textView11;
        textView11.setTag((Object) null);
        TextView textView12 = bindings[9];
        this.mboundView9 = textView12;
        textView12.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int variableId, Object variable) {
        if (24 != variableId) {
            return false;
        }
        setMicroAtmData((MicroAtmModel) variable);
        return true;
    }

    public void setMicroAtmData(MicroAtmModel MicroAtmData) {
        this.mMicroAtmData = MicroAtmData;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(24);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r15 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r0 = r15.getTransAmount();
        r6 = r15.getTerminalId();
        r7 = r15.getCardNumber();
        r8 = r15.getBankName();
        r9 = r15.getMessage();
        r10 = r15.getBalAmount();
        r11 = r15.getCardType();
        r12 = r15.getBalRrn();
        r13 = r15.getType();
        r14 = r15.getTransType();
        r22 = r15.getResponse();
        r23 = r15.getTxnId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r22 = null;
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        if ((r2 & 3) == 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView1, r9);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView10, r7);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView11, r6);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView12, r8);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView2, r22);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView3, r0);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView4, r10);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView5, r12);
        r18 = r0;
        r0 = r23;
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView6, r0);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView7, r14);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView8, r13);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        r18 = r0;
        r5 = r22;
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b7, code lost:
        if ((r2 & 2) == 0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        r16 = r0;
        r17 = null;
        r17 = null;
        r17 = null;
        r19 = r2;
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView1androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView10androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView11, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView11androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView12androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView2androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView3androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView4androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView5androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView6androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView7androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView8androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView9androidTextAttrChanged);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x011f, code lost:
        r16 = r0;
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = null;
        r6 = null;
        r7 = null;
        r8 = null;
        r9 = null;
        r10 = null;
        r11 = null;
        r12 = null;
        r13 = null;
        r14 = null;
        r15 = r1.mMicroAtmData;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r2 & 3) == 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r24 = this;
            r1 = r24
            r2 = 0
            monitor-enter(r24)
            long r4 = r1.mDirtyFlags     // Catch:{ all -> 0x0128 }
            r2 = r4
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x0124 }
            monitor-exit(r24)     // Catch:{ all -> 0x0124 }
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.sandy.cosmossoft.data.model.MicroAtmModel r15 = r1.mMicroAtmData
            r16 = 0
            r17 = 0
            r18 = 3
            long r20 = r2 & r18
            int r20 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x005c
            if (r15 == 0) goto L_0x005c
            java.lang.String r0 = r15.getTransAmount()
            java.lang.String r6 = r15.getTerminalId()
            java.lang.String r7 = r15.getCardNumber()
            java.lang.String r8 = r15.getBankName()
            java.lang.String r9 = r15.getMessage()
            java.lang.String r10 = r15.getBalAmount()
            java.lang.String r11 = r15.getCardType()
            java.lang.String r12 = r15.getBalRrn()
            java.lang.String r13 = r15.getType()
            java.lang.String r14 = r15.getTransType()
            java.lang.String r16 = r15.getResponse()
            java.lang.String r17 = r15.getTxnId()
            r22 = r16
            r23 = r17
            goto L_0x0060
        L_0x005c:
            r22 = r16
            r23 = r17
        L_0x0060:
            long r16 = r2 & r18
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x00a9
            android.widget.TextView r4 = r1.mboundView1
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r9)
            android.widget.TextView r4 = r1.mboundView10
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r7)
            android.widget.TextView r4 = r1.mboundView11
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r6)
            android.widget.TextView r4 = r1.mboundView12
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r8)
            android.widget.TextView r4 = r1.mboundView2
            r5 = r22
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r5)
            android.widget.TextView r4 = r1.mboundView3
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r0)
            android.widget.TextView r4 = r1.mboundView4
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r10)
            android.widget.TextView r4 = r1.mboundView5
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r12)
            android.widget.TextView r4 = r1.mboundView6
            r18 = r0
            r0 = r23
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r0)
            android.widget.TextView r4 = r1.mboundView7
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r14)
            android.widget.TextView r4 = r1.mboundView8
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r13)
            android.widget.TextView r4 = r1.mboundView9
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r11)
            goto L_0x00af
        L_0x00a9:
            r18 = r0
            r5 = r22
            r0 = r23
        L_0x00af:
            r19 = 2
            long r19 = r2 & r19
            r16 = 0
            int r4 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x011f
            android.widget.TextView r4 = r1.mboundView1
            r16 = r0
            r0 = 0
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r17
            r19 = r2
            androidx.databinding.InverseBindingListener r2 = r1.mboundView1androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r4, r0, r0, r0, r2)
            android.widget.TextView r2 = r1.mboundView10
            androidx.databinding.InverseBindingListener r3 = r1.mboundView10androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView11
            androidx.databinding.InverseBindingListener r3 = r1.mboundView11androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView12
            androidx.databinding.InverseBindingListener r3 = r1.mboundView12androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView2
            androidx.databinding.InverseBindingListener r3 = r1.mboundView2androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView3
            androidx.databinding.InverseBindingListener r3 = r1.mboundView3androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView4
            androidx.databinding.InverseBindingListener r3 = r1.mboundView4androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView5
            androidx.databinding.InverseBindingListener r3 = r1.mboundView5androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView6
            androidx.databinding.InverseBindingListener r3 = r1.mboundView6androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView7
            androidx.databinding.InverseBindingListener r3 = r1.mboundView7androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView8
            androidx.databinding.InverseBindingListener r3 = r1.mboundView8androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.mboundView9
            androidx.databinding.InverseBindingListener r3 = r1.mboundView9androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            goto L_0x0123
        L_0x011f:
            r16 = r0
            r19 = r2
        L_0x0123:
            return
        L_0x0124:
            r0 = move-exception
            r19 = r2
            goto L_0x0129
        L_0x0128:
            r0 = move-exception
        L_0x0129:
            monitor-exit(r24)     // Catch:{ all -> 0x0128 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityMicroAtmResponseBindingImpl.executeBindings():void");
    }
}
