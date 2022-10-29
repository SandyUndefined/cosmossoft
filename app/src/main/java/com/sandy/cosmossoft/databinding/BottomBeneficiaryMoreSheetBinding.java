package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class BottomBeneficiaryMoreSheetBinding extends ViewDataBinding {
    public final View beneficiaryDivider;
    public final View beneficiaryDivider3;
    public final TextView cancel;
    public final CardView cancelCard;
    public final RelativeLayout cancelLayout;
    public final RelativeLayout historyLayout;
    public final CardView optionsCard;
    public final TextView pennyDrop;
    public final TextView remove;
    public final RelativeLayout removeLayout;
    public final RelativeLayout shareLayout;
    public final TextView viewHistory;

    protected BottomBeneficiaryMoreSheetBinding(Object _bindingComponent, View _root, int _localFieldCount, View beneficiaryDivider2, View beneficiaryDivider32, TextView cancel2, CardView cancelCard2, RelativeLayout cancelLayout2, RelativeLayout historyLayout2, CardView optionsCard2, TextView pennyDrop2, TextView remove2, RelativeLayout removeLayout2, RelativeLayout shareLayout2, TextView viewHistory2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.beneficiaryDivider = beneficiaryDivider2;
        this.beneficiaryDivider3 = beneficiaryDivider32;
        this.cancel = cancel2;
        this.cancelCard = cancelCard2;
        this.cancelLayout = cancelLayout2;
        this.historyLayout = historyLayout2;
        this.optionsCard = optionsCard2;
        this.pennyDrop = pennyDrop2;
        this.remove = remove2;
        this.removeLayout = removeLayout2;
        this.shareLayout = shareLayout2;
        this.viewHistory = viewHistory2;
    }

    public static BottomBeneficiaryMoreSheetBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BottomBeneficiaryMoreSheetBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (BottomBeneficiaryMoreSheetBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.bottom_beneficiary_more_sheet, root, attachToRoot, component);
    }

    public static BottomBeneficiaryMoreSheetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BottomBeneficiaryMoreSheetBinding inflate(LayoutInflater inflater, Object component) {
        return (BottomBeneficiaryMoreSheetBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.bottom_beneficiary_more_sheet, (ViewGroup) null, false, component);
    }

    public static BottomBeneficiaryMoreSheetBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BottomBeneficiaryMoreSheetBinding bind(View view, Object component) {
        return (BottomBeneficiaryMoreSheetBinding) bind(component, view, C0330R.layout.bottom_beneficiary_more_sheet);
    }
}
