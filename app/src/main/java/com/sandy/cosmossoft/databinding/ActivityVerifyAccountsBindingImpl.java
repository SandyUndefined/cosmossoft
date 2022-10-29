package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public class ActivityVerifyAccountsBindingImpl extends ActivityVerifyAccountsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mPayoutViewModelVerifyPayoutDocumentsAndroidViewViewOnClickListener */
    private OnClickListenerImpl f194x92390b4c;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.scroller, 2);
        sparseIntArray.put(C0330R.C0333id.credit_card_card, 3);
        sparseIntArray.put(C0330R.C0333id.title, 4);
        sparseIntArray.put(C0330R.C0333id.doc_selection, 5);
        sparseIntArray.put(C0330R.C0333id.pan, 6);
        sparseIntArray.put(C0330R.C0333id.Aadhaar, 7);
        sparseIntArray.put(C0330R.C0333id.edi_passbook, 8);
        sparseIntArray.put(C0330R.C0333id.select_passbook, 9);
        sparseIntArray.put(C0330R.C0333id.pan_section_layout, 10);
        sparseIntArray.put(C0330R.C0333id.pan_card_image, 11);
        sparseIntArray.put(C0330R.C0333id.select_pan, 12);
        sparseIntArray.put(C0330R.C0333id.aadhaar_section_layout, 13);
        sparseIntArray.put(C0330R.C0333id.aadhaar_front_card_image, 14);
        sparseIntArray.put(C0330R.C0333id.select_front_aadhaar, 15);
        sparseIntArray.put(C0330R.C0333id.aadhaar_back_card_image, 16);
        sparseIntArray.put(C0330R.C0333id.select_back_aadhaar, 17);
    }

    public ActivityVerifyAccountsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }

    private ActivityVerifyAccountsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[7], bindings[16], bindings[14], bindings[13], bindings[3], bindings[5], bindings[8], bindings[6], bindings[11], bindings[10], bindings[2], bindings[17], bindings[15], bindings[12], bindings[9], bindings[1], bindings[4]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.sendCreditCardOtp.setTag((Object) null);
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
        if (38 != variableId) {
            return false;
        }
        setPayoutViewModel((PayoutViewModel) variable);
        return true;
    }

    public void setPayoutViewModel(PayoutViewModel PayoutViewModel) {
        this.mPayoutViewModel = PayoutViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(38);
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
        PayoutViewModel payoutViewModel = this.mPayoutViewModel;
        View.OnClickListener payoutViewModelVerifyPayoutDocumentsAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || payoutViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f194x92390b4c;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f194x92390b4c = onClickListenerImpl;
            }
            payoutViewModelVerifyPayoutDocumentsAndroidViewViewOnClickListener = onClickListenerImpl.setValue(payoutViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.sendCreditCardOtp.setOnClickListener(payoutViewModelVerifyPayoutDocumentsAndroidViewViewOnClickListener);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private PayoutViewModel value;

        public OnClickListenerImpl setValue(PayoutViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.verifyPayoutDocuments(arg0);
        }
    }
}
