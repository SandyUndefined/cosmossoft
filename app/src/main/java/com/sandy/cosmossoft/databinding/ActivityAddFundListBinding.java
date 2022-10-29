package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import p005de.hdodenhof.circleimageview.CircleImageView;

public abstract class ActivityAddFundListBinding extends ViewDataBinding {
    public final CardView infoSection;
    @Bindable
    protected FundViewModel mFundViewModel;
    public final CircleImageView offlinePayment;
    public final CircleImageView paytmFund;
    public final CircleImageView upiPayment;
    public final CircleImageView walletExchange;

    public abstract void setFundViewModel(FundViewModel fundViewModel);

    protected ActivityAddFundListBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView infoSection2, CircleImageView offlinePayment2, CircleImageView paytmFund2, CircleImageView upiPayment2, CircleImageView walletExchange2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.infoSection = infoSection2;
        this.offlinePayment = offlinePayment2;
        this.paytmFund = paytmFund2;
        this.upiPayment = upiPayment2;
        this.walletExchange = walletExchange2;
    }

    public FundViewModel getFundViewModel() {
        return this.mFundViewModel;
    }

    public static ActivityAddFundListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddFundListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAddFundListBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_add_fund_list, root, attachToRoot, component);
    }

    public static ActivityAddFundListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddFundListBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAddFundListBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_add_fund_list, (ViewGroup) null, false, component);
    }

    public static ActivityAddFundListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddFundListBinding bind(View view, Object component) {
        return (ActivityAddFundListBinding) bind(component, view, C0330R.layout.activity_add_fund_list);
    }
}
