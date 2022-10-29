package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.sandy.cosmossoft.C0330R;

public abstract class ActivityMainBinding extends ViewDataBinding {
    public final FragmentContainerView ScreenFrame;

    protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView ScreenFrame2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ScreenFrame = ScreenFrame2;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_main, root, attachToRoot, component);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_main, (ViewGroup) null, false, component);
    }

    public static ActivityMainBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding bind(View view, Object component) {
        return (ActivityMainBinding) bind(component, view, C0330R.layout.activity_main);
    }
}
