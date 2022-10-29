package com.sandy.cosmossoft.activities.payoutpaysprint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.sectionhistory.RegularHistory;
import com.sandy.cosmossoft.adapters.PaysprintPayoutAdapter;
import com.sandy.cosmossoft.data.network.responses.PayoutList;
import com.sandy.cosmossoft.databinding.ActivityPaysprintPayoutBinding;
import com.sandy.cosmossoft.listeners.PayoutHomeListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.util.List;
import java.util.Objects;

public class PaysprintPayout extends Hilt_PaysprintPayout implements PayoutHomeListener {
    ActivityPaysprintPayoutBinding binding;
    PayoutViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPaysprintPayoutBinding inflate = ActivityPaysprintPayoutBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Payout Accounts");
        PayoutViewModel payoutViewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.viewModel = payoutViewModel;
        this.binding.setPayoutViewModel(payoutViewModel);
        this.viewModel.repository.paySprintPayoutList(this);
        this.binding.searchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            onBackPressed();
            finish();
            return true;
        }
        if (item.getItemId() == C0330R.C0333id.history_check) {
            Intent intent = new Intent(this, RegularHistory.class);
            intent.putExtra("section", "payoutdeposit");
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0330R.C0335menu.history_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void setWholeRecycler(List<PayoutList> list) {
        this.binding.dmtUserRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        final PaysprintPayoutAdapter adapter = new PaysprintPayoutAdapter(list, this);
        this.binding.dmtUserRecycler.setAdapter(adapter);
        MyAlertUtils.dismissAlertDialog();
        if (list == null || list.isEmpty()) {
            this.binding.noRecords.setVisibility(0);
            this.binding.userSearchCard.setVisibility(8);
        } else {
            this.binding.noRecords.setVisibility(8);
            this.binding.userSearchCard.setVisibility(0);
        }
        this.binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String s) {
                adapter.getFilter().filter(s);
                return false;
            }

            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
    }

    public void setErrorInFetch(String value) {
        MyAlertUtils.showServerAlertDialog(this, value);
    }

    public void initiateStart() {
        MyAlertUtils.showProgressAlertDialog(this);
    }

    public void openBeneficiary(View view, PayoutList data) {
        if (data.getStatus() == null || data.getStatus().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            MyAlertUtils.showServerAlertDialog(this, "Un Eligible, Please verify the account");
        } else {
            this.viewModel.sendPayoutScreen(data.getBeneid(), this);
        }
    }

    public void verifyPayoutBeneficiary(View view, PayoutList data) {
        if (data.getStatus() == null || !data.getStatus().equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            MyAlertUtils.showServerAlertDialog(this, "Un Eligible.");
            return;
        }
        Intent intent = new Intent(this, VerifyAccounts.class);
        intent.putExtra("bene_id", data.getBeneid());
        intent.putExtra("account_no", data.getAccount());
        startActivity(intent);
    }

    public void deleteBeneficiary(View view, PayoutList data) {
    }
}
