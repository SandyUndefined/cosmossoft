package com.sandy.cosmossoft.activities.profile;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivitySettingsBinding;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import java.util.Objects;

public class Settings extends Hilt_Settings {
    ActivitySettingsBinding binding;
    ProfileViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySettingsBinding inflate = ActivitySettingsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setTitle((CharSequence) "Settings");
        ActionBar supportActionBar2 = getSupportActionBar();
        Objects.requireNonNull(supportActionBar2);
        ActionBar actionBar2 = supportActionBar2;
        supportActionBar2.setDisplayHomeAsUpEnabled(true);
        ProfileViewModel profileViewModel = (ProfileViewModel) new ViewModelProvider(this).get(ProfileViewModel.class);
        this.viewModel = profileViewModel;
        this.binding.setProfileViewModel(profileViewModel);
        AppDatabase.getAppDatabase(this).getUserDao().getUser().observe(this, new Settings$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-profile-Settings */
    public /* synthetic */ void mo48260x486f71c2(User user) {
        if (user != null) {
            this.binding.setUserModel(user);
        }
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
