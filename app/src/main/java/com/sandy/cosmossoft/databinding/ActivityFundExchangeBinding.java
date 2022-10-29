package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.viewmodel.FundViewModel;

public abstract class ActivityFundExchangeBinding extends ViewDataBinding {
    public final TextView aepsBalText;
    public final TextInputLayout amount;
    public final TextInputEditText amountBalance;
    public final CardView amountCard;
    public final CardView exchangeBalance;
    public final ImageView logoWalletImage;
    public final ImageView logoWalletImageA;
    @Bindable
    protected FundViewModel mFundViewModel;
    @Bindable
    protected User mUserDataModel;
    public final CardView mainBalCard;
    public final TextView mainBalText;
    public final LinearLayout walletBalLayout;
    public final LinearLayout walletBalLayoutA;

    public abstract void setFundViewModel(FundViewModel fundViewModel);

    public abstract void setUserDataModel(User user);

    protected ActivityFundExchangeBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView aepsBalText2, TextInputLayout amount2, TextInputEditText amountBalance2, CardView amountCard2, CardView exchangeBalance2, ImageView logoWalletImage2, ImageView logoWalletImageA2, CardView mainBalCard2, TextView mainBalText2, LinearLayout walletBalLayout2, LinearLayout walletBalLayoutA2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aepsBalText = aepsBalText2;
        this.amount = amount2;
        this.amountBalance = amountBalance2;
        this.amountCard = amountCard2;
        this.exchangeBalance = exchangeBalance2;
        this.logoWalletImage = logoWalletImage2;
        this.logoWalletImageA = logoWalletImageA2;
        this.mainBalCard = mainBalCard2;
        this.mainBalText = mainBalText2;
        this.walletBalLayout = walletBalLayout2;
        this.walletBalLayoutA = walletBalLayoutA2;
    }

    public User getUserDataModel() {
        return this.mUserDataModel;
    }

    public FundViewModel getFundViewModel() {
        return this.mFundViewModel;
    }

    public static ActivityFundExchangeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFundExchangeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityFundExchangeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_fund_exchange, root, attachToRoot, component);
    }

    public static ActivityFundExchangeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFundExchangeBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityFundExchangeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_fund_exchange, (ViewGroup) null, false, component);
    }

    public static ActivityFundExchangeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFundExchangeBinding bind(View view, Object component) {
        return (ActivityFundExchangeBinding) bind(component, view, C0330R.layout.activity_fund_exchange);
    }
}
