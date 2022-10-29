package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class ActivityAepsFailureReponseScreenBinding extends ViewDataBinding {
    public final TextView ackno;
    public final TextView clientrefno;
    public final TextView fromBank;
    public final LinearLayout headTransaction;
    public final TextView message;

    protected ActivityAepsFailureReponseScreenBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView ackno2, TextView clientrefno2, TextView fromBank2, LinearLayout headTransaction2, TextView message2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ackno = ackno2;
        this.clientrefno = clientrefno2;
        this.fromBank = fromBank2;
        this.headTransaction = headTransaction2;
        this.message = message2;
    }

    public static ActivityAepsFailureReponseScreenBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsFailureReponseScreenBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAepsFailureReponseScreenBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_aeps_failure_reponse_screen, root, attachToRoot, component);
    }

    public static ActivityAepsFailureReponseScreenBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsFailureReponseScreenBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAepsFailureReponseScreenBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_aeps_failure_reponse_screen, (ViewGroup) null, false, component);
    }

    public static ActivityAepsFailureReponseScreenBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsFailureReponseScreenBinding bind(View view, Object component) {
        return (ActivityAepsFailureReponseScreenBinding) bind(component, view, C0330R.layout.activity_aeps_failure_reponse_screen);
    }
}
