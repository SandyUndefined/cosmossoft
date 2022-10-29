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

public abstract class ActivityMiniStatementBinding extends ViewDataBinding {
    public final TextInputEditText aadhaarNumber;
    public final TextInputLayout aadhaarNumberLayout;
    public final Button captureFingerPrintButton;
    public final CardView infoSection;
    @Bindable
    protected AepsViewModel mMiniStatementViewModel;
    public final TextInputEditText mobileNumber;
    public final TextInputLayout mobileNumberLayout;
    public final TextInputLayout selectBankLayout;
    public final TextInputEditText selectedBankName;

    public abstract void setMiniStatementViewModel(AepsViewModel aepsViewModel);

    protected ActivityMiniStatementBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText aadhaarNumber2, TextInputLayout aadhaarNumberLayout2, Button captureFingerPrintButton2, CardView infoSection2, TextInputEditText mobileNumber2, TextInputLayout mobileNumberLayout2, TextInputLayout selectBankLayout2, TextInputEditText selectedBankName2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aadhaarNumber = aadhaarNumber2;
        this.aadhaarNumberLayout = aadhaarNumberLayout2;
        this.captureFingerPrintButton = captureFingerPrintButton2;
        this.infoSection = infoSection2;
        this.mobileNumber = mobileNumber2;
        this.mobileNumberLayout = mobileNumberLayout2;
        this.selectBankLayout = selectBankLayout2;
        this.selectedBankName = selectedBankName2;
    }

    public AepsViewModel getMiniStatementViewModel() {
        return this.mMiniStatementViewModel;
    }

    public static ActivityMiniStatementBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMiniStatementBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMiniStatementBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mini_statement, root, attachToRoot, component);
    }

    public static ActivityMiniStatementBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMiniStatementBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMiniStatementBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mini_statement, (ViewGroup) null, false, component);
    }

    public static ActivityMiniStatementBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMiniStatementBinding bind(View view, Object component) {
        return (ActivityMiniStatementBinding) bind(component, view, C0330R.layout.activity_mini_statement);
    }
}
