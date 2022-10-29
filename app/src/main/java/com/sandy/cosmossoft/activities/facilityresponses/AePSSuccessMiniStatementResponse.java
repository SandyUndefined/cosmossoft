package com.sandy.cosmossoft.activities.facilityresponses;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.adapters.MiniStatementAdapter;
import com.sandy.cosmossoft.databinding.ActivityAePssuccessMiniStatementResponseBinding;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;
import java.util.Objects;

public class AePSSuccessMiniStatementResponse extends AppCompatActivity {
    ActivityAePssuccessMiniStatementResponseBinding binding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAePssuccessMiniStatementResponseBinding inflate = ActivityAePssuccessMiniStatementResponseBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Statement");
        setData();
        setRecyclerView();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    private void setRecyclerView() {
        this.binding.miniStateRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.binding.miniStateRecycler.setAdapter(new MiniStatementAdapter(AepsViewModel.globalMiniStatementResponse.getMinistatement()));
    }

    private void setData() {
        this.binding.givenAckno.setText(String.valueOf(AepsViewModel.globalMiniStatementResponse.getAckno()));
        this.binding.givenBalance.setText(AepsViewModel.globalMiniStatementResponse.getBalanceamount());
        this.binding.givenBankName.setText(AepsViewModel.selectedAepsBankModel.getBankname());
        this.binding.givenDateTime.setText(AepsViewModel.globalMiniStatementResponse.getDatetime());
    }
}
