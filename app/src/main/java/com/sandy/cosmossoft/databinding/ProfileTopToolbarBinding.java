package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class ProfileTopToolbarBinding extends ViewDataBinding {
    public final ImageView back;
    public final TextView titleText;
    public final Toolbar toolbarTop;

    protected ProfileTopToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView back2, TextView titleText2, Toolbar toolbarTop2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.back = back2;
        this.titleText = titleText2;
        this.toolbarTop = toolbarTop2;
    }

    public static ProfileTopToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProfileTopToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ProfileTopToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.profile_top_toolbar, root, attachToRoot, component);
    }

    public static ProfileTopToolbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProfileTopToolbarBinding inflate(LayoutInflater inflater, Object component) {
        return (ProfileTopToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.profile_top_toolbar, (ViewGroup) null, false, component);
    }

    public static ProfileTopToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProfileTopToolbarBinding bind(View view, Object component) {
        return (ProfileTopToolbarBinding) bind(component, view, C0330R.layout.profile_top_toolbar);
    }
}
