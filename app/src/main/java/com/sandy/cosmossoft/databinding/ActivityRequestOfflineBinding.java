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
import com.sandy.cosmossoft.viewmodel.FundViewModel;

public abstract class ActivityRequestOfflineBinding extends ViewDataBinding {
    public final TextInputEditText amount;
    @Bindable
    protected FundViewModel mFundViewModel;
    public final Button onRequestOfflineAmount;
    public final CardView paymentSection;
    public final TextInputLayout receiptSelector;
    public final TextInputEditText remarks;
    public final TextInputEditText selectReceipt;
    public final TextInputLayout textInputLayout;
    public final TextInputEditText transactionID;
    public final TextInputEditText transactionType;

    public abstract void setFundViewModel(FundViewModel fundViewModel);

    protected ActivityRequestOfflineBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText amount2, Button onRequestOfflineAmount2, CardView paymentSection2, TextInputLayout receiptSelector2, TextInputEditText remarks2, TextInputEditText selectReceipt2, TextInputLayout textInputLayout2, TextInputEditText transactionID2, TextInputEditText transactionType2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.amount = amount2;
        this.onRequestOfflineAmount = onRequestOfflineAmount2;
        this.paymentSection = paymentSection2;
        this.receiptSelector = receiptSelector2;
        this.remarks = remarks2;
        this.selectReceipt = selectReceipt2;
        this.textInputLayout = textInputLayout2;
        this.transactionID = transactionID2;
        this.transactionType = transactionType2;
    }

    public FundViewModel getFundViewModel() {
        return this.mFundViewModel;
    }

    public static ActivityRequestOfflineBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRequestOfflineBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityRequestOfflineBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_request_offline, root, attachToRoot, component);
    }

    public static ActivityRequestOfflineBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRequestOfflineBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityRequestOfflineBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_request_offline, (ViewGroup) null, false, component);
    }

    public static ActivityRequestOfflineBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRequestOfflineBinding bind(View view, Object component) {
        return (ActivityRequestOfflineBinding) bind(component, view, C0330R.layout.activity_request_offline);
    }
}
