package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;

public abstract class FragmentHomeMenuFragmentsBinding extends ViewDataBinding {
    public final FrameLayout HomeSliderFragment;
    public final TextView aepsBalText;
    public final TextView everynews;
    public final RecyclerView firstHomeMenu;
    public final ImageView logoWalletImage;
    @Bindable
    protected HomeViewModel mHomeViewModel;
    public final TextView mainBalText;
    public final RecyclerView moneyTransfer;
    public final CardView newsSection;
    public final NestedScrollView parentRoot;
    public final RecyclerView taxesHomeMenu;
    public final RecyclerView utilitiesHomeMenu;
    public final LinearLayout walletBalLayout;

    public abstract void setHomeViewModel(HomeViewModel homeViewModel);

    protected FragmentHomeMenuFragmentsBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout HomeSliderFragment2, TextView aepsBalText2, TextView everynews2, RecyclerView firstHomeMenu2, ImageView logoWalletImage2, TextView mainBalText2, RecyclerView moneyTransfer2, CardView newsSection2, NestedScrollView parentRoot2, RecyclerView taxesHomeMenu2, RecyclerView utilitiesHomeMenu2, LinearLayout walletBalLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.HomeSliderFragment = HomeSliderFragment2;
        this.aepsBalText = aepsBalText2;
        this.everynews = everynews2;
        this.firstHomeMenu = firstHomeMenu2;
        this.logoWalletImage = logoWalletImage2;
        this.mainBalText = mainBalText2;
        this.moneyTransfer = moneyTransfer2;
        this.newsSection = newsSection2;
        this.parentRoot = parentRoot2;
        this.taxesHomeMenu = taxesHomeMenu2;
        this.utilitiesHomeMenu = utilitiesHomeMenu2;
        this.walletBalLayout = walletBalLayout2;
    }

    public HomeViewModel getHomeViewModel() {
        return this.mHomeViewModel;
    }

    public static FragmentHomeMenuFragmentsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeMenuFragmentsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentHomeMenuFragmentsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_home_menu_fragments, root, attachToRoot, component);
    }

    public static FragmentHomeMenuFragmentsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeMenuFragmentsBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentHomeMenuFragmentsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_home_menu_fragments, (ViewGroup) null, false, component);
    }

    public static FragmentHomeMenuFragmentsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeMenuFragmentsBinding bind(View view, Object component) {
        return (FragmentHomeMenuFragmentsBinding) bind(component, view, C0330R.layout.fragment_home_menu_fragments);
    }
}
