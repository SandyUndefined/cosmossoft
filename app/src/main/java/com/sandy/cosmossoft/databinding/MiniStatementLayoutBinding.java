package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.MiniStatementData;

public abstract class MiniStatementLayoutBinding extends ViewDataBinding {
    public final TextView givenAmount;
    public final TextView givenCrDr;
    public final TextView givenDate;
    public final TextView givenNarration;
    @Bindable
    protected MiniStatementData mMinSatementModel;
    public final CardView statementsInfo;

    public abstract void setMinSatementModel(MiniStatementData miniStatementData);

    protected MiniStatementLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView givenAmount2, TextView givenCrDr2, TextView givenDate2, TextView givenNarration2, CardView statementsInfo2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.givenAmount = givenAmount2;
        this.givenCrDr = givenCrDr2;
        this.givenDate = givenDate2;
        this.givenNarration = givenNarration2;
        this.statementsInfo = statementsInfo2;
    }

    public MiniStatementData getMinSatementModel() {
        return this.mMinSatementModel;
    }

    public static MiniStatementLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MiniStatementLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (MiniStatementLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.mini_statement_layout, root, attachToRoot, component);
    }

    public static MiniStatementLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MiniStatementLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (MiniStatementLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.mini_statement_layout, (ViewGroup) null, false, component);
    }

    public static MiniStatementLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MiniStatementLayoutBinding bind(View view, Object component) {
        return (MiniStatementLayoutBinding) bind(component, view, C0330R.layout.mini_statement_layout);
    }
}
