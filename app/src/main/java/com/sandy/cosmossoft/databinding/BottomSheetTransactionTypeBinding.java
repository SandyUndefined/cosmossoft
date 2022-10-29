package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class BottomSheetTransactionTypeBinding extends ViewDataBinding {
    public final CheckBox addFundCheck;
    public final CheckBox aepsCheck;
    public final Button applyFilter;
    public final CheckBox bbpsCheck;
    public final ImageView cancelImage;
    public final TextView clearText;
    public final View divider3;
    public final CheckBox dmtCheck;
    public final CheckBox microatmCheck;
    public final CardView optionsCard;
    public final CardView optionsCardAnother;
    public final CheckBox payoutCheck;
    public final CheckBox rechargeCheck;
    public final RelativeLayout topSectionStuff;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected BottomSheetTransactionTypeBinding(Object _bindingComponent, View _root, int _localFieldCount, CheckBox addFundCheck2, CheckBox aepsCheck2, Button applyFilter2, CheckBox bbpsCheck2, ImageView cancelImage2, TextView clearText2, View divider32, CheckBox dmtCheck2, CheckBox microatmCheck2, CardView optionsCard2, CardView optionsCardAnother2, CheckBox payoutCheck2, CheckBox rechargeCheck2, RelativeLayout topSectionStuff2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addFundCheck = addFundCheck2;
        this.aepsCheck = aepsCheck2;
        this.applyFilter = applyFilter2;
        this.bbpsCheck = bbpsCheck2;
        this.cancelImage = cancelImage2;
        this.clearText = clearText2;
        this.divider3 = divider32;
        this.dmtCheck = dmtCheck2;
        this.microatmCheck = microatmCheck2;
        this.optionsCard = optionsCard2;
        this.optionsCardAnother = optionsCardAnother2;
        this.payoutCheck = payoutCheck2;
        this.rechargeCheck = rechargeCheck2;
        this.topSectionStuff = topSectionStuff2;
    }

    public static BottomSheetTransactionTypeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BottomSheetTransactionTypeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (BottomSheetTransactionTypeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.bottom_sheet_transaction_type, root, attachToRoot, component);
    }

    public static BottomSheetTransactionTypeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BottomSheetTransactionTypeBinding inflate(LayoutInflater inflater, Object component) {
        return (BottomSheetTransactionTypeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.bottom_sheet_transaction_type, (ViewGroup) null, false, component);
    }

    public static BottomSheetTransactionTypeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BottomSheetTransactionTypeBinding bind(View view, Object component) {
        return (BottomSheetTransactionTypeBinding) bind(component, view, C0330R.layout.bottom_sheet_transaction_type);
    }
}
