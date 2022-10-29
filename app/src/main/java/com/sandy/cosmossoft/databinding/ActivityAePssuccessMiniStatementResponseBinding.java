package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;

public abstract class ActivityAePssuccessMiniStatementResponseBinding extends ViewDataBinding {
    public final RelativeLayout aboveInfo;
    public final CardView aboveInfoRoot;
    public final TextView acknowledgeNoText;
    public final TextView givenAckno;
    public final TextView givenBalance;
    public final TextView givenBalanceText;
    public final TextView givenBankName;
    public final TextView givenBankNameText;
    public final TextView givenDateTime;
    public final TextView givenDateTimeText;
    public final RecyclerView miniStateRecycler;

    protected ActivityAePssuccessMiniStatementResponseBinding(Object _bindingComponent, View _root, int _localFieldCount, RelativeLayout aboveInfo2, CardView aboveInfoRoot2, TextView acknowledgeNoText2, TextView givenAckno2, TextView givenBalance2, TextView givenBalanceText2, TextView givenBankName2, TextView givenBankNameText2, TextView givenDateTime2, TextView givenDateTimeText2, RecyclerView miniStateRecycler2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aboveInfo = aboveInfo2;
        this.aboveInfoRoot = aboveInfoRoot2;
        this.acknowledgeNoText = acknowledgeNoText2;
        this.givenAckno = givenAckno2;
        this.givenBalance = givenBalance2;
        this.givenBalanceText = givenBalanceText2;
        this.givenBankName = givenBankName2;
        this.givenBankNameText = givenBankNameText2;
        this.givenDateTime = givenDateTime2;
        this.givenDateTimeText = givenDateTimeText2;
        this.miniStateRecycler = miniStateRecycler2;
    }

    public static ActivityAePssuccessMiniStatementResponseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAePssuccessMiniStatementResponseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAePssuccessMiniStatementResponseBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_ae_pssuccess_mini_statement_response, root, attachToRoot, component);
    }

    public static ActivityAePssuccessMiniStatementResponseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAePssuccessMiniStatementResponseBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAePssuccessMiniStatementResponseBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_ae_pssuccess_mini_statement_response, (ViewGroup) null, false, component);
    }

    public static ActivityAePssuccessMiniStatementResponseBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAePssuccessMiniStatementResponseBinding bind(View view, Object component) {
        return (ActivityAePssuccessMiniStatementResponseBinding) bind(component, view, C0330R.layout.activity_ae_pssuccess_mini_statement_response);
    }
}
