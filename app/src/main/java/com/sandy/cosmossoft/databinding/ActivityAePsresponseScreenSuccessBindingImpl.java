package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public class ActivityAePsresponseScreenSuccessBindingImpl extends ActivityAePsresponseScreenSuccessBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ScrollView mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.head_transaction, 1);
        sparseIntArray.put(C0330R.C0333id.infoTransaction, 2);
        sparseIntArray.put(C0330R.C0333id.clientrefno, 3);
        sparseIntArray.put(C0330R.C0333id.amount, 4);
        sparseIntArray.put(C0330R.C0333id.balanceamount, 5);
        sparseIntArray.put(C0330R.C0333id.last_aadhar, 6);
        sparseIntArray.put(C0330R.C0333id.name, 7);
        sparseIntArray.put(C0330R.C0333id.from_bank, 8);
        sparseIntArray.put(C0330R.C0333id.ackno, 9);
        sparseIntArray.put(C0330R.C0333id.message, 10);
    }

    public ActivityAePsresponseScreenSuccessBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityAePsresponseScreenSuccessBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[9], bindings[4], bindings[5], bindings[3], bindings[8], bindings[1], bindings[2], bindings[6], bindings[10], bindings[7]);
        this.mDirtyFlags = -1;
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
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
