package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.CircleModel;
import p005de.hdodenhof.circleimageview.CircleImageView;

public abstract class CircleListLayoutBinding extends ViewDataBinding {
    public final CircleImageView circleImage;
    public final TextView circleName;
    public final RelativeLayout circleNameLayout;
    public final View contactDivider;
    public final LinearLayout contactNameNumbers;
    @Bindable
    protected CircleModel mCircleModel;

    public abstract void setCircleModel(CircleModel circleModel);

    protected CircleListLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, CircleImageView circleImage2, TextView circleName2, RelativeLayout circleNameLayout2, View contactDivider2, LinearLayout contactNameNumbers2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.circleImage = circleImage2;
        this.circleName = circleName2;
        this.circleNameLayout = circleNameLayout2;
        this.contactDivider = contactDivider2;
        this.contactNameNumbers = contactNameNumbers2;
    }

    public CircleModel getCircleModel() {
        return this.mCircleModel;
    }

    public static CircleListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CircleListLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CircleListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.circle_list_layout, root, attachToRoot, component);
    }

    public static CircleListLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CircleListLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (CircleListLayoutBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.circle_list_layout, (ViewGroup) null, false, component);
    }

    public static CircleListLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CircleListLayoutBinding bind(View view, Object component) {
        return (CircleListLayoutBinding) bind(component, view, C0330R.layout.circle_list_layout);
    }
}
