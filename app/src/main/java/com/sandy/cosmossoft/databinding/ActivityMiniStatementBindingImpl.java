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

public class ActivityMiniStatementBindingImpl extends ActivityMiniStatementBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener aadhaarNumberandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mMiniStatementViewModelSelectBankListAndroidViewViewOnClickListener */
    private OnClickListenerImpl f177x6bdb6db3;
    private final RelativeLayout mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;
    private InverseBindingListener selectedBankNameandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 4);
        sparseIntArray.put(C0330R.C0333id.aadhaar_number_layout, 5);
        sparseIntArray.put(C0330R.C0333id.mobile_number_layout, 6);
        sparseIntArray.put(C0330R.C0333id.select_bank_layout, 7);
        sparseIntArray.put(C0330R.C0333id.captureFingerPrintButton, 8);
    }

    public ActivityMiniStatementBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityMiniStatementBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[5], bindings[8], bindings[4], bindings[2], bindings[6], bindings[7], bindings[3]);
        this.aadhaarNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMiniStatementBindingImpl.this.aadhaarNumber);
                AepsViewModel miniStatementViewModel = ActivityMiniStatementBindingImpl.this.mMiniStatementViewModel;
                if (miniStatementViewModel != null) {
                    miniStatementViewModel.aadhaar = callbackArg_0;
                }
            }
        };
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMiniStatementBindingImpl.this.mobileNumber);
                AepsViewModel miniStatementViewModel = ActivityMiniStatementBindingImpl.this.mMiniStatementViewModel;
                if (miniStatementViewModel != null) {
                    miniStatementViewModel.mobile = callbackArg_0;
                }
            }
        };
        this.selectedBankNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityMiniStatementBindingImpl.this.selectedBankName);
                AepsViewModel miniStatementViewModel = ActivityMiniStatementBindingImpl.this.mMiniStatementViewModel;
                if (miniStatementViewModel != null) {
                    miniStatementViewModel.selectedBank = callbackArg_0;
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
        if (26 != variableId) {
            return false;
        }
        setMiniStatementViewModel((AepsViewModel) variable);
        return true;
    }

    public void setMiniStatementViewModel(AepsViewModel MiniStatementViewModel) {
        this.mMiniStatementViewModel = MiniStatementViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(26);
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
        AepsViewModel miniStatementViewModel = this.mMiniStatementViewModel;
        String miniStatementViewModelSelectedBank = null;
        View.OnClickListener miniStatementViewModelSelectBankListAndroidViewViewOnClickListener = null;
        String miniStatementViewModelAadhaar = null;
        String miniStatementViewModelMobile = null;
        if (!((dirtyFlags & 3) == 0 || miniStatementViewModel == null)) {
            miniStatementViewModelSelectedBank = miniStatementViewModel.selectedBank;
            OnClickListenerImpl onClickListenerImpl = this.f177x6bdb6db3;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f177x6bdb6db3 = onClickListenerImpl;
            }
            miniStatementViewModelSelectBankListAndroidViewViewOnClickListener = onClickListenerImpl.setValue(miniStatementViewModel);
            miniStatementViewModelAadhaar = miniStatementViewModel.aadhaar;
            miniStatementViewModelMobile = miniStatementViewModel.mobile;
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.aadhaarNumber, miniStatementViewModelAadhaar);
            TextViewBindingAdapter.setText(this.mobileNumber, miniStatementViewModelMobile);
            this.selectedBankName.setOnClickListener(miniStatementViewModelSelectBankListAndroidViewViewOnClickListener);
            TextViewBindingAdapter.setText(this.selectedBankName, miniStatementViewModelSelectedBank);
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
