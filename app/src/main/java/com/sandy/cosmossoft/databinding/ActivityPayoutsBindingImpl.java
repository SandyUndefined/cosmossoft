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

public class ActivityPayoutsBindingImpl extends ActivityPayoutsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener accountNumberandroidTextAttrChanged;
    private InverseBindingListener enteredAmountandroidTextAttrChanged;
    private long mDirtyFlags;
    private OnClickListenerImpl1 mPayoutViewModelOnPayToBankClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl mPayoutViewModelOnSpinnerClickAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;
    private InverseBindingListener mobileIFSCandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 6);
        sparseIntArray.put(C0330R.C0333id.textInputLayout, 7);
    }

    public ActivityPayoutsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private ActivityPayoutsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[3], bindings[6], bindings[2], bindings[5], bindings[7], bindings[4]);
        this.accountNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutsBindingImpl.this.accountNumber);
                PayoutViewModel payoutViewModel = ActivityPayoutsBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.accountNumber = callbackArg_0;
                }
            }
        };
        this.enteredAmountandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutsBindingImpl.this.enteredAmount);
                PayoutViewModel payoutViewModel = ActivityPayoutsBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.enteredAmount = callbackArg_0;
                }
            }
        };
        this.mobileIFSCandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutsBindingImpl.this.mobileIFSC);
                PayoutViewModel payoutViewModel = ActivityPayoutsBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.IFSC = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.accountNumber.setTag((Object) null);
        this.enteredAmount.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileIFSC.setTag((Object) null);
        this.onBillPayButton.setTag((Object) null);
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
        PayoutViewModel payoutViewModel = this.mPayoutViewModel;
        View.OnClickListener payoutViewModelOnSpinnerClickAndroidViewViewOnClickListener = null;
        String payoutViewModelAccountNumber = null;
        String payoutViewModelEnteredAmount = null;
        String payoutViewModelIFSC = null;
        View.OnClickListener payoutViewModelOnPayToBankClickAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || payoutViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mPayoutViewModelOnSpinnerClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mPayoutViewModelOnSpinnerClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            payoutViewModelOnSpinnerClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(payoutViewModel);
            payoutViewModelAccountNumber = payoutViewModel.accountNumber;
            payoutViewModelEnteredAmount = payoutViewModel.enteredAmount;
            payoutViewModelIFSC = payoutViewModel.IFSC;
            OnClickListenerImpl1 onClickListenerImpl1 = this.mPayoutViewModelOnPayToBankClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mPayoutViewModelOnPayToBankClickAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            payoutViewModelOnPayToBankClickAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(payoutViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.accountNumber, payoutViewModelAccountNumber);
            TextViewBindingAdapter.setText(this.enteredAmount, payoutViewModelEnteredAmount);
            TextViewBindingAdapter.setText(this.mobileIFSC, payoutViewModelIFSC);
            this.onBillPayButton.setOnClickListener(payoutViewModelOnPayToBankClickAndroidViewViewOnClickListener);
            this.transactionType.setOnClickListener(payoutViewModelOnSpinnerClickAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.accountNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.accountNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.enteredAmount, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.enteredAmountandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mobileIFSC, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mobileIFSCandroidTextAttrChanged);
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
            this.value.onSpinnerClick(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private PayoutViewModel value;

        public OnClickListenerImpl1 setValue(PayoutViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onPayToBankClick(arg0);
        }
    }
}
