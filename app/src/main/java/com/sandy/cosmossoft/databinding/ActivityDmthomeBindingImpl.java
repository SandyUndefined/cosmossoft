package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public class ActivityDmthomeBindingImpl extends ActivityDmthomeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.userSearchCard, 1);
        sparseIntArray.put(C0330R.C0333id.searchView, 2);
        sparseIntArray.put(C0330R.C0333id.dmt_user_recycler, 3);
        sparseIntArray.put(C0330R.C0333id.no_records, 4);
        sparseIntArray.put(C0330R.C0333id.add_more_beneficiary, 5);
    }

    public ActivityDmthomeBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ActivityDmthomeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[5], bindings[3], bindings[4], bindings[2], bindings[1]);
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
        if (52 != variableId) {
            return false;
        }
        setToBankViewModel((ToBankViewModel) variable);
        return true;
    }

    public void setToBankViewModel(ToBankViewModel ToBankViewModel) {
        this.mToBankViewModel = ToBankViewModel;
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
