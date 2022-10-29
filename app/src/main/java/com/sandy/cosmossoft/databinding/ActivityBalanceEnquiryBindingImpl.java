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

public class ActivityBalanceEnquiryBindingImpl extends ActivityBalanceEnquiryBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener aadhaarNumberandroidTextAttrChanged;

    /* renamed from: mBalanceEnquiryViewModelSelectBankListAndroidViewViewOnClickListener */
    private OnClickListenerImpl f172xe7cc84aa;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;
    private InverseBindingListener selectedBankNameandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 4);
        sparseIntArray.put(C0330R.C0333id.adhaar_layout, 5);
        sparseIntArray.put(C0330R.C0333id.number_layout, 6);
        sparseIntArray.put(C0330R.C0333id.bank_list_layout, 7);
        sparseIntArray.put(C0330R.C0333id.captureFingerPrintButton, 8);
    }

    public ActivityBalanceEnquiryBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityBalanceEnquiryBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[5], bindings[7], bindings[8], bindings[4], bindings[2], bindings[6], bindings[3]);
        this.aadhaarNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBalanceEnquiryBindingImpl.this.aadhaarNumber);
                AepsViewModel balanceEnquiryViewModel = ActivityBalanceEnquiryBindingImpl.this.mBalanceEnquiryViewModel;
                if (balanceEnquiryViewModel != null) {
                    balanceEnquiryViewModel.aadhaar = callbackArg_0;
                }
            }
        };
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBalanceEnquiryBindingImpl.this.mobileNumber);
                AepsViewModel balanceEnquiryViewModel = ActivityBalanceEnquiryBindingImpl.this.mBalanceEnquiryViewModel;
                if (balanceEnquiryViewModel != null) {
                    balanceEnquiryViewModel.mobile = callbackArg_0;
                }
            }
        };
        this.selectedBankNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBalanceEnquiryBindingImpl.this.selectedBankName);
                AepsViewModel balanceEnquiryViewModel = ActivityBalanceEnquiryBindingImpl.this.mBalanceEnquiryViewModel;
                if (balanceEnquiryViewModel != null) {
                    balanceEnquiryViewModel.selectedBank = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.aadhaarNumber.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
        this.selectedBankName.setTag((Object) null);
        View view = root;
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
        if (5 != variableId) {
            return false;
        }
        setBalanceEnquiryViewModel((AepsViewModel) variable);
        return true;
    }

    public void setBalanceEnquiryViewModel(AepsViewModel BalanceEnquiryViewModel) {
        this.mBalanceEnquiryViewModel = BalanceEnquiryViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
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
        String balanceEnquiryViewModelMobile = null;
        String balanceEnquiryViewModelAadhaar = null;
        View.OnClickListener balanceEnquiryViewModelSelectBankListAndroidViewViewOnClickListener = null;
        String balanceEnquiryViewModelSelectedBank = null;
        AepsViewModel balanceEnquiryViewModel = this.mBalanceEnquiryViewModel;
        if (!((dirtyFlags & 3) == 0 || balanceEnquiryViewModel == null)) {
            balanceEnquiryViewModelMobile = balanceEnquiryViewModel.mobile;
            balanceEnquiryViewModelAadhaar = balanceEnquiryViewModel.aadhaar;
            OnClickListenerImpl onClickListenerImpl = this.f172xe7cc84aa;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f172xe7cc84aa = onClickListenerImpl;
            }
            balanceEnquiryViewModelSelectBankListAndroidViewViewOnClickListener = onClickListenerImpl.setValue(balanceEnquiryViewModel);
            balanceEnquiryViewModelSelectedBank = balanceEnquiryViewModel.selectedBank;
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.aadhaarNumber, balanceEnquiryViewModelAadhaar);
            TextViewBindingAdapter.setText(this.mobileNumber, balanceEnquiryViewModelMobile);
            this.selectedBankName.setOnClickListener(balanceEnquiryViewModelSelectBankListAndroidViewViewOnClickListener);
            TextViewBindingAdapter.setText(this.selectedBankName, balanceEnquiryViewModelSelectedBank);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.aadhaarNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.aadhaarNumberandroidTextAttrChanged);
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
