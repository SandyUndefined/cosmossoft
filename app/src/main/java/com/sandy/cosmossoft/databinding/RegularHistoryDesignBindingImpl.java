package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;

public class RegularHistoryDesignBindingImpl extends RegularHistoryDesignBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView1;
    private InverseBindingListener mboundView1androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView2;
    private InverseBindingListener mboundView2androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView3;
    private InverseBindingListener mboundView3androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView4;
    private InverseBindingListener mboundView4androidTextAttrChanged;
    /* access modifiers changed from: private */
    public final TextView mboundView5;
    private InverseBindingListener mboundView5androidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.opSection, 6);
        sparseIntArray.put(C0330R.C0333id.historyClick, 7);
        sparseIntArray.put(C0330R.C0333id.claimRefund, 8);
    }

    public RegularHistoryDesignBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private RegularHistoryDesignBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[8], bindings[7], bindings[6]);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(RegularHistoryDesignBindingImpl.this.mboundView1);
                RegularHistoryResponse.EveryDayData histData = RegularHistoryDesignBindingImpl.this.mHistData;
                if (histData != null) {
                    histData.setAmount(callbackArg_0);
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(RegularHistoryDesignBindingImpl.this.mboundView2);
                RegularHistoryResponse.EveryDayData histData = RegularHistoryDesignBindingImpl.this.mHistData;
                if (histData != null) {
                    histData.setNumber(callbackArg_0);
                }
            }
        };
        this.mboundView3androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(RegularHistoryDesignBindingImpl.this.mboundView3);
                RegularHistoryResponse.EveryDayData histData = RegularHistoryDesignBindingImpl.this.mHistData;
                if (histData != null) {
                    histData.setStatus(callbackArg_0);
                }
            }
        };
        this.mboundView4androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(RegularHistoryDesignBindingImpl.this.mboundView4);
                RegularHistoryResponse.EveryDayData histData = RegularHistoryDesignBindingImpl.this.mHistData;
                if (histData != null) {
                    histData.setReference(callbackArg_0);
                }
            }
        };
        this.mboundView5androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(RegularHistoryDesignBindingImpl.this.mboundView5);
                RegularHistoryResponse.EveryDayData histData = RegularHistoryDesignBindingImpl.this.mHistData;
                if (histData != null) {
                    histData.setResponse(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextView textView = bindings[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = bindings[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = bindings[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = bindings[4];
        this.mboundView4 = textView4;
        textView4.setTag((Object) null);
        TextView textView5 = bindings[5];
        this.mboundView5 = textView5;
        textView5.setTag((Object) null);
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
        if (20 != variableId) {
            return false;
        }
        setHistData((RegularHistoryResponse.EveryDayData) variable);
        return true;
    }

    public void setHistData(RegularHistoryResponse.EveryDayData HistData) {
        this.mHistData = HistData;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(20);
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
        String histDataNumber = null;
        String histDataReference = null;
        String histDataAmount = null;
        RegularHistoryResponse.EveryDayData histData = this.mHistData;
        String histDataStatus = null;
        String histDataResponse = null;
        if (!((dirtyFlags & 3) == 0 || histData == null)) {
            histDataNumber = histData.getNumber();
            histDataReference = histData.getReference();
            histDataAmount = histData.getAmount();
            histDataStatus = histData.getStatus();
            histDataResponse = histData.getResponse();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, histDataAmount);
            TextViewBindingAdapter.setText(this.mboundView2, histDataNumber);
            TextViewBindingAdapter.setText(this.mboundView3, histDataStatus);
            TextViewBindingAdapter.setText(this.mboundView4, histDataReference);
            TextViewBindingAdapter.setText(this.mboundView5, histDataResponse);
        }
        if ((2 & dirtyFlags) != 0) {
            TextViewBindingAdapter.BeforeTextChanged beforeTextChanged = null;
            TextViewBindingAdapter.OnTextChanged onTextChanged = null;
            TextViewBindingAdapter.AfterTextChanged afterTextChanged = null;
            TextViewBindingAdapter.setTextWatcher(this.mboundView1, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView1androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView2, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView2androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView3, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView3androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView4, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView4androidTextAttrChanged);
            TextViewBindingAdapter.setTextWatcher(this.mboundView5, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView5androidTextAttrChanged);
        }
    }
}
