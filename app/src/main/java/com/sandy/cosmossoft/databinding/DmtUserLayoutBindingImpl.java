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
import com.sandy.cosmossoft.data.network.responses.DmtUserData;

public class DmtUserLayoutBindingImpl extends DmtUserLayoutBinding {
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
    /* access modifiers changed from: private */
    public final TextView mboundView6;
    private InverseBindingListener mboundView6androidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.infoSection, 7);
        sparseIntArray.put(C0330R.C0333id.refreshDmtUser, 8);
        sparseIntArray.put(C0330R.C0333id.deleteDmtUser, 9);
    }

    public DmtUserLayoutBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    private DmtUserLayoutBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[9], bindings[7], bindings[8]);
        this.mboundView1androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(DmtUserLayoutBindingImpl.this.mboundView1);
                DmtUserData dmtUserData = DmtUserLayoutBindingImpl.this.mDmtUserData;
                if (dmtUserData != null) {
                    dmtUserData.setFname(callbackArg_0);
                }
            }
        };
        this.mboundView2androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(DmtUserLayoutBindingImpl.this.mboundView2);
                DmtUserData dmtUserData = DmtUserLayoutBindingImpl.this.mDmtUserData;
                if (dmtUserData != null) {
                    dmtUserData.setLname(callbackArg_0);
                }
            }
        };
        this.mboundView3androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(DmtUserLayoutBindingImpl.this.mboundView3);
                DmtUserData dmtUserData = DmtUserLayoutBindingImpl.this.mDmtUserData;
                if (dmtUserData != null) {
                    dmtUserData.setMobile(callbackArg_0);
                }
            }
        };
        this.mboundView4androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(DmtUserLayoutBindingImpl.this.mboundView4);
                DmtUserData dmtUserData = DmtUserLayoutBindingImpl.this.mDmtUserData;
                if (dmtUserData != null) {
                    dmtUserData.setBank1_limit(callbackArg_0);
                }
            }
        };
        this.mboundView5androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(DmtUserLayoutBindingImpl.this.mboundView5);
                DmtUserData dmtUserData = DmtUserLayoutBindingImpl.this.mDmtUserData;
                if (dmtUserData != null) {
                    dmtUserData.setBank2_limit(callbackArg_0);
                }
            }
        };
        this.mboundView6androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(DmtUserLayoutBindingImpl.this.mboundView6);
                DmtUserData dmtUserData = DmtUserLayoutBindingImpl.this.mDmtUserData;
                if (dmtUserData != null) {
                    dmtUserData.setBank3_limit(callbackArg_0);
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
        TextView textView6 = bindings[6];
        this.mboundView6 = textView6;
        textView6.setTag((Object) null);
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
        if (17 != variableId) {
            return false;
        }
        setDmtUserData((DmtUserData) variable);
        return true;
    }

    public void setDmtUserData(DmtUserData DmtUserData) {
        this.mDmtUserData = DmtUserData;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(17);
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
        String dmtUserDataMobile = null;
        String dmtUserDataBank2Limit = null;
        DmtUserData dmtUserData = this.mDmtUserData;
        String dmtUserDataBank3Limit = null;
        String dmtUserDataLname = null;
        String dmtUserDataFname = null;
        String dmtUserDataBank1Limit = null;
        if (!((dirtyFlags & 3) == 0 || dmtUserData == null)) {
            dmtUserDataMobile = dmtUserData.getMobile();
            dmtUserDataBank2Limit = dmtUserData.getBank2_limit();
            dmtUserDataBank3Limit = dmtUserData.getBank3_limit();
            dmtUserDataLname = dmtUserData.getLname();
            dmtUserDataFname = dmtUserData.getFname();
            dmtUserDataBank1Limit = dmtUserData.getBank1_limit();
        }
        if ((3 & dirtyFlags) != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, dmtUserDataFname);
            TextViewBindingAdapter.setText(this.mboundView2, dmtUserDataLname);
            TextViewBindingAdapter.setText(this.mboundView3, dmtUserDataMobile);
            TextViewBindingAdapter.setText(this.mboundView4, dmtUserDataBank1Limit);
            TextViewBindingAdapter.setText(this.mboundView5, dmtUserDataBank2Limit);
            TextViewBindingAdapter.setText(this.mboundView6, dmtUserDataBank3Limit);
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
            TextViewBindingAdapter.setTextWatcher(this.mboundView6, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.mboundView6androidTextAttrChanged);
        }
    }
}
