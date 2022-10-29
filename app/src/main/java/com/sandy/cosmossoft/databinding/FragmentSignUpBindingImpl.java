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

public class FragmentSignUpBindingImpl extends FragmentSignUpBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener firstNumberandroidTextAttrChanged;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener;
    private OnClickListenerImpl mMyviewmodelOnSignupButtonClickAndroidViewViewOnClickListener;
    private final ScrollView mboundView0;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView3;
    private InverseBindingListener mboundView3androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextInputEditText mboundView4;
    private InverseBindingListener mboundView4androidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.imageView2, 7);
        sparseIntArray.put(C0330R.C0333id.edit_names, 8);
        sparseIntArray.put(C0330R.C0333id.edit_first_name, 9);
        sparseIntArray.put(C0330R.C0333id.edit_last_name, 10);
        sparseIntArray.put(C0330R.C0333id.edit_mobile, 11);
        sparseIntArray.put(C0330R.C0333id.edit_email, 12);
    }

    public FragmentSignUpBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentSignUpBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[6], bindings[5], bindings[12], bindings[9], bindings[10], bindings[11], bindings[8], bindings[1], bindings[7]);
        this.firstNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignUpBindingImpl.this.firstNumber);
                AuthViewModel authViewModel = FragmentSignUpBindingImpl.this.mMyviewmodel;
                AuthViewModel.first_name = callbackArg_0;
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignUpBindingImpl.this.mboundView2);
                AuthViewModel authViewModel = FragmentSignUpBindingImpl.this.mMyviewmodel;
                AuthViewModel.last_name = callbackArg_0;
            }
        };
        this.mboundView3androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignUpBindingImpl.this.mboundView3);
                AuthViewModel authViewModel = FragmentSignUpBindingImpl.this.mMyviewmodel;
                AuthViewModel.mobile = callbackArg_0;
            }
        };
        this.mboundView4androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentSignUpBindingImpl.this.mboundView4);
                AuthViewModel authViewModel = FragmentSignUpBindingImpl.this.mMyviewmodel;
                AuthViewModel.email = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.buttonLogin.setTag((Object) null);
        this.buttonRegister.setTag((Object) null);
        this.firstNumber.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        TextInputEditText textInputEditText = bindings[2];
        this.mboundView2 = textInputEditText;
        textInputEditText.setTag((Object) null);
        TextInputEditText textInputEditText2 = bindings[3];
        this.mboundView3 = textInputEditText2;
        textInputEditText2.setTag((Object) null);
        TextInputEditText textInputEditText3 = bindings[4];
        this.mboundView4 = textInputEditText3;
        textInputEditText3.setTag((Object) null);
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
        View.OnClickListener myviewmodelOnSignupButtonClickAndroidViewViewOnClickListener = null;
        String myviewmodelLastName = null;
        String myviewmodelEmail = null;
        String myviewmodelMobile = null;
        View.OnClickListener myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = null;
        String myviewmodelFirstName = null;
        AuthViewModel myviewmodel = this.mMyviewmodel;
        if ((dirtyFlags & 2) != 0) {
            myviewmodelLastName = AuthViewModel.last_name;
            myviewmodelEmail = AuthViewModel.email;
            myviewmodelMobile = AuthViewModel.mobile;
            myviewmodelFirstName = AuthViewModel.first_name;
        }
        if (!((dirtyFlags & 3) == 0 || myviewmodel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mMyviewmodelOnSignupButtonClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mMyviewmodelOnSignupButtonClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            myviewmodelOnSignupButtonClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(myviewmodel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(myviewmodel);
        }
        if ((dirtyFlags & 3) != 0) {
            this.buttonLogin.setOnClickListener(myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener);
            this.buttonRegister.setOnClickListener(myviewmodelOnSignupButtonClickAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.firstNumber, myviewmodelFirstName);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.firstNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.firstNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.mboundView2, myviewmodelLastName);
            TextViewBindingAdapter.setTextWatcher(this.mboundView2, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView2androidTextAttrChanged);
            TextViewBindingAdapter.setText(this.mboundView3, myviewmodelMobile);
            TextViewBindingAdapter.setTextWatcher(this.mboundView3, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView3androidTextAttrChanged);
            TextViewBindingAdapter.setText(this.mboundView4, myviewmodelEmail);
            TextViewBindingAdapter.setTextWatcher(this.mboundView4, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView4androidTextAttrChanged);
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
            this.value.onSignupButtonClick(arg0);
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
