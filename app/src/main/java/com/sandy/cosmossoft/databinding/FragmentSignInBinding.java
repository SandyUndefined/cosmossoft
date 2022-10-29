package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public abstract class FragmentSignInBinding extends ViewDataBinding {
    public final ConstraintLayout SignInRootLayout;
    public final MaterialButton buttonLogin;
    public final MaterialButton buttonRegister;
    public final MaterialButton buttonReset;
    public final TextInputLayout editMobile;
    public final TextInputLayout editPassword;
    public final ImageView imageView2;
    public final TextInputEditText loginotp;
    @Bindable
    protected AuthViewModel mMyviewmodel;
    public final TextInputEditText mobileNumber;
    public final TextInputLayout otpfield;
    public final TextInputEditText password;

    public abstract void setMyviewmodel(AuthViewModel authViewModel);

    protected FragmentSignInBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout SignInRootLayout2, MaterialButton buttonLogin2, MaterialButton buttonRegister2, MaterialButton buttonReset2, TextInputLayout editMobile2, TextInputLayout editPassword2, ImageView imageView22, TextInputEditText loginotp2, TextInputEditText mobileNumber2, TextInputLayout otpfield2, TextInputEditText password2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.SignInRootLayout = SignInRootLayout2;
        this.buttonLogin = buttonLogin2;
        this.buttonRegister = buttonRegister2;
        this.buttonReset = buttonReset2;
        this.editMobile = editMobile2;
        this.editPassword = editPassword2;
        this.imageView2 = imageView22;
        this.loginotp = loginotp2;
        this.mobileNumber = mobileNumber2;
        this.otpfield = otpfield2;
        this.password = password2;
    }

    public AuthViewModel getMyviewmodel() {
        return this.mMyviewmodel;
    }

    public static FragmentSignInBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignInBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSignInBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_sign_in, root, attachToRoot, component);
    }

    public static FragmentSignInBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignInBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSignInBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_sign_in, (ViewGroup) null, false, component);
    }

    public static FragmentSignInBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignInBinding bind(View view, Object component) {
        return (FragmentSignInBinding) bind(component, view, C0330R.layout.fragment_sign_in);
    }
}
