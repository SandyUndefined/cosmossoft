package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;

public abstract class OperatorSheetBackgroundBinding extends ViewDataBinding {
    public final ImageView exitButton;
    public final RecyclerView operatorListRecycler;
    public final RelativeLayout topOperatorSection;

    protected OperatorSheetBackgroundBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView exitButton2, RecyclerView operatorListRecycler2, RelativeLayout topOperatorSection2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.exitButton = exitButton2;
        this.operatorListRecycler = operatorListRecycler2;
        this.topOperatorSection = topOperatorSection2;
    }

    public static OperatorSheetBackgroundBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OperatorSheetBackgroundBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (OperatorSheetBackgroundBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.operator_sheet_background, root, attachToRoot, component);
    }

    public static OperatorSheetBackgroundBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OperatorSheetBackgroundBinding inflate(LayoutInflater inflater, Object component) {
        return (OperatorSheetBackgroundBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.operator_sheet_background, (ViewGroup) null, false, component);
    }

    public static OperatorSheetBackgroundBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OperatorSheetBackgroundBinding bind(View view, Object component) {
        return (OperatorSheetBackgroundBinding) bind(component, view, C0330R.layout.operator_sheet_background);
    }
}
