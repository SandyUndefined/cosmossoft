package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import p007pl.droidsonroids.gif.GifImageView;

public abstract class CustomAlertDialogBinding extends ViewDataBinding {
    public final TextView alertCancel;
    public final TextView alertMessage;
    public final TextView alertOkay;
    public final TextView alertTitle;
    public final GifImageView centerLogo;
    public final CardView dialogSection;

    protected CustomAlertDialogBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView alertCancel2, TextView alertMessage2, TextView alertOkay2, TextView alertTitle2, GifImageView centerLogo2, CardView dialogSection2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.alertCancel = alertCancel2;
        this.alertMessage = alertMessage2;
        this.alertOkay = alertOkay2;
        this.alertTitle = alertTitle2;
        this.centerLogo = centerLogo2;
        this.dialogSection = dialogSection2;
    }

    public static CustomAlertDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomAlertDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CustomAlertDialogBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.custom_alert_dialog, root, attachToRoot, component);
    }

    public static CustomAlertDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomAlertDialogBinding inflate(LayoutInflater inflater, Object component) {
        return (CustomAlertDialogBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.custom_alert_dialog, (ViewGroup) null, false, component);
    }

    public static CustomAlertDialogBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomAlertDialogBinding bind(View view, Object component) {
        return (CustomAlertDialogBinding) bind(component, view, C0330R.layout.custom_alert_dialog);
    }
}
