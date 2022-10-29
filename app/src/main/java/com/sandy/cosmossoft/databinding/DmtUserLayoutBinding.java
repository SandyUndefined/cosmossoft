package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.DmtUserData;

public abstract class DmtUserLayoutBinding extends ViewDataBinding {
    public final MaterialButton deleteDmtUser;
    public final CardView infoSection;
    @Bindable
    protected DmtUserData mDmtUserData;
    public final MaterialButton refreshDmtUser;

    public abstract void setDmtUserData(DmtUserData dmtUserData);

    protected DmtUserLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton deleteDmtUser2, CardView infoSection2, MaterialButton refreshDmtUser2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.deleteDmtUser = deleteDmtUser2;
        this.infoSection = infoSection2;
        this.refreshDmtUser = refreshDmtUser2;
    }

    public DmtUserData getDmtUserData() {
        return this.mDmtUserData;
    }

    public static DmtUserLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DmtUserLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DmtUserLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.dmt_user_layout, root, attachToRoot, component);
    }

    public static DmtUserLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DmtUserLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (DmtUserLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.dmt_user_layout, (ViewGroup) null, false, component);
    }

    public static DmtUserLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DmtUserLayoutBinding bind(View view, Object component) {
        return (DmtUserLayoutBinding) bind(component, view, C0330R.layout.dmt_user_layout);
    }
}
