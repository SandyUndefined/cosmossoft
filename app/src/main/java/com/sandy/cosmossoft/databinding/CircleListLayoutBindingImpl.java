package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.CircleModel;

public class CircleListLayoutBindingImpl extends CircleListLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.circle_image, 2);
        sparseIntArray.put(C0330R.C0333id.contactNameNumbers, 3);
        sparseIntArray.put(C0330R.C0333id.contactDivider, 4);
    }

    public CircleListLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private CircleListLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[1], bindings[0], bindings[4], bindings[3]);
        this.mDirtyFlags = -1;
        this.circleName.setTag((Object) null);
        this.circleNameLayout.setTag((Object) null);
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
        if (12 != variableId) {
            return false;
        }
        setCircleModel((CircleModel) variable);
        return true;
    }

    public void setCircleModel(CircleModel CircleModel) {
        this.mCircleModel = CircleModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String circleModelCircle = null;
        CircleModel circleModel = this.mCircleModel;
        if (!((dirtyFlags & 3) == 0 || circleModel == null)) {
            circleModelCircle = circleModel.getCircle();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.circleName, circleModelCircle);
        }
    }
}
