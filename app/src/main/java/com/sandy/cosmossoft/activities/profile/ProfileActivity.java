package com.sandy.cosmossoft.activities.profile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.Glide;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.ProfileListAdapter;
import com.sandy.cosmossoft.data.model.ProfileListModel;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.databinding.ActivityProfileBinding;
import com.sandy.cosmossoft.listeners.ProfileListListener;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;

public class ProfileActivity extends Hilt_ProfileActivity implements ProfileListListener {
    public static final int PICK_PROFILE_PIC = 2021;
    ActivityProfileBinding binding;
    String encodedImage;
    ProfileViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProfileBinding inflate = ActivityProfileBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.hide();
        ProfileViewModel profileViewModel = (ProfileViewModel) new ViewModelProvider(this).get(ProfileViewModel.class);
        this.viewModel = profileViewModel;
        this.binding.setProfileViewModel(profileViewModel);
        this.binding.toolbar.titleText.setText(getResources().getString(C0330R.string.profile_title));
        this.binding.toolbar.back.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda0(this));
        setData();
        setLiveData();
        setElementsInList();
        this.binding.onChangePicture.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda1(this));
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-profile-ProfileActivity */
    public /* synthetic */ void mo48248x8671b159(View view) {
        onBackPressed();
    }

    /* renamed from: lambda$onCreate$2$com-sandy-cosmossoft-activities-profile-ProfileActivity */
    public /* synthetic */ void mo48250x92794817(View view) {
        ImagePicker.with((Activity) this).crop().compress(512).maxResultSize(1080, 1080).createIntent(new ProfileActivity$$ExternalSyntheticLambda4(this));
    }

    /* renamed from: lambda$onCreate$1$com-sandy-cosmossoft-activities-profile-ProfileActivity */
    public /* synthetic */ Unit mo48249x8c757cb8(Intent intent) {
        startActivityForResult(intent, PICK_PROFILE_PIC);
        return null;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    private void setElementsInList() {
        List<ProfileListModel> list = new ArrayList<>();
        list.add(new ProfileListModel(Integer.valueOf(C0330R.C0332drawable.ic_profile_socialmedia), "Social Media"));
        list.add(new ProfileListModel(Integer.valueOf(C0330R.C0332drawable.ic_profile_bank), "My Bank Details"));
        list.add(new ProfileListModel(Integer.valueOf(C0330R.C0332drawable.ic_profile_settings), "Settings"));
        list.add(new ProfileListModel(Integer.valueOf(C0330R.C0332drawable.ic_profile_logout), "Logout"));
        this.binding.listRecycler.setAdapter(new ProfileListAdapter(list, this));
    }

    private void setData() {
        this.viewModel.profileRepository.bringUser(this);
    }

    private void setLiveData() {
        AppDatabase appDatabase = AppDatabase.getAppDatabase(this);
        appDatabase.getUserDao().getUser().observe(this, new ProfileActivity$$ExternalSyntheticLambda2(this));
        appDatabase.getUserProfileDao().getUserProfile().observe(this, new ProfileActivity$$ExternalSyntheticLambda3(this));
    }

    /* renamed from: lambda$setLiveData$3$com-sandy-cosmossoft-activities-profile-ProfileActivity */
    public /* synthetic */ void mo48251xf877fe73(User user) {
        if (user != null) {
            this.binding.setNameNumber(user);
        }
    }

    /* renamed from: lambda$setLiveData$4$com-sandy-cosmossoft-activities-profile-ProfileActivity */
    public /* synthetic */ void mo48252xfe7bc9d2(UserProfile userProfile) {
        if (userProfile == null || userProfile.PROFILE_IMG == null) {
            this.binding.profileImage.setImageResource(C0330R.C0332drawable.ic_profile_user);
        } else if (userProfile.PROFILE_IMG.isEmpty()) {
            this.binding.profileImage.setImageResource(C0330R.C0332drawable.ic_profile_user);
        } else {
            Glide.with((FragmentActivity) this).load(userProfile.PROFILE_IMG).into((ImageView) this.binding.profileImage);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onListItemSelected(View r3, ProfileListModel r4) {
        /*
            r2 = this;
            java.lang.String r0 = r4.getTitle()
            int r1 = r0.hashCode()
            switch(r1) {
                case -2013462102: goto L_0x0034;
                case -1408723406: goto L_0x002a;
                case -1230276566: goto L_0x0020;
                case 1052047729: goto L_0x0016;
                case 1499275331: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r1 = "Settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r1 = "Social Media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 0
            goto L_0x003f
        L_0x0020:
            java.lang.String r1 = "Add User"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 3
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "My Bank Details"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "Logout"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000b
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0061;
                case 2: goto L_0x0056;
                case 3: goto L_0x004b;
                case 4: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0077
        L_0x0043:
            com.sandy.cosmossoft.viewmodel.ProfileViewModel r0 = r2.viewModel
            com.sandy.cosmossoft.data.repositories.ProfileRepository r0 = r0.profileRepository
            r0.deleteUser(r2)
            goto L_0x0077
        L_0x004b:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.creation.CreationActivity> r1 = com.sandy.cosmossoft.activities.creation.CreationActivity.class
            r0.<init>(r2, r1)
            r2.startActivity(r0)
            goto L_0x0077
        L_0x0056:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.profile.Settings> r1 = com.sandy.cosmossoft.activities.profile.Settings.class
            r0.<init>(r2, r1)
            r2.startActivity(r0)
            goto L_0x0077
        L_0x0061:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.profile.BankDetails> r1 = com.sandy.cosmossoft.activities.profile.BankDetails.class
            r0.<init>(r2, r1)
            r2.startActivity(r0)
            goto L_0x0077
        L_0x006c:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.sandy.cosmossoft.activities.profile.SocialMedia> r1 = com.sandy.cosmossoft.activities.profile.SocialMedia.class
            r0.<init>(r2, r1)
            r2.startActivity(r0)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandy.cosmossoft.activities.profile.ProfileActivity.onListItemSelected(android.view.View, com.sandy.cosmossoft.data.model.ProfileListModel):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2021 && data != null) {
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data.getData());
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                this.encodedImage = Base64.encodeToString(stream.toByteArray(), 0);
                this.viewModel.profileRepository.updateProfilePicture(this, this.encodedImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
