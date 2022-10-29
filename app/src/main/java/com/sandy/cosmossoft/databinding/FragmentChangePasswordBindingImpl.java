package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AuthViewModel;

public class FragmentChangePasswordBindingImpl extends FragmentChangePasswordBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mMyviewmodelOnPasswordChangeButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl f195xe5f6ccc5;
    private OnClickListenerImpl1 mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;
    private InverseBindingListener passwordFirstandroidTextAttrChanged;
    private InverseBindingListener passwordSecondandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.imageView2, 5);
        sparseIntArray.put(C0330R.C0333id.password_first_l, 6);
        sparseIntArray.put(C0330R.C0333id.password_second_s, 7);
    }

    public FragmentChangePasswordBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private FragmentChangePasswordBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[3], bindings[4], bindings[5], bindings[1], bindings[6], bindings[2], bindings[7]);
        this.passwordFirstandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentChangePasswordBindingImpl.this.passwordFirst);
                AuthViewModel authViewModel = FragmentChangePasswordBindingImpl.this.mMyviewmodel;
                AuthViewModel.password_one = callbackArg_0;
            }
        };
        this.passwordSecondandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(FragmentChangePasswordBindingImpl.this.passwordSecond);
                AuthViewModel authViewModel = FragmentChangePasswordBindingImpl.this.mMyviewmodel;
                AuthViewModel.password_two = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.buttonForgotPassword.setTag((Object) null);
        this.buttonRegister.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.passwordFirst.setTag((Object) null);
        this.passwordSecond.setTag((Object) null);
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
        View.OnClickListener myviewmodelOnPasswordChangeButtonClickAndroidViewViewOnClickListener = null;
        String myviewmodelPasswordTwo = null;
        View.OnClickListener myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = null;
        String myviewmodelPasswordOne = null;
        AuthViewModel myviewmodel = this.mMyviewmodel;
        if ((dirtyFlags & 2) != 0) {
            myviewmodelPasswordTwo = AuthViewModel.password_two;
            myviewmodelPasswordOne = AuthViewModel.password_one;
        }
        if (!((dirtyFlags & 3) == 0 || myviewmodel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f195xe5f6ccc5;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f195xe5f6ccc5 = onClickListenerImpl;
            }
            myviewmodelOnPasswordChangeButtonClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(myviewmodel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mMyviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(myviewmodel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.buttonForgotPassword.setOnClickListener(myviewmodelOnPasswordChangeButtonClickAndroidViewViewOnClickListener);
            this.buttonRegister.setOnClickListener(myviewmodelOnSigninPageChangeAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.passwordFirst, myviewmodelPasswordOne);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.passwordFirst, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.passwordFirstandroidTextAttrChanged);
            TextViewBindingAdapter.setText(this.passwordSecond, myviewmodelPasswordTwo);
            TextViewBindingAdapter.setTextWatcher(this.passwordSecond, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.passwordSecondandroidTextAttrChanged);
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
            this.value.onPasswordChangeButtonClick(arg0);
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
