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

public class ActivityPayoutAddAccountBindingImpl extends ActivityPayoutAddAccountBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener accNumberandroidTextAttrChanged;
    private InverseBindingListener beneNameandroidTextAttrChanged;
    private InverseBindingListener ifscCodeandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mPayoutViewModelOnAddPayoutAccountButtonAndroidViewViewOnClickListener */
    private OnClickListenerImpl1 f180x1e9bf4ac;
    private OnClickListenerImpl mPayoutViewModelOnSelectBankClickAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.bankSectionBar, 6);
    }

    public ActivityPayoutAddAccountBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private ActivityPayoutAddAccountBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[5], bindings[4], bindings[6], bindings[3], bindings[2]);
        this.accNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutAddAccountBindingImpl.this.accNumber);
                PayoutViewModel payoutViewModel = ActivityPayoutAddAccountBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.accountNumber = callbackArg_0;
                }
            }
        };
        this.beneNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutAddAccountBindingImpl.this.beneName);
                PayoutViewModel payoutViewModel = ActivityPayoutAddAccountBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.beneficiaryName = callbackArg_0;
                }
            }
        };
        this.ifscCodeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutAddAccountBindingImpl.this.ifscCode);
                PayoutViewModel payoutViewModel = ActivityPayoutAddAccountBindingImpl.this.mPayoutViewModel;
                if (payoutViewModel != null) {
                    payoutViewModel.IFSC = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.accNumber.setTag((Object) null);
        this.addAccountButton.setTag((Object) null);
        this.bankName.setTag((Object) null);
        this.beneName.setTag((Object) null);
        this.ifscCode.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
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
        String payoutViewModelBeneficiaryName = null;
        PayoutViewModel payoutViewModel = this.mPayoutViewModel;
        String payoutViewModelAccountNumber = null;
        View.OnClickListener payoutViewModelOnSelectBankClickAndroidViewViewOnClickListener = null;
        View.OnClickListener payoutViewModelOnAddPayoutAccountButtonAndroidViewViewOnClickListener = null;
        String payoutViewModelIFSC = null;
        if (!((dirtyFlags & 3) == 0 || payoutViewModel == null)) {
            payoutViewModelBeneficiaryName = payoutViewModel.beneficiaryName;
            payoutViewModelAccountNumber = payoutViewModel.accountNumber;
            OnClickListenerImpl onClickListenerImpl = this.mPayoutViewModelOnSelectBankClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mPayoutViewModelOnSelectBankClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            payoutViewModelOnSelectBankClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(payoutViewModel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.f180x1e9bf4ac;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.f180x1e9bf4ac = onClickListenerImpl1;
            }
            payoutViewModelOnAddPayoutAccountButtonAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(payoutViewModel);
            payoutViewModelIFSC = payoutViewModel.IFSC;
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.accNumber, payoutViewModelAccountNumber);
            this.addAccountButton.setOnClickListener(payoutViewModelOnAddPayoutAccountButtonAndroidViewViewOnClickListener);
            this.bankName.setOnClickListener(payoutViewModelOnSelectBankClickAndroidViewViewOnClickListener);
            TextViewBindingAdapter.setText(this.beneName, payoutViewModelBeneficiaryName);
            TextViewBindingAdapter.setText(this.ifscCode, payoutViewModelIFSC);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.accNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.accNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.beneName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.beneNameandroidTextAttrChanged);
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
            this.value.onSelectBankClick(arg0);
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
            this.value.onAddPayoutAccountButton(arg0);
        }
    }
}
