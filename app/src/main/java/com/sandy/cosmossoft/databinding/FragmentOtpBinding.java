package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public abstract class FragmentOtpBinding extends ViewDataBinding {
    public final MaterialButton CreateAccountBCard;
    public final ConstraintLayout OtpSection;
    public final MaterialButton buttonLogin;
    public final ConstraintLayout createPasswordSection;
    public final TextInputLayout editOtp;
    public final TextInputLayout editPassword1;
    public final TextInputLayout editPassword2;
    @Bindable
    protected AuthViewModel mMyviewmodel;
    public final TextInputEditText otp;

    public abstract void setMyviewmodel(AuthViewModel authViewModel);

    protected FragmentOtpBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton CreateAccountBCard2, ConstraintLayout OtpSection2, MaterialButton buttonLogin2, ConstraintLayout createPasswordSection2, TextInputLayout editOtp2, TextInputLayout editPassword12, TextInputLayout editPassword22, TextInputEditText otp2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.CreateAccountBCard = CreateAccountBCard2;
        this.OtpSection = OtpSection2;
        this.buttonLogin = buttonLogin2;
        this.createPasswordSection = createPasswordSection2;
        this.editOtp = editOtp2;
        this.editPassword1 = editPassword12;
        this.editPassword2 = editPassword22;
        this.otp = otp2;
    }

    public AuthViewModel getMyviewmodel() {
        return this.mMyviewmodel;
    }

    public static FragmentOtpBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOtpBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentOtpBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_otp, root, attachToRoot, component);
    }

    public static FragmentOtpBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOtpBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentOtpBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_otp, (ViewGroup) null, false, component);
    }

    public static FragmentOtpBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOtpBinding bind(View view, Object component) {
        return (FragmentOtpBinding) bind(component, view, C0330R.layout.fragment_otp);
    }
}
