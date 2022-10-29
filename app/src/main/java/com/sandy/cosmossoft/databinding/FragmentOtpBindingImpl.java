package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public class FragmentOtpBindingImpl extends FragmentOtpBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mMyviewmodelOnCreateAccountButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl1 f197x12474033;
    private OnClickListenerImpl mMyviewmodelOnOTPButtonClickAndroidViewViewOnClickListener;
    private final ScrollView mboundView0;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView3;
    private InverseBindingListener mboundView3androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView4;
    private InverseBindingListener mboundView4androidTextAttrChanged;
    private InverseBindingListener otpandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.OtpSection, 6);
        sparseIntArray.put(C0330R.C0333id.edit_otp, 7);
        sparseIntArray.put(C0330R.C0333id.createPasswordSection, 8);
        sparseIntArray.put(C0330R.C0333id.edit_password1, 9);
        sparseIntArray.put(C0330R.C0333id.edit_password2, 10);
    }

    public FragmentOtpBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentOtpBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[5], bindings[6], bindings[2], bindings[8], bindings[7], bindings[9], bindings[10], bindings[1]);
        this.mboundView3androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentOtpBindingImpl.this.mboundView3);
                AuthViewModel authViewModel = FragmentOtpBindingImpl.this.mMyviewmodel;
                AuthViewModel.password_one = callbackArg_0;
            }
        };
        this.mboundView4androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentOtpBindingImpl.this.mboundView4);
                AuthViewModel authViewModel = FragmentOtpBindingImpl.this.mMyviewmodel;
                AuthViewModel.password_two = callbackArg_0;
            }
        };
        this.otpandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentOtpBindingImpl.this.otp);
                AuthViewModel authViewModel = FragmentOtpBindingImpl.this.mMyviewmodel;
                AuthViewModel.editOtp = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.CreateAccountBCard.setTag((Object) null);
        this.buttonLogin.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        TextInputEditText textInputEditText = bindings[3];
        this.mboundView3 = textInputEditText;
        textInputEditText.setTag((Object) null);
        TextInputEditText textInputEditText2 = bindings[4];
        this.mboundView4 = textInputEditText2;
        textInputEditText2.setTag((Object) null);
        this.otp.setTag((Object) null);
        View view = root;
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
        if (33 != variableId) {
            return false;
        }
        setMyviewmodel((AuthViewModel) variable);
        return true;
    }

    public void setMyviewmodel(AuthViewModel Myviewmodel) {
        this.mMyviewmodel = Myviewmodel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(33);
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
        String myviewmodelEditOtp = null;
        String myviewmodelPasswordTwo = null;
        View.OnClickListener myviewmodelOnOTPButtonClickAndroidViewViewOnClickListener = null;
        String myviewmodelPasswordOne = null;
        AuthViewModel myviewmodel = this.mMyviewmodel;
        View.OnClickListener myviewmodelOnCreateAccountButtonClickAndroidViewViewOnClickListener = null;
        if ((dirtyFlags & 2) != 0) {
            myviewmodelEditOtp = AuthViewModel.editOtp;
            myviewmodelPasswordTwo = AuthViewModel.password_two;
            myviewmodelPasswordOne = AuthViewModel.password_one;
        }
        if (!((dirtyFlags & 3) == 0 || myviewmodel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mMyviewmodelOnOTPButtonClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mMyviewmodelOnOTPButtonClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            myviewmodelOnOTPButtonClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(myviewmodel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.f197x12474033;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.f197x12474033 = onClickListenerImpl1;
            }
            myviewmodelOnCreateAccountButtonClickAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(myviewmodel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.CreateAccountBCard.setOnClickListener(myviewmodelOnCreateAccountButtonClickAndroidViewViewOnClickListener);
            this.buttonLogin.setOnClickListener(myviewmodelOnOTPButtonClickAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mboundView3, myviewmodelPasswordOne);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView3, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView3androidTextAttrChanged);
            TextViewBindingAdapter.setText(this.mboundView4, myviewmodelPasswordTwo);
            TextViewBindingAdapter.setTextWatcher(this.mboundView4, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView4androidTextAttrChanged);
            TextViewBindingAdapter.setText(this.otp, myviewmodelEditOtp);
            TextViewBindingAdapter.setTextWatcher(this.otp, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.otpandroidTextAttrChanged);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private AuthViewModel value;

        public OnClickListenerImpl setValue(AuthViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onOTPButtonClick(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private AuthViewModel value;

        public OnClickListenerImpl1 setValue(AuthViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onCreateAccountButtonClick(arg0);
        }
    }
}
