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
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;

public class ActivityBankDetailsBindingImpl extends ActivityBankDetailsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;

    /* renamed from: mBankDetailsViewModelUpdateBankDetailsDataAndroidViewViewOnClickListener */
    private OnClickListenerImpl f173x45029e40;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView1;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView3;
    private InverseBindingListener mboundView3androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView4;
    private InverseBindingListener mboundView4androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView5;
    private InverseBindingListener mboundView5androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView6;
    private InverseBindingListener mboundView6androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView7;
    private InverseBindingListener mboundView7androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView8;
    private InverseBindingListener mboundView8androidTextAttrChanged;
    private InverseBindingListener selectPassbookandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.aadhar_card_image, 11);
        sparseIntArray.put(C0330R.C0333id.select_aadhar, 12);
        sparseIntArray.put(C0330R.C0333id.edit_aadhar_no, 13);
        sparseIntArray.put(C0330R.C0333id.pan_card_image, 14);
        sparseIntArray.put(C0330R.C0333id.select_pan, 15);
        sparseIntArray.put(C0330R.C0333id.edit_pan_card, 16);
        sparseIntArray.put(C0330R.C0333id.selectBank, 17);
        sparseIntArray.put(C0330R.C0333id.edit_bank_branch, 18);
        sparseIntArray.put(C0330R.C0333id.account_holder_name, 19);
        sparseIntArray.put(C0330R.C0333id.edit_acoount_no, 20);
        sparseIntArray.put(C0330R.C0333id.confirm_account_number, 21);
        sparseIntArray.put(C0330R.C0333id.edit_ifsc, 22);
        sparseIntArray.put(C0330R.C0333id.edi_passbook, 23);
    }

    public ActivityBankDetailsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }

    private ActivityBankDetailsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[11], bindings[19], bindings[21], bindings[23], bindings[13], bindings[20], bindings[18], bindings[22], bindings[16], bindings[14], bindings[12], bindings[17], bindings[15], bindings[9], bindings[10]);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView1);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setAADHAR_CARD_NO(callbackArg_0);
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView2);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setPAN_CARD_NO(callbackArg_0);
                }
            }
        };
        this.mboundView3androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView3);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setBANK(callbackArg_0);
                }
            }
        };
        this.mboundView4androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView4);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setB_NAME(callbackArg_0);
                }
            }
        };
        this.mboundView5androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView5);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setAC_HOLDER_NAME(callbackArg_0);
                }
            }
        };
        this.mboundView6androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView6);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setAC_NUM(callbackArg_0);
                }
            }
        };
        this.mboundView7androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView7);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setAC_NUM(callbackArg_0);
                }
            }
        };
        this.mboundView8androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.mboundView8);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setIFSC_CODE(callbackArg_0);
                }
            }
        };
        this.selectPassbookandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBankDetailsBindingImpl.this.selectPassbook);
                UserProfile userProfileModel = ActivityBankDetailsBindingImpl.this.mUserProfileModel;
                if (userProfileModel != null) {
                    userProfileModel.setPASSBOOK(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextInputEditText textInputEditText = bindings[1];
        this.mboundView1 = textInputEditText;
        textInputEditText.setTag((Object) null);
        TextInputEditText textInputEditText2 = bindings[2];
        this.mboundView2 = textInputEditText2;
        textInputEditText2.setTag((Object) null);
        TextInputEditText textInputEditText3 = bindings[3];
        this.mboundView3 = textInputEditText3;
        textInputEditText3.setTag((Object) null);
        TextInputEditText textInputEditText4 = bindings[4];
        this.mboundView4 = textInputEditText4;
        textInputEditText4.setTag((Object) null);
        TextInputEditText textInputEditText5 = bindings[5];
        this.mboundView5 = textInputEditText5;
        textInputEditText5.setTag((Object) null);
        TextInputEditText textInputEditText6 = bindings[6];
        this.mboundView6 = textInputEditText6;
        textInputEditText6.setTag((Object) null);
        TextInputEditText textInputEditText7 = bindings[7];
        this.mboundView7 = textInputEditText7;
        textInputEditText7.setTag((Object) null);
        TextInputEditText textInputEditText8 = bindings[8];
        this.mboundView8 = textInputEditText8;
        textInputEditText8.setTag((Object) null);
        this.selectPassbook.setTag((Object) null);
        this.updateBankDetails.setTag((Object) null);
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
        if (56 == variableId) {
            setUserProfileModel((UserProfile) variable);
            return true;
        } else if (6 != variableId) {
            return false;
        } else {
            setBankDetailsViewModel((ProfileViewModel) variable);
            return true;
        }
    }

    public void setUserProfileModel(UserProfile UserProfileModel) {
        this.mUserProfileModel = UserProfileModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(56);
        super.requestRebind();
    }

    public void setBankDetailsViewModel(ProfileViewModel BankDetailsViewModel) {
        this.mBankDetailsViewModel = BankDetailsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(6);
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
        String userProfileModelBANK = null;
        String userProfileModelACNUM = null;
        String userProfileModelAADHARCARDNO = null;
        String userProfileModelPANCARDNO = null;
        String userProfileModelBNAME = null;
        UserProfile userProfileModel = this.mUserProfileModel;
        String userProfileModelPASSBOOK = null;
        String userProfileModelACHOLDERNAME = null;
        View.OnClickListener bankDetailsViewModelUpdateBankDetailsDataAndroidViewViewOnClickListener = null;
        ProfileViewModel bankDetailsViewModel = this.mBankDetailsViewModel;
        String userProfileModelIFSCCODE = null;
        if (!((dirtyFlags & 5) == 0 || userProfileModel == null)) {
            userProfileModelBANK = userProfileModel.getBANK();
            userProfileModelACNUM = userProfileModel.getAC_NUM();
            userProfileModelAADHARCARDNO = userProfileModel.getAADHAR_CARD_NO();
            userProfileModelPANCARDNO = userProfileModel.getPAN_CARD_NO();
            userProfileModelBNAME = userProfileModel.getB_NAME();
            userProfileModelPASSBOOK = userProfileModel.getPASSBOOK();
            userProfileModelACHOLDERNAME = userProfileModel.getAC_HOLDER_NAME();
            userProfileModelIFSCCODE = userProfileModel.getIFSC_CODE();
        }
        if (!((dirtyFlags & 6) == 0 || bankDetailsViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f173x45029e40;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f173x45029e40 = onClickListenerImpl;
            }
            bankDetailsViewModelUpdateBankDetailsDataAndroidViewViewOnClickListener = onClickListenerImpl.setValue(bankDetailsViewModel);
        }
        if ((dirtyFlags & 5) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, userProfileModelAADHARCARDNO);
            TextViewBindingAdapter.setText(this.mboundView2, userProfileModelPANCARDNO);
            TextViewBindingAdapter.setText(this.mboundView3, userProfileModelBANK);
            TextViewBindingAdapter.setText(this.mboundView4, userProfileModelBNAME);
            TextViewBindingAdapter.setText(this.mboundView5, userProfileModelACHOLDERNAME);
            TextViewBindingAdapter.setText(this.mboundView6, userProfileModelACNUM);
            TextViewBindingAdapter.setText(this.mboundView7, userProfileModelACNUM);
            TextViewBindingAdapter.setText(this.mboundView8, userProfileModelIFSCCODE);
            TextViewBindingAdapter.setText(this.selectPassbook, userProfileModelPASSBOOK);
        }
        if ((4 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            String str = userProfileModelBANK;
            TextViewBindingAdapter.setTextWatcher(this.mboundView1, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView1androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView2, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView2androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView3, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView3androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView4, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView4androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView5, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView5androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView6, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView6androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView7, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView7androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView8, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView8androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.selectPassbook, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.selectPassbookandroidTextAttrChanged);
        }
        if ((dirtyFlags & 6) != 0) {
            this.updateBankDetails.setOnClickListener(bankDetailsViewModelUpdateBankDetailsDataAndroidViewViewOnClickListener);
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
            this.value.updateBankDetailsData(arg0);
        }
    }
}
