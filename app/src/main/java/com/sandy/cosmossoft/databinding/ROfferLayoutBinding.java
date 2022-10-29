package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.ROfferModel;

public abstract class ROfferLayoutBinding extends ViewDataBinding {
    public final TextView desc;
    @Bindable
    protected ROfferModel mROfferDataModel;
    public final TextView rupee;

    public abstract void setROfferDataModel(ROfferModel rOfferModel);

    protected ROfferLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView desc2, TextView rupee2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.desc = desc2;
        this.rupee = rupee2;
    }

    public ROfferModel getROfferDataModel() {
        return this.mROfferDataModel;
    }

    public static ROfferLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ROfferLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ROfferLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.r_offer_layout, root, attachToRoot, component);
    }

    public static ROfferLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ROfferLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (ROfferLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.r_offer_layout, (ViewGroup) null, false, component);
    }

    public static ROfferLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ROfferLayoutBinding bind(View view, Object component) {
        return (ROfferLayoutBinding) bind(component, view, C0330R.layout.r_offer_layout);
    }
}
