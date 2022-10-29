package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public class ActivityAePssuccessMiniStatementResponseBindingImpl extends ActivityAePssuccessMiniStatementResponseBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.aboveInfo_root, 1);
        sparseIntArray.put(C0330R.C0333id.aboveInfo, 2);
        sparseIntArray.put(C0330R.C0333id.acknowledge_no_text, 3);
        sparseIntArray.put(C0330R.C0333id.given_ackno, 4);
        sparseIntArray.put(C0330R.C0333id.given_bank_name_text, 5);
        sparseIntArray.put(C0330R.C0333id.given_bank_name, 6);
        sparseIntArray.put(C0330R.C0333id.given_date_time_text, 7);
        sparseIntArray.put(C0330R.C0333id.given_date_time, 8);
        sparseIntArray.put(C0330R.C0333id.given_balance_text, 9);
        sparseIntArray.put(C0330R.C0333id.given_balance, 10);
        sparseIntArray.put(C0330R.C0333id.mini_stateRecycler, 11);
    }

    public ActivityAePssuccessMiniStatementResponseBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityAePssuccessMiniStatementResponseBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[1], bindings[3], bindings[4], bindings[10], bindings[9], bindings[6], bindings[5], bindings[8], bindings[7], bindings[11]);
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
