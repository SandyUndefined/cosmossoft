package com.sandy.cosmossoft.activities.Payouts;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityPayoutsBinding;
import com.sandy.cosmossoft.listeners.PayoutListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.util.Objects;

public class SendAmountPayouts extends Hilt_SendAmountPayouts implements PayoutListener {
    ActivityPayoutsBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPayoutsBinding inflate = ActivityPayoutsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Send Amount");
        PayoutViewModel viewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.binding.setPayoutViewModel(viewModel);
        viewModel.listener = this;
        viewModel.account_number = getIntent().getStringExtra("acc");
        viewModel.ifsc = getIntent().getStringExtra("ifsc");
        ViewUtils.setFocusable(this.binding.enteredAmount, this);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void onTransactionTypeChange(String string) {
        this.binding.transactionType.setText(string);
    }

    public void resetAll(boolean status) {
        this.binding.transactionType.setText("");
        this.binding.enteredAmount.setText("");
    }
}
