package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public abstract class ActivityBbpsEnterBinding extends ViewDataBinding {
    public final TextInputEditText customerId;
    public final TextView dthCallInfo;
    public final CardView dthInfoCard;
    public final TextView dthInfoWritten;
    public final ImageButton getTheContacts;
    public final CardView inputNumLayout;
    public final ImageView logoImage2;
    @Bindable
    protected MobileRechargeViewModel mDirectToHomeViewModel;
    public final RelativeLayout numberInputSection;
    public final Button onBillFetchButton;
    public final FrameLayout selectNumberSliders;

    public abstract void setDirectToHomeViewModel(MobileRechargeViewModel mobileRechargeViewModel);

    protected ActivityBbpsEnterBinding(Object _bindingComponent, View _root, int _localFieldCount, TextInputEditText customerId2, TextView dthCallInfo2, CardView dthInfoCard2, TextView dthInfoWritten2, ImageButton getTheContacts2, CardView inputNumLayout2, ImageView logoImage22, RelativeLayout numberInputSection2, Button onBillFetchButton2, FrameLayout selectNumberSliders2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.customerId = customerId2;
        this.dthCallInfo = dthCallInfo2;
        this.dthInfoCard = dthInfoCard2;
        this.dthInfoWritten = dthInfoWritten2;
        this.getTheContacts = getTheContacts2;
        this.inputNumLayout = inputNumLayout2;
        this.logoImage2 = logoImage22;
        this.numberInputSection = numberInputSection2;
        this.onBillFetchButton = onBillFetchButton2;
        this.selectNumberSliders = selectNumberSliders2;
    }

    public MobileRechargeViewModel getDirectToHomeViewModel() {
        return this.mDirectToHomeViewModel;
    }

    public static ActivityBbpsEnterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBbpsEnterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityBbpsEnterBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_bbps_enter, root, attachToRoot, component);
    }

    public static ActivityBbpsEnterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBbpsEnterBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityBbpsEnterBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_bbps_enter, (ViewGroup) null, false, component);
    }

    public static ActivityBbpsEnterBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBbpsEnterBinding bind(View view, Object component) {
        return (ActivityBbpsEnterBinding) bind(component, view, C0330R.layout.activity_bbps_enter);
    }
}
