package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;

public abstract class ActivityRegularHistoryBinding extends ViewDataBinding {
    public final CardView HistorySearchCard;
    public final RecyclerView historyRecycler;
    public final TextView noRecords;
    public final SearchView searchView;

    protected ActivityRegularHistoryBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView HistorySearchCard2, RecyclerView historyRecycler2, TextView noRecords2, SearchView searchView2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.HistorySearchCard = HistorySearchCard2;
        this.historyRecycler = historyRecycler2;
        this.noRecords = noRecords2;
        this.searchView = searchView2;
    }

    public static ActivityRegularHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegularHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityRegularHistoryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_regular_history, root, attachToRoot, component);
    }

    public static ActivityRegularHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegularHistoryBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityRegularHistoryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_regular_history, (ViewGroup) null, false, component);
    }

    public static ActivityRegularHistoryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegularHistoryBinding bind(View view, Object component) {
        return (ActivityRegularHistoryBinding) bind(component, view, C0330R.layout.activity_regular_history);
    }
}
