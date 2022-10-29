package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class ActivityAePsresponseScreenSuccessBinding extends ViewDataBinding {
    public final TextView ackno;
    public final TextView amount;
    public final TextView balanceamount;
    public final TextView clientrefno;
    public final TextView fromBank;
    public final LinearLayout headTransaction;
    public final LinearLayout infoTransaction;
    public final TextView lastAadhar;
    public final TextView message;
    public final TextView name;

    protected ActivityAePsresponseScreenSuccessBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView ackno2, TextView amount2, TextView balanceamount2, TextView clientrefno2, TextView fromBank2, LinearLayout headTransaction2, LinearLayout infoTransaction2, TextView lastAadhar2, TextView message2, TextView name2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ackno = ackno2;
        this.amount = amount2;
        this.balanceamount = balanceamount2;
        this.clientrefno = clientrefno2;
        this.fromBank = fromBank2;
        this.headTransaction = headTransaction2;
        this.infoTransaction = infoTransaction2;
        this.lastAadhar = lastAadhar2;
        this.message = message2;
        this.name = name2;
    }

    public static ActivityAePsresponseScreenSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAePsresponseScreenSuccessBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAePsresponseScreenSuccessBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_ae_psresponse_screen_success, root, attachToRoot, component);
    }

    public static ActivityAePsresponseScreenSuccessBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAePsresponseScreenSuccessBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAePsresponseScreenSuccessBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_ae_psresponse_screen_success, (ViewGroup) null, false, component);
    }

    public static ActivityAePsresponseScreenSuccessBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAePsresponseScreenSuccessBinding bind(View view, Object component) {
        return (ActivityAePsresponseScreenSuccessBinding) bind(component, view, C0330R.layout.activity_ae_psresponse_screen_success);
    }
}
