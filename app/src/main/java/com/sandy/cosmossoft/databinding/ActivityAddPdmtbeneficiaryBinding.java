package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public abstract class ActivityAddPdmtbeneficiaryBinding extends ViewDataBinding {
    public final TextInputEditText accountHolderName;
    public final TextInputEditText accountNumber;
    public final CardView bankSectionBar;
    public final TextInputEditText confirmAccountNumber;
    public final TextInputEditText ifscCode;
    @Bindable
    protected PayoutViewModel mPayoutViewModel;
    public final Button mobileRechargeButton;
    public final TextView upperTextAddBeneficiary;

    public abstract void setPayoutViewModel(PayoutViewModel payoutViewModel);

    protected ActivityAddPdmtbeneficiaryBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText accountHolderName2, TextInputEditText accountNumber2, CardView bankSectionBar2, TextInputEditText confirmAccountNumber2, TextInputEditText ifscCode2, Button mobileRechargeButton2, TextView upperTextAddBeneficiary2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.accountHolderName = accountHolderName2;
        this.accountNumber = accountNumber2;
        this.bankSectionBar = bankSectionBar2;
        this.confirmAccountNumber = confirmAccountNumber2;
        this.ifscCode = ifscCode2;
        this.mobileRechargeButton = mobileRechargeButton2;
        this.upperTextAddBeneficiary = upperTextAddBeneficiary2;
    }

    public PayoutViewModel getPayoutViewModel() {
        return this.mPayoutViewModel;
    }

    public static ActivityAddPdmtbeneficiaryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddPdmtbeneficiaryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAddPdmtbeneficiaryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_add_pdmtbeneficiary, root, attachToRoot, component);
    }

    public static ActivityAddPdmtbeneficiaryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddPdmtbeneficiaryBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAddPdmtbeneficiaryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_add_pdmtbeneficiary, (ViewGroup) null, false, component);
    }

    public static ActivityAddPdmtbeneficiaryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddPdmtbeneficiaryBinding bind(View view, Object component) {
        return (ActivityAddPdmtbeneficiaryBinding) bind(component, view, C0330R.layout.activity_add_pdmtbeneficiary);
    }
}
