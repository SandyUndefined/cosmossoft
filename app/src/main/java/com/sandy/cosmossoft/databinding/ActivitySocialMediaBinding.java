package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public abstract class ActivitySocialMediaBinding extends ViewDataBinding {
    public final CardView cardView;
    public final TextInputEditText editDribble;
    public final TextInputEditText editDropbox;
    public final TextInputEditText editFacebook;
    public final TextInputEditText editGooglePlus;
    public final TextInputEditText editInstagram;
    public final TextInputEditText editLinkedin;
    public final TextInputEditText editPinterest;
    public final TextInputEditText editSkype;
    public final TextInputEditText editTwitter;
    public final TextInputEditText editVine;
    public final ScrollView infoSection;
    @Bindable
    protected ProfileViewModel mProfileViewModel;
    @Bindable
    protected UserProfile mUserProfileModel;
    public final Button updateTheSocialDetails;

    public abstract void setProfileViewModel(ProfileViewModel profileViewModel);

    public abstract void setUserProfileModel(UserProfile userProfile);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivitySocialMediaBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView cardView2, TextInputEditText editDribble2, TextInputEditText editDropbox2, TextInputEditText editFacebook2, TextInputEditText editGooglePlus2, TextInputEditText editInstagram2, TextInputEditText editLinkedin2, TextInputEditText editPinterest2, TextInputEditText editSkype2, TextInputEditText editTwitter2, TextInputEditText editVine2, ScrollView infoSection2, Button updateTheSocialDetails2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cardView = cardView2;
        this.editDribble = editDribble2;
        this.editDropbox = editDropbox2;
        this.editFacebook = editFacebook2;
        this.editGooglePlus = editGooglePlus2;
        this.editInstagram = editInstagram2;
        this.editLinkedin = editLinkedin2;
        this.editPinterest = editPinterest2;
        this.editSkype = editSkype2;
        this.editTwitter = editTwitter2;
        this.editVine = editVine2;
        this.infoSection = infoSection2;
        this.updateTheSocialDetails = updateTheSocialDetails2;
    }

    public ProfileViewModel getProfileViewModel() {
        return this.mProfileViewModel;
    }

    public UserProfile getUserProfileModel() {
        return this.mUserProfileModel;
    }

    public static ActivitySocialMediaBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySocialMediaBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySocialMediaBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_social_media, root, attachToRoot, component);
    }

    public static ActivitySocialMediaBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySocialMediaBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySocialMediaBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_social_media, (ViewGroup) null, false, component);
    }

    public static ActivitySocialMediaBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySocialMediaBinding bind(View view, Object component) {
        return (ActivitySocialMediaBinding) bind(component, view, C0330R.layout.activity_social_media);
    }
}
