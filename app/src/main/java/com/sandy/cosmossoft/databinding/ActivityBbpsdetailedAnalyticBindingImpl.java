package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;

public class ActivityBbpsdetailedAnalyticBindingImpl extends ActivityBbpsdetailedAnalyticBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private InverseBindingListener responseCloseBalandroidTextAttrChanged;
    private InverseBindingListener responseCommAmandroidTextAttrChanged;
    private InverseBindingListener responseCommGstandroidTextAttrChanged;
    private InverseBindingListener responseCommTdsandroidTextAttrChanged;
    private InverseBindingListener responseDateandroidTextAttrChanged;
    private InverseBindingListener responseMobileandroidTextAttrChanged;
    private InverseBindingListener responseOpIdandroidTextAttrChanged;
    private InverseBindingListener responseOpNameandroidTextAttrChanged;
    private InverseBindingListener responseOpenBalandroidTextAttrChanged;
    private InverseBindingListener responseTxnIdandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.head_transaction, 12);
        sparseIntArray.put(C0330R.C0333id.gif_status, 13);
        sparseIntArray.put(C0330R.C0333id.text_status, 14);
        sparseIntArray.put(C0330R.C0333id.response_message, 15);
    }

    public ActivityBbpsdetailedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }

    private ActivityBbpsdetailedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[1], bindings[13], bindings[12], bindings[9], bindings[5], bindings[6], bindings[7], bindings[11], bindings[15], bindings[2], bindings[4], bindings[3], bindings[8], bindings[10], bindings[14]);
        this.responseCloseBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseCloseBal);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_left(callbackArg_0);
                }
            }
        };
        this.responseCommAmandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseCommAm);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setCommission_amount(callbackArg_0);
                }
            }
        };
        this.responseCommGstandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseCommGst);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setGst(callbackArg_0);
                }
            }
        };
        this.responseCommTdsandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseCommTds);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTds(callbackArg_0);
                }
            }
        };
        this.responseDateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseDate);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setDate(callbackArg_0);
                }
            }
        };
        this.responseMobileandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseMobile);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setOnMobile(callbackArg_0);
                }
            }
        };
        this.responseOpIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseOpId);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount(callbackArg_0);
                }
            }
        };
        this.responseOpNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseOpName);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setOperator_name(callbackArg_0);
                }
            }
        };
        this.responseOpenBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseOpenBal);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_earlier(callbackArg_0);
                }
            }
        };
        this.responseTxnIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityBbpsdetailedAnalyticBindingImpl.this.responseTxnId);
                AnalyticsResponseModel regularDetailModel = ActivityBbpsdetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTxn_id(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.circleImage.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        this.responseCloseBal.setTag((Object) null);
        this.responseCommAm.setTag((Object) null);
        this.responseCommGst.setTag((Object) null);
        this.responseCommTds.setTag((Object) null);
        this.responseDate.setTag((Object) null);
        this.responseMobile.setTag((Object) null);
        this.responseOpId.setTag((Object) null);
        this.responseOpName.setTag((Object) null);
        this.responseOpenBal.setTag((Object) null);
        this.responseTxnId.setTag((Object) null);
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
        if (46 != variableId) {
            return false;
        }
        setRegularDetailModel((AnalyticsResponseModel) variable);
        return true;
    }

    public void setRegularDetailModel(AnalyticsResponseModel RegularDetailModel) {
        this.mRegularDetailModel = RegularDetailModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(46);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r10 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r0 = r10.getOperator_name();
        r6 = r10.getCommission_amount();
        r7 = r10.getDate();
        r8 = r10.getOnMobile();
        r9 = r10.getTds();
        r11 = r10.getTxn_id();
        r12 = r10.getLogo();
        r13 = r10.getAmount();
        r14 = r10.getAmount_earlier();
        r15 = r10.getAmount_left();
        r21 = r10.getGst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if ((r2 & 3) == 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        com.sandy.cosmossoft.util.BindingUtils.loadUrlImage(r1.circleImage, r12);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCloseBal, r15);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCommAm, r6);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCommGst, r21);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCommTds, r9);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseDate, r7);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseMobile, r8);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseOpId, r13);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseOpName, r0);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseOpenBal, r14);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseTxnId, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0096, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        if ((r2 & 2) == 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        r16 = r0;
        r17 = null;
        r17 = null;
        r17 = null;
        r17 = r2;
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCloseBal, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCloseBalandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCommAm, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCommAmandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCommGst, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCommGstandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCommTds, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCommTdsandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseDateandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseMobile, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseMobileandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseOpId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseOpIdandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseOpName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseOpNameandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseOpenBal, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseOpenBalandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseTxnId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseTxnIdandroidTextAttrChanged);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fa, code lost:
        r16 = r0;
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = null;
        r6 = null;
        r7 = null;
        r8 = null;
        r9 = null;
        r10 = r1.mRegularDetailModel;
        r11 = null;
        r12 = null;
        r13 = null;
        r14 = null;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ((r2 & 3) == 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r22 = this;
            r1 = r22
            r2 = 0
            monitor-enter(r22)
            long r4 = r1.mDirtyFlags     // Catch:{ all -> 0x0103 }
            r2 = r4
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x00ff }
            monitor-exit(r22)     // Catch:{ all -> 0x00ff }
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel r10 = r1.mRegularDetailModel
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 3
            long r19 = r2 & r17
            int r19 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0054
            if (r10 == 0) goto L_0x0054
            java.lang.String r0 = r10.getOperator_name()
            java.lang.String r6 = r10.getCommission_amount()
            java.lang.String r7 = r10.getDate()
            java.lang.String r8 = r10.getOnMobile()
            java.lang.String r9 = r10.getTds()
            java.lang.String r11 = r10.getTxn_id()
            java.lang.String r12 = r10.getLogo()
            java.lang.String r13 = r10.getAmount()
            java.lang.String r14 = r10.getAmount_earlier()
            java.lang.String r15 = r10.getAmount_left()
            java.lang.String r16 = r10.getGst()
            r21 = r16
            goto L_0x0056
        L_0x0054:
            r21 = r16
        L_0x0056:
            long r16 = r2 & r17
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x0096
            de.hdodenhof.circleimageview.CircleImageView r4 = r1.circleImage
            com.sandy.cosmossoft.util.BindingUtils.loadUrlImage(r4, r12)
            android.widget.TextView r4 = r1.responseCloseBal
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r15)
            android.widget.TextView r4 = r1.responseCommAm
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r6)
            android.widget.TextView r4 = r1.responseCommGst
            r5 = r21
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r5)
            android.widget.TextView r4 = r1.responseCommTds
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r9)
            android.widget.TextView r4 = r1.responseDate
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r7)
            android.widget.TextView r4 = r1.responseMobile
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r8)
            android.widget.TextView r4 = r1.responseOpId
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r13)
            android.widget.TextView r4 = r1.responseOpName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r0)
            android.widget.TextView r4 = r1.responseOpenBal
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r14)
            android.widget.TextView r4 = r1.responseTxnId
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r11)
            goto L_0x0098
        L_0x0096:
            r5 = r21
        L_0x0098:
            r18 = 2
            long r18 = r2 & r18
            r16 = 0
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x00fa
            android.widget.TextView r4 = r1.responseCloseBal
            r16 = r0
            r0 = 0
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r17
            r17 = r2
            androidx.databinding.InverseBindingListener r2 = r1.responseCloseBalandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r4, r0, r0, r0, r2)
            android.widget.TextView r2 = r1.responseCommAm
            androidx.databinding.InverseBindingListener r3 = r1.responseCommAmandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseCommGst
            androidx.databinding.InverseBindingListener r3 = r1.responseCommGstandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseCommTds
            androidx.databinding.InverseBindingListener r3 = r1.responseCommTdsandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseDate
            androidx.databinding.InverseBindingListener r3 = r1.responseDateandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseMobile
            androidx.databinding.InverseBindingListener r3 = r1.responseMobileandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseOpId
            androidx.databinding.InverseBindingListener r3 = r1.responseOpIdandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseOpName
            androidx.databinding.InverseBindingListener r3 = r1.responseOpNameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseOpenBal
            androidx.databinding.InverseBindingListener r3 = r1.responseOpenBalandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseTxnId
            androidx.databinding.InverseBindingListener r3 = r1.responseTxnIdandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            goto L_0x00fe
        L_0x00fa:
            r16 = r0
            r17 = r2
        L_0x00fe:
            return
        L_0x00ff:
            r0 = move-exception
            r17 = r2
            goto L_0x0104
        L_0x0103:
            r0 = move-exception
        L_0x0104:
            monitor-exit(r22)     // Catch:{ all -> 0x0103 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityBbpsdetailedAnalyticBindingImpl.executeBindings():void");
    }
}
