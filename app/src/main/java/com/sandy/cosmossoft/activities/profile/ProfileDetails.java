package com.sandy.cosmossoft.activities.profile;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.databinding.ActivityProfileDetailsBinding;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import java.util.Locale;
import java.util.Objects;

public class ProfileDetails extends Hilt_ProfileDetails {
    ActivityProfileDetailsBinding binding;
    ProfileViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProfileDetailsBinding inflate = ActivityProfileDetailsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setTitle((CharSequence) "Profile Details");
        ActionBar supportActionBar2 = getSupportActionBar();
        Objects.requireNonNull(supportActionBar2);
        ActionBar actionBar2 = supportActionBar2;
        supportActionBar2.setDisplayHomeAsUpEnabled(true);
        ProfileViewModel profileViewModel = (ProfileViewModel) new ViewModelProvider(this).get(ProfileViewModel.class);
        this.viewModel = profileViewModel;
        this.binding.setProfileDetailsModel(profileViewModel);
        setElements();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    private void setElements() {
        AppDatabase appDatabase = AppDatabase.getAppDatabase(this);
        appDatabase.getUserProfileDao().getUserProfile().observe(this, new ProfileDetails$$ExternalSyntheticLambda1(this));
        appDatabase.getUserDao().getUser().observe(this, new ProfileDetails$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setElements$0$com-sandy-cosmossoft-activities-profile-ProfileDetails */
    public /* synthetic */ void mo48257xa81146dc(UserProfile userProfile) {
        if (userProfile != null) {
            this.binding.setUserProfileModel(userProfile);
            this.viewModel.userProfile = userProfile;
            if (userProfile.GENDER == null) {
                return;
            }
            if (userProfile.GENDER.toLowerCase(Locale.ROOT).equals("male")) {
                this.binding.genderRadio.check(C0330R.C0333id.male);
                userProfile.GENDER = "Male";
            } else if (userProfile.GENDER.toLowerCase(Locale.ROOT).equals("female")) {
                this.binding.genderRadio.check(C0330R.C0333id.fe_male);
                userProfile.GENDER = "Female";
            } else {
                this.binding.genderRadio.check(C0330R.C0333id.others);
                userProfile.GENDER = "Others";
            }
        }
    }

    /* renamed from: lambda$setElements$1$com-sandy-cosmossoft-activities-profile-ProfileDetails */
    public /* synthetic */ void mo48258xb8c7139d(User user) {
        if (user != null) {
            this.binding.setUserModel(user);
            this.viewModel.user = user;
        }
    }
}
