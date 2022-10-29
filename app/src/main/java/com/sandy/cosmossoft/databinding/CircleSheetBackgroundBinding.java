package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;

public abstract class CircleSheetBackgroundBinding extends ViewDataBinding {
    public final RecyclerView circleListRecycler;
    public final SearchView circleListRecyclerSearch;
    public final ImageView exitButton;
    public final RelativeLayout topCircleSection;
    public final TextView topHeading;

    protected CircleSheetBackgroundBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView circleListRecycler2, SearchView circleListRecyclerSearch2, ImageView exitButton2, RelativeLayout topCircleSection2, TextView topHeading2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.circleListRecycler = circleListRecycler2;
        this.circleListRecyclerSearch = circleListRecyclerSearch2;
        this.exitButton = exitButton2;
        this.topCircleSection = topCircleSection2;
        this.topHeading = topHeading2;
    }

    public static CircleSheetBackgroundBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CircleSheetBackgroundBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CircleSheetBackgroundBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.circle_sheet_background, root, attachToRoot, component);
    }

    public static CircleSheetBackgroundBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CircleSheetBackgroundBinding inflate(LayoutInflater inflater, Object component) {
        return (CircleSheetBackgroundBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.circle_sheet_background, (ViewGroup) null, false, component);
    }

    public static CircleSheetBackgroundBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CircleSheetBackgroundBinding bind(View view, Object component) {
        return (CircleSheetBackgroundBinding) bind(component, view, C0330R.layout.circle_sheet_background);
    }
}
