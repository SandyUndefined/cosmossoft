package com.sandy.cosmossoft.activities.tobank;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivitySendAmountDmtBinding;
import com.sandy.cosmossoft.listeners.PayoutListener;
import com.sandy.cosmossoft.listeners.SendAmountViewsListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.Objects;

public class SendAmountDMT extends Hilt_SendAmountDMT implements PayoutListener, SendAmountViewsListener {
    ActivitySendAmountDmtBinding binding;
    ToBankViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySendAmountDmtBinding inflate = ActivitySendAmountDmtBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Send");
        ToBankViewModel toBankViewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.viewModel = toBankViewModel;
        this.binding.setSendAmountViewModel(toBankViewModel);
        this.viewModel.payoutListener = this;
        this.viewModel.sendAmountViewsListener = this;
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
        this.binding.enteredAmount.setText("");
        this.binding.transactionType.setText("");
    }

    public void eraseAmountText() {
        this.binding.enteredAmount.setText("");
    }
}
