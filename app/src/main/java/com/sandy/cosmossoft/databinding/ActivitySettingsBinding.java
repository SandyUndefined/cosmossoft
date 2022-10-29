package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public abstract class ActivitySettingsBinding extends ViewDataBinding {
    public final TextInputEditText confirmPassword;
    public final TextInputLayout editConfirmPassword;
    public final TextInputLayout editMobile;
    public final TextInputLayout editNewPassword;
    public final TextInputLayout editOldPassword;
    @Bindable
    protected ProfileViewModel mProfileViewModel;
    @Bindable
    protected User mUserModel;
    public final TextInputEditText newPassword;
    public final TextInputEditText oldPassword;
    public final Button updateSettingsDetails;

    public abstract void setProfileViewModel(ProfileViewModel profileViewModel);

    public abstract void setUserModel(User user);

    protected ActivitySettingsBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText confirmPassword2, TextInputLayout editConfirmPassword2, TextInputLayout editMobile2, TextInputLayout editNewPassword2, TextInputLayout editOldPassword2, TextInputEditText newPassword2, TextInputEditText oldPassword2, Button updateSettingsDetails2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.confirmPassword = confirmPassword2;
        this.editConfirmPassword = editConfirmPassword2;
        this.editMobile = editMobile2;
        this.editNewPassword = editNewPassword2;
        this.editOldPassword = editOldPassword2;
        this.newPassword = newPassword2;
        this.oldPassword = oldPassword2;
        this.updateSettingsDetails = updateSettingsDetails2;
    }

    public ProfileViewModel getProfileViewModel() {
        return this.mProfileViewModel;
    }

    public User getUserModel() {
        return this.mUserModel;
    }

    public static ActivitySettingsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySettingsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySettingsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_settings, root, attachToRoot, component);
    }

    public static ActivitySettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySettingsBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySettingsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_settings, (ViewGroup) null, false, component);
    }

    public static ActivitySettingsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySettingsBinding bind(View view, Object component) {
        return (ActivitySettingsBinding) bind(component, view, C0330R.layout.activity_settings);
    }
}
