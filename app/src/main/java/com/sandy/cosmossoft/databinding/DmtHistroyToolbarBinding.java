package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;

public abstract class DmtHistroyToolbarBinding extends ViewDataBinding {
    public final View divider;
    public final Toolbar parentToolbar;
    public final TextView topTransactionDate;
    public final TextView topTransactionMessage;

    protected DmtHistroyToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount, View divider2, Toolbar parentToolbar2, TextView topTransactionDate2, TextView topTransactionMessage2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.divider = divider2;
        this.parentToolbar = parentToolbar2;
        this.topTransactionDate = topTransactionDate2;
        this.topTransactionMessage = topTransactionMessage2;
    }

    public static DmtHistroyToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DmtHistroyToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DmtHistroyToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.dmt_histroy_toolbar, root, attachToRoot, component);
    }

    public static DmtHistroyToolbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DmtHistroyToolbarBinding inflate(LayoutInflater inflater, Object component) {
        return (DmtHistroyToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.dmt_histroy_toolbar, (ViewGroup) null, false, component);
    }

    public static DmtHistroyToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DmtHistroyToolbarBinding bind(View view, Object component) {
        return (DmtHistroyToolbarBinding) bind(component, view, C0330R.layout.dmt_histroy_toolbar);
    }
}
