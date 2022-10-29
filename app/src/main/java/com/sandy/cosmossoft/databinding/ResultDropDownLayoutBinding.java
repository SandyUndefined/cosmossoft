package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class ResultDropDownLayoutBinding extends ViewDataBinding {
    public final RelativeLayout lyGiftList;
    public final Spinner spnGift;

    protected ResultDropDownLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, RelativeLayout lyGiftList2, Spinner spnGift2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.lyGiftList = lyGiftList2;
        this.spnGift = spnGift2;
    }

    public static ResultDropDownLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ResultDropDownLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ResultDropDownLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.result_drop_down_layout, root, attachToRoot, component);
    }

    public static ResultDropDownLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ResultDropDownLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ResultDropDownLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.result_drop_down_layout, (ViewGroup) null, false, component);
    }

    public static ResultDropDownLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ResultDropDownLayoutBinding bind(View view, Object component) {
        return (ResultDropDownLayoutBinding) bind(component, view, C0330R.layout.result_drop_down_layout);
    }
}
