package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;
import com.sandy.cosmossoft.util.BindingUtils;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public class ActivityBbpsRechargeBindingImpl extends ActivityBbpsRechargeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener customerNameandroidTextAttrChanged;
    private InverseBindingListener d2hNameandroidTextAttrChanged;
    private InverseBindingListener d2hNumandroidTextAttrChanged;
    private InverseBindingListener enterPlanandroidTextAttrChanged;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener monthlyAmountandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.sliders_fragment, 8);
        sparseIntArray.put(C0330R.C0333id.fetchAllInfoWeb, 9);
        sparseIntArray.put(C0330R.C0333id.all_information_layout, 10);
        sparseIntArray.put(C0330R.C0333id.divider_again, 11);
        sparseIntArray.put(C0330R.C0333id.all_bill_info, 12);
        sparseIntArray.put(C0330R.C0333id.bill_details_text, 13);
        sparseIntArray.put(C0330R.C0333id.customer_text, 14);
        sparseIntArray.put(C0330R.C0333id.monthly_amount_text, 15);
        sparseIntArray.put(C0330R.C0333id.customer_name_text, 16);
        sparseIntArray.put(C0330R.C0333id.customer_text_info, 17);
        sparseIntArray.put(C0330R.C0333id.onBillPayButton, 18);
    }

    public ActivityBbpsRechargeBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }

    private ActivityBbpsRechargeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[12], bindings[10], bindings[13], bindings[4], bindings[6], bindings[16], bindings[14], bindings[17], bindings[2], bindings[3], bindings[11], bindings[7], bindings[9], bindings[5], bindings[15], bindings[18], bindings[1], bindings[8]);
        this.customerNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsRechargeBindingImpl.this.customerName);
                FetchBillInfo fetchBillResponse = ActivityBbpsRechargeBindingImpl.this.mFetchBillResponse;
                if (fetchBillResponse != null) {
                    fetchBillResponse.setName(callbackArg_0);
                }
            }
        };
        this.d2hNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsRechargeBindingImpl.this.d2hName);
                MobileRechargeViewModel myRechargeViewModelForBbps = ActivityBbpsRechargeBindingImpl.this.mMyRechargeViewModelForBbps;
                if (myRechargeViewModelForBbps != null) {
                    myRechargeViewModelForBbps.operator = callbackArg_0;
                }
            }
        };
        this.d2hNumandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsRechargeBindingImpl.this.d2hNum);
                MobileRechargeViewModel myRechargeViewModelForBbps = ActivityBbpsRechargeBindingImpl.this.mMyRechargeViewModelForBbps;
                if (myRechargeViewModelForBbps != null) {
                    myRechargeViewModelForBbps.number = callbackArg_0;
                }
            }
        };
        this.enterPlanandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsRechargeBindingImpl.this.enterPlan);
                FetchBillInfo fetchBillResponse = ActivityBbpsRechargeBindingImpl.this.mFetchBillResponse;
                if (fetchBillResponse != null) {
                    fetchBillResponse.setAmount(callbackArg_0);
                }
            }
        };
        this.monthlyAmountandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsRechargeBindingImpl.this.monthlyAmount);
                FetchBillInfo fetchBillResponse = ActivityBbpsRechargeBindingImpl.this.mFetchBillResponse;
                if (fetchBillResponse != null) {
                    fetchBillResponse.setAmount(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.billMessage.setTag((Object) null);
        this.customerName.setTag((Object) null);
        this.d2hName.setTag((Object) null);
        this.d2hNum.setTag((Object) null);
        this.enterPlan.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.monthlyAmount.setTag((Object) null);
        this.operatorLogo.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int variableId, Object variable) {
        if (32 == variableId) {
            setMyRechargeViewModelForBbps((MobileRechargeViewModel) variable);
            return true;
        } else if (18 != variableId) {
            return false;
        } else {
            setFetchBillResponse((FetchBillInfo) variable);
            return true;
        }
    }

    public void setMyRechargeViewModelForBbps(MobileRechargeViewModel MyRechargeViewModelForBbps) {
        this.mMyRechargeViewModelForBbps = MyRechargeViewModelForBbps;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    public void setFetchBillResponse(FetchBillInfo FetchBillResponse) {
        this.mFetchBillResponse = FetchBillResponse;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String javaLangStringMessageNFetchBillResponseMessage = null;
        String fetchBillResponseAmount = null;
        String myRechargeViewModelForBbpsOperator = null;
        MobileRechargeViewModel myRechargeViewModelForBbps = this.mMyRechargeViewModelForBbps;
        String myRechargeViewModelForBbpsLogo = null;
        FetchBillInfo fetchBillResponse = this.mFetchBillResponse;
        String fetchBillResponseName = null;
        String fetchBillResponseMessage = null;
        String myRechargeViewModelForBbpsNumber = null;
        if (!((dirtyFlags & 5) == 0 || myRechargeViewModelForBbps == null)) {
            myRechargeViewModelForBbpsOperator = myRechargeViewModelForBbps.operator;
            myRechargeViewModelForBbpsLogo = myRechargeViewModelForBbps.logo;
            myRechargeViewModelForBbpsNumber = myRechargeViewModelForBbps.number;
        }
        if ((dirtyFlags & 6) != 0) {
            if (fetchBillResponse != null) {
                fetchBillResponseAmount = fetchBillResponse.getAmount();
                fetchBillResponseName = fetchBillResponse.getName();
                fetchBillResponseMessage = fetchBillResponse.getMessage();
            }
            javaLangStringMessageNFetchBillResponseMessage = "Message\n" + fetchBillResponseMessage;
        }
        if ((dirtyFlags & 6) != 0) {
            TextViewBindingAdapter.setText(this.billMessage, javaLangStringMessageNFetchBillResponseMessage);
            TextViewBindingAdapter.setText(this.customerName, fetchBillResponseName);
            TextViewBindingAdapter.setText(this.enterPlan, fetchBillResponseAmount);
            TextViewBindingAdapter.setText(this.monthlyAmount, fetchBillResponseAmount);
        }
        if ((4 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.customerName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.customerNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.d2hName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.d2hNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.d2hNum, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.d2hNumandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.enterPlan, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.enterPlanandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.monthlyAmount, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.monthlyAmountandroidTextAttrChanged);
        }
        if ((5 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.d2hName, myRechargeViewModelForBbpsOperator);
            TextViewBindingAdapter.setText(this.d2hNum, myRechargeViewModelForBbpsNumber);
            BindingUtils.loadUrlImage(this.operatorLogo, myRechargeViewModelForBbpsLogo);
        }
    }
}
