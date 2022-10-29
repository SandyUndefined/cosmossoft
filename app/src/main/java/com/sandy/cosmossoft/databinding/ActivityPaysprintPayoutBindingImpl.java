package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;

public class ActivityPaysprintPayoutBindingImpl extends ActivityPaysprintPayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mPayoutViewModelAddMorePayoutAccountAndroidViewViewOnClickListener */
    private OnClickListenerImpl f181x167cdb46;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.userSearchCard, 2);
        sparseIntArray.put(C0330R.C0333id.searchView, 3);
        sparseIntArray.put(C0330R.C0333id.dmt_user_recycler, 4);
        sparseIntArray.put(C0330R.C0333id.no_records, 5);
    }

    public ActivityPaysprintPayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ActivityPaysprintPayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[4], bindings[5], bindings[3], bindings[2]);
        this.mDirtyFlags = -1;
        this.addMoreBeneficiary.setTag((Object) null);
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
        View.OnClickListener payoutViewModelAddMorePayoutAccountAndroidViewViewOnClickListener = null;
        PayoutViewModel payoutViewModel = this.mPayoutViewModel;
        if (!((dirtyFlags & 3) == 0 || payoutViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f181x167cdb46;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f181x167cdb46 = onClickListenerImpl;
            }
            payoutViewModelAddMorePayoutAccountAndroidViewViewOnClickListener = onClickListenerImpl.setValue(payoutViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.addMoreBeneficiary.setOnClickListener(payoutViewModelAddMorePayoutAccountAndroidViewViewOnClickListener);
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
            this.value.addMorePayoutAccount(arg0);
        }
    }
}
