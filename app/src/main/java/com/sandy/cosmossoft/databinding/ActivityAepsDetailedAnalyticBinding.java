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

public abstract class ActivityAepsDetailedAnalyticBinding extends ViewDataBinding {
    public final CircleImageView circleImage;
    public final GifImageView gifStatus;
    public final RelativeLayout headTransaction;
    @Bindable
    protected AnalyticsResponseModel mRegularDetailModel;
    public final TextView responseCloseBal;
    public final TextView responseCommAm;
    public final TextView responseCommGst;
    public final TextView responseCommTds;
    public final TextView responseDate;
    public final TextView responseMessage;
    public final TextView responseMobile;
    public final TextView responseOpId;
    public final TextView responseOpenBal;
    public final TextView textStatus;
    public final TextView transactionID;
    public final TextView transactionType;

    public abstract void setRegularDetailModel(AnalyticsResponseModel analyticsResponseModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityAepsDetailedAnalyticBinding(Object _bindingComponent, View _root, int _localFieldCount, CircleImageView circleImage2, GifImageView gifStatus2, RelativeLayout headTransaction2, TextView responseCloseBal2, TextView responseCommAm2, TextView responseCommGst2, TextView responseCommTds2, TextView responseDate2, TextView responseMessage2, TextView responseMobile2, TextView responseOpId2, TextView responseOpenBal2, TextView textStatus2, TextView transactionID2, TextView transactionType2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.circleImage = circleImage2;
        this.gifStatus = gifStatus2;
        this.headTransaction = headTransaction2;
        this.responseCloseBal = responseCloseBal2;
        this.responseCommAm = responseCommAm2;
        this.responseCommGst = responseCommGst2;
        this.responseCommTds = responseCommTds2;
        this.responseDate = responseDate2;
        this.responseMessage = responseMessage2;
        this.responseMobile = responseMobile2;
        this.responseOpId = responseOpId2;
        this.responseOpenBal = responseOpenBal2;
        this.textStatus = textStatus2;
        this.transactionID = transactionID2;
        this.transactionType = transactionType2;
    }

    public AnalyticsResponseModel getRegularDetailModel() {
        return this.mRegularDetailModel;
    }

    public static ActivityAepsDetailedAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsDetailedAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAepsDetailedAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_aeps_detailed_analytic, root, attachToRoot, component);
    }

    public static ActivityAepsDetailedAnalyticBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsDetailedAnalyticBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAepsDetailedAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_aeps_detailed_analytic, (ViewGroup) null, false, component);
    }

    public static ActivityAepsDetailedAnalyticBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsDetailedAnalyticBinding bind(View view, Object component) {
        return (ActivityAepsDetailedAnalyticBinding) bind(component, view, C0330R.layout.activity_aeps_detailed_analytic);
    }
}
