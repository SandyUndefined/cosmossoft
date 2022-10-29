package com.sandy.cosmossoft.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.profile.ProfileActivity;
import com.sandy.cosmossoft.data.network.responses.PaySprintMerchant;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.databinding.ActivityHomeBinding;
import com.sandy.cosmossoft.fragments.AnalyticFragment;
import com.sandy.cosmossoft.fragments.screenmenus.HomeMenuFragments;
import com.sandy.cosmossoft.util.BindingUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.HomeViewModel;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends Hilt_HomeActivity {
    public static PaySprintMerchant merchant = null;
    public final int STORAGE_PERMISSION = 786;
    boolean exit = false;
    private ActivityHomeBinding homeBinding;
    HomeMenuFragments homeMenuFragments;
    HomeViewModel homeViewModel;
    private long mLastClickTime = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding inflate = ActivityHomeBinding.inflate(getLayoutInflater());
        this.homeBinding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.hide();
        HomeViewModel homeViewModel2 = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        this.homeViewModel = homeViewModel2;
        this.homeBinding.setHomeViewModel(homeViewModel2);
        HomeMenuFragments homeMenuFragments2 = new HomeMenuFragments();
        this.homeMenuFragments = homeMenuFragments2;
        setFragment(homeMenuFragments2, this.homeBinding.HomeMenuFragment);
        setNavigationClick();
        checkPermission();
        this.homeViewModel.getSignedInUser().observe(this, new HomeActivity$$ExternalSyntheticLambda2(this));
        this.homeViewModel.homeRepository.getUserProfileLiveData().observe(this, new HomeActivity$$ExternalSyntheticLambda3(this));
        this.homeBinding.toolbar.userFirstName.setOnClickListener(new HomeActivity$$ExternalSyntheticLambda0(this));
        this.homeBinding.toolbar.toolbarLogoImage.setOnClickListener(new HomeActivity$$ExternalSyntheticLambda1(this));
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-HomeActivity */
    public /* synthetic */ void mo47856xf04c0089(User user) {
        if (user != null) {
            TextView aepsBalance = this.homeMenuFragments.getAepsBalance();
            aepsBalance.setText("AEPS : " + user.getAepsbalance());
            TextView mainBalance = this.homeMenuFragments.getMainBalance();
            mainBalance.setText("Main : " + user.getMainbalance());
            HomeViewModel.aepsBalance = "AEPS : " + user.getAepsbalance();
            HomeViewModel.mainBalance = "Main : " + user.getMainbalance();
            TextView textView = this.homeBinding.toolbar.userFirstName;
            textView.setText("Hello, " + user.getName());
        }
    }

    /* renamed from: lambda$onCreate$1$com-sandy-cosmossoft-activities-HomeActivity */
    public /* synthetic */ void mo47857xefd59a8a(UserProfile userProfile) {
        if (userProfile != null && userProfile.PROFILE_IMG != null && !userProfile.PROFILE_IMG.isEmpty()) {
            BindingUtils.loadProfileUrlImage(this.homeBinding.toolbar.toolbarLogoImage, userProfile.PROFILE_IMG);
        }
    }

    /* renamed from: lambda$onCreate$2$com-sandy-cosmossoft-activities-HomeActivity */
    public /* synthetic */ void mo47858xef5f348b(View v) {
        startActivity(new Intent(this, ProfileActivity.class));
    }

    /* renamed from: lambda$onCreate$3$com-sandy-cosmossoft-activities-HomeActivity */
    public /* synthetic */ void mo47859xeee8ce8c(View v) {
        startActivity(new Intent(this, ProfileActivity.class));
    }

    public void setFragment(Fragment fragment, View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(view.getId(), fragment);
        fragmentTransaction.commit();
    }

    private void setNavigationClick() {
        this.homeBinding.bottomNavigation.setOnItemSelectedListener(new HomeActivity$$ExternalSyntheticLambda4(this));
    }

    /* renamed from: lambda$setNavigationClick$4$com-sandy-cosmossoft-activities-HomeActivity */
    public /* synthetic */ boolean mo47860xbaddd7e4(MenuItem item) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime < 500) {
            return false;
        }
        switch (item.getItemId()) {
            case C0330R.C0333id.navAccount:
                startActivity(new Intent(this, ProfileActivity.class));
                item.setCheckable(false);
                break;
            case C0330R.C0333id.navHistory:
                setFragment(new AnalyticFragment(), this.homeBinding.HomeMenuFragment);
                break;
            case C0330R.C0333id.navHome:
                setFragment(this.homeMenuFragments, this.homeBinding.HomeMenuFragment);
                break;
            default:
                ViewUtils.showToast(this, "Invalid choice");
                break;
        }
        this.mLastClickTime = SystemClock.elapsedRealtime();
        return true;
    }

    private void checkPermission() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") != 0 || ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0 || ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_CONTACTS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 786);
        }
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != 786 || grantResults.length <= 0 || grantResults[0] != 0 || grantResults[1] != 0 || grantResults[2] != 0) {
            ViewUtils.showToast(this, "Permissions denied, Please allow to use crucial facilities.");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        HomeViewModel homeViewModel2 = this.homeViewModel;
        if (homeViewModel2 != null) {
            homeViewModel2.homeRepository.reAuthenticateTheUser(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        HomeViewModel homeViewModel2 = this.homeViewModel;
        if (homeViewModel2 != null) {
            homeViewModel2.homeRepository.reAuthenticateTheUser(this);
        }
    }

    public void onBackPressed() {
        if (this.exit) {
            finish();
        } else {
            ViewUtils.showToast(this, "Press Again to exit");
        }
        new Timer().schedule(new TimerTask() {
            public void run() {
                HomeActivity.this.exit = false;
            }
        }, 2000);
        this.exit = true;
    }
}
