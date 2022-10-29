package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public class FragmentSignInBindingImpl extends FragmentSignInBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener loginotpandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mMyviewmodelOnForgotPasswordPageChangeAndroidViewViewOnClickListener */
    private OnClickListenerImpl2 f198xfd1d03ab;
    private OnClickListenerImpl1 mMyviewmodelOnLoginButtonClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl mMyviewmodelOnSignupPageChangeAndroidViewViewOnClickListener;
    private final ScrollView mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;
    private InverseBindingListener passwordandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.SignInRootLayout, 7);
        sparseIntArray.put(C0330R.C0333id.imageView2, 8);
        sparseIntArray.put(C0330R.C0333id.edit_mobile, 9);
        sparseIntArray.put(C0330R.C0333id.edit_password, 10);
        sparseIntArray.put(C0330R.C0333id.otpfield, 11);
    }

    public FragmentSignInBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentSignInBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[7], bindings[5], bindings[6], bindings[4], bindings[9], bindings[10], bindings[8], bindings[3], bindings[1], bindings[11], bindings[2]);
        this.loginotpandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignInBindingImpl.this.loginotp);
                AuthViewModel authViewModel = FragmentSignInBindingImpl.this.mMyviewmodel;
                AuthViewModel.inputotp = callbackArg_0;
            }
        };
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignInBindingImpl.this.mobileNumber);
                AuthViewModel authViewModel = FragmentSignInBindingImpl.this.mMyviewmodel;
                AuthViewModel.mobile = callbackArg_0;
            }
        };
        this.passwordandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignInBindingImpl.this.password);
                AuthViewModel authViewModel = FragmentSignInBindingImpl.this.mMyviewmodel;
                AuthViewModel.password = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.buttonLogin.setTag((Object) null);
        this.buttonRegister.setTag((Object) null);
        this.buttonReset.setTag((Object) null);
        this.loginotp.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
        this.password.setTag((Object) null);
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
        View.OnClickListener myviewmodelOnSignupPageChangeAndroidViewViewOnClickListener = null;
        String myviewmodelPassword = null;
        String myviewmodelMobile = null;
        String myviewmodelInputotp = null;
        View.OnClickListener myviewmodelOnLoginButtonClickAndroidViewViewOnClickListener = null;
        View.OnClickListener myviewmodelOnForgotPasswordPageChangeAndroidViewViewOnClickListener = null;
        AuthViewModel myviewmodel = this.mMyviewmodel;
        if ((dirtyFlags & 2) != 0) {
            myviewmodelPassword = AuthViewModel.password;
            myviewmodelMobile = AuthViewModel.mobile;
            myviewmodelInputotp = AuthViewModel.inputotp;
        }
        if (!((dirtyFlags & 3) == 0 || myviewmodel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mMyviewmodelOnSignupPageChangeAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mMyviewmodelOnSignupPageChangeAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            myviewmodelOnSignupPageChangeAndroidViewViewOnClickListener = onClickListenerImpl.setValue(myviewmodel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.mMyviewmodelOnLoginButtonClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mMyviewmodelOnLoginButtonClickAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            myviewmodelOnLoginButtonClickAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(myviewmodel);
            OnClickListenerImpl2 onClickListenerImpl2 = this.f198xfd1d03ab;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl2();
                this.f198xfd1d03ab = onClickListenerImpl2;
            }
            myviewmodelOnForgotPasswordPageChangeAndroidViewViewOnClickListener = onClickListenerImpl2.setValue(myviewmodel);
        }
        if ((dirtyFlags & 3) != 0) {
            this.buttonLogin.setOnClickListener(myviewmodelOnLoginButtonClickAndroidViewViewOnClickListener);
            this.buttonRegister.setOnClickListener(myviewmodelOnSignupPageChangeAndroidViewViewOnClickListener);
            this.buttonReset.setOnClickListener(myviewmodelOnForgotPasswordPageChangeAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.loginotp, myviewmodelInputotp);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.loginotp, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.loginotpandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.mobileNumber, myviewmodelMobile);
            TextViewBindingAdapter.setTextWatcher(this.mobileNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mobileNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.password, myviewmodelPassword);
            TextViewBindingAdapter.setTextWatcher(this.password, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.passwordandroidTextAttrChanged);
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
            this.value.onSignupPageChange(arg0);
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
            this.value.onLoginButtonClick(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private AuthViewModel value;

        public OnClickListenerImpl2 setValue(AuthViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onForgotPasswordPageChange(arg0);
        }
    }
}
