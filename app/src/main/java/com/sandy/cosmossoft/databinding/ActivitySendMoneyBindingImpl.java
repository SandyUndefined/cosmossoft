package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;

public class ActivitySendMoneyBindingImpl extends ActivitySendMoneyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener amountbalanceandroidTextAttrChanged;
    private long mDirtyFlags;

    /* renamed from: mSendMoneyViewModelRequestMoneyToContactAndroidViewViewOnClickListener */
    private OnClickListenerImpl1 f190x9e7a187f;

    /* renamed from: mSendMoneyViewModelSendMoneyToContactAndroidViewViewOnClickListener */
    private OnClickListenerImpl f191xa730260a;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.payLayouts, 4);
        sparseIntArray.put(C0330R.C0333id.buttonsLayout, 5);
        sparseIntArray.put(C0330R.C0333id.one, 6);
        sparseIntArray.put(C0330R.C0333id.two, 7);
        sparseIntArray.put(C0330R.C0333id.three, 8);
        sparseIntArray.put(C0330R.C0333id.four, 9);
        sparseIntArray.put(C0330R.C0333id.five, 10);
        sparseIntArray.put(C0330R.C0333id.six, 11);
        sparseIntArray.put(C0330R.C0333id.seven, 12);
        sparseIntArray.put(C0330R.C0333id.eight, 13);
        sparseIntArray.put(C0330R.C0333id.nine, 14);
        sparseIntArray.put(C0330R.C0333id.point, 15);
        sparseIntArray.put(C0330R.C0333id.zeo, 16);
        sparseIntArray.put(C0330R.C0333id.erase, 17);
    }

    public ActivitySendMoneyBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }

    private ActivitySendMoneyBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[5], bindings[13], bindings[17], bindings[10], bindings[9], bindings[14], bindings[2], bindings[3], bindings[6], bindings[4], bindings[15], bindings[12], bindings[11], bindings[8], bindings[7], bindings[16]);
        this.amountbalanceandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivitySendMoneyBindingImpl.this.amountbalance);
                MobileNumberPayViewModel sendMoneyViewModel = ActivitySendMoneyBindingImpl.this.mSendMoneyViewModel;
                if (sendMoneyViewModel != null) {
                    sendMoneyViewModel.amount = callbackArg_0;
                }
            }
        };
        this.mDirtyFlags = -1;
        this.amountbalance.setTag((Object) null);
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.onRequestMoneyButton.setTag((Object) null);
        this.onSendMoneyButton.setTag((Object) null);
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
        if (50 != variableId) {
            return false;
        }
        setSendMoneyViewModel((MobileNumberPayViewModel) variable);
        return true;
    }

    public void setSendMoneyViewModel(MobileNumberPayViewModel SendMoneyViewModel) {
        this.mSendMoneyViewModel = SendMoneyViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(50);
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
        View.OnClickListener sendMoneyViewModelSendMoneyToContactAndroidViewViewOnClickListener = null;
        String sendMoneyViewModelAmount = null;
        MobileNumberPayViewModel sendMoneyViewModel = this.mSendMoneyViewModel;
        View.OnClickListener sendMoneyViewModelRequestMoneyToContactAndroidViewViewOnClickListener = null;
        if (!((dirtyFlags & 3) == 0 || sendMoneyViewModel == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f191xa730260a;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f191xa730260a = onClickListenerImpl;
            }
            sendMoneyViewModelSendMoneyToContactAndroidViewViewOnClickListener = onClickListenerImpl.setValue(sendMoneyViewModel);
            sendMoneyViewModelAmount = sendMoneyViewModel.amount;
            OnClickListenerImpl1 onClickListenerImpl1 = this.f190x9e7a187f;
            if (onClickListenerImpl1 == null) {
                onClickListenerImpl1 = new OnClickListenerImpl1();
                this.f190x9e7a187f = onClickListenerImpl1;
            }
            sendMoneyViewModelRequestMoneyToContactAndroidViewViewOnClickListener = onClickListenerImpl1.setValue(sendMoneyViewModel);
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.amountbalance, sendMoneyViewModelAmount);
            this.onRequestMoneyButton.setOnClickListener(sendMoneyViewModelRequestMoneyToContactAndroidViewViewOnClickListener);
            this.onSendMoneyButton.setOnClickListener(sendMoneyViewModelSendMoneyToContactAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.amountbalance, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.amountbalanceandroidTextAttrChanged);
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private MobileNumberPayViewModel value;

        public OnClickListenerImpl setValue(MobileNumberPayViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.sendMoneyToContact(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private MobileNumberPayViewModel value;

        public OnClickListenerImpl1 setValue(MobileNumberPayViewModel value2) {
            this.value = value2;
            if (value2 == null) {
                return null;
            }
            return this;
        }

        public void onClick(View arg0) {
            this.value.requestMoneyToContact(arg0);
        }
    }
}
