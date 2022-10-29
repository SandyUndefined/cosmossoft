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
import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;

public abstract class RegularHistoryDesignBinding extends ViewDataBinding {
    public final MaterialButton claimRefund;
    public final MaterialButton historyClick;
    @Bindable
    protected RegularHistoryResponse.EveryDayData mHistData;
    public final CardView opSection;

    public abstract void setHistData(RegularHistoryResponse.EveryDayData everyDayData);

    protected RegularHistoryDesignBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton claimRefund2, MaterialButton historyClick2, CardView opSection2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.claimRefund = claimRefund2;
        this.historyClick = historyClick2;
        this.opSection = opSection2;
    }

    public RegularHistoryResponse.EveryDayData getHistData() {
        return this.mHistData;
    }

    public static RegularHistoryDesignBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static RegularHistoryDesignBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (RegularHistoryDesignBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.regular_history_design, root, attachToRoot, component);
    }

    public static RegularHistoryDesignBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static RegularHistoryDesignBinding inflate(LayoutInflater inflater, Object component) {
        return (RegularHistoryDesignBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.regular_history_design, (ViewGroup) null, false, component);
    }

    public static RegularHistoryDesignBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static RegularHistoryDesignBinding bind(View view, Object component) {
        return (RegularHistoryDesignBinding) bind(component, view, C0330R.layout.regular_history_design);
    }
}
