package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.MenuModel;

public abstract class RecyclerviewMenusOptionBinding extends ViewDataBinding {
    @Bindable
    protected MenuModel mMyMenus;
    public final ImageView menuIconLogo;
    public final TextView menuIconTitle;

    public abstract void setMyMenus(MenuModel menuModel);

    protected RecyclerviewMenusOptionBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView menuIconLogo2, TextView menuIconTitle2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.menuIconLogo = menuIconLogo2;
        this.menuIconTitle = menuIconTitle2;
    }

    public MenuModel getMyMenus() {
        return this.mMyMenus;
    }

    public static RecyclerviewMenusOptionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static RecyclerviewMenusOptionBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (RecyclerviewMenusOptionBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.recyclerview_menus_option, root, attachToRoot, component);
    }

    public static RecyclerviewMenusOptionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static RecyclerviewMenusOptionBinding inflate(LayoutInflater inflater, Object component) {
        return (RecyclerviewMenusOptionBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.recyclerview_menus_option, (ViewGroup) null, false, component);
    }

    public static RecyclerviewMenusOptionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static RecyclerviewMenusOptionBinding bind(View view, Object component) {
        return (RecyclerviewMenusOptionBinding) bind(component, view, C0330R.layout.recyclerview_menus_option);
    }
}
