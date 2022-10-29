package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public abstract class FragmentSignUpBinding extends ViewDataBinding {
    public final MaterialButton buttonLogin;
    public final MaterialButton buttonRegister;
    public final TextInputLayout editEmail;
    public final TextInputLayout editFirstName;
    public final TextInputLayout editLastName;
    public final TextInputLayout editMobile;
    public final LinearLayout editNames;
    public final TextInputEditText firstNumber;
    public final ImageView imageView2;
    @Bindable
    protected AuthViewModel mMyviewmodel;

    public abstract void setMyviewmodel(AuthViewModel authViewModel);

    protected FragmentSignUpBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton buttonLogin2, MaterialButton buttonRegister2, TextInputLayout editEmail2, TextInputLayout editFirstName2, TextInputLayout editLastName2, TextInputLayout editMobile2, LinearLayout editNames2, TextInputEditText firstNumber2, ImageView imageView22) {
        super(_bindingComponent, _root, _localFieldCount);
        this.buttonLogin = buttonLogin2;
        this.buttonRegister = buttonRegister2;
        this.editEmail = editEmail2;
        this.editFirstName = editFirstName2;
        this.editLastName = editLastName2;
        this.editMobile = editMobile2;
        this.editNames = editNames2;
        this.firstNumber = firstNumber2;
        this.imageView2 = imageView22;
    }

    public AuthViewModel getMyviewmodel() {
        return this.mMyviewmodel;
    }

    public static FragmentSignUpBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignUpBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSignUpBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_sign_up, root, attachToRoot, component);
    }

    public static FragmentSignUpBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignUpBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSignUpBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.fragment_sign_up, (ViewGroup) null, false, component);
    }

    public static FragmentSignUpBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSignUpBinding bind(View view, Object component) {
        return (FragmentSignUpBinding) bind(component, view, C0330R.layout.fragment_sign_up);
    }
}
