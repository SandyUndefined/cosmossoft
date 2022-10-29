package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;

public abstract class FragmentHistoryBinding extends ViewDataBinding {
    public final TextView categories;
    public final CardView filterBox;
    public final LinearLayout filterInfoSection;
    public final RecyclerView historyData;
    @Bindable
    protected HomeViewModel mHistoryViewModel;
    public final TextView noRecords;
    public final TextView selectedDate;
    public final TextView statusFilter;

    public abstract void setHistoryViewModel(HomeViewModel homeViewModel);

    protected FragmentHistoryBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView categories2, CardView filterBox2, LinearLayout filterInfoSection2, RecyclerView historyData2, TextView noRecords2, TextView selectedDate2, TextView statusFilter2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.categories = categories2;
        this.filterBox = filterBox2;
        this.filterInfoSection = filterInfoSection2;
        this.historyData = historyData2;
        this.noRecords = noRecords2;
        this.selectedDate = selectedDate2;
        this.statusFilter = statusFilter2;
    }

    public HomeViewModel getHistoryViewModel() {
        return this.mHistoryViewModel;
    }

    public static FragmentHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentHistoryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_history, root, attachToRoot, component);
    }

    public static FragmentHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHistoryBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentHistoryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_history, (ViewGroup) null, false, component);
    }

    public static FragmentHistoryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHistoryBinding bind(View view, Object component) {
        return (FragmentHistoryBinding) bind(component, view, C0330R.layout.fragment_history);
    }
}
