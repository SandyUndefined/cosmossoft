package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;

public abstract class BeneficiaryHistoryLayoutBinding extends ViewDataBinding {
    public final ImageView clickUpdate;
    public final RelativeLayout firstLayout;
    public final CardView historyTopSection;
    @Bindable
    protected BeneficiaryHistoryResponse mHistoryModelResponse;
    public final MaterialButton refundButton;
    public final TextView rupeeAmount;
    public final TextView rupeeSign;
    public final TextView statusHistory;
    public final TextView timeDate;

    public abstract void setHistoryModelResponse(BeneficiaryHistoryResponse beneficiaryHistoryResponse);

    protected BeneficiaryHistoryLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView clickUpdate2, RelativeLayout firstLayout2, CardView historyTopSection2, MaterialButton refundButton2, TextView rupeeAmount2, TextView rupeeSign2, TextView statusHistory2, TextView timeDate2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clickUpdate = clickUpdate2;
        this.firstLayout = firstLayout2;
        this.historyTopSection = historyTopSection2;
        this.refundButton = refundButton2;
        this.rupeeAmount = rupeeAmount2;
        this.rupeeSign = rupeeSign2;
        this.statusHistory = statusHistory2;
        this.timeDate = timeDate2;
    }

    public BeneficiaryHistoryResponse getHistoryModelResponse() {
        return this.mHistoryModelResponse;
    }

    public static BeneficiaryHistoryLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BeneficiaryHistoryLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (BeneficiaryHistoryLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.beneficiary_history_layout, root, attachToRoot, component);
    }

    public static BeneficiaryHistoryLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BeneficiaryHistoryLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (BeneficiaryHistoryLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.beneficiary_history_layout, (ViewGroup) null, false, component);
    }

    public static BeneficiaryHistoryLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BeneficiaryHistoryLayoutBinding bind(View view, Object component) {
        return (BeneficiaryHistoryLayoutBinding) bind(component, view, C0330R.layout.beneficiary_history_layout);
    }
}
