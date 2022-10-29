package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.CashDepositViewModel;

public abstract class ActivityCashDepositBinding extends ViewDataBinding {
    @Bindable
    protected CashDepositViewModel mDepositViewModel;

    public abstract void setDepositViewModel(CashDepositViewModel cashDepositViewModel);

    protected ActivityCashDepositBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public CashDepositViewModel getDepositViewModel() {
        return this.mDepositViewModel;
    }

    public static ActivityCashDepositBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCashDepositBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityCashDepositBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_cash_deposit, root, attachToRoot, component);
    }

    public static ActivityCashDepositBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCashDepositBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityCashDepositBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_cash_deposit, (ViewGroup) null, false, component);
    }

    public static ActivityCashDepositBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCashDepositBinding bind(View view, Object component) {
        return (ActivityCashDepositBinding) bind(component, view, C0330R.layout.activity_cash_deposit);
    }
}
