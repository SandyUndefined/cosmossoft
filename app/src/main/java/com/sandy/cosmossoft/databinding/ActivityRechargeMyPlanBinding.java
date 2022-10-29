package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public abstract class ActivityRechargeMyPlanBinding extends ViewDataBinding {
    public final MaterialButton ROffer;
    public final MaterialButton browsePlan;
    public final ImageView contactsImage;
    public final TextInputEditText customerId;
    public final TextInputEditText customerPlan;
    public final TextView dthCallInfo;
    public final CardView dthInfoCard;
    public final ImageButton getTheContacts;
    public final CardView inputNumLayout;
    @Bindable
    protected MobileRechargeViewModel mRechargeViewModel;
    public final Button mobileRechargeButton;
    public final LinearLayout numberInputSection;
    public final FrameLayout selectNumberSliders;

    public abstract void setRechargeViewModel(MobileRechargeViewModel mobileRechargeViewModel);

    protected ActivityRechargeMyPlanBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton ROffer2, MaterialButton browsePlan2, ImageView contactsImage2, TextInputEditText customerId2, TextInputEditText customerPlan2, TextView dthCallInfo2, CardView dthInfoCard2, ImageButton getTheContacts2, CardView inputNumLayout2, Button mobileRechargeButton2, LinearLayout numberInputSection2, FrameLayout selectNumberSliders2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ROffer = ROffer2;
        this.browsePlan = browsePlan2;
        this.contactsImage = contactsImage2;
        this.customerId = customerId2;
        this.customerPlan = customerPlan2;
        this.dthCallInfo = dthCallInfo2;
        this.dthInfoCard = dthInfoCard2;
        this.getTheContacts = getTheContacts2;
        this.inputNumLayout = inputNumLayout2;
        this.mobileRechargeButton = mobileRechargeButton2;
        this.numberInputSection = numberInputSection2;
        this.selectNumberSliders = selectNumberSliders2;
    }

    public MobileRechargeViewModel getRechargeViewModel() {
        return this.mRechargeViewModel;
    }

    public static ActivityRechargeMyPlanBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRechargeMyPlanBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityRechargeMyPlanBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_recharge_my_plan, root, attachToRoot, component);
    }

    public static ActivityRechargeMyPlanBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRechargeMyPlanBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityRechargeMyPlanBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_recharge_my_plan, (ViewGroup) null, false, component);
    }

    public static ActivityRechargeMyPlanBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRechargeMyPlanBinding bind(View view, Object component) {
        return (ActivityRechargeMyPlanBinding) bind(component, view, C0330R.layout.activity_recharge_my_plan);
    }
}
