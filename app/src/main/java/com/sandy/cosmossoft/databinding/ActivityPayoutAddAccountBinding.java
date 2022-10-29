package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public abstract class ActivityPayoutAddAccountBinding extends ViewDataBinding {
    public final TextInputEditText accNumber;
    public final Button addAccountButton;
    public final TextInputEditText bankName;
    public final CardView bankSectionBar;
    public final TextInputEditText beneName;
    public final TextInputEditText ifscCode;
    @Bindable
    protected PayoutViewModel mPayoutViewModel;

    public abstract void setPayoutViewModel(PayoutViewModel payoutViewModel);

    protected ActivityPayoutAddAccountBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText accNumber2, Button addAccountButton2, TextInputEditText bankName2, CardView bankSectionBar2, TextInputEditText beneName2, TextInputEditText ifscCode2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.accNumber = accNumber2;
        this.addAccountButton = addAccountButton2;
        this.bankName = bankName2;
        this.bankSectionBar = bankSectionBar2;
        this.beneName = beneName2;
        this.ifscCode = ifscCode2;
    }

    public PayoutViewModel getPayoutViewModel() {
        return this.mPayoutViewModel;
    }

    public static ActivityPayoutAddAccountBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutAddAccountBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPayoutAddAccountBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_payout_add_account, root, attachToRoot, component);
    }

    public static ActivityPayoutAddAccountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutAddAccountBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPayoutAddAccountBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_payout_add_account, (ViewGroup) null, false, component);
    }

    public static ActivityPayoutAddAccountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutAddAccountBinding bind(View view, Object component) {
        return (ActivityPayoutAddAccountBinding) bind(component, view, C0330R.layout.activity_payout_add_account);
    }
}
