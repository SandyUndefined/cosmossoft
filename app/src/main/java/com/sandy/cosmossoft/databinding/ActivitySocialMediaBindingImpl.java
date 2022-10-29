package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public class ActivitySocialMediaBindingImpl extends ActivitySocialMediaBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener editDribbleandroidTextAttrChanged;
    private InverseBindingListener editDropboxandroidTextAttrChanged;
    private InverseBindingListener editFacebookandroidTextAttrChanged;
    private InverseBindingListener editGooglePlusandroidTextAttrChanged;
    private InverseBindingListener editInstagramandroidTextAttrChanged;
    private InverseBindingListener editLinkedinandroidTextAttrChanged;
    private InverseBindingListener editPinterestandroidTextAttrChanged;
    private InverseBindingListener editSkypeandroidTextAttrChanged;
    private InverseBindingListener editTwitterandroidTextAttrChanged;
    private InverseBindingListener editVineandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mProfileViewModelUpdateSocialMediaDataAndroidViewViewOnClickListener */
    private OnClickListenerImpl f193xe7c93a54;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 12);
        sparseIntArray.put(C0330R.C0333id.cardView, 13);
    }

    public ActivitySocialMediaBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    private ActivitySocialMediaBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[13], bindings[5], bindings[6], bindings[1], bindings[7], bindings[4], bindings[3], bindings[8], bindings[9], bindings[2], bindings[10], bindings[12], bindings[11]);
        this.editDribbleandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editDribble);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setDRIBBLE_BOX_URL(callbackArg_0);
                }
            }
        };
        this.editDropboxandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editDropbox);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setDROPBOX_URL(callbackArg_0);
                }
            }
        };
        this.editFacebookandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editFacebook);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setFACEBOOK_URL(callbackArg_0);
                }
            }
        };
        this.editGooglePlusandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editGooglePlus);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setGOOGLE_PLUS_URL(callbackArg_0);
                }
            }
        };
        this.editInstagramandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editInstagram);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setINSTAGRAM_URL(callbackArg_0);
                }
            }
        };
        this.editLinkedinandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editLinkedin);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setLINKEDIN_URL(callbackArg_0);
                }
            }
        };
        this.editPinterestandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editPinterest);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setPINTEREST_URL(callbackArg_0);
                }
            }
        };
        this.editSkypeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editSkype);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setSKYPE_URL(callbackArg_0);
                }
            }
        };
        this.editTwitterandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editTwitter);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setTWITTER_URL(callbackArg_0);
                }
            }
        };
        this.editVineandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySocialMediaBindingImpl.this.editVine);
                UserProfile userProfileModel = ActivitySocialMediaBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setVINE_URL(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.editDribble.setTag((Object) null);
        this.editDropbox.setTag((Object) null);
        this.editFacebook.setTag((Object) null);
        this.editGooglePlus.setTag((Object) null);
        this.editInstagram.setTag((Object) null);
        this.editLinkedin.setTag((Object) null);
        this.editPinterest.setTag((Object) null);
        this.editSkype.setTag((Object) null);
        this.editTwitter.setTag((Object) null);
        this.editVine.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.updateTheSocialDetails.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int variableId, Object variable) {
        if (40 == variableId) {
            setProfileViewModel((ProfileViewModel) variable);
            return true;
        } else if (56 != variableId) {
            return false;
        } else {
            setUserProfileModel((UserProfile) variable);
            return true;
        }
    }

    public void setProfileViewModel(ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(40);
        super.requestRebind();
    }

    public void setUserProfileModel(UserProfile UserProfileModel) {
        this.mUserProfileModel = UserProfileModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(56);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        String userProfileModelDROPBOXURL;
        String userProfileModelTWITTERURL;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String userProfileModelDRIBBLEBOXURL = null;
        View.OnClickListener profileViewModelUpdateSocialMediaDataAndroidViewViewOnClickListener = null;
        String userProfileModelSKYPEURL = null;
        String userProfileModelLINKEDINURL = null;
        String userProfileModelVINEURL = null;
        ProfileViewModel profileViewModel = this.mProfileViewModel;
        UserProfile userProfileModel = this.mUserProfileModel;
        String userProfileModelPINTERESTURL = null;
        String userProfileModelFACEBOOKURL = null;
        String userProfileModelGOOGLEPLUSURL = null;
        String userProfileModelINSTAGRAMURL = null;
        if (!((dirtyFlags & 5) == 0 || profileViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f193xe7c93a54;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f193xe7c93a54 = onClickListenerImpl;
            }
            profileViewModelUpdateSocialMediaDataAndroidViewViewOnClickListener = onClickListenerImpl.setValue(profileViewModel);
        }
        if ((dirtyFlags & 6) == 0 || userProfileModel == null) {
            ProfileViewModel profileViewModel2 = profileViewModel;
            userProfileModelTWITTERURL = null;
            UserProfile userProfile = userProfileModel;
            userProfileModelDROPBOXURL = null;
        } else {
            userProfileModelDRIBBLEBOXURL = userProfileModel.getDRIBBLE_BOX_URL();
            userProfileModelSKYPEURL = userProfileModel.getSKYPE_URL();
            userProfileModelLINKEDINURL = userProfileModel.getLINKEDIN_URL();
            userProfileModelVINEURL = userProfileModel.getVINE_URL();
            userProfileModelPINTERESTURL = userProfileModel.getPINTEREST_URL();
            userProfileModelFACEBOOKURL = userProfileModel.getFACEBOOK_URL();
            userProfileModelGOOGLEPLUSURL = userProfileModel.getGOOGLE_PLUS_URL();
            userProfileModelINSTAGRAMURL = userProfileModel.getINSTAGRAM_URL();
            ProfileViewModel profileViewModel3 = profileViewModel;
            userProfileModelTWITTERURL = userProfileModel.getTWITTER_URL();
            UserProfile userProfile2 = userProfileModel;
            userProfileModelDROPBOXURL = userProfileModel.getDROPBOX_URL();
        }
        if ((6 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.editDribble, userProfileModelDRIBBLEBOXURL);
            TextViewBindingAdapter.setText(this.editDropbox, userProfileModelDROPBOXURL);
            TextViewBindingAdapter.setText(this.editFacebook, userProfileModelFACEBOOKURL);
            TextViewBindingAdapter.setText(this.editGooglePlus, userProfileModelGOOGLEPLUSURL);
            TextViewBindingAdapter.setText(this.editInstagram, userProfileModelINSTAGRAMURL);
            TextViewBindingAdapter.setText(this.editLinkedin, userProfileModelLINKEDINURL);
            TextViewBindingAdapter.setText(this.editPinterest, userProfileModelPINTERESTURL);
            TextViewBindingAdapter.setText(this.editSkype, userProfileModelSKYPEURL);
            TextViewBindingAdapter.setText(this.editTwitter, userProfileModelTWITTERURL);
            TextViewBindingAdapter.setText(this.editVine, userProfileModelVINEURL);
        }
        if ((4 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            String str = userProfileModelDRIBBLEBOXURL;
            TextViewBindingAdapter.setTextWatcher(this.editDribble, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editDribbleandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editDropbox, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editDropboxandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editFacebook, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editFacebookandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editGooglePlus, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editGooglePlusandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editInstagram, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editInstagramandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editLinkedin, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editLinkedinandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editPinterest, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editPinterestandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editSkype, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editSkypeandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editTwitter, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editTwitterandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.editVine, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.editVineandroidTextAttrChanged);
        }
        if ((dirtyFlags & 5) != 0) {
            this.updateTheSocialDetails.setOnClickListener(profileViewModelUpdateSocialMediaDataAndroidViewViewOnClickListener);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private ProfileViewModel value;

        public OnClickListenerImpl setValue(ProfileViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.updateSocialMediaData(arg0);
        }
    }
}
