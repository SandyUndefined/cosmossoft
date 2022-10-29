package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public class ActivityAddPdmtbeneficiaryBindingImpl extends ActivityAddPdmtbeneficiaryBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener accountHolderNameandroidTextAttrChanged;
    private InverseBindingListener accountNumberandroidTextAttrChanged;
    private InverseBindingListener confirmAccountNumberandroidTextAttrChanged;
    private InverseBindingListener ifscCodeandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mPayoutViewModelOnConfirmBeneficiaryAndroidViewViewOnClickListener */
    private OnClickListenerImpl f171x545c4699;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.bankSectionBar, 6);
        sparseIntArray.put(C0330R.C0333id.upperTextAddBeneficiary, 7);
    }

    public ActivityAddPdmtbeneficiaryBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private ActivityAddPdmtbeneficiaryBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[1], bindings[6], bindings[2], bindings[3], bindings[5], bindings[7]);
        this.accountHolderNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddPdmtbeneficiaryBindingImpl.this.accountHolderName);
                PayoutViewModel payoutViewModel = ActivityAddPdmtbeneficiaryBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.account_holder_name = callbackArg_0;
                }
            }
        };
        this.accountNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddPdmtbeneficiaryBindingImpl.this.accountNumber);
                PayoutViewModel payoutViewModel = ActivityAddPdmtbeneficiaryBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.account_number = callbackArg_0;
                }
            }
        };
        this.confirmAccountNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddPdmtbeneficiaryBindingImpl.this.confirmAccountNumber);
                PayoutViewModel payoutViewModel = ActivityAddPdmtbeneficiaryBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.confirm_account_number = callbackArg_0;
                }
            }
        };
        this.ifscCodeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAddPdmtbeneficiaryBindingImpl.this.ifscCode);
                PayoutViewModel payoutViewModel = ActivityAddPdmtbeneficiaryBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.ifsc = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.accountHolderName.setTag((Object) null);
        this.accountNumber.setTag((Object) null);
        this.confirmAccountNumber.setTag((Object) null);
        this.ifscCode.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileRechargeButton.setTag((Object) null);
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
        if (38 != variableId) {
            return false;
        }
        setPayoutViewModel((PayoutViewModel) variable);
        return true;
    }

    public void setPayoutViewModel(PayoutViewModel PayoutViewModel) {
        this.mPayoutViewModel = PayoutViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(38);
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
        String payoutViewModelIfsc = null;
        View.OnClickListener payoutViewModelOnConfirmBeneficiaryAndroidViewViewOnClickListener = null;
        PayoutViewModel payoutViewModel = this.mPayoutViewModel;
        String payoutViewModelAccountHolderName = null;
        String payoutViewModelConfirmAccountNumber = null;
        String payoutViewModelAccountNumber = null;
        if (!((dirtyFlags & 3) == 0 || payoutViewModel == null)) {
            payoutViewModelIfsc = payoutViewModel.ifsc;
            OnClickListenerImpl onClickListenerImpl = this.f171x545c4699;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f171x545c4699 = onClickListenerImpl;
            }
            payoutViewModelOnConfirmBeneficiaryAndroidViewViewOnClickListener = onClickListenerImpl.setValue(payoutViewModel);
            payoutViewModelAccountHolderName = payoutViewModel.account_holder_name;
            payoutViewModelConfirmAccountNumber = payoutViewModel.confirm_account_number;
            payoutViewModelAccountNumber = payoutViewModel.account_number;
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.accountHolderName, payoutViewModelAccountHolderName);
            TextViewBindingAdapter.setText(this.accountNumber, payoutViewModelAccountNumber);
            TextViewBindingAdapter.setText(this.confirmAccountNumber, payoutViewModelConfirmAccountNumber);
            TextViewBindingAdapter.setText(this.ifscCode, payoutViewModelIfsc);
            this.mobileRechargeButton.setOnClickListener(payoutViewModelOnConfirmBeneficiaryAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.accountHolderName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.accountHolderNameandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.accountNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.accountNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.confirmAccountNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.confirmAccountNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.ifscCode, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.ifscCodeandroidTextAttrChanged);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private PayoutViewModel value;

        public OnClickListenerImpl setValue(PayoutViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onConfirmBeneficiary(arg0);
        }
    }
}
