package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public class ActivitySettingsBindingImpl extends ActivitySettingsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener confirmPasswordandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mProfileViewModelUpdateSettingsDetailsDataAndroidViewViewOnClickListener */
    private OnClickListenerImpl f192x8c7eecfc;
    private final RelativeLayout mboundView0;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView1;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    private InverseBindingListener newPasswordandroidTextAttrChanged;
    private InverseBindingListener oldPasswordandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.edit_mobile, 6);
        sparseIntArray.put(C0330R.C0333id.edit_old_password, 7);
        sparseIntArray.put(C0330R.C0333id.edit_new_password, 8);
        sparseIntArray.put(C0330R.C0333id.edit_confirm_password, 9);
    }

    public ActivitySettingsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivitySettingsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[9], bindings[6], bindings[8], bindings[7], bindings[3], bindings[2], bindings[5]);
        this.confirmPasswordandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySettingsBindingImpl.this.confirmPassword);
                ProfileViewModel profileViewModel = ActivitySettingsBindingImpl.this.mProfileViewModel;
                if (profileViewModel != null) {
                    profileViewModel.confirm_pass = callbackArg_0;
                }
            }
        };
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySettingsBindingImpl.this.mboundView1);
                User userModel = ActivitySettingsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setMobile(callbackArg_0);
                }
            }
        };
        this.newPasswordandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySettingsBindingImpl.this.newPassword);
                ProfileViewModel profileViewModel = ActivitySettingsBindingImpl.this.mProfileViewModel;
                if (profileViewModel != null) {
                    profileViewModel.new_pass = callbackArg_0;
                }
            }
        };
        this.oldPasswordandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySettingsBindingImpl.this.oldPassword);
                ProfileViewModel profileViewModel = ActivitySettingsBindingImpl.this.mProfileViewModel;
                if (profileViewModel != null) {
                    profileViewModel.old_pass = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.confirmPassword.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextInputEditText textInputEditText = bindings[1];
        this.mboundView1 = textInputEditText;
        textInputEditText.setTag((Object) null);
        this.newPassword.setTag((Object) null);
        this.oldPassword.setTag((Object) null);
        this.updateSettingsDetails.setTag((Object) null);
        View view = root;
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
        if (54 == variableId) {
            setUserModel((User) variable);
            return true;
        } else if (40 != variableId) {
            return false;
        } else {
            setProfileViewModel((ProfileViewModel) variable);
            return true;
        }
    }

    public void setUserModel(User UserModel) {
        this.mUserModel = UserModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(54);
        super.requestRebind();
    }

    public void setProfileViewModel(ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(40);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String profileViewModelConfirmPass = null;
        User userModel = this.mUserModel;
        String userModelMobile = null;
        View.OnClickListener profileViewModelUpdateSettingsDetailsDataAndroidViewViewOnClickListener = null;
        ProfileViewModel profileViewModel = this.mProfileViewModel;
        String profileViewModelNewPass = null;
        String profileViewModelOldPass = null;
        if (!((dirtyFlags & 5) == 0 || userModel == null)) {
            userModelMobile = userModel.getMobile();
        }
        if (!((dirtyFlags & 6) == 0 || profileViewModel == null)) {
            profileViewModelConfirmPass = profileViewModel.confirm_pass;
            OnClickListenerImpl onClickListenerImpl = this.f192x8c7eecfc;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f192x8c7eecfc = onClickListenerImpl;
            }
            profileViewModelUpdateSettingsDetailsDataAndroidViewViewOnClickListener = onClickListenerImpl.setValue(profileViewModel);
            profileViewModelNewPass = profileViewModel.new_pass;
            profileViewModelOldPass = profileViewModel.old_pass;
        }
        if ((dirtyFlags & 6) != 0) {
            TextViewBindingAdapter.setText(this.confirmPassword, profileViewModelConfirmPass);
            TextViewBindingAdapter.setText(this.newPassword, profileViewModelNewPass);
            TextViewBindingAdapter.setText(this.oldPassword, profileViewModelOldPass);
            this.updateSettingsDetails.setOnClickListener(profileViewModelUpdateSettingsDetailsDataAndroidViewViewOnClickListener);
        }
        if ((4 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.confirmPassword, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.confirmPasswordandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView1, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView1androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.newPassword, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.newPasswordandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.oldPassword, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.oldPasswordandroidTextAttrChanged);
        }
        if ((5 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, userModelMobile);
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
            this.value.updateSettingsDetailsData(arg0);
        }
    }
}
