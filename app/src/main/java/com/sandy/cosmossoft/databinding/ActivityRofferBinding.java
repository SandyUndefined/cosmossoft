package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public abstract class ActivityRofferBinding extends ViewDataBinding {
    public final RecyclerView allContactsRecycler;
    public final CardView allPlanCard;
    @Bindable
    protected MobileRechargeViewModel mROfferViewModel;
    public final CardView panSearchCard;
    public final SearchView planSearchView;
    public final LinearLayout selectPlanLayout;

    public abstract void setROfferViewModel(MobileRechargeViewModel mobileRechargeViewModel);

    protected ActivityRofferBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView allContactsRecycler2, CardView allPlanCard2, CardView panSearchCard2, SearchView planSearchView2, LinearLayout selectPlanLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.allContactsRecycler = allContactsRecycler2;
        this.allPlanCard = allPlanCard2;
        this.panSearchCard = panSearchCard2;
        this.planSearchView = planSearchView2;
        this.selectPlanLayout = selectPlanLayout2;
    }

    public MobileRechargeViewModel getROfferViewModel() {
        return this.mROfferViewModel;
    }

    public static ActivityRofferBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRofferBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityRofferBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_roffer, root, attachToRoot, component);
    }

    public static ActivityRofferBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRofferBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityRofferBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_roffer, (ViewGroup) null, false, component);
    }

    public static ActivityRofferBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRofferBinding bind(View view, Object component) {
        return (ActivityRofferBinding) bind(component, view, C0330R.layout.activity_roffer);
    }
}
