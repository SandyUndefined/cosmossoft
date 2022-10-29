package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import p004at.markushi.p012ui.CircleButton;

public abstract class ActivityMobileRechargeBinding extends ViewDataBinding {
    public final CardView allContactsCard;
    public final RecyclerView allContactsRecycler;
    public final SearchView contactsSearchView;
    public final CircleButton enteredNumberSelf;
    @Bindable
    protected MobileRechargeViewModel mRechargeViewModel;
    public final CardView recentRechargesCard;
    public final RecyclerView recentRechargesRecycler;
    public final CardView rechargeSearchCard;
    public final LinearLayout selectContactLayout;

    public abstract void setRechargeViewModel(MobileRechargeViewModel mobileRechargeViewModel);

    protected ActivityMobileRechargeBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView allContactsCard2, RecyclerView allContactsRecycler2, SearchView contactsSearchView2, CircleButton enteredNumberSelf2, CardView recentRechargesCard2, RecyclerView recentRechargesRecycler2, CardView rechargeSearchCard2, LinearLayout selectContactLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.allContactsCard = allContactsCard2;
        this.allContactsRecycler = allContactsRecycler2;
        this.contactsSearchView = contactsSearchView2;
        this.enteredNumberSelf = enteredNumberSelf2;
        this.recentRechargesCard = recentRechargesCard2;
        this.recentRechargesRecycler = recentRechargesRecycler2;
        this.rechargeSearchCard = rechargeSearchCard2;
        this.selectContactLayout = selectContactLayout2;
    }

    public MobileRechargeViewModel getRechargeViewModel() {
        return this.mRechargeViewModel;
    }

    public static ActivityMobileRechargeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMobileRechargeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMobileRechargeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mobile_recharge, root, attachToRoot, component);
    }

    public static ActivityMobileRechargeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMobileRechargeBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMobileRechargeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mobile_recharge, (ViewGroup) null, false, component);
    }

    public static ActivityMobileRechargeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMobileRechargeBinding bind(View view, Object component) {
        return (ActivityMobileRechargeBinding) bind(component, view, C0330R.layout.activity_mobile_recharge);
    }
}
