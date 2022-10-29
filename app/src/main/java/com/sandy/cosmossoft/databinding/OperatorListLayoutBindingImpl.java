package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.OperatorModel;
import com.sandy.cosmossoft.util.BindingUtils;

public class OperatorListLayoutBindingImpl extends OperatorListLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.contactNameNumbers, 3);
        sparseIntArray.put(C0330R.C0333id.contactDivider, 4);
    }

    public OperatorListLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private OperatorListLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[3], bindings[1], bindings[2]);
        this.mDirtyFlags = -1;
        this.contactsImage.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.operatorName.setTag((Object) null);
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
        if (35 != variableId) {
            return false;
        }
        setOperatorModel((OperatorModel) variable);
        return true;
    }

    public void setOperatorModel(OperatorModel OperatorModel) {
        this.mOperatorModel = OperatorModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(35);
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
        String operatorModelLogo = null;
        OperatorModel operatorModel = this.mOperatorModel;
        String operatorModelName = null;
        if (!((dirtyFlags & 3) == 0 || operatorModel == null)) {
            operatorModelLogo = operatorModel.getLogo();
            operatorModelName = operatorModel.getName();
        }
        if ((3 & dirtyFlags) != 0) {
            BindingUtils.loadUrlImage(this.contactsImage, operatorModelLogo);
            TextViewBindingAdapter.setText(this.operatorName, operatorModelName);
        }
    }
}
