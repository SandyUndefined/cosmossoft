package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.PayoutList;

public class PayoutListLayoutBindingImpl extends PayoutListLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener accNumberandroidTextAttrChanged;
    private InverseBindingListener bankNameandroidTextAttrChanged;
    private InverseBindingListener ifscCodeandroidTextAttrChanged;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener nameandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 5);
        sparseIntArray.put(C0330R.C0333id.verifyAccount, 6);
    }

    public PayoutListLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private PayoutListLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[3], bindings[2], bindings[4], bindings[5], bindings[1], bindings[6]);
        this.accNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(PayoutListLayoutBindingImpl.this.accNumber);
                PayoutList paySprintList = PayoutListLayoutBindingImpl.this.mPaySprintList;
                if (paySprintList != null) {
                    paySprintList.setAccount(callbackArg_0);
                }
            }
        };
        this.bankNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(PayoutListLayoutBindingImpl.this.bankName);
                PayoutList paySprintList = PayoutListLayoutBindingImpl.this.mPaySprintList;
                if (paySprintList != null) {
                    paySprintList.setBankname(callbackArg_0);
                }
            }
        };
        this.ifscCodeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(PayoutListLayoutBindingImpl.this.ifscCode);
                PayoutList paySprintList = PayoutListLayoutBindingImpl.this.mPaySprintList;
                if (paySprintList != null) {
                    paySprintList.setIfsc(callbackArg_0);
                }
            }
        };
        this.nameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(PayoutListLayoutBindingImpl.this.name);
                PayoutList paySprintList = PayoutListLayoutBindingImpl.this.mPaySprintList;
                if (paySprintList != null) {
                    paySprintList.setName(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.accNumber.setTag((Object) null);
        this.bankName.setTag((Object) null);
        this.ifscCode.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.name.setTag((Object) null);
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
        if (37 != variableId) {
            return false;
        }
        setPaySprintList((PayoutList) variable);
        return true;
    }

    public void setPaySprintList(PayoutList PaySprintList) {
        this.mPaySprintList = PaySprintList;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(37);
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
        String paySprintListIfsc = null;
        String paySprintListName = null;
        PayoutList paySprintList = this.mPaySprintList;
        String paySprintListAccount = null;
        String paySprintListBankname = null;
        if (!((dirtyFlags & 3) == 0 || paySprintList == null)) {
            paySprintListIfsc = paySprintList.getIfsc();
            paySprintListName = paySprintList.getName();
            paySprintListAccount = paySprintList.getAccount();
            paySprintListBankname = paySprintList.getBankname();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.accNumber, paySprintListAccount);
            TextViewBindingAdapter.setText(this.bankName, paySprintListBankname);
            TextViewBindingAdapter.setText(this.ifscCode, paySprintListIfsc);
            TextViewBindingAdapter.setText(this.name, paySprintListName);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.accNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.accNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.bankName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.bankNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.ifscCode, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.ifscCodeandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.name, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.nameandroidTextAttrChanged);
        }
    }
}
