package com.sandy.cosmossoft.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public abstract class ActivityBbpsRechargeBinding extends ViewDataBinding {
    public final RelativeLayout allBillInfo;
    public final RelativeLayout allInformationLayout;
    public final TextView billDetailsText;
    public final TextView billMessage;
    public final TextView customerName;
    public final TextView customerNameText;
    public final LinearLayout customerText;
    public final LinearLayout customerTextInfo;
    public final TextView d2hName;
    public final TextView d2hNum;
    public final View dividerAgain;
    public final EditText enterPlan;
    public final CardView fetchAllInfoWeb;
    @Bindable
    protected FetchBillInfo mFetchBillResponse;
    @Bindable
    protected MobileRechargeViewModel mMyRechargeViewModelForBbps;
    public final TextView monthlyAmount;
    public final TextView monthlyAmountText;
    public final Button onBillPayButton;
    public final ImageView operatorLogo;
    public final FrameLayout slidersFragment;

    public abstract void setFetchBillResponse(FetchBillInfo fetchBillInfo);

    public abstract void setMyRechargeViewModelForBbps(MobileRechargeViewModel mobileRechargeViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityBbpsRechargeBinding(Object _bindingComponent, View _root, int _localFieldCount, RelativeLayout allBillInfo2, RelativeLayout allInformationLayout2, TextView billDetailsText2, TextView billMessage2, TextView customerName2, TextView customerNameText2, LinearLayout customerText2, LinearLayout customerTextInfo2, TextView d2hName2, TextView d2hNum2, View dividerAgain2, EditText enterPlan2, CardView fetchAllInfoWeb2, TextView monthlyAmount2, TextView monthlyAmountText2, Button onBillPayButton2, ImageView operatorLogo2, FrameLayout slidersFragment2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.allBillInfo = allBillInfo2;
        this.allInformationLayout = allInformationLayout2;
        this.billDetailsText = billDetailsText2;
        this.billMessage = billMessage2;
        this.customerName = customerName2;
        this.customerNameText = customerNameText2;
        this.customerText = customerText2;
        this.customerTextInfo = customerTextInfo2;
        this.d2hName = d2hName2;
        this.d2hNum = d2hNum2;
        this.dividerAgain = dividerAgain2;
        this.enterPlan = enterPlan2;
        this.fetchAllInfoWeb = fetchAllInfoWeb2;
        this.monthlyAmount = monthlyAmount2;
        this.monthlyAmountText = monthlyAmountText2;
        this.onBillPayButton = onBillPayButton2;
        this.operatorLogo = operatorLogo2;
        this.slidersFragment = slidersFragment2;
    }

    public MobileRechargeViewModel getMyRechargeViewModelForBbps() {
        return this.mMyRechargeViewModelForBbps;
    }

    public FetchBillInfo getFetchBillResponse() {
        return this.mFetchBillResponse;
    }

    public static ActivityBbpsRechargeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBbpsRechargeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityBbpsRechargeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_bbps_recharge, root, attachToRoot, component);
    }

    public static ActivityBbpsRechargeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBbpsRechargeBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityBbpsRechargeBinding) ViewDataBinding.inflateInternal(inflater, C0330R.layout.activity_bbps_recharge, (ViewGroup) null, false, component);
    }

    public static ActivityBbpsRechargeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityBbpsRechargeBinding bind(View view, Object component) {
        return (ActivityBbpsRechargeBinding) bind(component, view, C0330R.layout.activity_bbps_recharge);
    }
}
