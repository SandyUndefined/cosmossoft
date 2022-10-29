package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistory;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;

public class ActivityDetailedHistoryScreenBindingImpl extends ActivityDetailedHistoryScreenBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView1;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView5;
    private InverseBindingListener mboundView5androidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.copyReferenceId, 6);
        sparseIntArray.put(C0330R.C0333id.beneficiary_image, 7);
        sparseIntArray.put(C0330R.C0333id.beneficiary_details, 8);
    }

    public ActivityDetailedHistoryScreenBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private ActivityDetailedHistoryScreenBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[3], bindings[8], bindings[7], bindings[2], bindings[6]);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDetailedHistoryScreenBindingImpl.this.mboundView1);
                BeneficiaryHistoryResponse wholeInfoModel = ActivityDetailedHistoryScreenBindingImpl.this.mWholeInfoModel;
                if (wholeInfoModel != null) {
                    wholeInfoModel.setReference_id(callbackArg_0);
                }
            }
        };
        this.mboundView5androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDetailedHistoryScreenBindingImpl.this.mboundView5);
                BeneficiaryHistoryResponse wholeInfoModel = ActivityDetailedHistoryScreenBindingImpl.this.mWholeInfoModel;
                boolean wholeInfoModelDataJavaLangObjectNull = true;
                if (wholeInfoModel != null) {
                    BeneficiaryHistory wholeInfoModelData = wholeInfoModel.getData();
                    if (wholeInfoModelData == null) {
                        wholeInfoModelDataJavaLangObjectNull = false;
                    }
                    if (wholeInfoModelDataJavaLangObjectNull) {
                        wholeInfoModelData.setRemarks(callbackArg_0);
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.amount.setTag((Object) null);
        this.beneficiaryAccountNo.setTag((Object) null);
        this.beneficiaryName.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        TextView textView = bindings[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = bindings[5];
        this.mboundView5 = textView2;
        textView2.setTag((Object) null);
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
        if (57 != variableId) {
            return false;
        }
        setWholeInfoModel((BeneficiaryHistoryResponse) variable);
        return true;
    }

    public void setWholeInfoModel(BeneficiaryHistoryResponse WholeInfoModel) {
        this.mWholeInfoModel = WholeInfoModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(57);
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
        String wholeInfoModelDataTxnAmount = null;
        String wholeInfoModelDataBenename = null;
        String wholeInfoModelDataRemarks = null;
        String wholeInfoModelDataAccountNumber = null;
        String wholeInfoModelReferenceId = null;
        BeneficiaryHistory wholeInfoModelData = null;
        BeneficiaryHistoryResponse wholeInfoModel = this.mWholeInfoModel;
        if ((dirtyFlags & 3) != 0) {
            if (wholeInfoModel != null) {
                wholeInfoModelReferenceId = wholeInfoModel.getReference_id();
                wholeInfoModelData = wholeInfoModel.getData();
            }
            if (wholeInfoModelData != null) {
                wholeInfoModelDataTxnAmount = wholeInfoModelData.getTxn_amount();
                wholeInfoModelDataBenename = wholeInfoModelData.getBenename();
                wholeInfoModelDataRemarks = wholeInfoModelData.getRemarks();
                wholeInfoModelDataAccountNumber = wholeInfoModelData.getAccount_number();
            }
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.amount, wholeInfoModelDataTxnAmount);
            TextViewBindingAdapter.setText(this.beneficiaryAccountNo, wholeInfoModelDataAccountNumber);
            TextViewBindingAdapter.setText(this.beneficiaryName, wholeInfoModelDataBenename);
            TextViewBindingAdapter.setText(this.mboundView1, wholeInfoModelReferenceId);
            TextViewBindingAdapter.setText(this.mboundView5, wholeInfoModelDataRemarks);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView1, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView1androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView5, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView5androidTextAttrChanged);
        }
    }
}
