package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.MiniStatementData;

public class MiniStatementLayoutBindingImpl extends MiniStatementLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener givenAmountandroidTextAttrChanged;
    private InverseBindingListener givenCrDrandroidTextAttrChanged;
    private InverseBindingListener givenDateandroidTextAttrChanged;
    private InverseBindingListener givenNarrationandroidTextAttrChanged;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.statements_info, 5);
    }

    public MiniStatementLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private MiniStatementLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[3], bindings[4], bindings[1], bindings[2], bindings[5]);
        this.givenAmountandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(MiniStatementLayoutBindingImpl.this.givenAmount);
                MiniStatementData minSatementModel = MiniStatementLayoutBindingImpl.this.mMinSatementModel;
                if (minSatementModel != null) {
                    minSatementModel.setAmount(callbackArg_0);
                }
            }
        };
        this.givenCrDrandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(MiniStatementLayoutBindingImpl.this.givenCrDr);
                MiniStatementData minSatementModel = MiniStatementLayoutBindingImpl.this.mMinSatementModel;
                if (minSatementModel != null) {
                    minSatementModel.setTxnType(callbackArg_0);
                }
            }
        };
        this.givenDateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(MiniStatementLayoutBindingImpl.this.givenDate);
                MiniStatementData minSatementModel = MiniStatementLayoutBindingImpl.this.mMinSatementModel;
                if (minSatementModel != null) {
                    minSatementModel.setDate(callbackArg_0);
                }
            }
        };
        this.givenNarrationandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(MiniStatementLayoutBindingImpl.this.givenNarration);
                MiniStatementData minSatementModel = MiniStatementLayoutBindingImpl.this.mMinSatementModel;
                if (minSatementModel != null) {
                    minSatementModel.setNarration(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.givenAmount.setTag((Object) null);
        this.givenCrDr.setTag((Object) null);
        this.givenDate.setTag((Object) null);
        this.givenNarration.setTag((Object) null);
        LinearLayout linearLayout = bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
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
        if (25 != variableId) {
            return false;
        }
        setMinSatementModel((MiniStatementData) variable);
        return true;
    }

    public void setMinSatementModel(MiniStatementData MinSatementModel) {
        this.mMinSatementModel = MinSatementModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String minSatementModelNarration = null;
        String minSatementModelAmount = null;
        String minSatementModelTxnType = null;
        MiniStatementData minSatementModel = this.mMinSatementModel;
        String minSatementModelDate = null;
        if (!((dirtyFlags & 3) == 0 || minSatementModel == null)) {
            minSatementModelNarration = minSatementModel.getNarration();
            minSatementModelAmount = minSatementModel.getAmount();
            minSatementModelTxnType = minSatementModel.getTxnType();
            minSatementModelDate = minSatementModel.getDate();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.givenAmount, minSatementModelAmount);
            TextViewBindingAdapter.setText(this.givenCrDr, minSatementModelTxnType);
            TextViewBindingAdapter.setText(this.givenDate, minSatementModelDate);
            TextViewBindingAdapter.setText(this.givenNarration, minSatementModelNarration);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.givenAmount, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.givenAmountandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.givenCrDr, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.givenCrDrandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.givenDate, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.givenDateandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.givenNarration, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.givenNarrationandroidTextAttrChanged);
        }
    }
}
