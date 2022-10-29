package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.PayoutList;

public abstract class PayoutListLayoutBinding extends ViewDataBinding {
    public final TextView accNumber;
    public final TextView bankName;
    public final TextView ifscCode;
    public final CardView infoSection;
    @Bindable
    protected PayoutList mPaySprintList;
    public final TextView name;
    public final MaterialButton verifyAccount;

    public abstract void setPaySprintList(PayoutList payoutList);

    protected PayoutListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView accNumber2, TextView bankName2, TextView ifscCode2, CardView infoSection2, TextView name2, MaterialButton verifyAccount2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.accNumber = accNumber2;
        this.bankName = bankName2;
        this.ifscCode = ifscCode2;
        this.infoSection = infoSection2;
        this.name = name2;
        this.verifyAccount = verifyAccount2;
    }

    public PayoutList getPaySprintList() {
        return this.mPaySprintList;
    }

    public static PayoutListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayoutListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (PayoutListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.payout_list_layout, root, attachToRoot, component);
    }

    public static PayoutListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayoutListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (PayoutListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.payout_list_layout, (ViewGroup) null, false, component);
    }

    public static PayoutListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayoutListLayoutBinding bind(View view, Object component) {
        return (PayoutListLayoutBinding) bind(component, view, C0330R.layout.payout_list_layout);
    }
}
