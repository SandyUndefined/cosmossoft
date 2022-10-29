package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public abstract class FragmentForgotPasswordBinding extends ViewDataBinding {
    public final MaterialButton buttonForgotPassword;
    public final MaterialButton buttonRegister;
    public final TextInputLayout editOtp;
    public final ImageView imageView2;
    @Bindable
    protected AuthViewModel mMyviewmodel;
    public final TextInputEditText mobileNumber;

    public abstract void setMyviewmodel(AuthViewModel authViewModel);

    protected FragmentForgotPasswordBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton buttonForgotPassword2, MaterialButton buttonRegister2, TextInputLayout editOtp2, ImageView imageView22, TextInputEditText mobileNumber2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.buttonForgotPassword = buttonForgotPassword2;
        this.buttonRegister = buttonRegister2;
        this.editOtp = editOtp2;
        this.imageView2 = imageView22;
        this.mobileNumber = mobileNumber2;
    }

    public AuthViewModel getMyviewmodel() {
        return this.mMyviewmodel;
    }

    public static FragmentForgotPasswordBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentForgotPasswordBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentForgotPasswordBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_forgot_password, root, attachToRoot, component);
    }

    public static FragmentForgotPasswordBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentForgotPasswordBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentForgotPasswordBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_forgot_password, (ViewGroup) null, false, component);
    }

    public static FragmentForgotPasswordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentForgotPasswordBinding bind(View view, Object component) {
        return (FragmentForgotPasswordBinding) bind(component, view, C0330R.layout.fragment_forgot_password);
    }
}
