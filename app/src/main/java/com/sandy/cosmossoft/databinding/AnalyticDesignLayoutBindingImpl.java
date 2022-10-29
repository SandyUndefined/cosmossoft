package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.util.BindingUtils;

public class AnalyticDesignLayoutBindingImpl extends AnalyticDesignLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.TopSectionAnalytic, 12);
        sparseIntArray.put(C0330R.C0333id.updateButton, 13);
        sparseIntArray.put(C0330R.C0333id.operator_text, 14);
        sparseIntArray.put(C0330R.C0333id.check_details, 15);
    }

    public AnalyticDesignLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private AnalyticDesignLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[3], bindings[2], bindings[11], bindings[4], bindings[5], bindings[8], bindings[7], bindings[6], bindings[10], bindings[9], bindings[12], bindings[15], bindings[14], bindings[13]);
        this.mDirtyFlags = -1;
        this.AnalyticAmount.setTag((Object) null);
        this.AnalyticAmountLeft.setTag((Object) null);
        this.AnalyticAmountStatus.setTag((Object) null);
        this.AnalyticDateTime.setTag((Object) null);
        this.AnalyticLogo.setTag((Object) null);
        this.AnalyticMN.setTag((Object) null);
        this.AnalyticOPID.setTag((Object) null);
        this.AnalyticOperator.setTag((Object) null);
        this.AnalyticTxnID.setTag((Object) null);
        this.AnalyticUserCommissionAmount.setTag((Object) null);
        this.AnalyticUserMobile.setTag((Object) null);
        LinearLayout linearLayout = bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
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
        if (3 != variableId) {
            return false;
        }
        setAnalyticDataModel((AnalyticsResponseModel) variable);
        return true;
    }

    public void setAnalyticDataModel(AnalyticsResponseModel AnalyticDataModel) {
        this.mAnalyticDataModel = AnalyticDataModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        String analyticDataModelOpId;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String analyticDataModelOnMobile = null;
        AnalyticsResponseModel analyticDataModel = this.mAnalyticDataModel;
        String analyticDataModelLogo = null;
        String analyticDataModelStatus = null;
        String analyticDataModelCommissionAmount = null;
        String analyticDataModelAmount = null;
        String analyticDataModelTxnId = null;
        String analyticDataModelOperatorName = null;
        String analyticDataModelUserMobile = null;
        String analyticDataModelAmountLeft = null;
        String analyticDataModelDate = null;
        if ((dirtyFlags & 3) == 0 || analyticDataModel == null) {
            analyticDataModelOpId = null;
        } else {
            analyticDataModelOnMobile = analyticDataModel.getOnMobile();
            analyticDataModelLogo = analyticDataModel.getLogo();
            analyticDataModelStatus = analyticDataModel.getStatus();
            analyticDataModelCommissionAmount = analyticDataModel.getCommission_amount();
            analyticDataModelAmount = analyticDataModel.getAmount();
            analyticDataModelTxnId = analyticDataModel.getTxn_id();
            analyticDataModelOperatorName = analyticDataModel.getOperator_name();
            analyticDataModelUserMobile = analyticDataModel.getUser_mobile();
            analyticDataModelAmountLeft = analyticDataModel.getAmount_left();
            analyticDataModelDate = analyticDataModel.getDate();
            analyticDataModelOpId = analyticDataModel.getOp_id();
        }
        if ((dirtyFlags & 3) != 0) {
            TextViewBindingAdapter.setText(this.AnalyticAmount, analyticDataModelAmount);
            TextViewBindingAdapter.setText(this.AnalyticAmountLeft, analyticDataModelAmountLeft);
            TextViewBindingAdapter.setText(this.AnalyticAmountStatus, analyticDataModelStatus);
            TextViewBindingAdapter.setText(this.AnalyticDateTime, analyticDataModelDate);
            BindingUtils.loadUrlImage(this.AnalyticLogo, analyticDataModelLogo);
            TextViewBindingAdapter.setText(this.AnalyticMN, analyticDataModelOnMobile);
            TextViewBindingAdapter.setText(this.AnalyticOPID, analyticDataModelOpId);
            TextViewBindingAdapter.setText(this.AnalyticOperator, analyticDataModelOperatorName);
            TextViewBindingAdapter.setText(this.AnalyticTxnID, analyticDataModelTxnId);
            TextViewBindingAdapter.setText(this.AnalyticUserCommissionAmount, analyticDataModelCommissionAmount);
            TextViewBindingAdapter.setText(this.AnalyticUserMobile, analyticDataModelUserMobile);
            return;
        }
    }
}
