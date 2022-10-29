package com.sandy.cosmossoft.activities.rechargeactivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.sandy.cosmossoft.adapters.ROfferAdapter;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoResponse;
import com.sandy.cosmossoft.data.network.responses.MyOfferResponse;
import com.sandy.cosmossoft.data.network.responses.ROfferModel;
import com.sandy.cosmossoft.databinding.ActivityRofferBinding;
import com.sandy.cosmossoft.listeners.ROfferListener;
import com.sandy.cosmossoft.listeners.RegularClick;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.List;
import java.util.Objects;

public class ROffer extends Hilt_ROffer implements ROfferListener, RegularClick {
    ActionBar actionBar;
    ROfferAdapter adapter;
    ActivityRofferBinding binding;
    MobileRechargeViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRofferBinding inflate = ActivityRofferBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar2 = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        this.actionBar = supportActionBar2;
        supportActionBar2.setTitle((CharSequence) "R Offer");
        MobileRechargeViewModel mobileRechargeViewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.viewModel = mobileRechargeViewModel;
        this.binding.setROfferViewModel(mobileRechargeViewModel);
        Bundle bundle = getIntent().getExtras();
        bringROffer(bundle.getString("op"), bundle.getString("num"), bundle.getString("type"));
        searchAble();
    }

    private void bringROffer(String op, String num, String type) {
        if (type.equals("mobile_r")) {
            this.viewModel.mobileRechargesRepository.getMeMyROffer(op, num, this, type);
        } else if (type.equals("dth_rOffer")) {
            this.viewModel.mobileRechargesRepository.getMeMyDthROffer(op, num, this, type);
        }
    }

    public void onStartLooking() {
        MyAlertUtils.showProgressAlertDialog(this);
    }

    public void getMeROffer(MyOfferResponse response) {
        if (response == null) {
            return;
        }
        if (response.getCode() != 0) {
            MyAlertUtils.dismissAlertDialog();
            setAdapter(response.getOffers());
            return;
        }
        MyAlertUtils.showServerAlertDialog(this, response.getMessage());
    }

    public void onCausedError(String message) {
        MyAlertUtils.showServerAlertDialog(this, message);
    }

    public void onCustomerInfo(CustomerInfoResponse customerInfoResponse) {
    }

    public void searchAble() {
        this.binding.planSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                ROffer.this.adapter.getFilter().filter(query);
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                ROffer.this.adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    private void setAdapter(List<ROfferModel> list) {
        this.adapter = new ROfferAdapter(list, this);
        this.binding.allContactsRecycler.setLayoutManager(new GridLayoutManager((Context) this, 1, 1, false));
        this.binding.allContactsRecycler.setAdapter(this.adapter);
    }

    public void onClickItem(View view, String data) {
        Intent intentData = new Intent();
        intentData.putExtra("Price", data);
        setResult(-1, intentData);
        finish();
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }
}
