package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;

public class FragmentAnalyticBindingImpl extends FragmentAnalyticBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.filterBox, 1);
        sparseIntArray.put(C0330R.C0333id.filterInfoSection, 2);
        sparseIntArray.put(C0330R.C0333id.selected_date, 3);
        sparseIntArray.put(C0330R.C0333id.categories, 4);
        sparseIntArray.put(C0330R.C0333id.status_filter, 5);
        sparseIntArray.put(C0330R.C0333id.historyData, 6);
        sparseIntArray.put(C0330R.C0333id.no_records, 7);
    }

    public FragmentAnalyticBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private FragmentAnalyticBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[1], bindings[2], bindings[6], bindings[7], bindings[3], bindings[5]);
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
        if (4 != variableId) {
            return false;
        }
        setAnalyticsViewModel((HomeViewModel) variable);
        return true;
    }

    public void setAnalyticsViewModel(HomeViewModel AnalyticsViewModel) {
        this.mAnalyticsViewModel = AnalyticsViewModel;
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
