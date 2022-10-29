package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public class ActivityRegisterRemitterBindingImpl extends ActivityRegisterRemitterBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener addressandroidTextAttrChanged;
    private InverseBindingListener dateOfBirthandroidTextAttrChanged;
    private InverseBindingListener firstNameandroidTextAttrChanged;
    private InverseBindingListener lastNameandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mRegisterRemitterOnDateSelectionClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl f186x2402a679;

    /* renamed from: mRegisterRemitterOnRegisterRemitterButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl1 f187x1b86b890;
    private final ScrollView mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;
    private InverseBindingListener otpEditandroidTextAttrChanged;
    private InverseBindingListener pinCodeandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.edit_names, 9);
        sparseIntArray.put(C0330R.C0333id.first_name_layout, 10);
        sparseIntArray.put(C0330R.C0333id.last_name_layout, 11);
        sparseIntArray.put(C0330R.C0333id.edit_mobile_layout, 12);
        sparseIntArray.put(C0330R.C0333id.edit_otp, 13);
        sparseIntArray.put(C0330R.C0333id.edit_dob, 14);
        sparseIntArray.put(C0330R.C0333id.edit_address, 15);
        sparseIntArray.put(C0330R.C0333id.edit_pin_code, 16);
    }

    public ActivityRegisterRemitterBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }

    private ActivityRegisterRemitterBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[6], bindings[8], bindings[5], bindings[15], bindings[14], bindings[12], bindings[9], bindings[13], bindings[16], bindings[1], bindings[10], bindings[2], bindings[11], bindings[3], bindings[4], bindings[7]);
        this.addressandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.address);
                ToBankViewModel registerRemitter = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                if (registerRemitter != null) {
                    registerRemitter.remitter_address = callbackArg_0;
                }
            }
        };
        this.dateOfBirthandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.dateOfBirth);
                ToBankViewModel toBankViewModel = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                ToBankViewModel.remitter_dob = callbackArg_0;
            }
        };
        this.firstNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.firstName);
                ToBankViewModel registerRemitter = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                if (registerRemitter != null) {
                    registerRemitter.remitter_first_name = callbackArg_0;
                }
            }
        };
        this.lastNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.lastName);
                ToBankViewModel registerRemitter = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                if (registerRemitter != null) {
                    registerRemitter.remitter_last_name = callbackArg_0;
                }
            }
        };
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.mobileNumber);
                ToBankViewModel toBankViewModel = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                ToBankViewModel.remitter_mobile = callbackArg_0;
            }
        };
        this.otpEditandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.otpEdit);
                ToBankViewModel registerRemitter = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                if (registerRemitter != null) {
                    registerRemitter.remitter_otp = callbackArg_0;
                }
            }
        };
        this.pinCodeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRegisterRemitterBindingImpl.this.pinCode);
                ToBankViewModel toBankViewModel = ActivityRegisterRemitterBindingImpl.this.mRegisterRemitter;
                ToBankViewModel.pin_code = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.address.setTag((Object) null);
        this.buttonApply.setTag((Object) null);
        this.dateOfBirth.setTag((Object) null);
        this.firstName.setTag((Object) null);
        this.lastName.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
        this.otpEdit.setTag((Object) null);
        this.pinCode.setTag((Object) null);
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
        if (45 != variableId) {
            return false;
        }
        setRegisterRemitter((ToBankViewModel) variable);
        return true;
    }

    public void setRegisterRemitter(ToBankViewModel RegisterRemitter) {
        this.mRegisterRemitter = RegisterRemitter;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(45);
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
        String registerRemitterRemitterAddress = null;
        ToBankViewModel registerRemitter = this.mRegisterRemitter;
        View.OnClickListener registerRemitterOnDateSelectionClickAndroidViewViewOnClickListener = null;
        String registerRemitterPinCode = null;
        String registerRemitterRemitterLastName = null;
        String registerRemitterRemitterDob = null;
        String registerRemitterRemitterFirstName = null;
        String registerRemitterRemitterOtp = null;
        View.OnClickListener registerRemitterOnRegisterRemitterButtonClickAndroidViewViewOnClickListener = null;
        String registerRemitterRemitterMobile = null;
        if (!((dirtyFlags & 3) == 0 || registerRemitter == null)) {
            registerRemitterRemitterAddress = registerRemitter.remitter_address;
            OnClickListenerImpl onClickListenerImpl = this.f186x2402a679;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f186x2402a679 = onClickListenerImpl;
            }
            registerRemitterOnDateSelectionClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(registerRemitter);
            registerRemitterRemitterLastName = registerRemitter.remitter_last_name;
            registerRemitterRemitterFirstName = registerRemitter.remitter_first_name;
            registerRemitterRemitterOtp = registerRemitter.remitter_otp;
            OnClickListenerImpl1 onClickListenerImpl1 = this.f187x1b86b890;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.f187x1b86b890 = onClickListenerImpl1;
            }
            registerRemitterOnRegisterRemitterButtonClickAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(registerRemitter);
        }
        if ((dirtyFlags & 2) != 0) {
            registerRemitterPinCode = ToBankViewModel.pin_code;
            registerRemitterRemitterDob = ToBankViewModel.remitter_dob;
            registerRemitterRemitterMobile = ToBankViewModel.remitter_mobile;
        }
        if ((dirtyFlags & 3) != 0) {
            TextViewBindingAdapter.setText(this.address, registerRemitterRemitterAddress);
            this.buttonApply.setOnClickListener(registerRemitterOnRegisterRemitterButtonClickAndroidViewViewOnClickListener);
            this.dateOfBirth.setOnClickListener(registerRemitterOnDateSelectionClickAndroidViewViewOnClickListener);
            TextViewBindingAdapter.setText(this.firstName, registerRemitterRemitterFirstName);
            TextViewBindingAdapter.setText(this.lastName, registerRemitterRemitterLastName);
            TextViewBindingAdapter.setText(this.otpEdit, registerRemitterRemitterOtp);
        }
        if ((dirtyFlags & 2) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.address, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.addressandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.dateOfBirth, registerRemitterRemitterDob);
            TextViewBindingAdapter.setTextWatcher(this.dateOfBirth, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.dateOfBirthandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.firstName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.firstNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.lastName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.lastNameandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.mobileNumber, registerRemitterRemitterMobile);
            TextViewBindingAdapter.setTextWatcher(this.mobileNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mobileNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.otpEdit, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.otpEditandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.pinCode, registerRemitterPinCode);
            TextViewBindingAdapter.setTextWatcher(this.pinCode, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.pinCodeandroidTextAttrChanged);
        }
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
            this.value.onDateSelectionClick(arg0);
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
            this.value.onRegisterRemitterButtonClick(arg0);
        }
    }
}
