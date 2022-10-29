package com.sandy.cosmossoft.activities;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.sandy.cosmossoft.databinding.ActivityMainBinding;
import com.sandy.cosmossoft.fragments.SignInFragment;
import java.util.Objects;

public class MainActivity extends Hilt_MainActivity {
    ActivityMainBinding activityMainBinding;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        this.activityMainBinding = inflate;
        setContentView(inflate.getRoot());
        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar);
        actionBar.hide();
        if (savedInstanceState == null) {
            setFragment(new SignInFragment());
        }
    }

    public void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(this.activityMainBinding.ScreenFrame.getId(), fragment);
        fragmentTransaction.commit();
    }

    public void onBackPressed() {
        setFragment(new SignInFragment());
    }
}
