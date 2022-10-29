package com.sandy.cosmossoft.activities.payoutpaysprint;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.databinding.ActivitySendPayoutBinding;
import com.sandy.cosmossoft.util.ExecuteUtil;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.util.Objects;

public class SendPayout extends Hilt_SendPayout {
    ActivitySendPayoutBinding binding;
    PayoutViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySendPayoutBinding inflate = ActivitySendPayoutBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Send Payouts");
        PayoutViewModel payoutViewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.viewModel = payoutViewModel;
        this.binding.setPayoutViewModel(payoutViewModel);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            onBackPressed();
            finish();
            return true;
        }
        if (item.getItemId() == C0330R.C0333id.homePage) {
            ExecuteUtil.ThrowOut(this);
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0330R.C0335menu.response_menu, menu);
        menu.getItem(0).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }
}
