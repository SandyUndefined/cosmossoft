package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public abstract class ActivityPaysprintPayoutBinding extends ViewDataBinding {
    public final FloatingActionButton addMoreBeneficiary;
    public final RecyclerView dmtUserRecycler;
    @Bindable
    protected PayoutViewModel mPayoutViewModel;
    public final TextView noRecords;
    public final SearchView searchView;
    public final CardView userSearchCard;

    public abstract void setPayoutViewModel(PayoutViewModel payoutViewModel);

    protected ActivityPaysprintPayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, FloatingActionButton addMoreBeneficiary2, RecyclerView dmtUserRecycler2, TextView noRecords2, SearchView searchView2, CardView userSearchCard2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.addMoreBeneficiary = addMoreBeneficiary2;
        this.dmtUserRecycler = dmtUserRecycler2;
        this.noRecords = noRecords2;
        this.searchView = searchView2;
        this.userSearchCard = userSearchCard2;
    }

    public PayoutViewModel getPayoutViewModel() {
        return this.mPayoutViewModel;
    }

    public static ActivityPaysprintPayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPaysprintPayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityPaysprintPayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_paysprint_payout, root, attachToRoot, component);
    }

    public static ActivityPaysprintPayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPaysprintPayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityPaysprintPayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_paysprint_payout, (ViewGroup) null, false, component);
    }

    public static ActivityPaysprintPayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPaysprintPayoutBinding bind(View view, Object component) {
        return (ActivityPaysprintPayoutBinding) bind(component, view, C0330R.layout.activity_paysprint_payout);
    }
}
