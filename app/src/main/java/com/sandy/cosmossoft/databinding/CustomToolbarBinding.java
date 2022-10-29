package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import p005de.hdodenhof.circleimageview.CircleImageView;

public abstract class CustomToolbarBinding extends ViewDataBinding {
    public final View divider;
    public final Toolbar parentToolbar;
    public final CircleImageView toolbarLogoImage;
    public final TextView userFirstName;

    protected CustomToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount, View divider2, Toolbar parentToolbar2, CircleImageView toolbarLogoImage2, TextView userFirstName2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.divider = divider2;
        this.parentToolbar = parentToolbar2;
        this.toolbarLogoImage = toolbarLogoImage2;
        this.userFirstName = userFirstName2;
    }

    public static CustomToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CustomToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.custom_toolbar, root, attachToRoot, component);
    }

    public static CustomToolbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomToolbarBinding inflate(LayoutInflater inflater, Object component) {
        return (CustomToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.custom_toolbar, (ViewGroup) null, false, component);
    }

    public static CustomToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomToolbarBinding bind(View view, Object component) {
        return (CustomToolbarBinding) bind(component, view, C0330R.layout.custom_toolbar);
    }
}
