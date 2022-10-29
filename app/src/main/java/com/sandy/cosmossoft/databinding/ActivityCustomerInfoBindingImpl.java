package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoModel;

public class ActivityCustomerInfoBindingImpl extends ActivityCustomerInfoBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener customerNameandroidTextAttrChanged;
    private InverseBindingListener lastRechargeDateandroidTextAttrChanged;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener responseCommAmandroidTextAttrChanged;
    private InverseBindingListener responseMobileandroidTextAttrChanged;
    private InverseBindingListener responseOpIdandroidTextAttrChanged;
    private InverseBindingListener responseOpNameandroidTextAttrChanged;
    private InverseBindingListener responseOpenBalandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.allPlanCard, 8);
        sparseIntArray.put(C0330R.C0333id.confirm, 9);
    }

    public ActivityCustomerInfoBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityCustomerInfoBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[8], bindings[9], bindings[2], bindings[5], bindings[6], bindings[1], bindings[4], bindings[3], bindings[7]);
        this.customerNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.customerName);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setCustomerName(callbackArg_0);
                }
            }
        };
        this.lastRechargeDateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.lastRechargeDate);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setLastrechargedate(callbackArg_0);
                }
            }
        };
        this.responseCommAmandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.responseCommAm);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setLastrechargeamount(callbackArg_0);
                }
            }
        };
        this.responseMobileandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.responseMobile);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setMonthlyRecharge(callbackArg_0);
                }
            }
        };
        this.responseOpIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.responseOpId);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setNextRechargeDate(callbackArg_0);
                }
            }
        };
        this.responseOpNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.responseOpName);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setStatus(callbackArg_0);
                }
            }
        };
        this.responseOpenBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCustomerInfoBindingImpl.this.responseOpenBal);
                CustomerInfoModel customerInfoModel = ActivityCustomerInfoBindingImpl.this.mCustomerInfoModel;
                if (customerInfoModel != null) {
                    customerInfoModel.setPlanname(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.customerName.setTag((Object) null);
        this.lastRechargeDate.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.responseCommAm.setTag((Object) null);
        this.responseMobile.setTag((Object) null);
        this.responseOpId.setTag((Object) null);
        this.responseOpName.setTag((Object) null);
        this.responseOpenBal.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
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
        if (14 != variableId) {
            return false;
        }
        setCustomerInfoModel((CustomerInfoModel) variable);
        return true;
    }

    public void setCustomerInfoModel(CustomerInfoModel CustomerInfoModel) {
        this.mCustomerInfoModel = CustomerInfoModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(14);
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
        String customerInfoModelStatus = null;
        String customerInfoModelCustomerName = null;
        String customerInfoModelLastrechargeamount = null;
        String customerInfoModelLastrechargedate = null;
        String customerInfoModelNextRechargeDate = null;
        CustomerInfoModel customerInfoModel = this.mCustomerInfoModel;
        String customerInfoModelMonthlyRecharge = null;
        String customerInfoModelPlanname = null;
        if (!((dirtyFlags & 3) == 0 || customerInfoModel == null)) {
            customerInfoModelStatus = customerInfoModel.getStatus();
            customerInfoModelCustomerName = customerInfoModel.getCustomerName();
            customerInfoModelLastrechargeamount = customerInfoModel.getLastrechargeamount();
            customerInfoModelLastrechargedate = customerInfoModel.getLastrechargedate();
            customerInfoModelNextRechargeDate = customerInfoModel.getNextRechargeDate();
            customerInfoModelMonthlyRecharge = customerInfoModel.getMonthlyRecharge();
            customerInfoModelPlanname = customerInfoModel.getPlanname();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.customerName, customerInfoModelCustomerName);
            TextViewBindingAdapter.setText(this.lastRechargeDate, customerInfoModelLastrechargedate);
            TextViewBindingAdapter.setText(this.responseCommAm, customerInfoModelLastrechargeamount);
            TextViewBindingAdapter.setText(this.responseMobile, customerInfoModelMonthlyRecharge);
            TextViewBindingAdapter.setText(this.responseOpId, customerInfoModelNextRechargeDate);
            TextViewBindingAdapter.setText(this.responseOpName, customerInfoModelStatus);
            TextViewBindingAdapter.setText(this.responseOpenBal, customerInfoModelPlanname);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.customerName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.customerNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.lastRechargeDate, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.lastRechargeDateandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseCommAm, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseCommAmandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseMobile, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseMobileandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseOpId, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseOpIdandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseOpName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseOpNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseOpenBal, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseOpenBalandroidTextAttrChanged);
        }
    }
}
