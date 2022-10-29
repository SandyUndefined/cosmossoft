package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public class ActivityMobileRechargeBindingImpl extends ActivityMobileRechargeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mRechargeViewModelOnSelectedNumberClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl f178xebe8f059;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.rechargeSearchCard, 2);
        sparseIntArray.put(C0330R.C0333id.contactsSearchView, 3);
        sparseIntArray.put(C0330R.C0333id.selectContactLayout, 4);
        sparseIntArray.put(C0330R.C0333id.recentRechargesCard, 5);
        sparseIntArray.put(C0330R.C0333id.recentRechargesRecycler, 6);
        sparseIntArray.put(C0330R.C0333id.allContactsCard, 7);
        sparseIntArray.put(C0330R.C0333id.allContactsRecycler, 8);
    }

    public ActivityMobileRechargeBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityMobileRechargeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[7], bindings[8], bindings[3], bindings[1], bindings[5], bindings[6], bindings[2], bindings[4]);
        this.mDirtyFlags = -1;
        this.enteredNumberSelf.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
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
        if (44 != variableId) {
            return false;
        }
        setRechargeViewModel((MobileRechargeViewModel) variable);
        return true;
    }

    public void setRechargeViewModel(MobileRechargeViewModel RechargeViewModel) {
        this.mRechargeViewModel = RechargeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(44);
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
        MobileRechargeViewModel rechargeViewModel = this.mRechargeViewModel;
        View.OnClickListener rechargeViewModelOnSelectedNumberClickAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || rechargeViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f178xebe8f059;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f178xebe8f059 = onClickListenerImpl;
            }
            rechargeViewModelOnSelectedNumberClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(rechargeViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.enteredNumberSelf.setOnClickListener(rechargeViewModelOnSelectedNumberClickAndroidViewViewOnClickListener);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private MobileRechargeViewModel value;

        public OnClickListenerImpl setValue(MobileRechargeViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onSelectedNumberClick(arg0);
        }
    }
}
