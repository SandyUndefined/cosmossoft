package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;

public abstract class TPinLayoutBinding extends ViewDataBinding {
    public final MaterialButton cancelButton;
    public final MaterialButton confirmButton;
    public final CardView infoSection;
    public final TextInputEditText tPinEdit;
    public final TextInputLayout tPinLayout;
    public final TextView tPinTitle;

    protected TPinLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton cancelButton2, MaterialButton confirmButton2, CardView infoSection2, TextInputEditText tPinEdit2, TextInputLayout tPinLayout2, TextView tPinTitle2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cancelButton = cancelButton2;
        this.confirmButton = confirmButton2;
        this.infoSection = infoSection2;
        this.tPinEdit = tPinEdit2;
        this.tPinLayout = tPinLayout2;
        this.tPinTitle = tPinTitle2;
    }

    public static TPinLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static TPinLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (TPinLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.t_pin_layout, root, attachToRoot, component);
    }

    public static TPinLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static TPinLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (TPinLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.t_pin_layout, (ViewGroup) null, false, component);
    }

    public static TPinLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static TPinLayoutBinding bind(View view, Object component) {
        return (TPinLayoutBinding) bind(component, view, C0330R.layout.t_pin_layout);
    }
}
