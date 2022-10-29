package com.sandy.cosmossoft.activities.Payouts;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityAddPdmtbeneficiaryBinding;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.util.Objects;

public class AddPDMTBeneficiary extends Hilt_AddPDMTBeneficiary {
    ActivityAddPdmtbeneficiaryBinding binding;
    PayoutViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAddPdmtbeneficiaryBinding inflate = ActivityAddPdmtbeneficiaryBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Add Beneficiary");
        PayoutViewModel payoutViewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.viewModel = payoutViewModel;
        this.binding.setPayoutViewModel(payoutViewModel);
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
