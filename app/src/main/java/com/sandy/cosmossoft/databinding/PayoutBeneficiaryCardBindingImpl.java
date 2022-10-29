package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryModel;

public class PayoutBeneficiaryCardBindingImpl extends PayoutBeneficiaryCardBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView1;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 3);
        sparseIntArray.put(C0330R.C0333id.deleteDmtUser, 4);
    }

    public PayoutBeneficiaryCardBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }

    private PayoutBeneficiaryCardBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[3]);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(PayoutBeneficiaryCardBindingImpl.this.mboundView1);
                PBeneficiaryModel pBemeModel = PayoutBeneficiaryCardBindingImpl.this.mPBemeModel;
                if (pBemeModel != null) {
                    pBemeModel.setName(callbackArg_0);
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(PayoutBeneficiaryCardBindingImpl.this.mboundView2);
                PBeneficiaryModel pBemeModel = PayoutBeneficiaryCardBindingImpl.this.mPBemeModel;
                if (pBemeModel != null) {
                    pBemeModel.setAcc_num(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextView textView = bindings[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = bindings[2];
        this.mboundView2 = textView2;
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
        if (36 != variableId) {
            return false;
        }
        setPBemeModel((PBeneficiaryModel) variable);
        return true;
    }

    public void setPBemeModel(PBeneficiaryModel PBemeModel) {
        this.mPBemeModel = PBemeModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(36);
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
        String pBemeModelAccNum = null;
        PBeneficiaryModel pBemeModel = this.mPBemeModel;
        String pBemeModelName = null;
        if (!((dirtyFlags & 3) == 0 || pBemeModel == null)) {
            pBemeModelAccNum = pBemeModel.getAcc_num();
            pBemeModelName = pBemeModel.getName();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, pBemeModelName);
            TextViewBindingAdapter.setText(this.mboundView2, pBemeModelAccNum);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView1, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView1androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView2, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView2androidTextAttrChanged);
        }
    }
}
