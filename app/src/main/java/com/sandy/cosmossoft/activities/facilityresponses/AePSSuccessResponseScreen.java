package com.sandy.cosmossoft.activities.facilityresponses;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityAePsresponseScreenSuccessBinding;
import com.sandy.cosmossoft.maskedittext.MaskedEditText;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;
import java.util.Objects;

public class AePSSuccessResponseScreen extends AppCompatActivity {
    ActivityAePsresponseScreenSuccessBinding binding;
    private long mLastClickTime = 0;
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAePsresponseScreenSuccessBinding inflate = ActivityAePsresponseScreenSuccessBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Success");
        this.binding.ackno.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.getAckno()));
        this.binding.amount.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.getAmount()));
        this.binding.balanceamount.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.getBalanceamount()));
        this.binding.clientrefno.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.getClientrefno()));
        this.binding.lastAadhar.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.last_aadhar));
        this.binding.message.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.getMessage()));
        this.binding.name.setText(String.valueOf(AepsViewModel.globalAePSBalanceEnquiryResponse.getName()));
        this.binding.fromBank.setText(AepsViewModel.selectedAepsBankModel.getBankname());
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
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
            Intent whatsappIntent = new Intent("android.intent.action.SEND");
            whatsappIntent.setType("text/plain");
            whatsappIntent.putExtra("android.intent.extra.TEXT", "Acknowledgement no: " + AepsViewModel.globalAePSBalanceEnquiryResponse.getAckno() + "\nStatus: Failed\nRemaining Balance: " + AepsViewModel.globalAePSBalanceEnquiryResponse.getBalanceamount() + "\nAmount: " + AepsViewModel.globalAePSBalanceEnquiryResponse.getAmount() + "\nAadhaar: **** **** **** " + AepsViewModel.globalAePSBalanceEnquiryResponse.getLast_aadhar() + "\nName: " + AepsViewModel.globalAePSBalanceEnquiryResponse.getName() + "\nReference ID: " + AepsViewModel.globalAePSBalanceEnquiryResponse.getClientrefno() + "\nBank: " + AepsViewModel.selectedAepsBankModel.getBankname() + "\nRemarks: " + AepsViewModel.globalAePSBalanceEnquiryResponse.getMessage() + "\nSystem User: " + this.user.getName() + MaskedEditText.SPACE + this.user.getLastname() + "\nSystem User Mobile: " + this.user.getMobile());
            try {
                startActivity(Intent.createChooser(whatsappIntent, "Send Using: "));
            } catch (ActivityNotFoundException e) {
                ViewUtils.showToast(this, "No app found to share..");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }
}
