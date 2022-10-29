package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;

public abstract class ActivityMicroAtmHomeBinding extends ViewDataBinding {
    public final TextInputLayout amountLayout;
    public final Button btnSubmit;
    public final Button btnWithdraw;
    public final LinearLayout buttonsLayout;
    public final TextInputEditText edAmount;
    public final CardView infoSection;
    public final TextInputLayout microAtmLayout;
    public final TextInputEditText selectedBankName;

    protected ActivityMicroAtmHomeBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputLayout amountLayout2, Button btnSubmit2, Button btnWithdraw2, LinearLayout buttonsLayout2, TextInputEditText edAmount2, CardView infoSection2, TextInputLayout microAtmLayout2, TextInputEditText selectedBankName2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.amountLayout = amountLayout2;
        this.btnSubmit = btnSubmit2;
        this.btnWithdraw = btnWithdraw2;
        this.buttonsLayout = buttonsLayout2;
        this.edAmount = edAmount2;
        this.infoSection = infoSection2;
        this.microAtmLayout = microAtmLayout2;
        this.selectedBankName = selectedBankName2;
    }

    public static ActivityMicroAtmHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMicroAtmHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMicroAtmHomeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_micro_atm_home, root, attachToRoot, component);
    }

    public static ActivityMicroAtmHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMicroAtmHomeBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMicroAtmHomeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_micro_atm_home, (ViewGroup) null, false, component);
    }

    public static ActivityMicroAtmHomeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMicroAtmHomeBinding bind(View view, Object component) {
        return (ActivityMicroAtmHomeBinding) bind(component, view, C0330R.layout.activity_micro_atm_home);
    }
}
