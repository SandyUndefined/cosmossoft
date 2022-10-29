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

public class ActivityBbpsEnterBindingImpl extends ActivityBbpsEnterBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener customerIdandroidTextAttrChanged;

    /* renamed from: mDirectToHomeViewModelOnFetchTheBillAndroidViewViewOnClickListener */
    private OnClickListenerImpl f174xb6edb915;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.selectNumberSliders, 3);
        sparseIntArray.put(C0330R.C0333id.inputNumLayout, 4);
        sparseIntArray.put(C0330R.C0333id.numberInputSection, 5);
        sparseIntArray.put(C0330R.C0333id.getTheContacts, 6);
        sparseIntArray.put(C0330R.C0333id.dthCallInfo, 7);
        sparseIntArray.put(C0330R.C0333id.dth_info_card, 8);
        sparseIntArray.put(C0330R.C0333id.logo_image2, 9);
        sparseIntArray.put(C0330R.C0333id.dth_info_written, 10);
    }

    public ActivityBbpsEnterBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityBbpsEnterBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[7], bindings[8], bindings[10], bindings[6], bindings[4], bindings[9], bindings[5], bindings[2], bindings[3]);
        this.customerIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsEnterBindingImpl.this.customerId);
                MobileRechargeViewModel directToHomeViewModel = ActivityBbpsEnterBindingImpl.this.mDirectToHomeViewModel;
                if (directToHomeViewModel != null) {
                    directToHomeViewModel.number = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.customerId.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.onBillFetchButton.setTag((Object) null);
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
        if (16 != variableId) {
            return false;
        }
        setDirectToHomeViewModel((MobileRechargeViewModel) variable);
        return true;
    }

    public void setDirectToHomeViewModel(MobileRechargeViewModel DirectToHomeViewModel) {
        this.mDirectToHomeViewModel = DirectToHomeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(16);
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
        String directToHomeViewModelNumber = null;
        MobileRechargeViewModel directToHomeViewModel = this.mDirectToHomeViewModel;
        View.OnClickListener directToHomeViewModelOnFetchTheBillAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || directToHomeViewModel == null)) {
            directToHomeViewModelNumber = directToHomeViewModel.number;
            OnClickListenerImpl onClickListenerImpl = this.f174xb6edb915;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f174xb6edb915 = onClickListenerImpl;
            }
            directToHomeViewModelOnFetchTheBillAndroidViewViewOnClickListener = onClickListenerImpl.setValue(directToHomeViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.customerId, directToHomeViewModelNumber);
            this.onBillFetchButton.setOnClickListener(directToHomeViewModelOnFetchTheBillAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.customerId, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.customerIdandroidTextAttrChanged);
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
            this.value.onFetchTheBill(arg0);
        }
    }
}
