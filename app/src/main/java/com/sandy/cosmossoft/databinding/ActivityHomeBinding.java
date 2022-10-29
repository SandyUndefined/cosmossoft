package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;

public abstract class ActivityHomeBinding extends ViewDataBinding {
    public final FrameLayout HomeMenuFragment;
    public final BottomNavigationView bottomNavigation;
    @Bindable
    protected HomeViewModel mHomeViewModel;
    public final CustomToolbarBinding toolbar;

    public abstract void setHomeViewModel(HomeViewModel homeViewModel);

    protected ActivityHomeBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout HomeMenuFragment2, BottomNavigationView bottomNavigation2, CustomToolbarBinding toolbar2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.HomeMenuFragment = HomeMenuFragment2;
        this.bottomNavigation = bottomNavigation2;
        this.toolbar = toolbar2;
    }

    public HomeViewModel getHomeViewModel() {
        return this.mHomeViewModel;
    }

    public static ActivityHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityHomeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_home, root, attachToRoot, component);
    }

    public static ActivityHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityHomeBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityHomeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_home, (ViewGroup) null, false, component);
    }

    public static ActivityHomeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityHomeBinding bind(View view, Object component) {
        return (ActivityHomeBinding) bind(component, view, C0330R.layout.activity_home);
    }
}
