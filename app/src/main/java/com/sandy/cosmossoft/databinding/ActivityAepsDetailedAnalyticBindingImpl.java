package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.util.BindingUtils;

public class ActivityAepsDetailedAnalyticBindingImpl extends ActivityAepsDetailedAnalyticBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private InverseBindingListener responseCloseBalandroidTextAttrChanged;
    private InverseBindingListener responseCommAmandroidTextAttrChanged;
    private InverseBindingListener responseCommGstandroidTextAttrChanged;
    private InverseBindingListener responseCommTdsandroidTextAttrChanged;
    private InverseBindingListener responseDateandroidTextAttrChanged;
    private InverseBindingListener responseOpIdandroidTextAttrChanged;
    private InverseBindingListener responseOpenBalandroidTextAttrChanged;
    private InverseBindingListener transactionIDandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.head_transaction, 10);
        sparseIntArray.put(C0330R.C0333id.gif_status, 11);
        sparseIntArray.put(C0330R.C0333id.text_status, 12);
        sparseIntArray.put(C0330R.C0333id.response_mobile, 13);
        sparseIntArray.put(C0330R.C0333id.transactionType, 14);
        sparseIntArray.put(C0330R.C0333id.response_message, 15);
    }

    public ActivityAepsDetailedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private ActivityAepsDetailedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[11], bindings[10], bindings[8], bindings[4], bindings[5], bindings[6], bindings[9], bindings[15], bindings[13], bindings[3], bindings[7], bindings[12], bindings[2], bindings[14]);
        this.responseCloseBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseCloseBal);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_left(callbackArg_0);
                }
            }
        };
        this.responseCommAmandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseCommAm);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setCommission_amount(callbackArg_0);
                }
            }
        };
        this.responseCommGstandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseCommGst);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setGst(callbackArg_0);
                }
            }
        };
        this.responseCommTdsandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseCommTds);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTds(callbackArg_0);
                }
            }
        };
        this.responseDateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseDate);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setDate(callbackArg_0);
                }
            }
        };
        this.responseOpIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseOpId);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount(callbackArg_0);
                }
            }
        };
        this.responseOpenBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.responseOpenBal);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_earlier(callbackArg_0);
                }
            }
        };
        this.transactionIDandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityAepsDetailedAnalyticBindingImpl.this.transactionID);
                AnalyticsResponseModel regularDetailModel = ActivityAepsDetailedAnalyticBindingImpl.this.mRegularDetailModel;
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
        this.responseCloseBal.setTag((Object) null);
        this.responseCommAm.setTag((Object) null);
        this.responseCommGst.setTag((Object) null);
        this.responseCommTds.setTag((Object) null);
        this.responseDate.setTag((Object) null);
        this.responseOpId.setTag((Object) null);
        this.responseOpenBal.setTag((Object) null);
        this.transactionID.setTag((Object) null);
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
        String regularDetailModelCommissionAmount = null;
        String regularDetailModelDate = null;
        String regularDetailModelTds = null;
        AnalyticsResponseModel regularDetailModel = this.mRegularDetailModel;
        String regularDetailModelTxnId = null;
        String regularDetailModelLogo = null;
        String regularDetailModelAmount = null;
        String regularDetailModelAmountEarlier = null;
        String regularDetailModelAmountLeft = null;
        String regularDetailModelGst = null;
        if (!((dirtyFlags & 3) == 0 || regularDetailModel == null)) {
            regularDetailModelCommissionAmount = regularDetailModel.getCommission_amount();
            regularDetailModelDate = regularDetailModel.getDate();
            regularDetailModelTds = regularDetailModel.getTds();
            regularDetailModelTxnId = regularDetailModel.getTxn_id();
            regularDetailModelLogo = regularDetailModel.getLogo();
            regularDetailModelAmount = regularDetailModel.getAmount();
            regularDetailModelAmountEarlier = regularDetailModel.getAmount_earlier();
            regularDetailModelAmountLeft = regularDetailModel.getAmount_left();
            regularDetailModelGst = regularDetailModel.getGst();
        }
        if ((3 & dirtyFlags) != 0) {
            BindingUtils.loadUrlImage(this.circleImage, regularDetailModelLogo);
            TextViewBindingAdapter.setText(this.responseCloseBal, regularDetailModelAmountLeft);
            TextViewBindingAdapter.setText(this.responseCommAm, regularDetailModelCommissionAmount);
            TextViewBindingAdapter.setText(this.responseCommGst, regularDetailModelGst);
            TextViewBindingAdapter.setText(this.responseCommTds, regularDetailModelTds);
            TextViewBindingAdapter.setText(this.responseDate, regularDetailModelDate);
            TextViewBindingAdapter.setText(this.responseOpId, regularDetailModelAmount);
            TextViewBindingAdapter.setText(this.responseOpenBal, regularDetailModelAmountEarlier);
            TextViewBindingAdapter.setText(this.transactionID, regularDetailModelTxnId);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.responseCloseBal, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseCloseBalandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseCommAm, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseCommAmandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseCommGst, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseCommGstandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseCommTds, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseCommTdsandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseDate, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseDateandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseOpId, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseOpIdandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.responseOpenBal, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.responseOpenBalandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.transactionID, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.transactionIDandroidTextAttrChanged);
        }
    }
}
