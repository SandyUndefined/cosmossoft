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

public abstract class FragmentChangePasswordBinding extends ViewDataBinding {
    public final MaterialButton buttonForgotPassword;
    public final MaterialButton buttonRegister;
    public final ImageView imageView2;
    @Bindable
    protected AuthViewModel mMyviewmodel;
    public final TextInputEditText passwordFirst;
    public final TextInputLayout passwordFirstL;
    public final TextInputEditText passwordSecond;
    public final TextInputLayout passwordSecondS;

    public abstract void setMyviewmodel(AuthViewModel authViewModel);

    protected FragmentChangePasswordBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton buttonForgotPassword2, MaterialButton buttonRegister2, ImageView imageView22, TextInputEditText passwordFirst2, TextInputLayout passwordFirstL2, TextInputEditText passwordSecond2, TextInputLayout passwordSecondS2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.buttonForgotPassword = buttonForgotPassword2;
        this.buttonRegister = buttonRegister2;
        this.imageView2 = imageView22;
        this.passwordFirst = passwordFirst2;
        this.passwordFirstL = passwordFirstL2;
        this.passwordSecond = passwordSecond2;
        this.passwordSecondS = passwordSecondS2;
    }

    public AuthViewModel getMyviewmodel() {
        return this.mMyviewmodel;
    }

    public static FragmentChangePasswordBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangePasswordBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentChangePasswordBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_change_password, root, attachToRoot, component);
    }

    public static FragmentChangePasswordBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangePasswordBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentChangePasswordBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_change_password, (ViewGroup) null, false, component);
    }

    public static FragmentChangePasswordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentChangePasswordBinding bind(View view, Object component) {
        return (FragmentChangePasswordBinding) bind(component, view, C0330R.layout.fragment_change_password);
    }
}
