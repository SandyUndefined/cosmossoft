package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivityAddBeneficiaryBinding extends ViewDataBinding {
    public final TextInputEditText accountHolderName;
    public final TextInputEditText accountNumber;
    public final CardView bankSectionBar;
    public final TextInputEditText beneAddress;
    public final TextInputEditText beneDob;
    public final TextInputEditText benePinCode;
    public final TextInputEditText confirmAccountNumber;
    public final ImageButton getTheContacts;
    public final TextInputEditText ifscCode;
    @Bindable
    protected ToBankViewModel mBeneficiaryViewModel;
    public final Button mobileRechargeButton;
    public final TextInputEditText nickName;
    public final TextInputEditText phoneNumber;
    public final TextView upperTextAddBeneficiary;

    public abstract void setBeneficiaryViewModel(ToBankViewModel toBankViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityAddBeneficiaryBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText accountHolderName2, TextInputEditText accountNumber2, CardView bankSectionBar2, TextInputEditText beneAddress2, TextInputEditText beneDob2, TextInputEditText benePinCode2, TextInputEditText confirmAccountNumber2, ImageButton getTheContacts2, TextInputEditText ifscCode2, Button mobileRechargeButton2, TextInputEditText nickName2, TextInputEditText phoneNumber2, TextView upperTextAddBeneficiary2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.accountHolderName = accountHolderName2;
        this.accountNumber = accountNumber2;
        this.bankSectionBar = bankSectionBar2;
        this.beneAddress = beneAddress2;
        this.beneDob = beneDob2;
        this.benePinCode = benePinCode2;
        this.confirmAccountNumber = confirmAccountNumber2;
        this.getTheContacts = getTheContacts2;
        this.ifscCode = ifscCode2;
        this.mobileRechargeButton = mobileRechargeButton2;
        this.nickName = nickName2;
        this.phoneNumber = phoneNumber2;
        this.upperTextAddBeneficiary = upperTextAddBeneficiary2;
    }

    public ToBankViewModel getBeneficiaryViewModel() {
        return this.mBeneficiaryViewModel;
    }

    public static ActivityAddBeneficiaryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddBeneficiaryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAddBeneficiaryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_add_beneficiary, root, attachToRoot, component);
    }

    public static ActivityAddBeneficiaryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddBeneficiaryBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAddBeneficiaryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_add_beneficiary, (ViewGroup) null, false, component);
    }

    public static ActivityAddBeneficiaryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAddBeneficiaryBinding bind(View view, Object component) {
        return (ActivityAddBeneficiaryBinding) bind(component, view, C0330R.layout.activity_add_beneficiary);
    }
}
