package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;

public class BeneficiaryListLayoutBindingImpl extends BeneficiaryListLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.beneficiary_image, 4);
        sparseIntArray.put(C0330R.C0333id.beneficiary_details, 5);
        sparseIntArray.put(C0330R.C0333id.deleteBeneficiary, 6);
        sparseIntArray.put(C0330R.C0333id.contactDivider, 7);
    }

    public BeneficiaryListLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private BeneficiaryListLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[3], bindings[5], bindings[4], bindings[1], bindings[7], bindings[6]);
        this.mDirtyFlags = -1;
        this.beneficiaryAccountNo.setTag((Object) null);
        this.beneficiaryBankName.setTag((Object) null);
        this.beneficiaryName.setTag((Object) null);
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
        if (9 != variableId) {
            return false;
        }
        setBeneficiaryModel((BeneficiaryBank) variable);
        return true;
    }

    public void setBeneficiaryModel(BeneficiaryBank BeneficiaryModel) {
        this.mBeneficiaryModel = BeneficiaryModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(9);
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
        String beneficiaryModelAccno = null;
        BeneficiaryBank beneficiaryModel = this.mBeneficiaryModel;
        String beneficiaryModelBankname = null;
        String beneficiaryModelName = null;
        if (!((dirtyFlags & 3) == 0 || beneficiaryModel == null)) {
            beneficiaryModelAccno = beneficiaryModel.getAccno();
            beneficiaryModelBankname = beneficiaryModel.getBankname();
            beneficiaryModelName = beneficiaryModel.getName();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.beneficiaryAccountNo, beneficiaryModelAccno);
            TextViewBindingAdapter.setText(this.beneficiaryBankName, beneficiaryModelBankname);
            TextViewBindingAdapter.setText(this.beneficiaryName, beneficiaryModelName);
        }
    }
}
