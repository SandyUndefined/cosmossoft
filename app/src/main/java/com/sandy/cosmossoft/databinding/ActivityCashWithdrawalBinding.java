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

public abstract class ActivityCashWithdrawalBinding extends ViewDataBinding {
    public final TextInputEditText aadhaarNumber;
    public final TextInputLayout aadharLayout;
    public final TextInputLayout amountLayout;
    public final TextInputEditText amountNumber;
    public final TextInputLayout bankListLayout;
    public final Button captureFingerPrintButton;
    public final CardView infoSection;
    @Bindable
    protected AepsViewModel mCashWithdrawalViewModel;
    public final TextInputLayout mobileLayout;
    public final TextInputEditText mobileNumber;
    public final TextInputEditText selectedBankName;

    public abstract void setCashWithdrawalViewModel(AepsViewModel aepsViewModel);

    protected ActivityCashWithdrawalBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText aadhaarNumber2, TextInputLayout aadharLayout2, TextInputLayout amountLayout2, TextInputEditText amountNumber2, TextInputLayout bankListLayout2, Button captureFingerPrintButton2, CardView infoSection2, TextInputLayout mobileLayout2, TextInputEditText mobileNumber2, TextInputEditText selectedBankName2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aadhaarNumber = aadhaarNumber2;
        this.aadharLayout = aadharLayout2;
        this.amountLayout = amountLayout2;
        this.amountNumber = amountNumber2;
        this.bankListLayout = bankListLayout2;
        this.captureFingerPrintButton = captureFingerPrintButton2;
        this.infoSection = infoSection2;
        this.mobileLayout = mobileLayout2;
        this.mobileNumber = mobileNumber2;
        this.selectedBankName = selectedBankName2;
    }

    public AepsViewModel getCashWithdrawalViewModel() {
        return this.mCashWithdrawalViewModel;
    }

    public static ActivityCashWithdrawalBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCashWithdrawalBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityCashWithdrawalBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_cash_withdrawal, root, attachToRoot, component);
    }

    public static ActivityCashWithdrawalBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCashWithdrawalBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityCashWithdrawalBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_cash_withdrawal, (ViewGroup) null, false, component);
    }

    public static ActivityCashWithdrawalBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCashWithdrawalBinding bind(View view, Object component) {
        return (ActivityCashWithdrawalBinding) bind(component, view, C0330R.layout.activity_cash_withdrawal);
    }
}
