package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.FundViewModel;

public class ActivityAddFundListBindingImpl extends ActivityAddFundListBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl2 mFundViewModelOnOfflineAddFundAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mFundViewModelOnPayTmAddFundAndroidViewViewOnClickListener;
    private OnClickListenerImpl mFundViewModelOnRazorPayAddFundAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mFundViewModelOnWalletExchangeAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 5);
    }

    public ActivityAddFundListBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ActivityAddFundListBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[5], bindings[2], bindings[3], bindings[1], bindings[4]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.offlinePayment.setTag((Object) null);
        this.paytmFund.setTag((Object) null);
        this.upiPayment.setTag((Object) null);
        this.walletExchange.setTag((Object) null);
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
        if (19 != variableId) {
            return false;
        }
        setFundViewModel((FundViewModel) variable);
        return true;
    }

    public void setFundViewModel(FundViewModel FundViewModel) {
        this.mFundViewModel = FundViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
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
        View.OnClickListener fundViewModelOnRazorPayAddFundAndroidViewViewOnClickListener = null;
        View.OnClickListener fundViewModelOnPayTmAddFundAndroidViewViewOnClickListener = null;
        View.OnClickListener fundViewModelOnOfflineAddFundAndroidViewViewOnClickListener = null;
        View.OnClickListener fundViewModelOnWalletExchangeAndroidViewViewOnClickListener = null;
        FundViewModel fundViewModel = this.mFundViewModel;
        if (!((dirtyFlags & 3) == 0 || fundViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mFundViewModelOnRazorPayAddFundAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mFundViewModelOnRazorPayAddFundAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            fundViewModelOnRazorPayAddFundAndroidViewViewOnClickListener = onClickListenerImpl.setValue(fundViewModel);
            OnClickListenerImpl1 onClickListenerImpl1 = this.mFundViewModelOnPayTmAddFundAndroidViewViewOnClickListener;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.mFundViewModelOnPayTmAddFundAndroidViewViewOnClickListener = onClickListenerImpl1;
            }
            fundViewModelOnPayTmAddFundAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(fundViewModel);
            OnClickListenerImpl2 onClickListenerImpl2 = this.mFundViewModelOnOfflineAddFundAndroidViewViewOnClickListener;
            if (onClickListenerImpl2 == null) {
                onClickListenerImpl2 = new OnClickListenerImpl2();
                this.mFundViewModelOnOfflineAddFundAndroidViewViewOnClickListener = onClickListenerImpl2;
            }
            fundViewModelOnOfflineAddFundAndroidViewViewOnClickListener = onClickListenerImpl2.setValue(fundViewModel);
            OnClickListenerImpl3 onClickListenerImpl3 = this.mFundViewModelOnWalletExchangeAndroidViewViewOnClickListener;
            if (onClickListenerImpl3 == null) {
                onClickListenerImpl3 = new OnClickListenerImpl3();
                this.mFundViewModelOnWalletExchangeAndroidViewViewOnClickListener = onClickListenerImpl3;
            }
            fundViewModelOnWalletExchangeAndroidViewViewOnClickListener = onClickListenerImpl3.setValue(fundViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.offlinePayment.setOnClickListener(fundViewModelOnRazorPayAddFundAndroidViewViewOnClickListener);
            this.paytmFund.setOnClickListener(fundViewModelOnPayTmAddFundAndroidViewViewOnClickListener);
            this.upiPayment.setOnClickListener(fundViewModelOnOfflineAddFundAndroidViewViewOnClickListener);
            this.walletExchange.setOnClickListener(fundViewModelOnWalletExchangeAndroidViewViewOnClickListener);
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
            this.value.onRazorPayAddFund(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private FundViewModel value;

        public OnClickListenerImpl1 setValue(FundViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onPayTmAddFund(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private FundViewModel value;

        public OnClickListenerImpl2 setValue(FundViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onOfflineAddFund(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private FundViewModel value;

        public OnClickListenerImpl3 setValue(FundViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onWalletExchange(arg0);
        }
    }
}
