package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import p005de.hdodenhof.circleimageview.CircleImageView;
import p007pl.droidsonroids.gif.GifImageView;

public abstract class ActivityMiniStatementAnalyticBinding extends ViewDataBinding {
    public final RelativeLayout aboveInfo;
    public final CardView aboveInfoRoot;
    public final TextView acknowledgeNoText;
    public final CircleImageView circleImage;
    public final LinearLayout detailSection;
    public final GifImageView gifStatus;
    public final TextView givenAckno;
    public final TextView givenBalance;
    public final TextView givenBalanceText;
    public final TextView givenBankName;
    public final TextView givenBankNameText;
    public final TextView givenDateTime;
    public final TextView givenDateTimeText;
    public final RelativeLayout headTransaction;
    @Bindable
    protected AnalyticsResponseModel mRegularDetailModel;
    public final RecyclerView miniStateRecycler;
    public final RelativeLayout miniStatementLayout;
    public final TextView responseCloseBal;
    public final TextView responseCommAm;
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
    protected ActivityMiniStatementAnalyticBinding(Object _bindingComponent, View _root, int _localFieldCount, RelativeLayout aboveInfo2, CardView aboveInfoRoot2, TextView acknowledgeNoText2, CircleImageView circleImage2, LinearLayout detailSection2, GifImageView gifStatus2, TextView givenAckno2, TextView givenBalance2, TextView givenBalanceText2, TextView givenBankName2, TextView givenBankNameText2, TextView givenDateTime2, TextView givenDateTimeText2, RelativeLayout headTransaction2, RecyclerView miniStateRecycler2, RelativeLayout miniStatementLayout2, TextView responseCloseBal2, TextView responseCommAm2, TextView responseDate2, TextView responseMessage2, TextView responseMobile2, TextView responseOpId2, TextView responseOpenBal2, TextView textStatus2, TextView transactionID2, TextView transactionType2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aboveInfo = aboveInfo2;
        this.aboveInfoRoot = aboveInfoRoot2;
        this.acknowledgeNoText = acknowledgeNoText2;
        this.circleImage = circleImage2;
        this.detailSection = detailSection2;
        this.gifStatus = gifStatus2;
        this.givenAckno = givenAckno2;
        this.givenBalance = givenBalance2;
        this.givenBalanceText = givenBalanceText2;
        this.givenBankName = givenBankName2;
        this.givenBankNameText = givenBankNameText2;
        this.givenDateTime = givenDateTime2;
        this.givenDateTimeText = givenDateTimeText2;
        this.headTransaction = headTransaction2;
        this.miniStateRecycler = miniStateRecycler2;
        this.miniStatementLayout = miniStatementLayout2;
        this.responseCloseBal = responseCloseBal2;
        this.responseCommAm = responseCommAm2;
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

    public static ActivityMiniStatementAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMiniStatementAnalyticBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMiniStatementAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mini_statement_analytic, root, attachToRoot, component);
    }

    public static ActivityMiniStatementAnalyticBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMiniStatementAnalyticBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMiniStatementAnalyticBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mini_statement_analytic, (ViewGroup) null, false, component);
    }

    public static ActivityMiniStatementAnalyticBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMiniStatementAnalyticBinding bind(View view, Object component) {
        return (ActivityMiniStatementAnalyticBinding) bind(component, view, C0330R.layout.activity_mini_statement_analytic);
    }
}
