package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public class ActivityProfileDetailsBindingImpl extends ActivityProfileDetailsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener editAddressandroidTextAttrChanged;
    private InverseBindingListener editAlternateMobileNumberandroidTextAttrChanged;
    private InverseBindingListener editCountryandroidTextAttrChanged;
    private InverseBindingListener editEmailandroidTextAttrChanged;
    private InverseBindingListener editFirstNameandroidTextAttrChanged;
    private InverseBindingListener editLastNameandroidTextAttrChanged;
    private InverseBindingListener editMobileNumberandroidTextAttrChanged;
    private InverseBindingListener editPinandroidTextAttrChanged;
    private InverseBindingListener editStateandroidTextAttrChanged;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mProfileDetailsModelSelectDOBAndroidViewViewOnClickListener;

    /* renamed from: mProfileDetailsModelSelectTheGenderAndroidWidgetRadioGroupOnCheckedChangeListener */
    private OnCheckedChangeListenerImpl f182x127ba4e8;

    /* renamed from: mProfileDetailsModelUpdateProfileDataAndroidViewViewOnClickListener */
    private OnClickListenerImpl f183x2b8966eb;
    private final RelativeLayout mboundView0;
    private InverseBindingListener selectedDOBandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 13);
        sparseIntArray.put(C0330R.C0333id.male, 14);
        sparseIntArray.put(C0330R.C0333id.fe_male, 15);
        sparseIntArray.put(C0330R.C0333id.others, 16);
    }

    public ActivityProfileDetailsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }

    private ActivityProfileDetailsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[11], bindings[4], bindings[8], bindings[5], bindings[1], bindings[2], bindings[3], bindings[10], bindings[9], bindings[15], bindings[7], bindings[13], bindings[14], bindings[16], bindings[6], bindings[12]);
        this.editAddressandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editAddress);
                User userModel = ActivityProfileDetailsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setAddress(callbackArg_0);
                }
            }
        };
        this.editAlternateMobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editAlternateMobileNumber);
                UserProfile userProfileModel = ActivityProfileDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setALTERNATE_PHONE_NO(callbackArg_0);
                }
            }
        };
        this.editCountryandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editCountry);
                UserProfile userProfileModel = ActivityProfileDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setCOUNTRY(callbackArg_0);
                }
            }
        };
        this.editEmailandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editEmail);
                User userModel = ActivityProfileDetailsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setEmail(callbackArg_0);
                }
            }
        };
        this.editFirstNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editFirstName);
                User userModel = ActivityProfileDetailsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setName(callbackArg_0);
                }
            }
        };
        this.editLastNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editLastName);
                User userModel = ActivityProfileDetailsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setLastname(callbackArg_0);
                }
            }
        };
        this.editMobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editMobileNumber);
                User userModel = ActivityProfileDetailsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setMobile(callbackArg_0);
                }
            }
        };
        this.editPinandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editPin);
                User userModel = ActivityProfileDetailsBindingImpl.this.mUserModel;
                if (userModel != null) {
                    userModel.setPin(callbackArg_0);
                }
            }
        };
        this.editStateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.editState);
                UserProfile userProfileModel = ActivityProfileDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setSTATE(callbackArg_0);
                }
            }
        };
        this.selectedDOBandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityProfileDetailsBindingImpl.this.selectedDOB);
                UserProfile userProfileModel = ActivityProfileDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setDOB(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.editAddress.setTag((Object) null);
        this.editAlternateMobileNumber.setTag((Object) null);
        this.editCountry.setTag((Object) null);
        this.editEmail.setTag((Object) null);
        this.editFirstName.setTag((Object) null);
        this.editLastName.setTag((Object) null);
        this.editMobileNumber.setTag((Object) null);
        this.editPin.setTag((Object) null);
        this.editState.setTag((Object) null);
        this.genderRadio.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.selectedDOB.setTag((Object) null);
        this.updateTheProfileDetails.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8;
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
        } else if (39 == variableId) {
            setProfileDetailsModel((ProfileViewModel) variable);
            return true;
        } else if (56 != variableId) {
            return false;
        } else {
            setUserProfileModel((UserProfile) variable);
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

    public void setProfileDetailsModel(ProfileViewModel ProfileDetailsModel) {
        this.mProfileDetailsModel = ProfileDetailsModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(39);
        super.requestRebind();
    }

    public void setUserProfileModel(UserProfile UserProfileModel) {
        this.mUserProfileModel = UserProfileModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(56);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r32 = this;
            r1 = r32
            r2 = 0
            monitor-enter(r32)
            long r4 = r1.mDirtyFlags     // Catch:{ all -> 0x01a7 }
            r2 = r4
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x01a7 }
            monitor-exit(r32)     // Catch:{ all -> 0x01a7 }
            r0 = 0
            com.sandy.cosmossoft.data.db.entities.User r6 = r1.mUserModel
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.sandy.cosmossoft.viewmodel.ProfileViewModel r14 = r1.mProfileDetailsModel
            r15 = 0
            r16 = 0
            com.sandy.cosmossoft.data.db.entities.UserProfile r4 = r1.mUserProfileModel
            r5 = 0
            r19 = 0
            r20 = 0
            r21 = 9
            long r23 = r2 & r21
            r17 = 0
            int r23 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r23 == 0) goto L_0x0054
            if (r6 == 0) goto L_0x0054
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = r6.getEmail()
            java.lang.String r15 = r6.getPin()
            java.lang.String r16 = r6.getMobile()
            java.lang.String r5 = r6.getLastname()
            java.lang.String r20 = r6.getAddress()
            r30 = r16
            r16 = r0
            r0 = r30
            r31 = r20
            r20 = r6
            r6 = r31
            goto L_0x0060
        L_0x0054:
            r30 = r16
            r16 = r0
            r0 = r30
            r31 = r20
            r20 = r6
            r6 = r31
        L_0x0060:
            r23 = 10
            long r25 = r2 & r23
            r17 = 0
            int r25 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r25 == 0) goto L_0x00a1
            if (r14 == 0) goto L_0x009e
            r25 = r7
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl r7 = r1.f183x2b8966eb
            if (r7 != 0) goto L_0x0079
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl r7 = new com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl
            r7.<init>()
            r1.f183x2b8966eb = r7
        L_0x0079:
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl r10 = r7.setValue(r14)
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl1 r7 = r1.mProfileDetailsModelSelectDOBAndroidViewViewOnClickListener
            if (r7 != 0) goto L_0x0088
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl1 r7 = new com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl1
            r7.<init>()
            r1.mProfileDetailsModelSelectDOBAndroidViewViewOnClickListener = r7
        L_0x0088:
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnClickListenerImpl1 r13 = r7.setValue(r14)
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnCheckedChangeListenerImpl r7 = r1.f182x127ba4e8
            if (r7 != 0) goto L_0x0097
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnCheckedChangeListenerImpl r7 = new com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnCheckedChangeListenerImpl
            r7.<init>()
            r1.f182x127ba4e8 = r7
        L_0x0097:
            com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl$OnCheckedChangeListenerImpl r19 = r7.setValue(r14)
            r7 = r19
            goto L_0x00a5
        L_0x009e:
            r25 = r7
            goto L_0x00a3
        L_0x00a1:
            r25 = r7
        L_0x00a3:
            r7 = r19
        L_0x00a5:
            r26 = 12
            long r28 = r2 & r26
            r17 = 0
            int r19 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r19 == 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00d0
            java.lang.String r16 = r4.getCOUNTRY()
            java.lang.String r19 = r4.getSTATE()
            java.lang.String r11 = r4.getALTERNATE_PHONE_NO()
            java.lang.String r12 = r4.getDOB()
            r30 = r16
            r16 = r4
            r4 = r11
            r11 = r30
            r31 = r14
            r14 = r12
            r12 = r19
            r19 = r31
            goto L_0x00dc
        L_0x00d0:
            r19 = r14
            r14 = r12
            r12 = r25
            r30 = r16
            r16 = r4
            r4 = r11
            r11 = r30
        L_0x00dc:
            long r21 = r2 & r21
            r17 = 0
            int r21 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r21 == 0) goto L_0x0105
            r21 = r10
            com.google.android.material.textfield.TextInputEditText r10 = r1.editAddress
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r6)
            com.google.android.material.textfield.TextInputEditText r10 = r1.editEmail
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r9)
            com.google.android.material.textfield.TextInputEditText r10 = r1.editFirstName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r8)
            com.google.android.material.textfield.TextInputEditText r10 = r1.editLastName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r5)
            com.google.android.material.textfield.TextInputEditText r10 = r1.editMobileNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r0)
            com.google.android.material.textfield.TextInputEditText r10 = r1.editPin
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r15)
            goto L_0x0107
        L_0x0105:
            r21 = r10
        L_0x0107:
            r28 = 8
            long r28 = r2 & r28
            r17 = 0
            int r10 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            r22 = r0
            r0 = 0
            if (r10 == 0) goto L_0x0169
            com.google.android.material.textfield.TextInputEditText r10 = r1.editAddress
            r25 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r25 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r25
            r25 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r25 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r25
            r25 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r25 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r25
            r25 = r5
            androidx.databinding.InverseBindingListener r5 = r1.editAddressandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r10, r0, r0, r0, r5)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editAlternateMobileNumber
            androidx.databinding.InverseBindingListener r10 = r1.editAlternateMobileNumberandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editCountry
            androidx.databinding.InverseBindingListener r10 = r1.editCountryandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editEmail
            androidx.databinding.InverseBindingListener r10 = r1.editEmailandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editFirstName
            androidx.databinding.InverseBindingListener r10 = r1.editFirstNameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editLastName
            androidx.databinding.InverseBindingListener r10 = r1.editLastNameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editMobileNumber
            androidx.databinding.InverseBindingListener r10 = r1.editMobileNumberandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editPin
            androidx.databinding.InverseBindingListener r10 = r1.editPinandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editState
            androidx.databinding.InverseBindingListener r10 = r1.editStateandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.selectedDOB
            androidx.databinding.InverseBindingListener r10 = r1.selectedDOBandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r10)
            goto L_0x016b
        L_0x0169:
            r25 = r5
        L_0x016b:
            long r26 = r2 & r26
            r17 = 0
            int r5 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0187
            com.google.android.material.textfield.TextInputEditText r5 = r1.editAlternateMobileNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r4)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editCountry
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r11)
            com.google.android.material.textfield.TextInputEditText r5 = r1.editState
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r12)
            com.google.android.material.textfield.TextInputEditText r5 = r1.selectedDOB
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r14)
        L_0x0187:
            long r23 = r2 & r23
            r17 = 0
            int r5 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x01a4
            android.widget.RadioGroup r5 = r1.genderRadio
            r10 = r0
            androidx.databinding.InverseBindingListener r10 = (androidx.databinding.InverseBindingListener) r10
            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(r5, r7, r0)
            com.google.android.material.textfield.TextInputEditText r0 = r1.selectedDOB
            r0.setOnClickListener(r13)
            android.widget.Button r0 = r1.updateTheProfileDetails
            r10 = r21
            r0.setOnClickListener(r10)
            goto L_0x01a6
        L_0x01a4:
            r10 = r21
        L_0x01a6:
            return
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r32)     // Catch:{ all -> 0x01a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityProfileDetailsBindingImpl.executeBindings():void");
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
            this.value.updateProfileData(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private ProfileViewModel value;

        public OnClickListenerImpl1 setValue(ProfileViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.selectDOB(arg0);
        }
    }

    public static class OnCheckedChangeListenerImpl implements RadioGroup.OnCheckedChangeListener {
        private ProfileViewModel value;

        public OnCheckedChangeListenerImpl setValue(ProfileViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onCheckedChanged(RadioGroup arg0, int arg1) {
            this.value.selectTheGender(arg0, arg1);
        }
    }
}
