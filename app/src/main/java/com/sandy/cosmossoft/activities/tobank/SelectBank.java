package com.sandy.cosmossoft.activities.tobank;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.adapters.BanksAdapter;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.databinding.ActivitySelectBankBinding;
import com.sandy.cosmossoft.listeners.BanksListener;
import com.sandy.cosmossoft.listeners.ToBankListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.ArrayList;
import java.util.Objects;

public class SelectBank extends Hilt_SelectBank implements BanksListener, ToBankListener {
    BanksAdapter adapter;
    ActivitySelectBankBinding binding;
    ProgressDialog dialog;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySelectBankBinding inflate = ActivitySelectBankBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Select Bank");
        ToBankViewModel viewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.binding.setHomeViewModel(viewModel);
        viewModel.listener = this;
        viewModel.getBankListsOnline();
    }

    public void selectedBanks(View view, BankModel model) {
        Intent intent = new Intent(this, AddBeneficiary.class);
        ToBankViewModel.selectedBank = model;
        startActivity(intent);
    }

    public void onStarted(String message) {
        if (this.dialog == null) {
            this.dialog = new ProgressDialog(this);
        }
        this.dialog.setTitle(message);
        this.dialog.show();
    }

    public void onCompleted(String message) {
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public void onError(String message) {
        ViewUtils.showToast(this, message);
    }

    public void setAllBanks(ArrayList<BankModel> list) {
        this.adapter = new BanksAdapter(list, this);
        this.binding.banksRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.binding.banksRecycler.setAdapter(this.adapter);
        searchAble();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void searchAble() {
        this.binding.searchMyBanks.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                SelectBank.this.adapter.getFilter().filter(query);
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                SelectBank.this.adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
