package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;

public abstract class ActivityBalanceEnquiryBinding extends ViewDataBinding {
    public final TextInputEditText aadhaarNumber;
    public final TextInputLayout adhaarLayout;
    public final TextInputLayout bankListLayout;
    public final Button captureFingerPrintButton;
    public final CardView infoSection;
    @Bindable
    protected AepsViewModel mBalanceEnquiryViewModel;
    public final TextInputEditText mobileNumber;
    public final TextInputLayout numberLayout;
    public final TextInputEditText selectedBankName;

    public abstract void setBalanceEnquiryViewModel(AepsViewModel aepsViewModel);

    protected ActivityBalanceEnquiryBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText aadhaarNumber2, TextInputLayout adhaarLayout2, TextInputLayout bankListLayout2, Button captureFingerPrintButton2, CardView infoSection2, TextInputEditText mobileNumber2, TextInputLayout numberLayout2, TextInputEditText selectedBankName2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aadhaarNumber = aadhaarNumber2;
        this.adhaarLayout = adhaarLayout2;
        this.bankListLayout = bankListLayout2;
        this.captureFingerPrintButton = captureFingerPrintButton2;
        this.infoSection = infoSection2;
        this.mobileNumber = mobileNumber2;
        this.numberLayout = numberLayout2;
        this.selectedBankName = selectedBankName2;
    }

    public AepsViewModel getBalanceEnquiryViewModel() {
        return this.mBalanceEnquiryViewModel;
    }

    public static ActivityBalanceEnquiryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBalanceEnquiryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityBalanceEnquiryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_balance_enquiry, root, attachToRoot, component);
    }

    public static ActivityBalanceEnquiryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBalanceEnquiryBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityBalanceEnquiryBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_balance_enquiry, (ViewGroup) null, false, component);
    }

    public static ActivityBalanceEnquiryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBalanceEnquiryBinding bind(View view, Object component) {
        return (ActivityBalanceEnquiryBinding) bind(component, view, C0330R.layout.activity_balance_enquiry);
    }
}
