package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public abstract class ActivityVerifyAccountsBinding extends ViewDataBinding {
    public final RadioButton Aadhaar;
    public final TextInputLayout aadhaarBackCardImage;
    public final TextInputLayout aadhaarFrontCardImage;
    public final LinearLayout aadhaarSectionLayout;
    public final CardView creditCardCard;
    public final RadioGroup docSelection;
    public final TextInputLayout ediPassbook;
    @Bindable
    protected PayoutViewModel mPayoutViewModel;
    public final RadioButton pan;
    public final TextInputLayout panCardImage;
    public final LinearLayout panSectionLayout;
    public final ScrollView scroller;
    public final TextInputEditText selectBackAadhaar;
    public final TextInputEditText selectFrontAadhaar;
    public final TextInputEditText selectPan;
    public final TextInputEditText selectPassbook;
    public final Button sendCreditCardOtp;
    public final TextView title;

    public abstract void setPayoutViewModel(PayoutViewModel payoutViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityVerifyAccountsBinding(Object _bindingComponent, View _root, int _localFieldCount, RadioButton Aadhaar2, TextInputLayout aadhaarBackCardImage2, TextInputLayout aadhaarFrontCardImage2, LinearLayout aadhaarSectionLayout2, CardView creditCardCard2, RadioGroup docSelection2, TextInputLayout ediPassbook2, RadioButton pan2, TextInputLayout panCardImage2, LinearLayout panSectionLayout2, ScrollView scroller2, TextInputEditText selectBackAadhaar2, TextInputEditText selectFrontAadhaar2, TextInputEditText selectPan2, TextInputEditText selectPassbook2, Button sendCreditCardOtp2, TextView title2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.Aadhaar = Aadhaar2;
        this.aadhaarBackCardImage = aadhaarBackCardImage2;
        this.aadhaarFrontCardImage = aadhaarFrontCardImage2;
        this.aadhaarSectionLayout = aadhaarSectionLayout2;
        this.creditCardCard = creditCardCard2;
        this.docSelection = docSelection2;
        this.ediPassbook = ediPassbook2;
        this.pan = pan2;
        this.panCardImage = panCardImage2;
        this.panSectionLayout = panSectionLayout2;
        this.scroller = scroller2;
        this.selectBackAadhaar = selectBackAadhaar2;
        this.selectFrontAadhaar = selectFrontAadhaar2;
        this.selectPan = selectPan2;
        this.selectPassbook = selectPassbook2;
        this.sendCreditCardOtp = sendCreditCardOtp2;
        this.title = title2;
    }

    public PayoutViewModel getPayoutViewModel() {
        return this.mPayoutViewModel;
    }

    public static ActivityVerifyAccountsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityVerifyAccountsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityVerifyAccountsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_verify_accounts, root, attachToRoot, component);
    }

    public static ActivityVerifyAccountsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityVerifyAccountsBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityVerifyAccountsBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_verify_accounts, (ViewGroup) null, false, component);
    }

    public static ActivityVerifyAccountsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityVerifyAccountsBinding bind(View view, Object component) {
        return (ActivityVerifyAccountsBinding) bind(component, view, C0330R.layout.activity_verify_accounts);
    }
}
