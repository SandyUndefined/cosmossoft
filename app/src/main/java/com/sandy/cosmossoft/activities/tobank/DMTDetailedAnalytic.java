package com.sandy.cosmossoft.activities.tobank;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.Objects;

public class DMTDetailedAnalytic extends AppCompatActivity {
    String amount_in_word = "";
    String amount_label = "Amount";
    String bank_name = "";
    String bene_id = "";
    String bene_user_name = "";
    ActivityDmtdetaitedAnalyticBinding binding;
    String charges = "";
    String dmt_mobile = "";
    String gst_no = "";
    DetailedHistoryResponse historyResponse;
    String ifsc_code = "";
    String location;
    private long mLastClickTime = 0;
    AnalyticsResponseModel model;
    String myStatus = "";
    String shareResponse = "";
    String transactionType = "";
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDmtdetaitedAnalyticBinding inflate = ActivityDmtdetaitedAnalyticBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar2 = getSupportActionBar();
        String stringExtra = getIntent().getStringExtra("location");
        this.location = stringExtra;
        actionBar2.setTitle((CharSequence) stringExtra);
        this.historyResponse = (DetailedHistoryResponse) getIntent().getSerializableExtra("detailed");
        this.model = (AnalyticsResponseModel) getIntent().getSerializableExtra("regular");
        setJsonData();
        this.binding.setRegularDetailModel(this.model);
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setJsonData() {
        /*
            r13 = this;
            java.lang.String r0 = "bene_user_name"
            java.lang.String r1 = "dmt_mobile"
            java.lang.String r2 = "bene_id"
            java.lang.String r3 = "message"
            java.lang.String r4 = "Success"
            java.lang.String r5 = "Failed"
            java.lang.String r6 = "Pending"
            java.lang.String r7 = "Refunded"
            java.lang.String r8 = ""
            com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel r9 = r13.model
            java.lang.String r9 = r9.getStatus()
            if (r9 == 0) goto L_0x0024
            com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel r9 = r13.model
            java.lang.String r9 = r9.getStatus()
            java.lang.String r8 = r9.toLowerCase()
        L_0x0024:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse r10 = r13.historyResponse     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r10 = r10.getData_response()     // Catch:{ JSONException -> 0x0154 }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x0154 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse r11 = r13.historyResponse     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r11.getAdditional_info()     // Catch:{ JSONException -> 0x0154 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x0154 }
            r11 = -1
            int r12 = r8.hashCode()     // Catch:{ JSONException -> 0x0154 }
            switch(r12) {
                case -1867169789: goto L_0x0057;
                case -707924457: goto L_0x004d;
                case -682587753: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ JSONException -> 0x0154 }
        L_0x0042:
            goto L_0x0060
        L_0x0043:
            java.lang.String r12 = "pending"
            boolean r12 = r8.equals(r12)     // Catch:{ JSONException -> 0x0154 }
            if (r12 == 0) goto L_0x0042
            r11 = 1
            goto L_0x0060
        L_0x004d:
            java.lang.String r12 = "refunded"
            boolean r12 = r8.equals(r12)     // Catch:{ JSONException -> 0x0154 }
            if (r12 == 0) goto L_0x0042
            r11 = 2
            goto L_0x0060
        L_0x0057:
            java.lang.String r12 = "success"
            boolean r12 = r8.equals(r12)     // Catch:{ JSONException -> 0x0154 }
            if (r12 == 0) goto L_0x0042
            r11 = 0
        L_0x0060:
            r12 = 2131231066(0x7f08015a, float:1.8078203E38)
            switch(r11) {
                case 0: goto L_0x008e;
                case 1: goto L_0x007a;
                case 2: goto L_0x0069;
                default: goto L_0x0066;
            }     // Catch:{ JSONException -> 0x0154 }
        L_0x0066:
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            goto L_0x009f
        L_0x0069:
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            pl.droidsonroids.gif.GifImageView r11 = r11.gifStatus     // Catch:{ JSONException -> 0x0154 }
            r11.setImageResource(r12)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r11 = r11.textStatus     // Catch:{ JSONException -> 0x0154 }
            r11.setText(r7)     // Catch:{ JSONException -> 0x0154 }
            r13.myStatus = r7     // Catch:{ JSONException -> 0x0154 }
            goto L_0x00b0
        L_0x007a:
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            pl.droidsonroids.gif.GifImageView r11 = r11.gifStatus     // Catch:{ JSONException -> 0x0154 }
            r12 = 2131231098(0x7f08017a, float:1.8078267E38)
            r11.setImageResource(r12)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r11 = r11.textStatus     // Catch:{ JSONException -> 0x0154 }
            r11.setText(r6)     // Catch:{ JSONException -> 0x0154 }
            r13.myStatus = r6     // Catch:{ JSONException -> 0x0154 }
            goto L_0x00b0
        L_0x008e:
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            pl.droidsonroids.gif.GifImageView r11 = r11.gifStatus     // Catch:{ JSONException -> 0x0154 }
            r11.setImageResource(r12)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r11 = r11.textStatus     // Catch:{ JSONException -> 0x0154 }
            r11.setText(r4)     // Catch:{ JSONException -> 0x0154 }
            r13.myStatus = r4     // Catch:{ JSONException -> 0x0154 }
            goto L_0x00b0
        L_0x009f:
            pl.droidsonroids.gif.GifImageView r11 = r11.gifStatus     // Catch:{ JSONException -> 0x0154 }
            r12 = 2131230874(0x7f08009a, float:1.8077813E38)
            r11.setImageResource(r12)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r11 = r11.textStatus     // Catch:{ JSONException -> 0x0154 }
            r11.setText(r5)     // Catch:{ JSONException -> 0x0154 }
            r13.myStatus = r5     // Catch:{ JSONException -> 0x0154 }
        L_0x00b0:
            java.lang.String r11 = r9.getString(r3)     // Catch:{ JSONException -> 0x0154 }
            r13.shareResponse = r11     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r11 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r11 = r11.responseMessage     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r3 = r9.getString(r3)     // Catch:{ JSONException -> 0x0154 }
            r11.setText(r3)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse r3 = r13.historyResponse     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r3 = r3.getType_response()     // Catch:{ JSONException -> 0x0154 }
            r13.transactionType = r3     // Catch:{ JSONException -> 0x0154 }
            if (r3 != 0) goto L_0x00cf
            java.lang.String r3 = ""
            r13.transactionType = r3     // Catch:{ JSONException -> 0x0154 }
        L_0x00cf:
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.transactionType     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r13.transactionType     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r11.toUpperCase()     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.beneficiaryId     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r10.getString(r2)     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.dmtMobile     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r10.getString(r1)     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.beneUserName     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r10.getString(r0)     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r3 = "bank_name"
            java.lang.String r3 = r10.getString(r3)     // Catch:{ JSONException -> 0x0154 }
            r13.bank_name = r3     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.bankName     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r13.bank_name     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r3 = "ifsc_code"
            java.lang.String r3 = r10.getString(r3)     // Catch:{ JSONException -> 0x0154 }
            r13.ifsc_code = r3     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.ifscCode     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r13.ifsc_code     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r3 = "charges"
            java.lang.String r3 = r10.getString(r3)     // Catch:{ JSONException -> 0x0154 }
            r13.charges = r3     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.charges     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r13.charges     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r3 = "gst_no"
            java.lang.String r3 = r10.getString(r3)     // Catch:{ JSONException -> 0x0154 }
            r13.gst_no = r3     // Catch:{ JSONException -> 0x0154 }
            com.sandy.cosmossoft.databinding.ActivityDmtdetaitedAnalyticBinding r3 = r13.binding     // Catch:{ JSONException -> 0x0154 }
            android.widget.TextView r3 = r3.gstNo     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r11 = r13.gst_no     // Catch:{ JSONException -> 0x0154 }
            r3.setText(r11)     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ JSONException -> 0x0154 }
            r13.dmt_mobile = r1     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ JSONException -> 0x0154 }
            r13.bene_user_name = r0     // Catch:{ JSONException -> 0x0154 }
            java.lang.String r0 = r10.getString(r2)     // Catch:{ JSONException -> 0x0154 }
            r13.bene_id = r0     // Catch:{ JSONException -> 0x0154 }
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.activities.tobank.DMTDetailedAnalytic.setJsonData():void");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            onBackPressed();
            finish();
            return true;
        }
        if (item.getItemId() == C0330R.C0333id.share) {
            shareTheData();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0330R.C0335menu.response_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void shareTheData() {
        Intent whatsappIntent;
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (this.shareResponse == null) {
                this.shareResponse = "nothing";
            }
            Intent whatsappIntent2 = new Intent("android.intent.action.SEND");
            whatsappIntent2.setType("text/plain");
            boolean equals = this.location.equals("Payout Transaction");
            Intent whatsappIntent3 = whatsappIntent2;
            String str = "\nSystem User Mobile: ";
            String str2 = MaskedEditText.SPACE;
            String str3 = "\nSystem User: ";
            String str4 = "\nDate-Time";
            String str5 = "\nResponse: ";
            if (equals) {
                whatsappIntent = whatsappIntent3;
                whatsappIntent.putExtra("android.intent.extra.TEXT", "Status: " + this.myStatus + "\nBank Name: " + this.bank_name + "\nAccount Number: " + this.model.getOnMobile() + "\nIFSC CODE: " + this.ifsc_code + "\nBeneficiary Name: " + this.bene_user_name + "\nBeneficiary ID : " + this.bene_id + "\nTransaction Type : " + this.transactionType + "\nGST No :" + this.gst_no + "\n" + this.amount_label + ": " + this.model.getAmount() + "\nAmount in Words " + this.amount_in_word + "\nCharges: " + this.charges + "\nTransaction id: " + this.model.getTxn_id() + str5 + this.shareResponse + str4 + this.model.getDate() + str3 + this.user.getName() + str2 + this.user.getLastname() + str + this.user.getMobile());
            } else {
                String str6 = str5;
                String str7 = str4;
                String str8 = str3;
                String str9 = str2;
                String str10 = str7;
                whatsappIntent = whatsappIntent3;
                whatsappIntent.putExtra("android.intent.extra.TEXT", "Status: " + this.myStatus + "\nBank Name: " + this.bank_name + "\nAccount Number: " + this.model.getOnMobile() + "\nIFSC CODE: " + this.ifsc_code + "\nDMT Mobile: " + this.dmt_mobile + "\nBeneficiary Name: " + this.bene_user_name + "\nBeneficiary ID : " + this.bene_id + "\nTransaction Type : " + this.transactionType + "\nGST No :" + this.gst_no + "\n" + this.amount_label + ": " + this.model.getAmount() + "\nAmount in Words " + this.amount_in_word + "\nCharges: " + this.charges + "\nTransaction id: " + this.model.getTxn_id() + str6 + this.shareResponse + str10 + this.model.getDate() + str8 + this.user.getName() + str9 + this.user.getLastname() + str + this.user.getMobile());
            }
            try {
                startActivity(Intent.createChooser(whatsappIntent, "Send Using: "));
            } catch (ActivityNotFoundException e) {
                ViewUtils.showToast(this, "No app found to share..");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }
}
