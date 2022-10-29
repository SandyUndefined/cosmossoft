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
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public abstract class ActivityPayoutsBinding extends ViewDataBinding {
    public final TextInputEditText accountNumber;
    public final TextInputEditText enteredAmount;
    public final CardView infoSection;
    @Bindable
    protected PayoutViewModel mPayoutViewModel;
    public final TextInputEditText mobileIFSC;
    public final Button onBillPayButton;
    public final TextInputLayout textInputLayout;
    public final TextInputEditText transactionType;

    public abstract void setPayoutViewModel(PayoutViewModel payoutViewModel);

    protected ActivityPayoutsBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText accountNumber2, TextInputEditText enteredAmount2, CardView infoSection2, TextInputEditText mobileIFSC2, Button onBillPayButton2, TextInputLayout textInputLayout2, TextInputEditText transactionType2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.accountNumber = accountNumber2;
        this.enteredAmount = enteredAmount2;
        this.infoSection = infoSection2;
        this.mobileIFSC = mobileIFSC2;
        this.onBillPayButton = onBillPayButton2;
        this.textInputLayout = textInputLayout2;
        this.transactionType = transactionType2;
    }

    public PayoutViewModel getPayoutViewModel() {
        return this.mPayoutViewModel;
    }

    public static ActivityPayoutsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPayoutsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_payouts, root, attachToRoot, component);
    }

    public static ActivityPayoutsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutsBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPayoutsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_payouts, (ViewGroup) null, false, component);
    }

    public static ActivityPayoutsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPayoutsBinding bind(View view, Object component) {
        return (ActivityPayoutsBinding) bind(component, view, C0330R.layout.activity_payouts);
    }
}
