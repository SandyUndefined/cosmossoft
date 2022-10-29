package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.viewmodel.FundViewModel;

public class ActivityFundExchangeBindingImpl extends ActivityFundExchangeBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener amountBalanceandroidTextAttrChanged;
    private long mDirtyFlags;
    private OnClickListenerImpl mFundViewModelOnFundExchangeClickAndroidViewViewOnClickListener;
    private final ScrollView mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.main_bal_card, 3);
        sparseIntArray.put(C0330R.C0333id.logo_wallet_image, 4);
        sparseIntArray.put(C0330R.C0333id.wallet_bal_layout, 5);
        sparseIntArray.put(C0330R.C0333id.main_bal_text, 6);
        sparseIntArray.put(C0330R.C0333id.amount_card, 7);
        sparseIntArray.put(C0330R.C0333id.amount, 8);
        sparseIntArray.put(C0330R.C0333id.logo_wallet_image_a, 9);
        sparseIntArray.put(C0330R.C0333id.wallet_bal_layout_a, 10);
        sparseIntArray.put(C0330R.C0333id.aeps_bal_text, 11);
    }

    public ActivityFundExchangeBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityFundExchangeBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[11], bindings[8], bindings[1], bindings[7], bindings[2], bindings[4], bindings[9], bindings[3], bindings[6], bindings[5], bindings[10]);
        this.amountBalanceandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityFundExchangeBindingImpl.this.amountBalance);
                FundViewModel fundViewModel = ActivityFundExchangeBindingImpl.this.mFundViewModel;
                if (fundViewModel != null) {
                    fundViewModel.amount = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.amountBalance.setTag((Object) null);
        this.exchangeBalance.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
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
        if (53 == variableId) {
            setUserDataModel((User) variable);
            return true;
        } else if (19 != variableId) {
            return false;
        } else {
            setFundViewModel((FundViewModel) variable);
            return true;
        }
    }

    public void setUserDataModel(User UserDataModel) {
        this.mUserDataModel = UserDataModel;
    }

    public void setFundViewModel(FundViewModel FundViewModel) {
        this.mFundViewModel = FundViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(19);
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
        String fundViewModelAmount = null;
        FundViewModel fundViewModel = this.mFundViewModel;
        View.OnClickListener fundViewModelOnFundExchangeClickAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 6) == 0 || fundViewModel == null)) {
            fundViewModelAmount = fundViewModel.amount;
            OnClickListenerImpl onClickListenerImpl = this.mFundViewModelOnFundExchangeClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mFundViewModelOnFundExchangeClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            fundViewModelOnFundExchangeClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(fundViewModel);
        }
        if ((6 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.amountBalance, fundViewModelAmount);
            this.exchangeBalance.setOnClickListener(fundViewModelOnFundExchangeClickAndroidViewViewOnClickListener);
        }
        if ((4 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.amountBalance, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.amountBalanceandroidTextAttrChanged);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private FundViewModel value;

        public OnClickListenerImpl setValue(FundViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onFundExchangeClick(arg0);
        }
    }
}
