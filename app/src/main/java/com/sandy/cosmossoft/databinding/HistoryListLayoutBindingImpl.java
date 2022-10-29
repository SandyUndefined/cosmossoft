package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.HistoryModel;

public class HistoryListLayoutBindingImpl extends HistoryListLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;
    private final TextView mboundView5;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.historyCard, 6);
        sparseIntArray.put(C0330R.C0333id.history_logo_layout, 7);
        sparseIntArray.put(C0330R.C0333id.history_logo, 8);
    }

    public HistoryListLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private HistoryListLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[4], bindings[6], bindings[8], bindings[7]);
        this.mDirtyFlags = -1;
        this.historyAmount.setTag((Object) null);
        LinearLayout linearLayout = bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        TextView textView = bindings[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = bindings[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = bindings[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = bindings[5];
        this.mboundView5 = textView4;
        textView4.setTag((Object) null);
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
        if (30 != variableId) {
            return false;
        }
        setMyHistoryModel((HistoryModel) variable);
        return true;
    }

    public void setMyHistoryModel(HistoryModel MyHistoryModel) {
        this.mMyHistoryModel = MyHistoryModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(30);
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
        HistoryModel myHistoryModel = this.mMyHistoryModel;
        String myHistoryModelAmount = null;
        String myHistoryModelDate = null;
        String myHistoryModelDebitedFromCreditTo = null;
        String myHistoryModelPaidToReceiveFrom = null;
        String myHistoryModelToPerson = null;
        if (!((dirtyFlags & 3) == 0 || myHistoryModel == null)) {
            myHistoryModelAmount = myHistoryModel.getAmount();
            myHistoryModelDate = myHistoryModel.getDate();
            myHistoryModelDebitedFromCreditTo = myHistoryModel.getDebited_from_credit_to();
            myHistoryModelPaidToReceiveFrom = myHistoryModel.getPaid_to_receive_from();
            myHistoryModelToPerson = myHistoryModel.getTo_person();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.historyAmount, myHistoryModelAmount);
            TextViewBindingAdapter.setText(this.mboundView1, myHistoryModelDate);
            TextViewBindingAdapter.setText(this.mboundView2, myHistoryModelPaidToReceiveFrom);
            TextViewBindingAdapter.setText(this.mboundView3, myHistoryModelToPerson);
            TextViewBindingAdapter.setText(this.mboundView5, myHistoryModelDebitedFromCreditTo);
        }
    }
}
