package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivitySelectedBenefeciaryHistoryBinding extends ViewDataBinding {
    @Bindable
    protected ToBankViewModel mSelectedBeneficiaryViewModel;
    public final TextView noRecords;
    public final RecyclerView selectedBeneficiaryHistory;

    public abstract void setSelectedBeneficiaryViewModel(ToBankViewModel toBankViewModel);

    protected ActivitySelectedBenefeciaryHistoryBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView noRecords2, RecyclerView selectedBeneficiaryHistory2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.noRecords = noRecords2;
        this.selectedBeneficiaryHistory = selectedBeneficiaryHistory2;
    }

    public ToBankViewModel getSelectedBeneficiaryViewModel() {
        return this.mSelectedBeneficiaryViewModel;
    }

    public static ActivitySelectedBenefeciaryHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectedBenefeciaryHistoryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySelectedBenefeciaryHistoryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_selected_benefeciary_history, root, attachToRoot, component);
    }

    public static ActivitySelectedBenefeciaryHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectedBenefeciaryHistoryBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySelectedBenefeciaryHistoryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_selected_benefeciary_history, (ViewGroup) null, false, component);
    }

    public static ActivitySelectedBenefeciaryHistoryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectedBenefeciaryHistoryBinding bind(View view, Object component) {
        return (ActivitySelectedBenefeciaryHistoryBinding) bind(component, view, C0330R.layout.activity_selected_benefeciary_history);
    }
}
