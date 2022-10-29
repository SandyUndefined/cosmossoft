package com.sandy.cosmossoft.activities.addfunds;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityAddFundListBinding;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import java.util.Objects;

public class AddFundList extends Hilt_AddFundList {
    ActivityAddFundListBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAddFundListBinding inflate = ActivityAddFundListBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Add Fund");
        this.binding.setFundViewModel((FundViewModel) new ViewModelProvider(this).get(FundViewModel.class));
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
