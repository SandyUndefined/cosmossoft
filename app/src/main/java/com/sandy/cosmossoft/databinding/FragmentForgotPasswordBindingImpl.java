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

public class FragmentForgotPasswordBindingImpl extends FragmentForgotPasswordBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mMyviewmodelOnForgotPasswordButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl f196xdf4d5d72;
    private OnClickListenerImpl1 mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener;
    private final ScrollView mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.imageView2, 4);
        sparseIntArray.put(C0330R.C0333id.edit_otp, 5);
    }

    public FragmentForgotPasswordBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private FragmentForgotPasswordBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[3], bindings[5], bindings[4], bindings[1]);
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentForgotPasswordBindingImpl.this.mobileNumber);
                AuthViewModel authViewModel = FragmentForgotPasswordBindingImpl.this.mMyviewmodel;
                AuthViewModel.mobile = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.buttonForgotPassword.setTag((Object) null);
        this.buttonRegister.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
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
        View.OnClickListener myviewmodelOnForgotPasswordButtonClickAndroidViewViewOnClickListener = null;
        String myviewmodelMobile = null;
        View.OnClickListener myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = null;
        AuthViewModel myviewmodel = this.mMyviewmodel;
        if ((dirtyFlags & 2) != 0) {
            myviewmodelMobile = AuthViewModel.mobile;
        }
        if (!((dirtyFlags & 3) == 0 || myviewmodel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f196xdf4d5d72;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f196xdf4d5d72 = onClickListenerImpl;
            }
            myviewmodelOnForgotPasswordButtonClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(myviewmodel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(myviewmodel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.buttonForgotPassword.setOnClickListener(myviewmodelOnForgotPasswordButtonClickAndroidViewViewOnClickListener);
            this.buttonRegister.setOnClickListener(myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mobileNumber, myviewmodelMobile);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mobileNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mobileNumberandroidTextAttrChanged);
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
            this.value.onForgotPasswordButtonClick(arg0);
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
            this.value.onSigninPageChange(arg0);
        }
    }
}
