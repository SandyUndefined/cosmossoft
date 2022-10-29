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
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;

public abstract class ActivityMobileNumberHomePageBinding extends ViewDataBinding {
    public final CardView allContactsCard;
    public final RecyclerView allContactsRecycler;
    public final SearchView contactsSearchView;
    @Bindable
    protected MobileNumberPayViewModel mMobileNumbersViewModel;
    public final CardView numberSearchCard;
    public final LinearLayout selectContactLayout;

    public abstract void setMobileNumbersViewModel(MobileNumberPayViewModel mobileNumberPayViewModel);

    protected ActivityMobileNumberHomePageBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView allContactsCard2, RecyclerView allContactsRecycler2, SearchView contactsSearchView2, CardView numberSearchCard2, LinearLayout selectContactLayout2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.allContactsCard = allContactsCard2;
        this.allContactsRecycler = allContactsRecycler2;
        this.contactsSearchView = contactsSearchView2;
        this.numberSearchCard = numberSearchCard2;
        this.selectContactLayout = selectContactLayout2;
    }

    public MobileNumberPayViewModel getMobileNumbersViewModel() {
        return this.mMobileNumbersViewModel;
    }

    public static ActivityMobileNumberHomePageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMobileNumberHomePageBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMobileNumberHomePageBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mobile_number_home_page, root, attachToRoot, component);
    }

    public static ActivityMobileNumberHomePageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMobileNumberHomePageBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMobileNumberHomePageBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_mobile_number_home_page, (ViewGroup) null, false, component);
    }

    public static ActivityMobileNumberHomePageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMobileNumberHomePageBinding bind(View view, Object component) {
        return (ActivityMobileNumberHomePageBinding) bind(component, view, C0330R.layout.activity_mobile_number_home_page);
    }
}
