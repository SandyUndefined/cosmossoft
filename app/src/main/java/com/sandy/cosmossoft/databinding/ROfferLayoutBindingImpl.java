package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.data.network.responses.ROfferModel;

public class ROfferLayoutBindingImpl extends ROfferLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private InverseBindingListener descandroidTextAttrChanged;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private InverseBindingListener rupeeandroidTextAttrChanged;

    public ROfferLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }

    private ROfferLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[2], bindings[1]);
        this.descandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ROfferLayoutBindingImpl.this.desc);
                ROfferModel rOfferDataModel = ROfferLayoutBindingImpl.this.mROfferDataModel;
                if (rOfferDataModel != null) {
                    rOfferDataModel.setDesc(callbackArg_0);
                }
            }
        };
        this.rupeeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ROfferLayoutBindingImpl.this.rupee);
                ROfferModel rOfferDataModel = ROfferLayoutBindingImpl.this.mROfferDataModel;
                if (rOfferDataModel != null) {
                    rOfferDataModel.setRs(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.desc.setTag((Object) null);
        LinearLayout linearLayout = bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        this.rupee.setTag((Object) null);
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
        if (42 != variableId) {
            return false;
        }
        setROfferDataModel((ROfferModel) variable);
        return true;
    }

    public void setROfferDataModel(ROfferModel ROfferDataModel) {
        this.mROfferDataModel = ROfferDataModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(42);
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
        String rOfferDataModelRs = null;
        ROfferModel rOfferDataModel = this.mROfferDataModel;
        String rOfferDataModelDesc = null;
        if (!((dirtyFlags & 3) == 0 || rOfferDataModel == null)) {
            rOfferDataModelRs = rOfferDataModel.getRs();
            rOfferDataModelDesc = rOfferDataModel.getDesc();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.desc, rOfferDataModelDesc);
            TextViewBindingAdapter.setText(this.rupee, rOfferDataModelRs);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.desc, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.descandroidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.rupee, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.rupeeandroidTextAttrChanged);
        }
    }
}
