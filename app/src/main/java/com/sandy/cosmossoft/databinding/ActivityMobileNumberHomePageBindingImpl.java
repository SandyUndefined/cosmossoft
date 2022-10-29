package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;

public class ActivityMobileNumberHomePageBindingImpl extends ActivityMobileNumberHomePageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.numberSearchCard, 1);
        sparseIntArray.put(C0330R.C0333id.contactsSearchView, 2);
        sparseIntArray.put(C0330R.C0333id.selectContactLayout, 3);
        sparseIntArray.put(C0330R.C0333id.allContactsCard, 4);
        sparseIntArray.put(C0330R.C0333id.allContactsRecycler, 5);
    }

    public ActivityMobileNumberHomePageBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ActivityMobileNumberHomePageBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[5], bindings[2], bindings[1], bindings[3]);
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
        if (27 != variableId) {
            return false;
        }
        setMobileNumbersViewModel((MobileNumberPayViewModel) variable);
        return true;
    }

    public void setMobileNumbersViewModel(MobileNumberPayViewModel MobileNumbersViewModel) {
        this.mMobileNumbersViewModel = MobileNumbersViewModel;
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
