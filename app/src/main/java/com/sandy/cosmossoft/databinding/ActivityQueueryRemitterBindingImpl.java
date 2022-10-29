package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;

public class ActivityQueueryRemitterBindingImpl extends ActivityQueueryRemitterBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* renamed from: mQueueryRemitterOnQueryRemitterButtonClickAndroidViewViewOnClickListener */
    private OnClickListenerImpl f184xa2cc247c;
    private final ConstraintLayout mboundView0;
    private InverseBindingListener mobileNumberandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.edit_mobile, 3);
    }

    public ActivityQueueryRemitterBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private ActivityQueueryRemitterBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[3], bindings[1]);
        this.mobileNumberandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityQueueryRemitterBindingImpl.this.mobileNumber);
                ToBankViewModel toBankViewModel = ActivityQueueryRemitterBindingImpl.this.mQueueryRemitter;
                ToBankViewModel.remitter_mobile = callbackArg_0;
            }
        };
        this.mDirtyFlags = -1;
        this.buttonApply.setTag((Object) null);
        ConstraintLayout constraintLayout = bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        this.mobileNumber.setTag((Object) null);
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
        if (41 != variableId) {
            return false;
        }
        setQueueryRemitter((ToBankViewModel) variable);
        return true;
    }

    public void setQueueryRemitter(ToBankViewModel QueueryRemitter) {
        this.mQueueryRemitter = QueueryRemitter;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(41);
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
        View.OnClickListener queueryRemitterOnQueryRemitterButtonClickAndroidViewViewOnClickListener = null;
        String queueryRemitterRemitterMobile = null;
        ToBankViewModel queueryRemitter = this.mQueueryRemitter;
        if ((dirtyFlags & 2) != 0) {
            queueryRemitterRemitterMobile = ToBankViewModel.remitter_mobile;
        }
        if (!((dirtyFlags & 3) == 0 || queueryRemitter == null)) {
            OnClickListenerImpl onClickListenerImpl = this.f184xa2cc247c;
            if (onClickListenerImpl == null) {
                onClickListenerImpl = new OnClickListenerImpl();
                this.f184xa2cc247c = onClickListenerImpl;
            }
            queueryRemitterOnQueryRemitterButtonClickAndroidViewViewOnClickListener = onClickListenerImpl.setValue(queueryRemitter);
        }
        if ((3 & dirtyFlags) != 0) {
            this.buttonApply.setOnClickListener(queueryRemitterOnQueryRemitterButtonClickAndroidViewViewOnClickListener);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mobileNumber, queueryRemitterRemitterMobile);
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mobileNumber, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mobileNumberandroidTextAttrChanged);
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
            this.value.onQueryRemitterButtonClick(arg0);
        }
    }
}
