package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.MicroAtmModel;

public abstract class ActivityMicroAtmResponseBinding extends ViewDataBinding {
    @Bindable
    protected MicroAtmModel mMicroAtmData;

    public abstract void setMicroAtmData(MicroAtmModel microAtmModel);

    protected ActivityMicroAtmResponseBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public MicroAtmModel getMicroAtmData() {
        return this.mMicroAtmData;
    }

    public static ActivityMicroAtmResponseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMicroAtmResponseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMicroAtmResponseBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_micro_atm_response, root, attachToRoot, component);
    }

    public static ActivityMicroAtmResponseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMicroAtmResponseBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMicroAtmResponseBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_micro_atm_response, (ViewGroup) null, false, component);
    }

    public static ActivityMicroAtmResponseBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMicroAtmResponseBinding bind(View view, Object component) {
        return (ActivityMicroAtmResponseBinding) bind(component, view, C0330R.layout.activity_micro_atm_response);
    }
}
