package com.sandy.cosmossoft.activities.aeps;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.fingpay.microatmsdk.utils.Constants;
import com.itextpdf.text.xml.xmp.DublinCoreProperties;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.MiniStatementAdapter;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.MiniStatementData;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityMiniStatementAnalyticBinding;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MiniStatementAnalytic extends AppCompatActivity {
    ActivityMiniStatementAnalyticBinding binding;
    DetailedHistoryResponse historyResponse;
    private long mLastClickTime = 0;
    AnalyticsResponseModel model;
    String myStatus = "";
    String shareResponse = "";
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMiniStatementAnalyticBinding inflate = ActivityMiniStatementAnalyticBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "AEPS Transaction");
        this.historyResponse = (DetailedHistoryResponse) getIntent().getSerializableExtra("detailed");
        this.model = (AnalyticsResponseModel) getIntent().getSerializableExtra("regular");
        setJsonData();
        this.binding.setRegularDetailModel(this.model);
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
    }

    private void setJsonData() {
        JSONArray ministatement = null;
        try {
            JSONObject object = new JSONObject(this.historyResponse.getData_response());
            if (!object.getBoolean("status") || object.getInt("response_code") != 1) {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.failed);
                this.binding.textStatus.setText("Failed");
                this.myStatus = "Failed";
                this.binding.responseMobile.setText(this.model.getOnMobile());
            } else {
                this.binding.gifStatus.setImageResource(C0330R.C0332drawable.success);
                this.binding.textStatus.setText("Success");
                TextView textView = this.binding.responseMobile;
                textView.setText("**** **** **** " + object.getString("last_aadhar"));
                this.myStatus = "Success";
                ministatement = object.getJSONArray("ministatement");
            }
            this.shareResponse = object.getString("message");
            this.binding.responseMessage.setText(object.getString("message"));
            if (this.historyResponse.getType_response() == null) {
                this.historyResponse.setType_response("No Data");
            } else if (this.historyResponse.getType_response().equals("be")) {
                this.historyResponse.setType_response("Balance Enquiry");
            } else if (this.historyResponse.getType_response().equals(Constants.MICROATM_MS)) {
                this.historyResponse.setType_response("Mini Statement");
            } else if (this.historyResponse.getType_response().equals(Constants.MICROATM_CW)) {
                this.historyResponse.setType_response("Cash Withdrawal");
            }
            this.binding.transactionType.setText(this.historyResponse.getType_response());
            this.binding.givenBalance.setText(object.getString("balanceamount"));
            this.binding.givenBankName.setText(object.getString("bankiin"));
            this.binding.givenDateTime.setText(object.getString("datetime"));
            this.binding.givenAckno.setText(object.getString("ackno"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        List<MiniStatementData> list = new ArrayList<>();
        if (ministatement != null) {
            int i = 0;
            while (true) {
                try {
                    Objects.requireNonNull(ministatement);
                    if (i >= ministatement.length()) {
                        break;
                    }
                    JSONObject ob = ministatement.getJSONObject(i);
                    list.add(new MiniStatementData(ob.getString(DublinCoreProperties.DATE), ob.getString("txnType"), ob.getString("amount"), ob.getString("narration")));
                    i++;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        setRecyclerView(list);
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
            whatsappIntent.putExtra("android.intent.extra.TEXT", "Status: " + this.myStatus + "\nAadhaar Number: " + this.model.getOnMobile() + "\nTransaction Type: " + this.binding.transactionType.getText().toString() + "\nAmount: " + this.model.getAmount() + "\nCommission: " + this.model.getCommission_amount() + "\nOpening Balance: " + this.model.getAmount_earlier() + "\nClosing Balance: " + this.model.getAmount_left() + "\nTransaction id: " + this.model.getTxn_id() + "\nResponse: " + this.shareResponse + "\nDate-Time" + this.model.getDate() + "\nSystem User: " + this.user.getName() + MaskedEditText.SPACE + this.user.getLastname() + "\nSystem User Mobile: " + this.user.getMobile());
            try {
                startActivity(Intent.createChooser(whatsappIntent, "Send Using: "));
            } catch (ActivityNotFoundException e) {
                ViewUtils.showToast(this, "No app found to share..");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    private void setRecyclerView(List<MiniStatementData> list) {
        this.binding.miniStateRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.binding.miniStateRecycler.setAdapter(new MiniStatementAdapter(list));
        if (list == null) {
            this.binding.miniStatementLayout.setVisibility(8);
        } else if (list.size() == 0) {
            this.binding.miniStatementLayout.setVisibility(8);
        }
    }
}
