package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.makeramen.roundedimageview.RoundedImageView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;

public abstract class ActivityAepsHomeBinding extends ViewDataBinding {
    public final CardView aepsBannerImage;
    public final RecyclerView aepsHomeMenu;
    public final RoundedImageView bannerImage;
    @Bindable
    protected AepsViewModel mAepsHomeViewModel;

    public abstract void setAepsHomeViewModel(AepsViewModel aepsViewModel);

    protected ActivityAepsHomeBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView aepsBannerImage2, RecyclerView aepsHomeMenu2, RoundedImageView bannerImage2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aepsBannerImage = aepsBannerImage2;
        this.aepsHomeMenu = aepsHomeMenu2;
        this.bannerImage = bannerImage2;
    }

    public AepsViewModel getAepsHomeViewModel() {
        return this.mAepsHomeViewModel;
    }

    public static ActivityAepsHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityAepsHomeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_aeps_home, root, attachToRoot, component);
    }

    public static ActivityAepsHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsHomeBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityAepsHomeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_aeps_home, (ViewGroup) null, false, component);
    }

    public static ActivityAepsHomeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityAepsHomeBinding bind(View view, Object component) {
        return (ActivityAepsHomeBinding) bind(component, view, C0330R.layout.activity_aeps_home);
    }
}
