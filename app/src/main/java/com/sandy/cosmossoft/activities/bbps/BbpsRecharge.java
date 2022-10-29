package com.sandy.cosmossoft.activities.bbps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityBbpsRechargeBinding;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.PopupUtil;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.Objects;

public class BbpsRecharge extends Hilt_BbpsRecharge implements ResetListener {
    ActivityBbpsRechargeBinding binding;
    String logo;
    private long mLastClickTime = 0;
    String number;
    String opCode;
    String opName;
    MobileRechargeViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBbpsRechargeBinding inflate = ActivityBbpsRechargeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        MobileRechargeViewModel mobileRechargeViewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.viewModel = mobileRechargeViewModel;
        this.binding.setMyRechargeViewModelForBbps(mobileRechargeViewModel);
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.hide();
        try {
            this.opName = getIntent().getStringExtra("operatorName");
            this.opCode = getIntent().getStringExtra("operatorCode");
            this.logo = getIntent().getStringExtra("logo");
            this.number = getIntent().getStringExtra("number");
            this.viewModel.longCode = this.opCode;
            this.viewModel.operator = this.opName;
            this.viewModel.logo = this.logo;
            this.viewModel.number = this.number;
            this.viewModel.myFetchedBill = (FetchBillInfo) getIntent().getSerializableExtra("fetchBillResponse");
            this.binding.setFetchBillResponse(this.viewModel.myFetchedBill);
            User user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
            this.viewModel.userTypeId = user.getUserstatus();
            this.viewModel.userId = user.getId();
            setListeners();
        } catch (NullPointerException e) {
            ViewUtils.showToast(this, e.getMessage());
        }
        setFragment(new SliderFragment(), this.binding.slidersFragment);
    }

    public void setFragment(Fragment fragment, View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(view.getId(), fragment);
        fragmentTransaction.commit();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void setListeners() {
        this.binding.onBillPayButton.setOnClickListener(new BbpsRecharge$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-bbps-BbpsRecharge */
    public /* synthetic */ void mo1039x1fc26f7(View v) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (!this.binding.enterPlan.getText().toString().isEmpty()) {
                getCurrentLocation();
            } else {
                ViewUtils.showToast(this, "Enter a valid amount");
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void getCurrentLocation() {
        MyAlertUtils.showProgressAlertDialog(this);
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(300);
        locationRequest.setPriority(100);
        if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationServices.getFusedLocationProviderClient((Activity) this).requestLocationUpdates(locationRequest, new LocationCallback() {
                public void onLocationResult(LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    LocationServices.getFusedLocationProviderClient((Activity) BbpsRecharge.this).removeLocationUpdates((LocationCallback) this);
                    if (locationResult.getLocations().size() > 0) {
                        int latestLocationIndex = locationResult.getLocations().size() - 1;
                        BbpsRecharge.this.startService(String.valueOf(locationResult.getLocations().get(latestLocationIndex).getLongitude()), String.valueOf(locationResult.getLocations().get(latestLocationIndex).getLatitude()));
                        return;
                    }
                    ViewUtils.showToast(BbpsRecharge.this, "Location issue found..");
                }
            }, Looper.getMainLooper());
        } else {
            ViewUtils.showToast(this, "No Location Permission has given");
        }
    }

    /* access modifiers changed from: private */
    public void startService(String longitude, String latitude) {
        User user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
        if (PopupUtil.access) {
            this.viewModel.payMyBBPSBill(this, longitude, latitude, user.getUserstatus(), user.getId(), this);
            return;
        }
        PopupUtil.tPinSystem(this, this.viewModel.mobileRechargesRepository.apiServices);
    }

    public void resetRequiredData(boolean result) {
        this.binding.enterPlan.setText("");
    }
}
