package com.sandy.cosmossoft.activities.tobank;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityRegisterRemitterBinding;
import com.sandy.cosmossoft.listeners.RemitterListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.Objects;

public class RegisterRemitter extends Hilt_RegisterRemitter implements RemitterListener {
    ActivityRegisterRemitterBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegisterRemitterBinding inflate = ActivityRegisterRemitterBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Add Sender");
        ToBankViewModel viewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.binding.setRegisterRemitter(viewModel);
        viewModel.remitterListener = this;
        ViewUtils.setFocusable(this.binding.firstName, this);
        viewModel.remitter_otp = getIntent().getExtras().getString("enteredOTP");
    }

    public void dateSetter(String date) {
        this.binding.dateOfBirth.setText(date);
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
