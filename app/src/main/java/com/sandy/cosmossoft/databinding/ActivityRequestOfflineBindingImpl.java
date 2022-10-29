package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.FundViewModel;

public class ActivityRequestOfflineBindingImpl extends ActivityRequestOfflineBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener amountandroidTextAttrChanged;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mFundViewModelOnRequestOfflineAndroidViewViewOnClickListener;
    private OnClickListenerImpl mFundViewModelOnSpinnerClickAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;
    private InverseBindingListener remarksandroidTextAttrChanged;
    private InverseBindingListener transactionIDandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.paymentSection, 6);
        sparseIntArray.put(C0330R.C0333id.textInputLayout, 7);
        sparseIntArray.put(C0330R.C0333id.receipt_selector, 8);
        sparseIntArray.put(C0330R.C0333id.select_receipt, 9);
    }

    public ActivityRequestOfflineBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityRequestOfflineBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[5], bindings[6], bindings[8], bindings[4], bindings[9], bindings[7], bindings[2], bindings[3]);
        this.amountandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRequestOfflineBindingImpl.this.amount);
                FundViewModel fundViewModel = ActivityRequestOfflineBindingImpl.this.mFundViewModel;
                if (fundViewModel != null) {
                    fundViewModel.amount = callbackArg_0;
                }
            }
        };
        this.remarksandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRequestOfflineBindingImpl.this.remarks);
                FundViewModel fundViewModel = ActivityRequestOfflineBindingImpl.this.mFundViewModel;
                if (fundViewModel != null) {
                    fundViewModel.remarks = callbackArg_0;
                }
            }
        };
        this.transactionIDandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRequestOfflineBindingImpl.this.transactionID);
                FundViewModel fundViewModel = ActivityRequestOfflineBindingImpl.this.mFundViewModel;
                if (fundViewModel != null) {
                    fundViewModel.transaction_id = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.amount.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.onRequestOfflineAmount.setTag((Object) null);
        this.remarks.setTag((Object) null);
        this.transactionID.setTag((Object) null);
        this.transactionType.setTag((Object) null);
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
        if (19 != variableId) {
            return false;
        }
        setFundViewModel((FundViewModel) variable);
        return true;
    }

    public void setFundViewModel(FundViewModel FundViewModel) {
        this.mFundViewModel = FundViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(19);
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
        String fundViewModelAmount = null;
        String fundViewModelTransactionId = null;
        FundViewModel fundViewModel = this.mFundViewModel;
        View.OnClickListener fundViewModelOnSpinnerClickAndroidViewViewOnClickListener = null;
        String fundViewModelRemarks = null;
        View.OnClickListener fundViewModelOnRequestOfflineAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || fundViewModel == null)) {
            fundViewModelAmount = fundViewModel.amount;
            fundViewModelTransactionId = fundViewModel.transaction_id;
            OnClickListenerImpl onClickListenerImpl = this.mFundViewModelOnSpinnerClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mFundViewModelOnSpinnerClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            fundViewModelOnSpinnerClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(fundViewModel);
            fundViewModelRemarks = fundViewModel.remarks;
            OnClickListenerImpl1 onClickListenerImpl1 = this.mFundViewModelOnRequestOfflineAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mFundViewModelOnRequestOfflineAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            fundViewModelOnRequestOfflineAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(fundViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.amount, fundViewModelAmount);
            this.onRequestOfflineAmount.setOnClickListener(fundViewModelOnRequestOfflineAndroidViewViewOnClickListener);
            TextViewBindingAdapter.setText(this.remarks, fundViewModelRemarks);
            TextViewBindingAdapter.setText(this.transactionID, fundViewModelTransactionId);
            this.transactionType.setOnClickListener(fundViewModelOnSpinnerClickAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.amount, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.amountandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.remarks, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.remarksandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.transactionID, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.transactionIDandroidTextAttrChanged);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private FundViewModel value;

        public OnClickListenerImpl setValue(FundViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onSpinnerClick(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private FundViewModel value;

        public OnClickListenerImpl1 setValue(FundViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onRequestOffline(arg0);
        }
    }
}
