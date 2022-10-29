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
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.util.BindingUtils;

public class ActivityDmtdetaitedAnalyticBindingImpl extends ActivityDmtdetaitedAnalyticBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView5;
    private InverseBindingListener mboundView5androidTextAttrChanged;
    private InverseBindingListener responseCommTdsandroidTextAttrChanged;
    private InverseBindingListener responseDateandroidTextAttrChanged;
    private InverseBindingListener responseMobileandroidTextAttrChanged;
    private InverseBindingListener responseOpIdandroidTextAttrChanged;
    private InverseBindingListener responseTxnIdandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.head_transaction, 8);
        sparseIntArray.put(C0330R.C0333id.printReceipt, 9);
        sparseIntArray.put(C0330R.C0333id.gif_status, 10);
        sparseIntArray.put(C0330R.C0333id.text_status, 11);
        sparseIntArray.put(C0330R.C0333id.bank_name, 12);
        sparseIntArray.put(C0330R.C0333id.ifsc_code, 13);
        sparseIntArray.put(C0330R.C0333id.dmt_mobile, 14);
        sparseIntArray.put(C0330R.C0333id.bene_user_name, 15);
        sparseIntArray.put(C0330R.C0333id.beneficiary_id, 16);
        sparseIntArray.put(C0330R.C0333id.transactionType, 17);
        sparseIntArray.put(C0330R.C0333id.gst_no_section, 18);
        sparseIntArray.put(C0330R.C0333id.gst_no, 19);
        sparseIntArray.put(C0330R.C0333id.tds_charge_section, 20);
        sparseIntArray.put(C0330R.C0333id.amount_label, 21);
        sparseIntArray.put(C0330R.C0333id.charges, 22);
        sparseIntArray.put(C0330R.C0333id.response_message, 23);
    }

    public ActivityDmtdetaitedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }

    private ActivityDmtdetaitedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[21], bindings[12], bindings[15], bindings[16], bindings[22], bindings[1], bindings[14], bindings[10], bindings[19], bindings[18], bindings[8], bindings[13], bindings[9], bindings[3], bindings[7], bindings[23], bindings[2], bindings[4], bindings[6], bindings[20], bindings[11], bindings[17]);
        this.mboundView5androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDmtdetaitedAnalyticBindingImpl.this.mboundView5);
                AnalyticsResponseModel regularDetailModel = ActivityDmtdetaitedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_in_word(callbackArg_0);
                }
            }
        };
        this.responseCommTdsandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDmtdetaitedAnalyticBindingImpl.this.responseCommTds);
                AnalyticsResponseModel regularDetailModel = ActivityDmtdetaitedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTds(callbackArg_0);
                }
            }
        };
        this.responseDateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDmtdetaitedAnalyticBindingImpl.this.responseDate);
                AnalyticsResponseModel regularDetailModel = ActivityDmtdetaitedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setDate(callbackArg_0);
                }
            }
        };
        this.responseMobileandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDmtdetaitedAnalyticBindingImpl.this.responseMobile);
                AnalyticsResponseModel regularDetailModel = ActivityDmtdetaitedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setOnMobile(callbackArg_0);
                }
            }
        };
        this.responseOpIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDmtdetaitedAnalyticBindingImpl.this.responseOpId);
                AnalyticsResponseModel regularDetailModel = ActivityDmtdetaitedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount(callbackArg_0);
                }
            }
        };
        this.responseTxnIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityDmtdetaitedAnalyticBindingImpl.this.responseTxnId);
                AnalyticsResponseModel regularDetailModel = ActivityDmtdetaitedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTxn_id(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.circleImage.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        TextView textView = bindings[5];
        this.mboundView5 = textView;
        textView.setTag((Object) null);
        this.responseCommTds.setTag((Object) null);
        this.responseDate.setTag((Object) null);
        this.responseMobile.setTag((Object) null);
        this.responseOpId.setTag((Object) null);
        this.responseTxnId.setTag((Object) null);
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
        if (46 != variableId) {
            return false;
        }
        setRegularDetailModel((AnalyticsResponseModel) variable);
        return true;
    }

    public void setRegularDetailModel(AnalyticsResponseModel RegularDetailModel) {
        this.mRegularDetailModel = RegularDetailModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(46);
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
        String regularDetailModelDate = null;
        String regularDetailModelOnMobile = null;
        String regularDetailModelTds = null;
        AnalyticsResponseModel regularDetailModel = this.mRegularDetailModel;
        String regularDetailModelTxnId = null;
        String regularDetailModelLogo = null;
        String regularDetailModelAmount = null;
        String regularDetailModelAmountInWord = null;
        if (!((dirtyFlags & 3) == 0 || regularDetailModel == null)) {
            regularDetailModelDate = regularDetailModel.getDate();
            regularDetailModelOnMobile = regularDetailModel.getOnMobile();
            regularDetailModelTds = regularDetailModel.getTds();
            regularDetailModelTxnId = regularDetailModel.getTxn_id();
            regularDetailModelLogo = regularDetailModel.getLogo();
            regularDetailModelAmount = regularDetailModel.getAmount();
            regularDetailModelAmountInWord = regularDetailModel.getAmount_in_word();
        }
        if ((3 & dirtyFlags) != 0) {
            BindingUtils.loadUrlImage(this.circleImage, regularDetailModelLogo);
            TextViewBindingAdapter.setText(this.mboundView5, regularDetailModelAmountInWord);
            TextViewBindingAdapter.setText(this.responseCommTds, regularDetailModelTds);
            TextViewBindingAdapter.setText(this.responseDate, regularDetailModelDate);
            TextViewBindingAdapter.setText(this.responseMobile, regularDetailModelOnMobile);
            TextViewBindingAdapter.setText(this.responseOpId, regularDetailModelAmount);
            TextViewBindingAdapter.setText(this.responseTxnId, regularDetailModelTxnId);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView5, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView5androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseCommTds, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseCommTdsandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseDate, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseDateandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseMobile, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseMobileandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseOpId, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseOpIdandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseTxnId, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseTxnIdandroidTextAttrChanged);
        }
    }
}
