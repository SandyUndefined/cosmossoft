package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public abstract class ActivitySelectOperatorBinding extends ViewDataBinding {
    public final CardView OperatorListCard;
    @Bindable
    protected MobileRechargeViewModel mSelectOperatorViewModel;
    public final SearchView operatorSearchList;
    public final RecyclerView operatorsRecycler;
    public final FrameLayout selectOperatorSliders;

    public abstract void setSelectOperatorViewModel(MobileRechargeViewModel mobileRechargeViewModel);

    protected ActivitySelectOperatorBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView OperatorListCard2, SearchView operatorSearchList2, RecyclerView operatorsRecycler2, FrameLayout selectOperatorSliders2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.OperatorListCard = OperatorListCard2;
        this.operatorSearchList = operatorSearchList2;
        this.operatorsRecycler = operatorsRecycler2;
        this.selectOperatorSliders = selectOperatorSliders2;
    }

    public MobileRechargeViewModel getSelectOperatorViewModel() {
        return this.mSelectOperatorViewModel;
    }

    public static ActivitySelectOperatorBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectOperatorBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivitySelectOperatorBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_select_operator, root, attachToRoot, component);
    }

    public static ActivitySelectOperatorBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectOperatorBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivitySelectOperatorBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_select_operator, (ViewGroup) null, false, component);
    }

    public static ActivitySelectOperatorBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivitySelectOperatorBinding bind(View view, Object component) {
        return (ActivitySelectOperatorBinding) bind(component, view, C0330R.layout.activity_select_operator);
    }
}
