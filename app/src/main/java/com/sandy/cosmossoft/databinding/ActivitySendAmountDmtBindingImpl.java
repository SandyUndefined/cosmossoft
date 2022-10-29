package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public class ActivitySendAmountDmtBindingImpl extends ActivitySendAmountDmtBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener enteredAmountandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mSendAmountViewModelOnHistoryCheckOfBeneficiaryAndroidViewViewOnClickListener */
    private OnClickListenerImpl f188xfd6474e8;

    /* renamed from: mSendAmountViewModelOnSendDMTButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl2 f189xb3a0dd0d;
    private OnClickListenerImpl1 mSendAmountViewModelOnSpinnerClickAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.addAmountTopSection, 8);
        sparseIntArray.put(C0330R.C0333id.beneficiary_image, 9);
        sparseIntArray.put(C0330R.C0333id.beneficiary_details, 10);
        sparseIntArray.put(C0330R.C0333id.addAmountBalanceSection, 11);
        sparseIntArray.put(C0330R.C0333id.textInputLayout, 12);
    }

    public ActivitySendAmountDmtBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    private ActivitySendAmountDmtBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[11], bindings[8], bindings[2], bindings[3], bindings[10], bindings[9], bindings[1], bindings[7], bindings[5], bindings[12], bindings[6], bindings[4]);
        this.enteredAmountandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySendAmountDmtBindingImpl.this.enteredAmount);
                ToBankViewModel toBankViewModel = ActivitySendAmountDmtBindingImpl.this.mSendAmountViewModel;
                ToBankViewModel.amount = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.beneficiaryAccountNo.setTag((Object) null);
        this.beneficiaryBankName.setTag((Object) null);
        this.beneficiaryName.setTag((Object) null);
        this.buttonSendAmount.setTag((Object) null);
        this.enteredAmount.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.transactionType.setTag((Object) null);
        this.viewHistory.setTag((Object) null);
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
        if (49 != variableId) {
            return false;
        }
        setSendAmountViewModel((ToBankViewModel) variable);
        return true;
    }

    public void setSendAmountViewModel(ToBankViewModel SendAmountViewModel) {
        this.mSendAmountViewModel = SendAmountViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(49);
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
        ToBankViewModel sendAmountViewModel = this.mSendAmountViewModel;
        View.OnClickListener sendAmountViewModelOnHistoryCheckOfBeneficiaryAndroidViewViewOnClickListener = null;
        String sendAmountViewModelAmount = null;
        String sendAmountViewModelSelectedBeneficiaryModelName = null;
        View.OnClickListener sendAmountViewModelOnSpinnerClickAndroidViewViewOnClickListener = null;
        String sendAmountViewModelSelectedBeneficiaryModelBankname = null;
        String sendAmountViewModelSelectedBeneficiaryModelAccno = null;
        View.OnClickListener sendAmountViewModelOnSendDMTButtonClickAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || sendAmountViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f188xfd6474e8;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f188xfd6474e8 = onClickListenerImpl;
            }
            sendAmountViewModelOnHistoryCheckOfBeneficiaryAndroidViewViewOnClickListener = onClickListenerImpl.setValue(sendAmountViewModel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.mSendAmountViewModelOnSpinnerClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mSendAmountViewModelOnSpinnerClickAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            sendAmountViewModelOnSpinnerClickAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(sendAmountViewModel);
            OnClickListenerImpl2 onClickListenerImpl2 = this.f189xb3a0dd0d;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl2();
                this.f189xb3a0dd0d = onClickListenerImpl2;
            }
            sendAmountViewModelOnSendDMTButtonClickAndroidViewViewOnClickListener = onClickListenerImpl2.setValue(sendAmountViewModel);
        }
        if ((dirtyFlags & 2) != 0) {
            sendAmountViewModelAmount = ToBankViewModel.amount;
            BeneficiaryBank sendAmountViewModelSelectedBeneficiaryModel = ToBankViewModel.selectedBeneficiaryModel;
            if (sendAmountViewModelSelectedBeneficiaryModel != null) {
                sendAmountViewModelSelectedBeneficiaryModelName = sendAmountViewModelSelectedBeneficiaryModel.getName();
                sendAmountViewModelSelectedBeneficiaryModelBankname = sendAmountViewModelSelectedBeneficiaryModel.getBankname();
                sendAmountViewModelSelectedBeneficiaryModelAccno = sendAmountViewModelSelectedBeneficiaryModel.getAccno();
            }
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.beneficiaryAccountNo, sendAmountViewModelSelectedBeneficiaryModelAccno);
            TextViewBindingAdapter.setText(this.beneficiaryBankName, sendAmountViewModelSelectedBeneficiaryModelBankname);
            TextViewBindingAdapter.setText(this.beneficiaryName, sendAmountViewModelSelectedBeneficiaryModelName);
            TextViewBindingAdapter.setText(this.enteredAmount, sendAmountViewModelAmount);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.enteredAmount, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.enteredAmountandroidTextAttrChanged);
        }
        if ((3 & dirtyFlags) != 0) {
            this.buttonSendAmount.setOnClickListener(sendAmountViewModelOnSendDMTButtonClickAndroidViewViewOnClickListener);
            this.transactionType.setOnClickListener(sendAmountViewModelOnSpinnerClickAndroidViewViewOnClickListener);
            this.viewHistory.setOnClickListener(sendAmountViewModelOnHistoryCheckOfBeneficiaryAndroidViewViewOnClickListener);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private ToBankViewModel value;

        public OnClickListenerImpl setValue(ToBankViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onHistoryCheckOfBeneficiary(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private ToBankViewModel value;

        public OnClickListenerImpl1 setValue(ToBankViewModel value2) {
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

    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private ToBankViewModel value;

        public OnClickListenerImpl2 setValue(ToBankViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onSendDMTButtonClick(arg0);
        }
    }
}
