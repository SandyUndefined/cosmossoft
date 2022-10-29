package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivityToAccountBinding extends ViewDataBinding {
    public final CardView AddBeneficiary;
    public final TabLayout bankOptionTabs;
    public final SearchView bankSearchView;
    public final CardView bankSectionBar;
    public final CardView banksSearchCard;
    @Bindable
    protected ToBankViewModel mMyBankViewModel;
    public final RecyclerView myBankListRecycler;
    public final RecyclerView myHistoryListRecycler;
    public final View tabLayoutDivider;

    public abstract void setMyBankViewModel(ToBankViewModel toBankViewModel);

    protected ActivityToAccountBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView AddBeneficiary2, TabLayout bankOptionTabs2, SearchView bankSearchView2, CardView bankSectionBar2, CardView banksSearchCard2, RecyclerView myBankListRecycler2, RecyclerView myHistoryListRecycler2, View tabLayoutDivider2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.AddBeneficiary = AddBeneficiary2;
        this.bankOptionTabs = bankOptionTabs2;
        this.bankSearchView = bankSearchView2;
        this.bankSectionBar = bankSectionBar2;
        this.banksSearchCard = banksSearchCard2;
        this.myBankListRecycler = myBankListRecycler2;
        this.myHistoryListRecycler = myHistoryListRecycler2;
        this.tabLayoutDivider = tabLayoutDivider2;
    }

    public ToBankViewModel getMyBankViewModel() {
        return this.mMyBankViewModel;
    }

    public static ActivityToAccountBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityToAccountBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityToAccountBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_to_account, root, attachToRoot, component);
    }

    public static ActivityToAccountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityToAccountBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityToAccountBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_to_account, (ViewGroup) null, false, component);
    }

    public static ActivityToAccountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityToAccountBinding bind(View view, Object component) {
        return (ActivityToAccountBinding) bind(component, view, C0330R.layout.activity_to_account);
    }
}
