package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.data.model.MenuModel;
import com.sandy.cosmossoft.util.BindingUtils;

public class RecyclerviewMenusOptionBindingImpl extends RecyclerviewMenusOptionBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    public RecyclerviewMenusOptionBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }

    private RecyclerviewMenusOptionBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[2]);
        this.mDirtyFlags = -1;
        ConstraintLayout constraintLayout = bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        this.menuIconLogo.setTag((Object) null);
        this.menuIconTitle.setTag((Object) null);
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
        if (31 != variableId) {
            return false;
        }
        setMyMenus((MenuModel) variable);
        return true;
    }

    public void setMyMenus(MenuModel MyMenus) {
        this.mMyMenus = MyMenus;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(31);
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
        String myMenusTitle = null;
        MenuModel myMenus = this.mMyMenus;
        Integer myMenusIcon = null;
        if (!((dirtyFlags & 3) == 0 || myMenus == null)) {
            myMenusTitle = myMenus.getTitle();
            myMenusIcon = myMenus.getIcon();
        }
        if ((3 & dirtyFlags) != 0) {
            BindingUtils.loadResourceImage(this.menuIconLogo, myMenusIcon);
            TextViewBindingAdapter.setText(this.menuIconTitle, myMenusTitle);
        }
    }
}
