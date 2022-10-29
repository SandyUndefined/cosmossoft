package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;

public abstract class AnalyticDesignLayoutBinding extends ViewDataBinding {
    public final TextView AnalyticAmount;
    public final TextView AnalyticAmountLeft;
    public final TextView AnalyticAmountStatus;
    public final TextView AnalyticDateTime;
    public final ImageView AnalyticLogo;
    public final TextView AnalyticMN;
    public final TextView AnalyticOPID;
    public final TextView AnalyticOperator;
    public final TextView AnalyticTxnID;
    public final TextView AnalyticUserCommissionAmount;
    public final TextView AnalyticUserMobile;
    public final RelativeLayout TopSectionAnalytic;
    public final MaterialButton checkDetails;
    @Bindable
    protected AnalyticsResponseModel mAnalyticDataModel;
    public final TextView operatorText;
    public final MaterialButton updateButton;

    public abstract void setAnalyticDataModel(AnalyticsResponseModel analyticsResponseModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AnalyticDesignLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView AnalyticAmount2, TextView AnalyticAmountLeft2, TextView AnalyticAmountStatus2, TextView AnalyticDateTime2, ImageView AnalyticLogo2, TextView AnalyticMN2, TextView AnalyticOPID2, TextView AnalyticOperator2, TextView AnalyticTxnID2, TextView AnalyticUserCommissionAmount2, TextView AnalyticUserMobile2, RelativeLayout TopSectionAnalytic2, MaterialButton checkDetails2, TextView operatorText2, MaterialButton updateButton2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.AnalyticAmount = AnalyticAmount2;
        this.AnalyticAmountLeft = AnalyticAmountLeft2;
        this.AnalyticAmountStatus = AnalyticAmountStatus2;
        this.AnalyticDateTime = AnalyticDateTime2;
        this.AnalyticLogo = AnalyticLogo2;
        this.AnalyticMN = AnalyticMN2;
        this.AnalyticOPID = AnalyticOPID2;
        this.AnalyticOperator = AnalyticOperator2;
        this.AnalyticTxnID = AnalyticTxnID2;
        this.AnalyticUserCommissionAmount = AnalyticUserCommissionAmount2;
        this.AnalyticUserMobile = AnalyticUserMobile2;
        this.TopSectionAnalytic = TopSectionAnalytic2;
        this.checkDetails = checkDetails2;
        this.operatorText = operatorText2;
        this.updateButton = updateButton2;
    }

    public AnalyticsResponseModel getAnalyticDataModel() {
        return this.mAnalyticDataModel;
    }

    public static AnalyticDesignLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AnalyticDesignLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (AnalyticDesignLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.analytic_design_layout, root, attachToRoot, component);
    }

    public static AnalyticDesignLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AnalyticDesignLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (AnalyticDesignLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.analytic_design_layout, (ViewGroup) null, false, component);
    }

    public static AnalyticDesignLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AnalyticDesignLayoutBinding bind(View view, Object component) {
        return (AnalyticDesignLayoutBinding) bind(component, view, C0330R.layout.analytic_design_layout);
    }
}
