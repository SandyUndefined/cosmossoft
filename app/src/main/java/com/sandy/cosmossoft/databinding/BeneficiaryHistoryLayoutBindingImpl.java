package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;

public class BeneficiaryHistoryLayoutBindingImpl extends BeneficiaryHistoryLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.historyTopSection, 4);
        sparseIntArray.put(C0330R.C0333id.first_layout, 5);
        sparseIntArray.put(C0330R.C0333id.rupee_sign, 6);
        sparseIntArray.put(C0330R.C0333id.clickUpdate, 7);
        sparseIntArray.put(C0330R.C0333id.refundButton, 8);
    }

    public BeneficiaryHistoryLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BeneficiaryHistoryLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[7], bindings[5], bindings[4], bindings[8], bindings[1], bindings[6], bindings[2], bindings[3]);
        this.mDirtyFlags = -1;
        LinearLayout linearLayout = bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        this.rupeeAmount.setTag((Object) null);
        this.statusHistory.setTag((Object) null);
        this.timeDate.setTag((Object) null);
        View view = root;
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
        if (21 != variableId) {
            return false;
        }
        setHistoryModelResponse((BeneficiaryHistoryResponse) variable);
        return true;
    }

    public void setHistoryModelResponse(BeneficiaryHistoryResponse HistoryModelResponse) {
        this.mHistoryModelResponse = HistoryModelResponse;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(21);
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
        String historyModelResponseTime = null;
        BeneficiaryHistoryResponse historyModelResponse = this.mHistoryModelResponse;
        String historyModelResponseAmount = null;
        String historyModelResponseStatus = null;
        if (!((dirtyFlags & 3) == 0 || historyModelResponse == null)) {
            historyModelResponseTime = historyModelResponse.getTime();
            historyModelResponseAmount = historyModelResponse.getAmount();
            historyModelResponseStatus = historyModelResponse.getStatus();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.rupeeAmount, historyModelResponseAmount);
            TextViewBindingAdapter.setText(this.statusHistory, historyModelResponseStatus);
            TextViewBindingAdapter.setText(this.timeDate, historyModelResponseTime);
        }
    }
}
