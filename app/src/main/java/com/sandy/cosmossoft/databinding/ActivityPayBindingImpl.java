package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.FundViewModel;

public class ActivityPayBindingImpl extends ActivityPayBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.amountbalance, 1);
        sparseIntArray.put(C0330R.C0333id.payLayouts, 2);
        sparseIntArray.put(C0330R.C0333id.onRequestMoneyButton, 3);
        sparseIntArray.put(C0330R.C0333id.buttonsLayout, 4);
        sparseIntArray.put(C0330R.C0333id.one, 5);
        sparseIntArray.put(C0330R.C0333id.two, 6);
        sparseIntArray.put(C0330R.C0333id.three, 7);
        sparseIntArray.put(C0330R.C0333id.four, 8);
        sparseIntArray.put(C0330R.C0333id.five, 9);
        sparseIntArray.put(C0330R.C0333id.six, 10);
        sparseIntArray.put(C0330R.C0333id.seven, 11);
        sparseIntArray.put(C0330R.C0333id.eight, 12);
        sparseIntArray.put(C0330R.C0333id.nine, 13);
        sparseIntArray.put(C0330R.C0333id.point, 14);
        sparseIntArray.put(C0330R.C0333id.zeo, 15);
        sparseIntArray.put(C0330R.C0333id.erase, 16);
    }

    public ActivityPayBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }

    private ActivityPayBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[4], bindings[12], bindings[16], bindings[9], bindings[8], bindings[13], bindings[3], bindings[5], bindings[2], bindings[14], bindings[11], bindings[10], bindings[7], bindings[6], bindings[15]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
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
        if (19 != variableId) {
            return false;
        }
        setFundViewModel((FundViewModel) variable);
        return true;
    }

    public void setFundViewModel(FundViewModel FundViewModel) {
        this.mFundViewModel = FundViewModel;
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            long dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
    }
}
