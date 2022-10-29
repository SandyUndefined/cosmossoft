package com.sandy.cosmossoft.activities.sectionhistory;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.itextpdf.text.xml.xmp.XmpMMProperties;
import com.sandy.cosmossoft.adapters.RegularHistoryAdapter;
import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;
import com.sandy.cosmossoft.data.repositories.MobileRechargesRepository;
import com.sandy.cosmossoft.databinding.ActivityRegularHistoryBinding;
import com.sandy.cosmossoft.databinding.RegularHistoryDesignBinding;
import com.sandy.cosmossoft.listeners.RegularHistoryListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.List;
import java.util.Objects;

public class RegularHistory extends Hilt_RegularHistory implements RegularHistoryListener {
    ActivityRegularHistoryBinding binding;
    String section = "";
    MobileRechargeViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegularHistoryBinding inflate = ActivityRegularHistoryBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) XmpMMProperties.HISTORY);
        this.section = getIntent().getStringExtra("section");
        this.viewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.binding.searchView.findViewById(getResources().getIdentifier("android:id/search_plate", (String) null, (String) null)).setBackgroundColor(0);
        this.viewModel.mobileRechargesRepository.bringUsualFastAgHistory(this, this, this.section);
        this.viewModel.mobileRechargesRepository.regularHistoryListener = this;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void bringTheHistory(List<RegularHistoryResponse.EveryDayData> data) {
        this.binding.HistorySearchCard.setVisibility(0);
        final RegularHistoryAdapter adapter = new RegularHistoryAdapter(data, this);
        this.binding.historyRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.binding.historyRecycler.setAdapter(adapter);
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

    public void thereWasNoData() {
        this.binding.noRecords.setVisibility(0);
        this.binding.historyRecycler.setVisibility(8);
        this.binding.HistorySearchCard.setVisibility(8);
    }

    public void onClickedData(RegularHistoryResponse.EveryDayData history) {
    }

    public void onCheckStatusData(RegularHistoryResponse.EveryDayData history) {
        if (this.section.equals("lic") || this.section.equals("cashdeposit")) {
            MyAlertUtils.showWarningAlertDialog(this, "This Service is not available for this operator");
            return;
        }
        MobileRechargesRepository mobileRechargesRepository = this.viewModel.mobileRechargesRepository;
        mobileRechargesRepository.checkHistoryStatusRegular(this, this.section + "status", history.getReference());
    }

    public void disableListener(RegularHistoryDesignBinding binding2, RegularHistoryResponse.EveryDayData history) {
        if (this.section.equals("lic") || this.section.equals("cashdeposit") || this.section.equals("recharge")) {
            binding2.claimRefund.setVisibility(8);
        } else {
            binding2.claimRefund.setVisibility(0);
        }
        if (this.section.equals("lic") || this.section.equals("cashdeposit")) {
            binding2.historyClick.setVisibility(8);
        } else {
            binding2.historyClick.setVisibility(0);
        }
    }

    public void onRefundClick(RegularHistoryResponse.EveryDayData history) {
        if (this.section.equals("creditcard")) {
            this.viewModel.mobileRechargesRepository.creditCardRefundSystem(this, history.getReference());
        }
    }

    public void bringTheHistoryAgain() {
        this.viewModel.mobileRechargesRepository.bringUsualFastAgHistory(this, this, this.section);
    }
}
