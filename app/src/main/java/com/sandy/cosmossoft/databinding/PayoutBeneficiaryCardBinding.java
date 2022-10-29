package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryModel;

public abstract class PayoutBeneficiaryCardBinding extends ViewDataBinding {
    public final MaterialButton deleteDmtUser;
    public final CardView infoSection;
    @Bindable
    protected PBeneficiaryModel mPBemeModel;

    public abstract void setPBemeModel(PBeneficiaryModel pBeneficiaryModel);

    protected PayoutBeneficiaryCardBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton deleteDmtUser2, CardView infoSection2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.deleteDmtUser = deleteDmtUser2;
        this.infoSection = infoSection2;
    }

    public PBeneficiaryModel getPBemeModel() {
        return this.mPBemeModel;
    }

    public static PayoutBeneficiaryCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayoutBeneficiaryCardBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (PayoutBeneficiaryCardBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.payout_beneficiary_card, root, attachToRoot, component);
    }

    public static PayoutBeneficiaryCardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayoutBeneficiaryCardBinding inflate(LayoutInflater inflater, Object component) {
        return (PayoutBeneficiaryCardBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.payout_beneficiary_card, (ViewGroup) null, false, component);
    }

    public static PayoutBeneficiaryCardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayoutBeneficiaryCardBinding bind(View view, Object component) {
        return (PayoutBeneficiaryCardBinding) bind(component, view, C0330R.layout.payout_beneficiary_card);
    }
}
