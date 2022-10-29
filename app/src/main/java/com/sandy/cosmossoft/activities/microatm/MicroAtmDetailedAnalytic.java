package com.sandy.cosmossoft.activities.microatm;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.paytm.pgsdk.PaytmConstants;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityMicroAtmDetailedAnalyticBinding;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class MicroAtmDetailedAnalytic extends AppCompatActivity {
    String acc_rem_bal = "";
    ActivityMicroAtmDetailedAnalyticBinding binding;
    String cardType = "";
    DetailedHistoryResponse historyResponse;
    private long mLastClickTime = 0;
    AnalyticsResponseModel model;
    String myStatus = "";
    String shareResponse = "";
    String transactionType = "";
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMicroAtmDetailedAnalyticBinding inflate = ActivityMicroAtmDetailedAnalyticBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Micro ATM Transaction");
        this.historyResponse = (DetailedHistoryResponse) getIntent().getSerializableExtra("detailed");
        AnalyticsResponseModel analyticsResponseModel = (AnalyticsResponseModel) getIntent().getSerializableExtra("regular");
        this.model = analyticsResponseModel;
        this.binding.setRegularDetailModel(analyticsResponseModel);
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
        setJsonData();
    }

    private void setJsonData() {
        try {
            JSONObject object = new JSONObject(this.historyResponse.getData_response());
            if (object.getString(PaytmConstants.STATUS).equals("1")) {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.success);
                this.binding.textStatus.setText("Success");
                this.myStatus = "Success";
            } else {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.failed);
                this.binding.textStatus.setText("Failed");
                this.myStatus = "Failed";
            }
            this.acc_rem_bal = object.getString("BALAMOUNT");
            this.cardType = object.getString("CARDTYPE");
            this.transactionType = object.getString("TRANSTYPE");
            this.binding.responseAccountBalance.setText(this.acc_rem_bal);
            this.binding.cardType.setText(this.cardType);
            this.binding.transactionType.setText(this.transactionType);
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (this.shareResponse == null) {
                this.shareResponse = "nothing";
            }
            Intent whatsappIntent = new Intent("android.intent.action.SEND");
            whatsappIntent.setType("text/plain");
            whatsappIntent.putExtra("android.intent.extra.TEXT", "Status: " + this.myStatus + "\nCard Number: " + this.model.getOnMobile() + "\nCard Type: " + this.cardType + "\nBank Name: " + this.model.getOperator_name() + "\nAmount: " + this.model.getAmount() + "\nAccount Balance: " + this.acc_rem_bal + "\nCommission: " + this.model.getCommission_amount() + "\nOpening Balance: " + this.model.getAmount_earlier() + "\nClosing Balance: " + this.model.getAmount_left() + "\nTransaction id: " + this.model.getTxn_id() + "\nTransaction Type: " + this.transactionType + "\nDate-Time" + this.model.getDate() + "\nSystem User: " + this.user.getName() + MaskedEditText.SPACE + this.user.getLastname() + "\nSystem User Mobile: " + this.user.getMobile());
            try {
                startActivity(Intent.createChooser(whatsappIntent, "Send Using: "));
            } catch (ActivityNotFoundException e) {
                ViewUtils.showToast(this, "No app found to share..");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }
}
