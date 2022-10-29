package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.OperatorModel;
import p005de.hdodenhof.circleimageview.CircleImageView;

public abstract class OperatorListLayoutBinding extends ViewDataBinding {
    public final View contactDivider;
    public final LinearLayout contactNameNumbers;
    public final CircleImageView contactsImage;
    @Bindable
    protected OperatorModel mOperatorModel;
    public final TextView operatorName;

    public abstract void setOperatorModel(OperatorModel operatorModel);

    protected OperatorListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, View contactDivider2, LinearLayout contactNameNumbers2, CircleImageView contactsImage2, TextView operatorName2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.contactDivider = contactDivider2;
        this.contactNameNumbers = contactNameNumbers2;
        this.contactsImage = contactsImage2;
        this.operatorName = operatorName2;
    }

    public OperatorModel getOperatorModel() {
        return this.mOperatorModel;
    }

    public static OperatorListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OperatorListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (OperatorListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.operator_list_layout, root, attachToRoot, component);
    }

    public static OperatorListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OperatorListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (OperatorListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.operator_list_layout, (ViewGroup) null, false, component);
    }

    public static OperatorListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static OperatorListLayoutBinding bind(View view, Object component) {
        return (OperatorListLayoutBinding) bind(component, view, C0330R.layout.operator_list_layout);
    }
}
