package com.sandy.cosmossoft.activities.addfunds;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityFundExchangeBinding;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import java.util.Objects;

public class FundExchange extends Hilt_FundExchange {
    String aeps_bal;
    ActivityFundExchangeBinding binding;
    FundViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFundExchangeBinding inflate = ActivityFundExchangeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Fund Exchange");
        FundViewModel fundViewModel = (FundViewModel) new ViewModelProvider(this).get(FundViewModel.class);
        this.viewModel = fundViewModel;
        this.binding.setFundViewModel(fundViewModel);
        setLiveData();
    }

    private void setLiveData() {
        AppDatabase.getAppDatabase(this).getUserDao().getUser().observe(this, new FundExchange$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setLiveData$0$com-sandy-cosmossoft-activities-addfunds-FundExchange */
    public /* synthetic */ void mo938xe6d3d0ea(User user) {
        if (user != null) {
            TextView textView = this.binding.aepsBalText;
            textView.setText("AePS Bal: " + user.getAepsbalance());
            TextView textView2 = this.binding.mainBalText;
            textView2.setText("Main Bal: " + user.getMainbalance());
            this.aeps_bal = user.getAepsbalance();
        }
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
