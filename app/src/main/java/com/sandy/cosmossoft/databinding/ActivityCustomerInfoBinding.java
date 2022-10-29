package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoModel;

public abstract class ActivityCustomerInfoBinding extends ViewDataBinding {
    public final CardView allPlanCard;
    public final MaterialButton confirm;
    public final TextView customerName;
    public final TextView lastRechargeDate;
    @Bindable
    protected CustomerInfoModel mCustomerInfoModel;
    public final TextView responseCommAm;
    public final TextView responseMobile;
    public final TextView responseOpId;
    public final TextView responseOpName;
    public final TextView responseOpenBal;

    public abstract void setCustomerInfoModel(CustomerInfoModel customerInfoModel);

    protected ActivityCustomerInfoBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView allPlanCard2, MaterialButton confirm2, TextView customerName2, TextView lastRechargeDate2, TextView responseCommAm2, TextView responseMobile2, TextView responseOpId2, TextView responseOpName2, TextView responseOpenBal2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.allPlanCard = allPlanCard2;
        this.confirm = confirm2;
        this.customerName = customerName2;
        this.lastRechargeDate = lastRechargeDate2;
        this.responseCommAm = responseCommAm2;
        this.responseMobile = responseMobile2;
        this.responseOpId = responseOpId2;
        this.responseOpName = responseOpName2;
        this.responseOpenBal = responseOpenBal2;
    }

    public CustomerInfoModel getCustomerInfoModel() {
        return this.mCustomerInfoModel;
    }

    public static ActivityCustomerInfoBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCustomerInfoBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityCustomerInfoBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_customer_info, root, attachToRoot, component);
    }

    public static ActivityCustomerInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCustomerInfoBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityCustomerInfoBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_customer_info, (ViewGroup) null, false, component);
    }

    public static ActivityCustomerInfoBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCustomerInfoBinding bind(View view, Object component) {
        return (ActivityCustomerInfoBinding) bind(component, view, C0330R.layout.activity_customer_info);
    }
}
