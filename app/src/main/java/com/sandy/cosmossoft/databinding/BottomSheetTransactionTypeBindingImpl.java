package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public class BottomSheetTransactionTypeBindingImpl extends BottomSheetTransactionTypeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.optionsCard, 1);
        sparseIntArray.put(C0330R.C0333id.topSectionStuff, 2);
        sparseIntArray.put(C0330R.C0333id.cancel_image, 3);
        sparseIntArray.put(C0330R.C0333id.clear_text, 4);
        sparseIntArray.put(C0330R.C0333id.divider3, 5);
        sparseIntArray.put(C0330R.C0333id.optionsCardAnother, 6);
        sparseIntArray.put(C0330R.C0333id.rechargeCheck, 7);
        sparseIntArray.put(C0330R.C0333id.bbpsCheck, 8);
        sparseIntArray.put(C0330R.C0333id.aepsCheck, 9);
        sparseIntArray.put(C0330R.C0333id.dmtCheck, 10);
        sparseIntArray.put(C0330R.C0333id.microatmCheck, 11);
        sparseIntArray.put(C0330R.C0333id.addFundCheck, 12);
        sparseIntArray.put(C0330R.C0333id.payoutCheck, 13);
        sparseIntArray.put(C0330R.C0333id.applyFilter, 14);
    }

    public BottomSheetTransactionTypeBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }

    private BottomSheetTransactionTypeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[12], bindings[9], bindings[14], bindings[8], bindings[3], bindings[4], bindings[5], bindings[10], bindings[11], bindings[1], bindings[6], bindings[13], bindings[7], bindings[2]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1;
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
        return true;
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
