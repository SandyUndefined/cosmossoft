package com.sandy.cosmossoft.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;

public class ActivityPayoutDetailedAnalyticBindingImpl extends ActivityPayoutDetailedAnalyticBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener beneficiaryIdandroidTextAttrChanged;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    /* access modifiers changed from: private */
    public final TextView mboundView6;
    private InverseBindingListener mboundView6androidTextAttrChanged;
    private InverseBindingListener responseCloseBalandroidTextAttrChanged;
    private InverseBindingListener responseCommAmandroidTextAttrChanged;
    private InverseBindingListener responseCommGstandroidTextAttrChanged;
    private InverseBindingListener responseCommTdsandroidTextAttrChanged;
    private InverseBindingListener responseDateandroidTextAttrChanged;
    private InverseBindingListener responseOpIdandroidTextAttrChanged;
    private InverseBindingListener responseOpenBalandroidTextAttrChanged;
    private InverseBindingListener responseTxnIdandroidTextAttrChanged;
    private InverseBindingListener transactionTypeandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0330R.C0333id.head_transaction, 13);
        sparseIntArray.put(C0330R.C0333id.printReceipt, 14);
        sparseIntArray.put(C0330R.C0333id.gif_status, 15);
        sparseIntArray.put(C0330R.C0333id.text_status, 16);
        sparseIntArray.put(C0330R.C0333id.gst_no_section, 17);
        sparseIntArray.put(C0330R.C0333id.gst_no, 18);
        sparseIntArray.put(C0330R.C0333id.tds_charge_section, 19);
        sparseIntArray.put(C0330R.C0333id.amount_label, 20);
        sparseIntArray.put(C0330R.C0333id.charges, 21);
        sparseIntArray.put(C0330R.C0333id.gst_section, 22);
        sparseIntArray.put(C0330R.C0333id.response_message, 23);
    }

    public ActivityPayoutDetailedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }

    private ActivityPayoutDetailedAnalyticBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, bindings[20], bindings[2], bindings[21], bindings[1], bindings[15], bindings[18], bindings[17], bindings[22], bindings[13], bindings[14], bindings[10], bindings[7], bindings[8], bindings[4], bindings[12], bindings[23], bindings[5], bindings[9], bindings[11], bindings[19], bindings[16], bindings[3]);
        this.beneficiaryIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.beneficiaryId);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setOnMobile(callbackArg_0);
                }
            }
        };
        this.mboundView6androidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.mboundView6);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_in_word(callbackArg_0);
                }
            }
        };
        this.responseCloseBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseCloseBal);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_left(callbackArg_0);
                }
            }
        };
        this.responseCommAmandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseCommAm);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setCommission_amount(callbackArg_0);
                }
            }
        };
        this.responseCommGstandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseCommGst);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setGst(callbackArg_0);
                }
            }
        };
        this.responseCommTdsandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseCommTds);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTds(callbackArg_0);
                }
            }
        };
        this.responseDateandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseDate);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setDate(callbackArg_0);
                }
            }
        };
        this.responseOpIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseOpId);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount(callbackArg_0);
                }
            }
        };
        this.responseOpenBalandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseOpenBal);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setAmount_earlier(callbackArg_0);
                }
            }
        };
        this.responseTxnIdandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.responseTxnId);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setTxn_id(callbackArg_0);
                }
            }
        };
        this.transactionTypeandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String callbackArg_0 = TextViewBindingAdapter.getTextString(ActivityPayoutDetailedAnalyticBindingImpl.this.transactionType);
                AnalyticsResponseModel regularDetailModel = ActivityPayoutDetailedAnalyticBindingImpl.this.mRegularDetailModel;
                if (regularDetailModel != null) {
                    regularDetailModel.setOp_id(callbackArg_0);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.beneficiaryId.setTag((Object) null);
        this.circleImage.setTag((Object) null);
        ScrollView scrollView = bindings[0];
        this.mboundView0 = scrollView;
        scrollView.setTag((Object) null);
        TextView textView = bindings[6];
        this.mboundView6 = textView;
        textView.setTag((Object) null);
        this.responseCloseBal.setTag((Object) null);
        this.responseCommAm.setTag((Object) null);
        this.responseCommGst.setTag((Object) null);
        this.responseCommTds.setTag((Object) null);
        this.responseDate.setTag((Object) null);
        this.responseOpId.setTag((Object) null);
        this.responseOpenBal.setTag((Object) null);
        this.responseTxnId.setTag((Object) null);
        this.transactionType.setTag((Object) null);
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
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r4 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r0 = r4.getDate();
        r6 = r4.getOnMobile();
        r7 = r4.getOp_id();
        r8 = r4.getTxn_id();
        r9 = r4.getLogo();
        r10 = r4.getAmount();
        r11 = r4.getAmount_earlier();
        r12 = r4.getAmount_left();
        r13 = r4.getGst();
        r14 = r4.getCommission_amount();
        r15 = r4.getTds();
        r5 = r4.getAmount_in_word();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if ((r2 & 3) == 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r18 = r4;
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.beneficiaryId, r6);
        com.sandy.cosmossoft.util.BindingUtils.loadUrlImage(r1.circleImage, r9);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.mboundView6, r5);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCloseBal, r12);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCommAm, r14);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCommGst, r13);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseCommTds, r15);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseDate, r0);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseOpId, r10);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseOpenBal, r11);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.responseTxnId, r8);
        androidx.databinding.adapters.TextViewBindingAdapter.setText(r1.transactionType, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a8, code lost:
        if ((r2 & 2) == 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00aa, code lost:
        r16 = r0;
        r17 = null;
        r17 = null;
        r17 = null;
        r19 = r2;
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.beneficiaryId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.beneficiaryIdandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.mboundView6androidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCloseBal, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCloseBalandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCommAm, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCommAmandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCommGst, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCommGstandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseCommTds, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseCommTdsandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseDateandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseOpId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseOpIdandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseOpenBal, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseOpenBalandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.responseTxnId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.responseTxnIdandroidTextAttrChanged);
        androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r1.transactionType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) null, r1.transactionTypeandroidTextAttrChanged);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0109, code lost:
        r16 = r0;
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r0 = null;
        r6 = null;
        r7 = null;
        r8 = null;
        r9 = null;
        r10 = null;
        r11 = null;
        r12 = null;
        r13 = null;
        r14 = null;
        r15 = null;
        r4 = r1.mRegularDetailModel;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r2 & 3) == 0) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r22 = this;
            r1 = r22
            r2 = 0
            monitor-enter(r22)
            long r4 = r1.mDirtyFlags     // Catch:{ all -> 0x0112 }
            r2 = r4
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x010e }
            monitor-exit(r22)     // Catch:{ all -> 0x010e }
            r0 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel r4 = r1.mRegularDetailModel
            r5 = 0
            r18 = 3
            long r20 = r2 & r18
            r16 = 0
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 == 0) goto L_0x0057
            if (r4 == 0) goto L_0x0057
            java.lang.String r0 = r4.getDate()
            java.lang.String r6 = r4.getOnMobile()
            java.lang.String r7 = r4.getOp_id()
            java.lang.String r8 = r4.getTxn_id()
            java.lang.String r9 = r4.getLogo()
            java.lang.String r10 = r4.getAmount()
            java.lang.String r11 = r4.getAmount_earlier()
            java.lang.String r12 = r4.getAmount_left()
            java.lang.String r13 = r4.getGst()
            java.lang.String r14 = r4.getCommission_amount()
            java.lang.String r15 = r4.getTds()
            java.lang.String r5 = r4.getAmount_in_word()
        L_0x0057:
            long r18 = r2 & r18
            r16 = 0
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x009e
            r18 = r4
            android.widget.TextView r4 = r1.beneficiaryId
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r6)
            de.hdodenhof.circleimageview.CircleImageView r4 = r1.circleImage
            com.sandy.cosmossoft.util.BindingUtils.loadUrlImage(r4, r9)
            android.widget.TextView r4 = r1.mboundView6
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r5)
            android.widget.TextView r4 = r1.responseCloseBal
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r12)
            android.widget.TextView r4 = r1.responseCommAm
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r14)
            android.widget.TextView r4 = r1.responseCommGst
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r13)
            android.widget.TextView r4 = r1.responseCommTds
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r15)
            android.widget.TextView r4 = r1.responseDate
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r0)
            android.widget.TextView r4 = r1.responseOpId
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r10)
            android.widget.TextView r4 = r1.responseOpenBal
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r11)
            android.widget.TextView r4 = r1.responseTxnId
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r8)
            android.widget.TextView r4 = r1.transactionType
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r4, r7)
            goto L_0x00a0
        L_0x009e:
            r18 = r4
        L_0x00a0:
            r19 = 2
            long r19 = r2 & r19
            r16 = 0
            int r4 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0109
            android.widget.TextView r4 = r1.beneficiaryId
            r16 = r0
            r0 = 0
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r17
            r17 = r0
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r17 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r17
            r19 = r2
            androidx.databinding.InverseBindingListener r2 = r1.beneficiaryIdandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r4, r0, r0, r0, r2)
            android.widget.TextView r2 = r1.mboundView6
            androidx.databinding.InverseBindingListener r3 = r1.mboundView6androidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseCloseBal
            androidx.databinding.InverseBindingListener r3 = r1.responseCloseBalandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
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
            android.widget.TextView r2 = r1.responseOpId
            androidx.databinding.InverseBindingListener r3 = r1.responseOpIdandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseOpenBal
            androidx.databinding.InverseBindingListener r3 = r1.responseOpenBalandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.responseTxnId
            androidx.databinding.InverseBindingListener r3 = r1.responseTxnIdandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            android.widget.TextView r2 = r1.transactionType
            androidx.databinding.InverseBindingListener r3 = r1.transactionTypeandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r2, r0, r0, r0, r3)
            goto L_0x010d
        L_0x0109:
            r16 = r0
            r19 = r2
        L_0x010d:
            return
        L_0x010e:
            r0 = move-exception
            r19 = r2
            goto L_0x0113
        L_0x0112:
            r0 = move-exception
        L_0x0113:
            monitor-exit(r22)     // Catch:{ all -> 0x0112 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.databinding.ActivityPayoutDetailedAnalyticBindingImpl.executeBindings():void");
    }
}
