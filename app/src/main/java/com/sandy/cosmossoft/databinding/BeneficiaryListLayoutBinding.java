package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;

public abstract class BeneficiaryListLayoutBinding extends ViewDataBinding {
    public final TextView beneficiaryAccountNo;
    public final TextView beneficiaryBankName;
    public final LinearLayout beneficiaryDetails;
    public final ImageView beneficiaryImage;
    public final TextView beneficiaryName;
    public final View contactDivider;
    public final ImageView deleteBeneficiary;
    @Bindable
    protected BeneficiaryBank mBeneficiaryModel;

    public abstract void setBeneficiaryModel(BeneficiaryBank beneficiaryBank);

    protected BeneficiaryListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView beneficiaryAccountNo2, TextView beneficiaryBankName2, LinearLayout beneficiaryDetails2, ImageView beneficiaryImage2, TextView beneficiaryName2, View contactDivider2, ImageView deleteBeneficiary2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.beneficiaryAccountNo = beneficiaryAccountNo2;
        this.beneficiaryBankName = beneficiaryBankName2;
        this.beneficiaryDetails = beneficiaryDetails2;
        this.beneficiaryImage = beneficiaryImage2;
        this.beneficiaryName = beneficiaryName2;
        this.contactDivider = contactDivider2;
        this.deleteBeneficiary = deleteBeneficiary2;
    }

    public BeneficiaryBank getBeneficiaryModel() {
        return this.mBeneficiaryModel;
    }

    public static BeneficiaryListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BeneficiaryListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (BeneficiaryListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.beneficiary_list_layout, root, attachToRoot, component);
    }

    public static BeneficiaryListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BeneficiaryListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (BeneficiaryListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.beneficiary_list_layout, (ViewGroup) null, false, component);
    }

    public static BeneficiaryListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BeneficiaryListLayoutBinding bind(View view, Object component) {
        return (BeneficiaryListLayoutBinding) bind(component, view, C0330R.layout.beneficiary_list_layout);
    }
}
