package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.SliderItem;

public abstract class ItemContainerSliderImageBinding extends ViewDataBinding {
    @Bindable
    protected SliderItem mSliderItem;

    public abstract void setSliderItem(SliderItem sliderItem);

    protected ItemContainerSliderImageBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public SliderItem getSliderItem() {
        return this.mSliderItem;
    }

    public static ItemContainerSliderImageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContainerSliderImageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemContainerSliderImageBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.item_container_slider_image, root, attachToRoot, component);
    }

    public static ItemContainerSliderImageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContainerSliderImageBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemContainerSliderImageBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.item_container_slider_image, (ViewGroup) null, false, component);
    }

    public static ItemContainerSliderImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContainerSliderImageBinding bind(View view, Object component) {
        return (ItemContainerSliderImageBinding) bind(component, view, C0330R.layout.item_container_slider_image);
    }
}
