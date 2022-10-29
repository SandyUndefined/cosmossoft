package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.ProfileListModel;
import com.sandy.cosmossoft.util.BindingUtils;

public class ProfileEditLayoutBindingImpl extends ProfileEditLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.divider2, 3);
    }

    public ProfileEditLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private ProfileEditLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[3], bindings[1]);
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ProfileEditLayoutBindingImpl.this.mboundView2);
                ProfileListModel models = ProfileEditLayoutBindingImpl.this.mModels;
                if (models != null) {
                    models.setTitle(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.icons.setTag((Object) null);
        LinearLayout linearLayout = bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        TextView textView = bindings[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
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
        if (28 != variableId) {
            return false;
        }
        setModels((ProfileListModel) variable);
        return true;
    }

    public void setModels(ProfileListModel Models) {
        this.mModels = Models;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(28);
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
        Integer modelsIcon = null;
        ProfileListModel models = this.mModels;
        String modelsTitle = null;
        if (!((dirtyFlags & 3) == 0 || models == null)) {
            modelsIcon = models.getIcon();
            modelsTitle = models.getTitle();
        }
        if ((3 & dirtyFlags) != 0) {
            BindingUtils.loadResourceImage(this.icons, modelsIcon);
            TextViewBindingAdapter.setText(this.mboundView2, modelsTitle);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView2, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView2androidTextAttrChanged);
        }
    }
}
