package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.AEPSBanksModel;

public abstract class AepsBankListLayoutBinding extends ViewDataBinding {
    public final TextView aepsBankName;
    public final View bankDivider;
    public final LinearLayout bankNameDetails;
    public final ImageView circleImage;
    public final RelativeLayout circleNameLayout;
    @Bindable
    protected AEPSBanksModel mBankListModel;

    public abstract void setBankListModel(AEPSBanksModel aEPSBanksModel);

    protected AepsBankListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView aepsBankName2, View bankDivider2, LinearLayout bankNameDetails2, ImageView circleImage2, RelativeLayout circleNameLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aepsBankName = aepsBankName2;
        this.bankDivider = bankDivider2;
        this.bankNameDetails = bankNameDetails2;
        this.circleImage = circleImage2;
        this.circleNameLayout = circleNameLayout2;
    }

    public AEPSBanksModel getBankListModel() {
        return this.mBankListModel;
    }

    public static AepsBankListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AepsBankListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (AepsBankListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.aeps_bank_list_layout, root, attachToRoot, component);
    }

    public static AepsBankListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AepsBankListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (AepsBankListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.aeps_bank_list_layout, (ViewGroup) null, false, component);
    }

    public static AepsBankListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AepsBankListLayoutBinding bind(View view, Object component) {
        return (AepsBankListLayoutBinding) bind(component, view, C0330R.layout.aeps_bank_list_layout);
    }
}
