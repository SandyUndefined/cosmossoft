package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;

public class ActivityCashWithdrawalBindingImpl extends ActivityCashWithdrawalBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener aadhaarNumberandroidTextAttrChanged;
    private InverseBindingListener amountNumberandroidTextAttrChanged;

    /* renamed from: mCashWithdrawalViewModelSelectBankListAndroidViewViewOnClickListener */
    private OnClickListenerImpl f175xa4a82949;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;
    private InverseBindingListener selectedBankNameandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 5);
        sparseIntArray.put(C0330R.C0333id.aadharLayout, 6);
        sparseIntArray.put(C0330R.C0333id.mobileLayout, 7);
        sparseIntArray.put(C0330R.C0333id.amount_layout, 8);
        sparseIntArray.put(C0330R.C0333id.bank_list_layout, 9);
        sparseIntArray.put(C0330R.C0333id.captureFingerPrintButton, 10);
    }

    public ActivityCashWithdrawalBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityCashWithdrawalBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[6], bindings[8], bindings[3], bindings[9], bindings[10], bindings[5], bindings[7], bindings[2], bindings[4]);
        this.aadhaarNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCashWithdrawalBindingImpl.this.aadhaarNumber);
                AepsViewModel cashWithdrawalViewModel = ActivityCashWithdrawalBindingImpl.this.mCashWithdrawalViewModel;
                if (cashWithdrawalViewModel != null) {
                    cashWithdrawalViewModel.aadhaar = callbackArg_0;
                }
            }
        };
        this.amountNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCashWithdrawalBindingImpl.this.amountNumber);
                AepsViewModel cashWithdrawalViewModel = ActivityCashWithdrawalBindingImpl.this.mCashWithdrawalViewModel;
                if (cashWithdrawalViewModel != null) {
                    cashWithdrawalViewModel.amount = callbackArg_0;
                }
            }
        };
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCashWithdrawalBindingImpl.this.mobileNumber);
                AepsViewModel cashWithdrawalViewModel = ActivityCashWithdrawalBindingImpl.this.mCashWithdrawalViewModel;
                if (cashWithdrawalViewModel != null) {
                    cashWithdrawalViewModel.mobile = callbackArg_0;
                }
            }
        };
        this.selectedBankNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityCashWithdrawalBindingImpl.this.selectedBankName);
                AepsViewModel cashWithdrawalViewModel = ActivityCashWithdrawalBindingImpl.this.mCashWithdrawalViewModel;
                if (cashWithdrawalViewModel != null) {
                    cashWithdrawalViewModel.selectedBank = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.aadhaarNumber.setTag((Object) null);
        this.amountNumber.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
        this.selectedBankName.setTag((Object) null);
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
        if (11 != variableId) {
            return false;
        }
        setCashWithdrawalViewModel((AepsViewModel) variable);
        return true;
    }

    public void setCashWithdrawalViewModel(AepsViewModel CashWithdrawalViewModel) {
        this.mCashWithdrawalViewModel = CashWithdrawalViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(11);
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
        String cashWithdrawalViewModelAadhaar = null;
        String cashWithdrawalViewModelMobile = null;
        String cashWithdrawalViewModelAmount = null;
        AepsViewModel cashWithdrawalViewModel = this.mCashWithdrawalViewModel;
        View.OnClickListener cashWithdrawalViewModelSelectBankListAndroidViewViewOnClickListener = null;
        String cashWithdrawalViewModelSelectedBank = null;
        if (!((dirtyFlags & 3) == 0 || cashWithdrawalViewModel == null)) {
            cashWithdrawalViewModelAadhaar = cashWithdrawalViewModel.aadhaar;
            cashWithdrawalViewModelMobile = cashWithdrawalViewModel.mobile;
            cashWithdrawalViewModelAmount = cashWithdrawalViewModel.amount;
            OnClickListenerImpl onClickListenerImpl = this.f175xa4a82949;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f175xa4a82949 = onClickListenerImpl;
            }
            cashWithdrawalViewModelSelectBankListAndroidViewViewOnClickListener = onClickListenerImpl.setValue(cashWithdrawalViewModel);
            cashWithdrawalViewModelSelectedBank = cashWithdrawalViewModel.selectedBank;
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.aadhaarNumber, cashWithdrawalViewModelAadhaar);
            TextViewBindingAdapter.setText(this.amountNumber, cashWithdrawalViewModelAmount);
            TextViewBindingAdapter.setText(this.mobileNumber, cashWithdrawalViewModelMobile);
            this.selectedBankName.setOnClickListener(cashWithdrawalViewModelSelectBankListAndroidViewViewOnClickListener);
            TextViewBindingAdapter.setText(this.selectedBankName, cashWithdrawalViewModelSelectedBank);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.aadhaarNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.aadhaarNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.amountNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.amountNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mobileNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mobileNumberandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.selectedBankName, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.selectedBankNameandroidTextAttrChanged);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private AepsViewModel value;

        public OnClickListenerImpl setValue(AepsViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.selectBankList(arg0);
        }
    }
}
