package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import p005de.hdodenhof.circleimageview.CircleImageView;
import p007pl.droidsonroids.gif.GifImageView;

public abstract class ActivityPayoutDetailedAnalyticBinding extends ViewDataBinding {
    public final TextView amountLabel;
    public final TextView beneficiaryId;
    public final TextView charges;
    public final CircleImageView circleImage;
    public final GifImageView gifStatus;
    public final TextView gstNo;
    public final LinearLayout gstNoSection;
    public final LinearLayout gstSection;
    public final RelativeLayout headTransaction;
    @Bindable
    protected AnalyticsResponseModel mRegularDetailModel;
    public final ImageView printReceipt;
    public final TextView responseCloseBal;
    public final TextView responseCommAm;
    public final TextView responseCommGst;
    public final TextView responseCommTds;
    public final TextView responseDate;
    public final TextView responseMessage;
    public final TextView responseOpId;
    public final TextView responseOpenBal;
    public final TextView responseTxnId;
    public final LinearLayout tdsChargeSection;
    public final TextView textStatus;
    public final TextView transactionType;

    public abstract void setRegularDetailModel(AnalyticsResponseModel analyticsResponseModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityPayoutDetailedAnalyticBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView amountLabel2, TextView beneficiaryId2, TextView charges2, CircleImageView circleImage2, GifImageView gifStatus2, TextView gstNo2, LinearLayout gstNoSection2, LinearLayout gstSection2, RelativeLayout headTransaction2, ImageView printReceipt2, TextView responseCloseBal2, TextView responseCommAm2, TextView responseCommGst2, TextView responseCommTds2, TextView responseDate2, TextView responseMessage2, TextView responseOpId2, TextView responseOpenBal2, TextView responseTxnId2, LinearLayout tdsChargeSection2, TextView textStatus2, TextView transactionType2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.amountLabel = amountLabel2;
        this.beneficiaryId = beneficiaryId2;
        this.charges = charges2;
        this.circleImage = circleImage2;
        this.gifStatus = gifStatus2;
        this.gstNo = gstNo2;
        this.gstNoSection = gstNoSection2;
        this.gstSection = gstSection2;
        this.headTransaction = headTransaction2;
        this.printReceipt = printReceipt2;
        this.responseCloseBal = responseCloseBal2;
        this.responseCommAm = responseCommAm2;
        this.responseCommGst = responseCommGst2;
        this.responseCommTds = responseCommTds2;
        this.responseDate = responseDate2;
        this.responseMessage = responseMessage2;
        this.responseOpId = responseOpId2;
        this.responseOpenBal = responseOpenBal2;
        this.responseTxnId = responseTxnId2;
        this.tdsChargeSection = tdsChargeSection2;
        this.textStatus = textStatus2;
        this.transactionType = transactionType2;
    }

    public AnalyticsResponseModel getRegularDetailModel() {
        return this.mRegularDetailModel;
    }

    public static ActivityPayoutDetailedAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutDetailedAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPayoutDetailedAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_payout_detailed_analytic, root, attachToRoot, component);
    }

    public static ActivityPayoutDetailedAnalyticBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutDetailedAnalyticBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPayoutDetailedAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_payout_detailed_analytic, (ViewGroup) null, false, component);
    }

    public static ActivityPayoutDetailedAnalyticBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutDetailedAnalyticBinding bind(View view, Object component) {
        return (ActivityPayoutDetailedAnalyticBinding) bind(component, view, C0330R.layout.activity_payout_detailed_analytic);
    }
}
