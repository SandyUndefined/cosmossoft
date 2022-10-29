package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;

public abstract class ActivityDetailedHistoryScreenBinding extends ViewDataBinding {
    public final TextView amount;
    public final TextView beneficiaryAccountNo;
    public final LinearLayout beneficiaryDetails;
    public final ImageView beneficiaryImage;
    public final TextView beneficiaryName;
    public final TextView copyReferenceId;
    @Bindable
    protected BeneficiaryHistoryResponse mWholeInfoModel;

    public abstract void setWholeInfoModel(BeneficiaryHistoryResponse beneficiaryHistoryResponse);

    protected ActivityDetailedHistoryScreenBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView amount2, TextView beneficiaryAccountNo2, LinearLayout beneficiaryDetails2, ImageView beneficiaryImage2, TextView beneficiaryName2, TextView copyReferenceId2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.amount = amount2;
        this.beneficiaryAccountNo = beneficiaryAccountNo2;
        this.beneficiaryDetails = beneficiaryDetails2;
        this.beneficiaryImage = beneficiaryImage2;
        this.beneficiaryName = beneficiaryName2;
        this.copyReferenceId = copyReferenceId2;
    }

    public BeneficiaryHistoryResponse getWholeInfoModel() {
        return this.mWholeInfoModel;
    }

    public static ActivityDetailedHistoryScreenBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityDetailedHistoryScreenBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityDetailedHistoryScreenBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_detailed_history_screen, root, attachToRoot, component);
    }

    public static ActivityDetailedHistoryScreenBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityDetailedHistoryScreenBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityDetailedHistoryScreenBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_detailed_history_screen, (ViewGroup) null, false, component);
    }

    public static ActivityDetailedHistoryScreenBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityDetailedHistoryScreenBinding bind(View view, Object component) {
        return (ActivityDetailedHistoryScreenBinding) bind(component, view, C0330R.layout.activity_detailed_history_screen);
    }
}
