package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivityRegisterRemitterBinding extends ViewDataBinding {
    public final TextInputEditText address;
    public final MaterialButton buttonApply;
    public final TextInputEditText dateOfBirth;
    public final TextInputLayout editAddress;
    public final TextInputLayout editDob;
    public final TextInputLayout editMobileLayout;
    public final LinearLayout editNames;
    public final TextInputLayout editOtp;
    public final TextInputLayout editPinCode;
    public final TextInputEditText firstName;
    public final TextInputLayout firstNameLayout;
    public final TextInputEditText lastName;
    public final TextInputLayout lastNameLayout;
    @Bindable
    protected ToBankViewModel mRegisterRemitter;
    public final TextInputEditText mobileNumber;
    public final TextInputEditText otpEdit;
    public final TextInputEditText pinCode;

    public abstract void setRegisterRemitter(ToBankViewModel toBankViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityRegisterRemitterBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText address2, MaterialButton buttonApply2, TextInputEditText dateOfBirth2, TextInputLayout editAddress2, TextInputLayout editDob2, TextInputLayout editMobileLayout2, LinearLayout editNames2, TextInputLayout editOtp2, TextInputLayout editPinCode2, TextInputEditText firstName2, TextInputLayout firstNameLayout2, TextInputEditText lastName2, TextInputLayout lastNameLayout2, TextInputEditText mobileNumber2, TextInputEditText otpEdit2, TextInputEditText pinCode2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.address = address2;
        this.buttonApply = buttonApply2;
        this.dateOfBirth = dateOfBirth2;
        this.editAddress = editAddress2;
        this.editDob = editDob2;
        this.editMobileLayout = editMobileLayout2;
        this.editNames = editNames2;
        this.editOtp = editOtp2;
        this.editPinCode = editPinCode2;
        this.firstName = firstName2;
        this.firstNameLayout = firstNameLayout2;
        this.lastName = lastName2;
        this.lastNameLayout = lastNameLayout2;
        this.mobileNumber = mobileNumber2;
        this.otpEdit = otpEdit2;
        this.pinCode = pinCode2;
    }

    public ToBankViewModel getRegisterRemitter() {
        return this.mRegisterRemitter;
    }

    public static ActivityRegisterRemitterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegisterRemitterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityRegisterRemitterBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_register_remitter, root, attachToRoot, component);
    }

    public static ActivityRegisterRemitterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegisterRemitterBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityRegisterRemitterBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_register_remitter, (ViewGroup) null, false, component);
    }

    public static ActivityRegisterRemitterBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegisterRemitterBinding bind(View view, Object component) {
        return (ActivityRegisterRemitterBinding) bind(component, view, C0330R.layout.activity_register_remitter);
    }
}
