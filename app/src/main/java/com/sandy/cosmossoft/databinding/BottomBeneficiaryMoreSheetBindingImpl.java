package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public class BottomBeneficiaryMoreSheetBindingImpl extends BottomBeneficiaryMoreSheetBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.optionsCard, 1);
        sparseIntArray.put(C0330R.C0333id.history_layout, 2);
        sparseIntArray.put(C0330R.C0333id.view_history, 3);
        sparseIntArray.put(C0330R.C0333id.beneficiaryDivider, 4);
        sparseIntArray.put(C0330R.C0333id.share_layout, 5);
        sparseIntArray.put(C0330R.C0333id.penny_drop, 6);
        sparseIntArray.put(C0330R.C0333id.beneficiaryDivider3, 7);
        sparseIntArray.put(C0330R.C0333id.remove_layout, 8);
        sparseIntArray.put(C0330R.C0333id.remove, 9);
        sparseIntArray.put(C0330R.C0333id.cancel_card, 10);
        sparseIntArray.put(C0330R.C0333id.cancel_layout, 11);
        sparseIntArray.put(C0330R.C0333id.cancel, 12);
    }

    public BottomBeneficiaryMoreSheetBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    private BottomBeneficiaryMoreSheetBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[7], bindings[12], bindings[10], bindings[11], bindings[2], bindings[1], bindings[6], bindings[9], bindings[8], bindings[5], bindings[3]);
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
