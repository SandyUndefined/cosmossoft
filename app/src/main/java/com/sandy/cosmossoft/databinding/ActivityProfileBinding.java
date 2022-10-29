package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import p004at.markushi.p012ui.CircleButton;
import p005de.hdodenhof.circleimageview.CircleImageView;

public abstract class ActivityProfileBinding extends ViewDataBinding {
    public final RecyclerView listRecycler;
    @Bindable
    protected User mNameNumber;
    @Bindable
    protected ProfileViewModel mProfileViewModel;
    @Bindable
    protected UserProfile mUserProfile;
    public final CircleButton onChangePicture;
    public final RelativeLayout pictureSections;
    public final CircleImageView profileImage;
    public final ProfileTopToolbarBinding toolbar;

    public abstract void setNameNumber(User user);

    public abstract void setProfileViewModel(ProfileViewModel profileViewModel);

    public abstract void setUserProfile(UserProfile userProfile);

    protected ActivityProfileBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView listRecycler2, CircleButton onChangePicture2, RelativeLayout pictureSections2, CircleImageView profileImage2, ProfileTopToolbarBinding toolbar2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.listRecycler = listRecycler2;
        this.onChangePicture = onChangePicture2;
        this.pictureSections = pictureSections2;
        this.profileImage = profileImage2;
        this.toolbar = toolbar2;
    }

    public ProfileViewModel getProfileViewModel() {
        return this.mProfileViewModel;
    }

    public User getNameNumber() {
        return this.mNameNumber;
    }

    public UserProfile getUserProfile() {
        return this.mUserProfile;
    }

    public static ActivityProfileBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityProfileBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityProfileBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_profile, root, attachToRoot, component);
    }

    public static ActivityProfileBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityProfileBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityProfileBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_profile, (ViewGroup) null, false, component);
    }

    public static ActivityProfileBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityProfileBinding bind(View view, Object component) {
        return (ActivityProfileBinding) bind(component, view, C0330R.layout.activity_profile);
    }
}
