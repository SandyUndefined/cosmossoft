package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;

public abstract class MyRecyclerSpinnerBinding extends ViewDataBinding {
    public final RecyclerView MyOperatorListView;
    public final SearchView SearchOperator;
    public final TextView headTitleSection;

    protected MyRecyclerSpinnerBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView MyOperatorListView2, SearchView SearchOperator2, TextView headTitleSection2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.MyOperatorListView = MyOperatorListView2;
        this.SearchOperator = SearchOperator2;
        this.headTitleSection = headTitleSection2;
    }

    public static MyRecyclerSpinnerBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MyRecyclerSpinnerBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (MyRecyclerSpinnerBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.my_recycler_spinner, root, attachToRoot, component);
    }

    public static MyRecyclerSpinnerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MyRecyclerSpinnerBinding inflate(LayoutInflater inflater, Object component) {
        return (MyRecyclerSpinnerBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.my_recycler_spinner, (ViewGroup) null, false, component);
    }

    public static MyRecyclerSpinnerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MyRecyclerSpinnerBinding bind(View view, Object component) {
        return (MyRecyclerSpinnerBinding) bind(component, view, C0330R.layout.my_recycler_spinner);
    }
}
