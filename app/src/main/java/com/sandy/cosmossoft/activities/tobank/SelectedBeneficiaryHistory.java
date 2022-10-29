package com.sandy.cosmossoft.activities.tobank;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;
import com.sandy.cosmossoft.databinding.ActivitySelectedBenefeciaryHistoryBinding;
import com.sandy.cosmossoft.listeners.BeneficiaryHistoryListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.Objects;

public class SelectedBeneficiaryHistory extends Hilt_SelectedBeneficiaryHistory implements BeneficiaryHistoryListener {
    public static BeneficiaryHistoryResponse selectedHistory;
    ActivitySelectedBenefeciaryHistoryBinding binding;
    ToBankViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySelectedBenefeciaryHistoryBinding inflate = ActivitySelectedBenefeciaryHistoryBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Beneficiary History");
        ToBankViewModel toBankViewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.viewModel = toBankViewModel;
        this.binding.setSelectedBeneficiaryViewModel(toBankViewModel);
        this.binding.noRecords.setVisibility(8);
        this.viewModel.getSelectedBeneficiaryHistory(this, this.binding.selectedBeneficiaryHistory, this);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void clickOnMoreInfo(View view, BeneficiaryHistoryResponse history) {
        Intent intent = new Intent(this, DetailedHistoryScreen.class);
        selectedHistory = history;
        startActivity(intent);
    }

    public void clickOnUpdateInfo(View view, BeneficiaryHistoryResponse history) {
        this.viewModel.updateDMTTransactionNow(this, history.getReference_id(), this.binding.selectedBeneficiaryHistory, this, "selected");
    }

    public void notifierScreen(boolean result) {
        if (result) {
            this.binding.noRecords.setVisibility(8);
        } else {
            this.binding.noRecords.setVisibility(0);
        }
    }

    public void clickOnRefund(View view, BeneficiaryHistoryResponse history) {
        if (history.getData().getAckno() == null || history.getData().getAckno().isEmpty()) {
            ViewUtils.showToast(this, "You are not acknowledge to use this service");
        } else {
            this.viewModel.applyForRefundDmtTransaction(this, this, history.getData().getAckno(), history.getReference_id());
        }
    }

    public void bringAllOverHistoryAgain(boolean status) {
        if (status) {
            this.viewModel.getSelectedBeneficiaryHistory(this, this.binding.selectedBeneficiaryHistory, this);
        }
    }
}
