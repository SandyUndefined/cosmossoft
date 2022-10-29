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

public abstract class OtpScreenLayoutBinding extends ViewDataBinding {
    public final MaterialButton cancelLayout;
    public final TextInputLayout editOtpLay;
    public final TextInputEditText enterOtpDmt;
    public final CardView infoSection;
    public final TextView titleTop;
    public final MaterialButton verifyOtp;

    protected OtpScreenLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton cancelLayout2, TextInputLayout editOtpLay2, TextInputEditText enterOtpDmt2, CardView infoSection2, TextView titleTop2, MaterialButton verifyOtp2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cancelLayout = cancelLayout2;
        this.editOtpLay = editOtpLay2;
        this.enterOtpDmt = enterOtpDmt2;
        this.infoSection = infoSection2;
        this.titleTop = titleTop2;
        this.verifyOtp = verifyOtp2;
    }

    public static OtpScreenLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OtpScreenLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (OtpScreenLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.otp_screen_layout, root, attachToRoot, component);
    }

    public static OtpScreenLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OtpScreenLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (OtpScreenLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.otp_screen_layout, (ViewGroup) null, false, component);
    }

    public static OtpScreenLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OtpScreenLayoutBinding bind(View view, Object component) {
        return (OtpScreenLayoutBinding) bind(component, view, C0330R.layout.otp_screen_layout);
    }
}
