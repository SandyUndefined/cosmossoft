package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivityQueueryRemitterBinding extends ViewDataBinding {
    public final MaterialButton buttonApply;
    public final TextInputLayout editMobile;
    @Bindable
    protected ToBankViewModel mQueueryRemitter;
    public final TextInputEditText mobileNumber;

    public abstract void setQueueryRemitter(ToBankViewModel toBankViewModel);

    protected ActivityQueueryRemitterBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton buttonApply2, TextInputLayout editMobile2, TextInputEditText mobileNumber2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.buttonApply = buttonApply2;
        this.editMobile = editMobile2;
        this.mobileNumber = mobileNumber2;
    }

    public ToBankViewModel getQueueryRemitter() {
        return this.mQueueryRemitter;
    }

    public static ActivityQueueryRemitterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityQueueryRemitterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityQueueryRemitterBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_queuery_remitter, root, attachToRoot, component);
    }

    public static ActivityQueueryRemitterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityQueueryRemitterBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityQueueryRemitterBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_queuery_remitter, (ViewGroup) null, false, component);
    }

    public static ActivityQueueryRemitterBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityQueueryRemitterBinding bind(View view, Object component) {
        return (ActivityQueueryRemitterBinding) bind(component, view, C0330R.layout.activity_queuery_remitter);
    }
}
