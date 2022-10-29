package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public abstract class ActivityProfileDetailsBinding extends ViewDataBinding {
    public final TextInputEditText editAddress;
    public final TextInputEditText editAlternateMobileNumber;
    public final TextInputEditText editCountry;
    public final TextInputEditText editEmail;
    public final TextInputEditText editFirstName;
    public final TextInputEditText editLastName;
    public final TextInputEditText editMobileNumber;
    public final TextInputEditText editPin;
    public final TextInputEditText editState;
    public final RadioButton feMale;
    public final RadioGroup genderRadio;
    public final CardView infoSection;
    @Bindable
    protected ProfileViewModel mProfileDetailsModel;
    @Bindable
    protected User mUserModel;
    @Bindable
    protected UserProfile mUserProfileModel;
    public final RadioButton male;
    public final RadioButton others;
    public final TextInputEditText selectedDOB;
    public final Button updateTheProfileDetails;

    public abstract void setProfileDetailsModel(ProfileViewModel profileViewModel);

    public abstract void setUserModel(User user);

    public abstract void setUserProfileModel(UserProfile userProfile);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityProfileDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText editAddress2, TextInputEditText editAlternateMobileNumber2, TextInputEditText editCountry2, TextInputEditText editEmail2, TextInputEditText editFirstName2, TextInputEditText editLastName2, TextInputEditText editMobileNumber2, TextInputEditText editPin2, TextInputEditText editState2, RadioButton feMale2, RadioGroup genderRadio2, CardView infoSection2, RadioButton male2, RadioButton others2, TextInputEditText selectedDOB2, Button updateTheProfileDetails2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.editAddress = editAddress2;
        this.editAlternateMobileNumber = editAlternateMobileNumber2;
        this.editCountry = editCountry2;
        this.editEmail = editEmail2;
        this.editFirstName = editFirstName2;
        this.editLastName = editLastName2;
        this.editMobileNumber = editMobileNumber2;
        this.editPin = editPin2;
        this.editState = editState2;
        this.feMale = feMale2;
        this.genderRadio = genderRadio2;
        this.infoSection = infoSection2;
        this.male = male2;
        this.others = others2;
        this.selectedDOB = selectedDOB2;
        this.updateTheProfileDetails = updateTheProfileDetails2;
    }

    public ProfileViewModel getProfileDetailsModel() {
        return this.mProfileDetailsModel;
    }

    public User getUserModel() {
        return this.mUserModel;
    }

    public UserProfile getUserProfileModel() {
        return this.mUserProfileModel;
    }

    public static ActivityProfileDetailsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityProfileDetailsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityProfileDetailsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_profile_details, root, attachToRoot, component);
    }

    public static ActivityProfileDetailsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityProfileDetailsBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityProfileDetailsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_profile_details, (ViewGroup) null, false, component);
    }

    public static ActivityProfileDetailsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityProfileDetailsBinding bind(View view, Object component) {
        return (ActivityProfileDetailsBinding) bind(component, view, C0330R.layout.activity_profile_details);
    }
}
