package com.sandy.cosmossoft.activities.rechargeactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoModel;
import com.sandy.cosmossoft.databinding.ActivityCustomerInfoBinding;
import java.util.Objects;

public class CustomerInfoActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCustomerInfoBinding binding = ActivityCustomerInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Customer Info");
        CustomerInfoModel model = (CustomerInfoModel) getIntent().getSerializableExtra("infoDetails");
        if (model != null) {
            binding.setCustomerInfoModel(model);
            binding.confirm.setVisibility(0);
            binding.confirm.setOnClickListener(new CustomerInfoActivity$$ExternalSyntheticLambda0(this, model));
        }
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-rechargeactivities-CustomerInfoActivity */
    public /* synthetic */ void mo48264xab09e719(CustomerInfoModel model, View v) {
        Intent intentData = new Intent();
        if (model.getLastrechargeamount() == null) {
            model.setLastrechargeamount("");
        }
        intentData.putExtra("Price", model.getMonthlyRecharge());
        setResult(-1, intentData);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }
}
