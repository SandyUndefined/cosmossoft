package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public class ActivityAddBeneficiaryBindingImpl extends ActivityAddBeneficiaryBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener accountHolderNameandroidTextAttrChanged;
    private InverseBindingListener accountNumberandroidTextAttrChanged;
    private InverseBindingListener beneAddressandroidTextAttrChanged;
    private InverseBindingListener beneDobandroidTextAttrChanged;
    private InverseBindingListener benePinCodeandroidTextAttrChanged;
    private InverseBindingListener confirmAccountNumberandroidTextAttrChanged;
    private InverseBindingListener ifscCodeandroidTextAttrChanged;

    /* renamed from: mBeneficiaryViewModelOnConfirmBeneficiaryAndroidViewViewOnClickListener */
    private OnClickListenerImpl f169x1f0e23b4;

    /* renamed from: mBeneficiaryViewModelOnDateSelectionClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl1 f170xa6e1a399;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener nickNameandroidTextAttrChanged;
    private InverseBindingListener phoneNumberandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.bankSectionBar, 11);
        sparseIntArray.put(C0330R.C0333id.upperTextAddBeneficiary, 12);
        sparseIntArray.put(C0330R.C0333id.getTheContacts, 13);
    }

    public ActivityAddBeneficiaryBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    private ActivityAddBeneficiaryBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[1], bindings[11], bindings[7], bindings[6], bindings[8], bindings[2], bindings[13], bindings[3], bindings[10], bindings[9], bindings[5], bindings[12]);
        this.accountHolderNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.accountHolderName);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.account_holder_name = callbackArg_0;
                }
            }
        };
        this.accountNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.accountNumber);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.account_number = callbackArg_0;
                }
            }
        };
        this.beneAddressandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.beneAddress);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.remitter_address = callbackArg_0;
                }
            }
        };
        this.beneDobandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.beneDob);
                ToBankViewModel toBankViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                ToBankViewModel.remitter_dob = callbackArg_0;
            }
        };
        this.benePinCodeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.benePinCode);
                ToBankViewModel toBankViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                ToBankViewModel.pin_code = callbackArg_0;
            }
        };
        this.confirmAccountNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.confirmAccountNumber);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.confirm_account_number = callbackArg_0;
                }
            }
        };
        this.ifscCodeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.ifscCode);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.ifsc = callbackArg_0;
                }
            }
        };
        this.nickNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.nickName);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.nick_name = callbackArg_0;
                }
            }
        };
        this.phoneNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddBeneficiaryBindingImpl.this.phoneNumber);
                ToBankViewModel beneficiaryViewModel = ActivityAddBeneficiaryBindingImpl.this.mBeneficiaryViewModel;
                if (beneficiaryViewModel != null) {
                    beneficiaryViewModel.phone_number = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.accountHolderName.setTag((Object) null);
        this.accountNumber.setTag((Object) null);
        this.beneAddress.setTag((Object) null);
        this.beneDob.setTag((Object) null);
        this.benePinCode.setTag((Object) null);
        this.confirmAccountNumber.setTag((Object) null);
        this.ifscCode.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileRechargeButton.setTag((Object) null);
        this.nickName.setTag((Object) null);
        this.phoneNumber.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
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
        if (10 != variableId) {
            return false;
        }
        setBeneficiaryViewModel((ToBankViewModel) variable);
        return true;
    }

    public void setBeneficiaryViewModel(ToBankViewModel BeneficiaryViewModel) {
        this.mBeneficiaryViewModel = BeneficiaryViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(10);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r11 = com.sandy.cosmossoft.viewmodel.ToBankViewModel.pin_code;
        r12 = com.sandy.cosmossoft.viewmodel.ToBankViewModel.remitter_dob;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if ((r2 & 3) == 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r14 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = r14.phone_number;
        r6 = r14.account_holder_name;
        r7 = r14.ifsc;
        r8 = r14.remitter_address;
        r9 = r14.confirm_account_number;
        r10 = r14.account_number;
        r13 = r14.nick_name;
        r4 = r1.f169x1f0e23b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r4 = new com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl.OnClickListenerImpl();
        r1.f169x1f0e23b4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r15 = r4.setValue(r14);
        r4 = r1.f170xa6e1a399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r4 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r4 = new com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl.OnClickListenerImpl1();
        r1.f170xa6e1a399 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        r4 = r4.setValue(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if ((r2 & 3) == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.accountHolderName, r6);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.accountNumber, r10);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.beneAddress, r8);
        r1.beneDob.setOnClickListener(r4);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.confirmAccountNumber, r9);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.ifscCode, r7);
        r1.mobileRechargeButton.setOnClickListener(r15);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.nickName, r13);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.phoneNumber, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if ((r2 & 2) == 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r16 = r0;
        r17 = null;
        r17 = null;
        r17 = null;
        r17 = r2;
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.accountHolderName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.accountHolderNameandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.accountNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.accountNumberandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.beneAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.beneAddressandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.beneDob, r12);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.beneDob, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.beneDobandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.benePinCode, r11);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.benePinCode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.benePinCodeandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.confirmAccountNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.confirmAccountNumberandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.ifscCode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.ifscCodeandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.nickName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.nickNameandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.phoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.phoneNumberandroidTextAttrChanged);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fa, code lost:
        r16 = r0;
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = null;
        r6 = null;
        r7 = null;
        r8 = null;
        r9 = null;
        r10 = null;
        r11 = null;
        r12 = null;
        r13 = null;
        r14 = r1.mBeneficiaryViewModel;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ((r2 & 2) == 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r23 = this;
            r1 = r23
            r2 = 0
            monitor-enter(r23)
            long r4 = r1.mDirtyFlags     // Catch:{ all -> 0x0103 }
            r2 = r4
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x00ff }
            monitor-exit(r23)     // Catch:{ all -> 0x00ff }
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.sandy.cosmossoft.viewmodel.ToBankViewModel r14 = r1.mBeneficiaryViewModel
            r15 = 0
            r16 = 0
            r17 = 2
            long r19 = r2 & r17
            int r19 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0027
            java.lang.String r11 = com.sandy.cosmossoft.viewmodel.ToBankViewModel.pin_code
            java.lang.String r12 = com.sandy.cosmossoft.viewmodel.ToBankViewModel.remitter_dob
        L_0x0027:
            r19 = 3
            long r21 = r2 & r19
            int r21 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r21 == 0) goto L_0x0060
            if (r14 == 0) goto L_0x0060
            java.lang.String r0 = r14.phone_number
            java.lang.String r6 = r14.account_holder_name
            java.lang.String r7 = r14.ifsc
            java.lang.String r8 = r14.remitter_address
            java.lang.String r9 = r14.confirm_account_number
            java.lang.String r10 = r14.account_number
            java.lang.String r13 = r14.nick_name
            com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl r4 = r1.f169x1f0e23b4
            if (r4 != 0) goto L_0x004a
            com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl r4 = new com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl
            r4.<init>()
            r1.f169x1f0e23b4 = r4
        L_0x004a:
            com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl r15 = r4.setValue(r14)
            com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl1 r4 = r1.f170xa6e1a399
            if (r4 != 0) goto L_0x0059
            com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl1 r4 = new com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl1
            r4.<init>()
            r1.f170xa6e1a399 = r4
        L_0x0059:
            com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl$OnClickListenerImpl1 r16 = r4.setValue(r14)
            r4 = r16
            goto L_0x0062
        L_0x0060:
            r4 = r16
        L_0x0062:
            long r19 = r2 & r19
            r21 = 0
            int r5 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x0097
            com.google.android.material.textfield.TextInputEditText r5 = r1.accountHolderName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r6)
            com.google.android.material.textfield.TextInputEditText r5 = r1.accountNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r10)
            com.google.android.material.textfield.TextInputEditText r5 = r1.beneAddress
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r8)
            com.google.android.material.textfield.TextInputEditText r5 = r1.beneDob
            r5.setOnClickListener(r4)
            com.google.android.material.textfield.TextInputEditText r5 = r1.confirmAccountNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r9)
            com.google.android.material.textfield.TextInputEditText r5 = r1.ifscCode
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r7)
            android.widget.Button r5 = r1.mobileRechargeButton
            r5.setOnClickListener(r15)
            com.google.android.material.textfield.TextInputEditText r5 = r1.nickName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r13)
            com.google.android.material.textfield.TextInputEditText r5 = r1.phoneNumber
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r0)
        L_0x0097:
            long r16 = r2 & r17
            r18 = 0
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x00fa
            com.google.android.material.textfield.TextInputEditText r5 = r1.accountHolderName
            r16 = r0
            r0 = 0
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r17
            r17 = r2
            androidx.databinding.InverseBindingListener r2 = r1.accountHolderNameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r5, r0, r0, r0, r2)
            com.google.android.material.textfield.TextInputEditText r2 = r1.accountNumber
            androidx.databinding.InverseBindingListener r3 = r1.accountNumberandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.beneAddress
            androidx.databinding.InverseBindingListener r3 = r1.beneAddressandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.beneDob
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r2, r12)
            com.google.android.material.textfield.TextInputEditText r2 = r1.beneDob
            androidx.databinding.InverseBindingListener r3 = r1.beneDobandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.benePinCode
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r2, r11)
            com.google.android.material.textfield.TextInputEditText r2 = r1.benePinCode
            androidx.databinding.InverseBindingListener r3 = r1.benePinCodeandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.confirmAccountNumber
            androidx.databinding.InverseBindingListener r3 = r1.confirmAccountNumberandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.ifscCode
            androidx.databinding.InverseBindingListener r3 = r1.ifscCodeandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.nickName
            androidx.databinding.InverseBindingListener r3 = r1.nickNameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            com.google.android.material.textfield.TextInputEditText r2 = r1.phoneNumber
            androidx.databinding.InverseBindingListener r3 = r1.phoneNumberandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            goto L_0x00fe
        L_0x00fa:
            r16 = r0
            r17 = r2
        L_0x00fe:
            return
        L_0x00ff:
            r0 = move-exception
            r17 = r2
            goto L_0x0104
        L_0x0103:
            r0 = move-exception
        L_0x0104:
            monitor-exit(r23)     // Catch:{ all -> 0x0103 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBindingImpl.executeBindings():void");
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private ToBankViewModel value;

        public OnClickListenerImpl setValue(ToBankViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onConfirmBeneficiary(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private ToBankViewModel value;

        public OnClickListenerImpl1 setValue(ToBankViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onDateSelectionClick(arg0);
        }
    }
}
