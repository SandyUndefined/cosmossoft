package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;

public class FragmentHomeMenuFragmentsBindingImpl extends FragmentHomeMenuFragmentsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mHomeViewModelOnAddFundClickAndroidViewViewOnClickListener;
    private final CardView mboundView3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.newsSection, 4);
        sparseIntArray.put(C0330R.C0333id.everynews, 5);
        sparseIntArray.put(C0330R.C0333id.HomeSliderFragment, 6);
        sparseIntArray.put(C0330R.C0333id.moneyTransfer, 7);
        sparseIntArray.put(C0330R.C0333id.logo_wallet_image, 8);
        sparseIntArray.put(C0330R.C0333id.wallet_bal_layout, 9);
        sparseIntArray.put(C0330R.C0333id.firstHomeMenu, 10);
        sparseIntArray.put(C0330R.C0333id.utilitiesHomeMenu, 11);
        sparseIntArray.put(C0330R.C0333id.taxesHomeMenu, 12);
    }

    public FragmentHomeMenuFragmentsBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }

    private FragmentHomeMenuFragmentsBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[6], bindings[2], bindings[5], bindings[10], bindings[8], bindings[1], bindings[7], bindings[4], bindings[0], bindings[12], bindings[11], bindings[9]);
        this.mDirtyFlags = -1;
        this.aepsBalText.setTag((Object) null);
        this.mainBalText.setTag((Object) null);
        CardView cardView = bindings[3];
        this.mboundView3 = cardView;
        cardView.setTag((Object) null);
        this.parentRoot.setTag((Object) null);
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
        if (23 != variableId) {
            return false;
        }
        setHomeViewModel((HomeViewModel) variable);
        return true;
    }

    public void setHomeViewModel(HomeViewModel HomeViewModel) {
        this.mHomeViewModel = HomeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(23);
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
        String homeViewModelAepsBalance = null;
        View.OnClickListener homeViewModelOnAddFundClickAndroidViewViewOnClickListener = null;
        HomeViewModel homeViewModel = this.mHomeViewModel;
        String homeViewModelMainBalance = null;
        if ((dirtyFlags & 2) != 0) {
            homeViewModelAepsBalance = HomeViewModel.aepsBalance;
            homeViewModelMainBalance = HomeViewModel.mainBalance;
        }
        if (!((dirtyFlags & 3) == 0 || homeViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mHomeViewModelOnAddFundClickAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mHomeViewModelOnAddFundClickAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            homeViewModelOnAddFundClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(homeViewModel);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.aepsBalText, homeViewModelAepsBalance);
            TextViewBindingAdapter.setText(this.mainBalText, homeViewModelMainBalance);
        }
        if ((dirtyFlags & 3) != 0) {
            this.mboundView3.setOnClickListener(homeViewModelOnAddFundClickAndroidViewViewOnClickListener);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private HomeViewModel value;

        public OnClickListenerImpl setValue(HomeViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onAddFundClick(arg0);
        }
    }
}
