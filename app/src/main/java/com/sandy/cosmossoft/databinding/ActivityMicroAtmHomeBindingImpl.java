package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public class ActivityMicroAtmHomeBindingImpl extends ActivityMicroAtmHomeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 1);
        sparseIntArray.put(C0330R.C0333id.amount_layout, 2);
        sparseIntArray.put(C0330R.C0333id.edAmount, 3);
        sparseIntArray.put(C0330R.C0333id.micro_atm_layout, 4);
        sparseIntArray.put(C0330R.C0333id.selectedBankName, 5);
        sparseIntArray.put(C0330R.C0333id.buttonsLayout, 6);
        sparseIntArray.put(C0330R.C0333id.btnSubmit, 7);
        sparseIntArray.put(C0330R.C0333id.btnWithdraw, 8);
    }

    public ActivityMicroAtmHomeBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityMicroAtmHomeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[7], bindings[8], bindings[6], bindings[3], bindings[1], bindings[4], bindings[5]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        View view = root;
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
