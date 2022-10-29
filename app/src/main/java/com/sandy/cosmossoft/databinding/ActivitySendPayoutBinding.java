package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public abstract class ActivitySendPayoutBinding extends ViewDataBinding {
    @Bindable
    protected PayoutViewModel mPayoutViewModel;

    public abstract void setPayoutViewModel(PayoutViewModel payoutViewModel);

    protected ActivitySendPayoutBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public PayoutViewModel getPayoutViewModel() {
        return this.mPayoutViewModel;
    }

    public static ActivitySendPayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendPayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySendPayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_send_payout, root, attachToRoot, component);
    }

    public static ActivitySendPayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendPayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySendPayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_send_payout, (ViewGroup) null, false, component);
    }

    public static ActivitySendPayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendPayoutBinding bind(View view, Object component) {
        return (ActivitySendPayoutBinding) bind(component, view, C0330R.layout.activity_send_payout);
    }
}
