package com.sandy.cosmossoft.activities.profile;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.databinding.ActivitySocialMediaBinding;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import java.util.Objects;

public class SocialMedia extends Hilt_SocialMedia {
    ActivitySocialMediaBinding binding;
    ProfileViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySocialMediaBinding inflate = ActivitySocialMediaBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setTitle((CharSequence) "Social Media");
        ActionBar supportActionBar2 = getSupportActionBar();
        Objects.requireNonNull(supportActionBar2);
        ActionBar actionBar2 = supportActionBar2;
        supportActionBar2.setDisplayHomeAsUpEnabled(true);
        ProfileViewModel profileViewModel = (ProfileViewModel) new ViewModelProvider(this).get(ProfileViewModel.class);
        this.viewModel = profileViewModel;
        this.binding.setProfileViewModel(profileViewModel);
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
        AppDatabase.getAppDatabase(this).getUserProfileDao().getUserProfile().observe(this, new SocialMedia$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setElements$0$com-sandy-cosmossoft-activities-profile-SocialMedia */
    public /* synthetic */ void mo48262x7a5184d4(UserProfile userProfile) {
        if (userProfile != null) {
            this.binding.setUserProfileModel(userProfile);
            this.viewModel.userProfile = userProfile;
        }
    }
}
