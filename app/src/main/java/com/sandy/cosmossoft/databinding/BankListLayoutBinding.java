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
import com.sandy.cosmossoft.data.model.BankModel;

public abstract class BankListLayoutBinding extends ViewDataBinding {
    public final TextView bankName;
    public final LinearLayout bankNameNumbers;
    public final View contactDivider;
    public final ImageView contactsImage;
    @Bindable
    protected BankModel mBankModel;

    public abstract void setBankModel(BankModel bankModel);

    protected BankListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView bankName2, LinearLayout bankNameNumbers2, View contactDivider2, ImageView contactsImage2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.bankName = bankName2;
        this.bankNameNumbers = bankNameNumbers2;
        this.contactDivider = contactDivider2;
        this.contactsImage = contactsImage2;
    }

    public BankModel getBankModel() {
        return this.mBankModel;
    }

    public static BankListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BankListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (BankListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.bank_list_layout, root, attachToRoot, component);
    }

    public static BankListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BankListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (BankListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.bank_list_layout, (ViewGroup) null, false, component);
    }

    public static BankListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BankListLayoutBinding bind(View view, Object component) {
        return (BankListLayoutBinding) bind(component, view, C0330R.layout.bank_list_layout);
    }
}
