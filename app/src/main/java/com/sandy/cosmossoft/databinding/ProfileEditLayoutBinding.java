package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.ProfileListModel;

public abstract class ProfileEditLayoutBinding extends ViewDataBinding {
    public final View divider2;
    public final ImageView icons;
    @Bindable
    protected ProfileListModel mModels;

    public abstract void setModels(ProfileListModel profileListModel);

    protected ProfileEditLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, View divider22, ImageView icons2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.divider2 = divider22;
        this.icons = icons2;
    }

    public ProfileListModel getModels() {
        return this.mModels;
    }

    public static ProfileEditLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProfileEditLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ProfileEditLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.profile_edit_layout, root, attachToRoot, component);
    }

    public static ProfileEditLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProfileEditLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ProfileEditLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.profile_edit_layout, (ViewGroup) null, false, component);
    }

    public static ProfileEditLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProfileEditLayoutBinding bind(View view, Object component) {
        return (ProfileEditLayoutBinding) bind(component, view, C0330R.layout.profile_edit_layout);
    }
}
