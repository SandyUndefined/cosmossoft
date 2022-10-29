package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;

public class ActivityRechargeMyPlanBindingImpl extends ActivityRechargeMyPlanBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener customerIdandroidTextAttrChanged;
    private InverseBindingListener customerPlanandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mRechargeViewModelOnRechargeButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl f185xc12d8544;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.selectNumberSliders, 4);
        sparseIntArray.put(C0330R.C0333id.inputNumLayout, 5);
        sparseIntArray.put(C0330R.C0333id.numberInputSection, 6);
        sparseIntArray.put(C0330R.C0333id.contacts_image, 7);
        sparseIntArray.put(C0330R.C0333id.getTheContacts, 8);
        sparseIntArray.put(C0330R.C0333id.dthCallInfo, 9);
        sparseIntArray.put(C0330R.C0333id.dth_info_card, 10);
        sparseIntArray.put(C0330R.C0333id.ROffer, 11);
        sparseIntArray.put(C0330R.C0333id.browsePlan, 12);
    }

    public ActivityRechargeMyPlanBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    private ActivityRechargeMyPlanBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[11], bindings[12], bindings[7], bindings[1], bindings[2], bindings[9], bindings[10], bindings[8], bindings[5], bindings[3], bindings[6], bindings[4]);
        this.customerIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRechargeMyPlanBindingImpl.this.customerId);
                MobileRechargeViewModel rechargeViewModel = ActivityRechargeMyPlanBindingImpl.this.mRechargeViewModel;
                if (rechargeViewModel != null) {
                    rechargeViewModel.number = callbackArg_0;
                }
            }
        };
        this.customerPlanandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityRechargeMyPlanBindingImpl.this.customerPlan);
                MobileRechargeViewModel rechargeViewModel = ActivityRechargeMyPlanBindingImpl.this.mRechargeViewModel;
                if (rechargeViewModel != null) {
                    rechargeViewModel.plan = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.customerId.setTag((Object) null);
        this.customerPlan.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.mobileRechargeButton.setTag((Object) null);
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
        String rechargeViewModelPlan = null;
        View.OnClickListener rechargeViewModelOnRechargeButtonClickAndroidViewViewOnClickListener = null;
        String rechargeViewModelNumber = null;
        if (!((dirtyFlags & 3) == 0 || rechargeViewModel == null)) {
            rechargeViewModelPlan = rechargeViewModel.plan;
            OnClickListenerImpl onClickListenerImpl = this.f185xc12d8544;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f185xc12d8544 = onClickListenerImpl;
            }
            rechargeViewModelOnRechargeButtonClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(rechargeViewModel);
            rechargeViewModelNumber = rechargeViewModel.number;
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.customerId, rechargeViewModelNumber);
            TextViewBindingAdapter.setText(this.customerPlan, rechargeViewModelPlan);
            this.mobileRechargeButton.setOnClickListener(rechargeViewModelOnRechargeButtonClickAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.customerId, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.customerIdandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.customerPlan, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.customerPlanandroidTextAttrChanged);
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
            this.value.onRechargeButtonClick(arg0);
        }
    }
}
