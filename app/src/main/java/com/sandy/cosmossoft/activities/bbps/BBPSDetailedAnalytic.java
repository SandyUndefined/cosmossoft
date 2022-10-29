package com.sandy.cosmossoft.activities.bbps;

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
import com.sandy.cosmossoft.databinding.ActivityBbpsdetailedAnalyticBinding;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class BBPSDetailedAnalytic extends AppCompatActivity {
    ActivityBbpsdetailedAnalyticBinding binding;
    DetailedHistoryResponse historyResponse;
    private long mLastClickTime = 0;
    AnalyticsResponseModel model;
    String myStatus = "";
    String shareResponse = "";
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBbpsdetailedAnalyticBinding inflate = ActivityBbpsdetailedAnalyticBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "BBPS Transaction");
        this.historyResponse = (DetailedHistoryResponse) getIntent().getSerializableExtra("detailed");
        this.model = (AnalyticsResponseModel) getIntent().getSerializableExtra("regular");
        setJsonData();
        this.binding.setRegularDetailModel(this.model);
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
    }

    private void setJsonData() {
        try {
            JSONObject object = new JSONObject(this.historyResponse.getData_response());
            if (!object.getBoolean("status") || object.getInt("response_code") != 1) {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.failed);
                this.binding.textStatus.setText("Failed");
                this.myStatus = "Failed";
            } else {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.success);
                this.binding.textStatus.setText("Success");
                this.myStatus = "Success";
            }
            this.shareResponse = object.getString("message");
            this.binding.responseMessage.setText(object.getString("message"));
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
            whatsappIntent.putExtra("android.intent.extra.TEXT", "Status: " + this.myStatus + "\nConsumer Number: " + this.model.getOnMobile() + "\nOperator Name: " + this.model.getOperator_name() + "\nAmount: " + this.model.getAmount() + "\nCommission: " + this.model.getCommission_amount() + "\nOpening Balance: " + this.model.getAmount_earlier() + "\nClosing Balance: " + this.model.getAmount_left() + "\nTransaction id: " + this.model.getTxn_id() + "\nResponse: " + this.shareResponse + "\nDate-Time" + this.model.getDate() + "\nSystem User: " + this.user.getName() + MaskedEditText.SPACE + this.user.getLastname() + "\nSystem User Mobile: " + this.user.getMobile());
            try {
                startActivity(Intent.createChooser(whatsappIntent, "Send Using: "));
            } catch (ActivityNotFoundException e) {
                ViewUtils.showToast(this, "No app found to share..");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }
}
