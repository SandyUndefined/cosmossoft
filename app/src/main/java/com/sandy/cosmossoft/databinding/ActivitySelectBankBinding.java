package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivitySelectBankBinding extends ViewDataBinding {
    public final CardView bankSectionBar;
    public final RecyclerView banksRecycler;
    public final CardView banksSearchCard;
    @Bindable
    protected ToBankViewModel mHomeViewModel;
    public final SearchView searchMyBanks;

    public abstract void setHomeViewModel(ToBankViewModel toBankViewModel);

    protected ActivitySelectBankBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView bankSectionBar2, RecyclerView banksRecycler2, CardView banksSearchCard2, SearchView searchMyBanks2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.bankSectionBar = bankSectionBar2;
        this.banksRecycler = banksRecycler2;
        this.banksSearchCard = banksSearchCard2;
        this.searchMyBanks = searchMyBanks2;
    }

    public ToBankViewModel getHomeViewModel() {
        return this.mHomeViewModel;
    }

    public static ActivitySelectBankBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectBankBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySelectBankBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_select_bank, root, attachToRoot, component);
    }

    public static ActivitySelectBankBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectBankBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySelectBankBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_select_bank, (ViewGroup) null, false, component);
    }

    public static ActivitySelectBankBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectBankBinding bind(View view, Object component) {
        return (ActivitySelectBankBinding) bind(component, view, C0330R.layout.activity_select_bank);
    }
}
