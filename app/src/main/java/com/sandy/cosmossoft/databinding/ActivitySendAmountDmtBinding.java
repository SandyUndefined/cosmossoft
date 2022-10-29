package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public abstract class ActivitySendAmountDmtBinding extends ViewDataBinding {
    public final CardView addAmountBalanceSection;
    public final CardView addAmountTopSection;
    public final TextView beneficiaryAccountNo;
    public final TextView beneficiaryBankName;
    public final LinearLayout beneficiaryDetails;
    public final ImageView beneficiaryImage;
    public final TextView beneficiaryName;
    public final MaterialButton buttonSendAmount;
    public final TextInputEditText enteredAmount;
    @Bindable
    protected ToBankViewModel mSendAmountViewModel;
    public final TextInputLayout textInputLayout;
    public final TextInputEditText transactionType;
    public final TextView viewHistory;

    public abstract void setSendAmountViewModel(ToBankViewModel toBankViewModel);

    protected ActivitySendAmountDmtBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView addAmountBalanceSection2, CardView addAmountTopSection2, TextView beneficiaryAccountNo2, TextView beneficiaryBankName2, LinearLayout beneficiaryDetails2, ImageView beneficiaryImage2, TextView beneficiaryName2, MaterialButton buttonSendAmount2, TextInputEditText enteredAmount2, TextInputLayout textInputLayout2, TextInputEditText transactionType2, TextView viewHistory2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addAmountBalanceSection = addAmountBalanceSection2;
        this.addAmountTopSection = addAmountTopSection2;
        this.beneficiaryAccountNo = beneficiaryAccountNo2;
        this.beneficiaryBankName = beneficiaryBankName2;
        this.beneficiaryDetails = beneficiaryDetails2;
        this.beneficiaryImage = beneficiaryImage2;
        this.beneficiaryName = beneficiaryName2;
        this.buttonSendAmount = buttonSendAmount2;
        this.enteredAmount = enteredAmount2;
        this.textInputLayout = textInputLayout2;
        this.transactionType = transactionType2;
        this.viewHistory = viewHistory2;
    }

    public ToBankViewModel getSendAmountViewModel() {
        return this.mSendAmountViewModel;
    }

    public static ActivitySendAmountDmtBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendAmountDmtBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySendAmountDmtBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_send_amount_dmt, root, attachToRoot, component);
    }

    public static ActivitySendAmountDmtBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendAmountDmtBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySendAmountDmtBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_send_amount_dmt, (ViewGroup) null, false, component);
    }

    public static ActivitySendAmountDmtBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySendAmountDmtBinding bind(View view, Object component) {
        return (ActivitySendAmountDmtBinding) bind(component, view, C0330R.layout.activity_send_amount_dmt);
    }
}
