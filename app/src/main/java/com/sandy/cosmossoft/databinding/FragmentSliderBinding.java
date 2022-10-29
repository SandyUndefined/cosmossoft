package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.sandy.cosmossoft.C0330R;

public abstract class FragmentSliderBinding extends ViewDataBinding {
    public final LinearLayout LayoutSliderIndicators;
    public final ViewPager2 sliderViewPager;

    protected FragmentSliderBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout LayoutSliderIndicators2, ViewPager2 sliderViewPager2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.LayoutSliderIndicators = LayoutSliderIndicators2;
        this.sliderViewPager = sliderViewPager2;
    }

    public static FragmentSliderBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSliderBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSliderBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_slider, root, attachToRoot, component);
    }

    public static FragmentSliderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSliderBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSliderBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_slider, (ViewGroup) null, false, component);
    }

    public static FragmentSliderBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSliderBinding bind(View view, Object component) {
        return (FragmentSliderBinding) bind(component, view, C0330R.layout.fragment_slider);
    }
}
