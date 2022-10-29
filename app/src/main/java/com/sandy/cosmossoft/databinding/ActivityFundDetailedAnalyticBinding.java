package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import p005de.hdodenhof.circleimageview.CircleImageView;
import p007pl.droidsonroids.gif.GifImageView;

public abstract class ActivityFundDetailedAnalyticBinding extends ViewDataBinding {
    public final CircleImageView circleImage;
    public final GifImageView gifStatus;
    public final RelativeLayout headTransaction;
    @Bindable
    protected AnalyticsResponseModel mRegularDetailModel;
    public final TextView responseCloseBal;
    public final TextView responseCommAm;
    public final TextView responseDate;
    public final TextView responseMobile;
    public final TextView responseOpId;
    public final TextView responseOpName;
    public final TextView responseOpenBal;
    public final TextView responseTxnId;
    public final TextView textStatus;

    public abstract void setRegularDetailModel(AnalyticsResponseModel analyticsResponseModel);

    protected ActivityFundDetailedAnalyticBinding(Object _bindingComponent, View _root, int _localFieldCount, CircleImageView circleImage2, GifImageView gifStatus2, RelativeLayout headTransaction2, TextView responseCloseBal2, TextView responseCommAm2, TextView responseDate2, TextView responseMobile2, TextView responseOpId2, TextView responseOpName2, TextView responseOpenBal2, TextView responseTxnId2, TextView textStatus2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.circleImage = circleImage2;
        this.gifStatus = gifStatus2;
        this.headTransaction = headTransaction2;
        this.responseCloseBal = responseCloseBal2;
        this.responseCommAm = responseCommAm2;
        this.responseDate = responseDate2;
        this.responseMobile = responseMobile2;
        this.responseOpId = responseOpId2;
        this.responseOpName = responseOpName2;
        this.responseOpenBal = responseOpenBal2;
        this.responseTxnId = responseTxnId2;
        this.textStatus = textStatus2;
    }

    public AnalyticsResponseModel getRegularDetailModel() {
        return this.mRegularDetailModel;
    }

    public static ActivityFundDetailedAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFundDetailedAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityFundDetailedAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_fund_detailed_analytic, root, attachToRoot, component);
    }

    public static ActivityFundDetailedAnalyticBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFundDetailedAnalyticBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityFundDetailedAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_fund_detailed_analytic, (ViewGroup) null, false, component);
    }

    public static ActivityFundDetailedAnalyticBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFundDetailedAnalyticBinding bind(View view, Object component) {
        return (ActivityFundDetailedAnalyticBinding) bind(component, view, C0330R.layout.activity_fund_detailed_analytic);
    }
}
