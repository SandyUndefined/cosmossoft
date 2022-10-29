package com.sandy.cosmossoft.activities.tobank;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.sandy.cosmossoft.databinding.ActivityDetailedHistoryScreenBinding;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.Objects;

public class DetailedHistoryScreen extends AppCompatActivity {
    ActivityDetailedHistoryScreenBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailedHistoryScreenBinding inflate = ActivityDetailedHistoryScreenBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        inflate.setWholeInfoModel(SelectedBeneficiaryHistory.selectedHistory);
        setContentView(this.binding.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        supportActionBar2.setTitle((CharSequence) Html.fromHtml("<small>" + SelectedBeneficiaryHistory.selectedHistory.data.getRemarks() + "</small>"));
        ActionBar supportActionBar3 = getSupportActionBar();
        supportActionBar3.setSubtitle((CharSequence) Html.fromHtml("<small>" + SelectedBeneficiaryHistory.selectedHistory.getTime() + "</small>"));
        clicks();
    }

    private void clicks() {
        this.binding.copyReferenceId.setOnClickListener(new DetailedHistoryScreen$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$clicks$0$com-sandy-cosmossoft-activities-tobank-DetailedHistoryScreen */
    public /* synthetic */ void mo28xe82f51e5(View v) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied", SelectedBeneficiaryHistory.selectedHistory.getReference_id()));
        ViewUtils.showToast(this, "Copied");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        ToBankViewModel.amount = null;
        ToBankViewModel.transType = null;
    }
}
