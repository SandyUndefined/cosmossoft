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
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public abstract class ActivityBankDetailsBinding extends ViewDataBinding {
    public final TextInputLayout aadharCardImage;
    public final TextInputLayout accountHolderName;
    public final TextInputLayout confirmAccountNumber;
    public final TextInputLayout ediPassbook;
    public final TextInputLayout editAadharNo;
    public final TextInputLayout editAcoountNo;
    public final TextInputLayout editBankBranch;
    public final TextInputLayout editIfsc;
    public final TextInputLayout editPanCard;
    @Bindable
    protected ProfileViewModel mBankDetailsViewModel;
    @Bindable
    protected UserProfile mUserProfileModel;
    public final TextInputLayout panCardImage;
    public final TextInputEditText selectAadhar;
    public final TextInputLayout selectBank;
    public final TextInputEditText selectPan;
    public final TextInputEditText selectPassbook;
    public final Button updateBankDetails;

    public abstract void setBankDetailsViewModel(ProfileViewModel profileViewModel);

    public abstract void setUserProfileModel(UserProfile userProfile);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityBankDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputLayout aadharCardImage2, TextInputLayout accountHolderName2, TextInputLayout confirmAccountNumber2, TextInputLayout ediPassbook2, TextInputLayout editAadharNo2, TextInputLayout editAcoountNo2, TextInputLayout editBankBranch2, TextInputLayout editIfsc2, TextInputLayout editPanCard2, TextInputLayout panCardImage2, TextInputEditText selectAadhar2, TextInputLayout selectBank2, TextInputEditText selectPan2, TextInputEditText selectPassbook2, Button updateBankDetails2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aadharCardImage = aadharCardImage2;
        this.accountHolderName = accountHolderName2;
        this.confirmAccountNumber = confirmAccountNumber2;
        this.ediPassbook = ediPassbook2;
        this.editAadharNo = editAadharNo2;
        this.editAcoountNo = editAcoountNo2;
        this.editBankBranch = editBankBranch2;
        this.editIfsc = editIfsc2;
        this.editPanCard = editPanCard2;
        this.panCardImage = panCardImage2;
        this.selectAadhar = selectAadhar2;
        this.selectBank = selectBank2;
        this.selectPan = selectPan2;
        this.selectPassbook = selectPassbook2;
        this.updateBankDetails = updateBankDetails2;
    }

    public ProfileViewModel getBankDetailsViewModel() {
        return this.mBankDetailsViewModel;
    }

    public UserProfile getUserProfileModel() {
        return this.mUserProfileModel;
    }

    public static ActivityBankDetailsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBankDetailsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityBankDetailsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_bank_details, root, attachToRoot, component);
    }

    public static ActivityBankDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBankDetailsBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityBankDetailsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_bank_details, (ViewGroup) null, false, component);
    }

    public static ActivityBankDetailsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBankDetailsBinding bind(View view, Object component) {
        return (ActivityBankDetailsBinding) bind(component, view, C0330R.layout.activity_bank_details);
    }
}
