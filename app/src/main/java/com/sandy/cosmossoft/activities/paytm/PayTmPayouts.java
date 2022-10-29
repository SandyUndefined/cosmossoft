package com.sandy.cosmossoft.activities.paytm;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityPayTmPayoutsBinding;
import com.sandy.cosmossoft.listeners.PayoutListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.util.Objects;

public class PayTmPayouts extends Hilt_PayTmPayouts implements PayoutListener {
    ActivityPayTmPayoutsBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPayTmPayoutsBinding inflate = ActivityPayTmPayoutsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Payouts");
        PayoutViewModel viewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.binding.setPayoutViewModel(viewModel);
        viewModel.listener = this;
        ViewUtils.setFocusable(this.binding.accountNumber, this);
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
        this.binding.accountNumber.setText("");
        this.binding.transactionType.setText("");
        this.binding.enteredAmount.setText("");
        this.binding.mobileIFSC.setText("");
    }
}
