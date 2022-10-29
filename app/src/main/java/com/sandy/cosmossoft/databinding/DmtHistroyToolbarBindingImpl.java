package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public class DmtHistroyToolbarBindingImpl extends DmtHistroyToolbarBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.top_transaction_message, 1);
        sparseIntArray.put(C0330R.C0333id.top_transaction_date, 2);
        sparseIntArray.put(C0330R.C0333id.divider, 3);
    }

    public DmtHistroyToolbarBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private DmtHistroyToolbarBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[3], bindings[0], bindings[2], bindings[1]);
        this.mDirtyFlags = -1;
        this.parentToolbar.setTag((Object) null);
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
