package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public class ActivityToAccountBindingImpl extends ActivityToAccountBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mMyBankViewModelOnAddBankPageAndroidViewViewOnClickListener;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.banksSearchCard, 2);
        sparseIntArray.put(C0330R.C0333id.bankSearchView, 3);
        sparseIntArray.put(C0330R.C0333id.bankSectionBar, 4);
        sparseIntArray.put(C0330R.C0333id.bankOptionTabs, 5);
        sparseIntArray.put(C0330R.C0333id.tabLayoutDivider, 6);
        sparseIntArray.put(C0330R.C0333id.myBankListRecycler, 7);
        sparseIntArray.put(C0330R.C0333id.myHistoryListRecycler, 8);
    }

    public ActivityToAccountBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ActivityToAccountBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[5], bindings[3], bindings[4], bindings[2], bindings[7], bindings[8], bindings[6]);
        this.mDirtyFlags = -1;
        this.AddBeneficiary.setTag((Object) null);
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
        if (1 != variableId) {
            return false;
        }
        setMyBankViewModel((ToBankViewModel) variable);
        return true;
    }

    public void setMyBankViewModel(ToBankViewModel MyBankViewModel) {
        this.mMyBankViewModel = MyBankViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(1);
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
        View.OnClickListener myBankViewModelOnAddBankPageAndroidViewViewOnClickListener = null;
        ToBankViewModel myBankViewModel = this.mMyBankViewModel;
        if (!((dirtyFlags & 3) == 0 || myBankViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.mMyBankViewModelOnAddBankPageAndroidViewViewOnClickListener;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.mMyBankViewModelOnAddBankPageAndroidViewViewOnClickListener = onClickListenerImpl;
            }
            myBankViewModelOnAddBankPageAndroidViewViewOnClickListener = onClickListenerImpl.setValue(myBankViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            this.AddBeneficiary.setOnClickListener(myBankViewModelOnAddBankPageAndroidViewViewOnClickListener);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private ToBankViewModel value;

        public OnClickListenerImpl setValue(ToBankViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.onAddBankPage(arg0);
        }
    }
}
