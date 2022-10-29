package com.sandy.cosmossoft.activities.Payouts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.adapters.PUserAdapter;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryModel;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryResponse;
import com.sandy.cosmossoft.databinding.ActivityPayoutHomeBinding;
import com.sandy.cosmossoft.listeners.PDMTListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.util.Objects;

public class PayoutHome extends Hilt_PayoutHome implements PDMTListener {
    ActivityPayoutHomeBinding binding;
    PayoutViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPayoutHomeBinding inflate = ActivityPayoutHomeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "DMT Home");
        PayoutViewModel payoutViewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.viewModel = payoutViewModel;
        this.binding.setPayoutViewModel(payoutViewModel);
        this.binding.addMoreBeneficiary.setOnClickListener(new PayoutHome$$ExternalSyntheticLambda0(this));
        this.binding.searchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-Payouts-PayoutHome */
    public /* synthetic */ void mo1545x512d6540(View v) {
        startActivity(new Intent(this, AddPDMTBeneficiary.class));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void startOperation() {
        MyAlertUtils.showProgressAlertDialog(this);
    }

    public void causedError(String info2) {
        MyAlertUtils.showServerAlertDialog(this, info2);
    }

    public void bringWholePDMTData(PBeneficiaryResponse pBeneficiaryResponse) {
        if (pBeneficiaryResponse.getResponse_code() == 2) {
            MyAlertUtils.dismissAlertDialog();
            ViewUtils.showToast(this, pBeneficiaryResponse.getMessage());
            onBackPressed();
        } else if (pBeneficiaryResponse.isStatus() && pBeneficiaryResponse.getResponse_code() == 1) {
            MyAlertUtils.dismissAlertDialog();
            if (pBeneficiaryResponse.getData() == null || pBeneficiaryResponse.getData().isEmpty()) {
                this.binding.noRecords.setVisibility(0);
                this.binding.userSearchCard.setVisibility(8);
                return;
            }
            this.binding.noRecords.setVisibility(8);
            this.binding.userSearchCard.setVisibility(0);
            this.binding.dmtUserRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
            final PUserAdapter adapter = new PUserAdapter(pBeneficiaryResponse.getData(), this);
            this.binding.dmtUserRecycler.setAdapter(adapter);
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
    }

    public void onClickBeneficiary(View view, PBeneficiaryModel model) {
        Intent intent = new Intent(this, SendAmountPayouts.class);
        intent.putExtra("acc", model.getAcc_num());
        intent.putExtra("ifsc", model.getIfsc());
        startActivity(intent);
    }

    public void onDeleteBeneficiary(View view, PBeneficiaryModel model) {
        this.viewModel.repository.deleteTheBeneficiary(this, model.getId());
    }

    public void reAssignData() {
        MyAlertUtils.dismissAlertDialog();
        this.viewModel.repository.getPDmtList(this);
    }
}
