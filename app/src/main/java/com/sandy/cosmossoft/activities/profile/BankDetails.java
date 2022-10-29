package com.sandy.cosmossoft.activities.profile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.databinding.ActivityBankDetailsBinding;
import com.sandy.cosmossoft.encoder.Base64Encoder;
import com.sandy.cosmossoft.viewmodel.ProfileViewModel;
import java.io.FileNotFoundException;
import java.util.Objects;
import kotlin.Unit;

public class BankDetails extends Hilt_BankDetails {
    ActivityResultLauncher<Intent> aadhaarCardResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BankDetails$$ExternalSyntheticLambda4(this));
    ActivityBankDetailsBinding binding;
    ActivityResultLauncher<Intent> panCardResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BankDetails$$ExternalSyntheticLambda3(this));
    ActivityResultLauncher<Intent> passbookResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BankDetails$$ExternalSyntheticLambda5(this));
    ProfileViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBankDetailsBinding inflate = ActivityBankDetailsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setTitle((CharSequence) "Bank Details");
        ActionBar supportActionBar2 = getSupportActionBar();
        Objects.requireNonNull(supportActionBar2);
        ActionBar actionBar2 = supportActionBar2;
        supportActionBar2.setDisplayHomeAsUpEnabled(true);
        ProfileViewModel profileViewModel = (ProfileViewModel) new ViewModelProvider(this).get(ProfileViewModel.class);
        this.viewModel = profileViewModel;
        this.binding.setBankDetailsViewModel(profileViewModel);
        AppDatabase.getAppDatabase(this).getUserProfileDao().getUserProfile().observe(this, new BankDetails$$ExternalSyntheticLambda6(this));
        setMyDrawables();
        setListeners();
    }

    /* renamed from: lambda$onCreate$0$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48227xd81aba67(UserProfile userProfile) {
        if (userProfile != null) {
            this.binding.setUserProfileModel(userProfile);
            this.viewModel.userProfile = userProfile;
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

    /* renamed from: lambda$new$1$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48224xc2d0a45b(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectPan.setText("Pan Card Selected");
                this.binding.selectAadhar.setTextColor(Color.parseColor("#008000"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }

    /* renamed from: lambda$new$2$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48225xc406f73a(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectAadhar.setText("Aadhar Card Selected");
                this.binding.selectAadhar.setTextColor(Color.parseColor("#008000"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }

    /* renamed from: lambda$new$3$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48226xc53d4a19(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectPassbook.setText("Passbook Selected");
                this.binding.selectPassbook.setTextColor(Color.parseColor("#008000"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }

    private void setListeners() {
        this.binding.selectAadhar.setOnClickListener(new BankDetails$$ExternalSyntheticLambda0(this));
        this.binding.selectPan.setOnClickListener(new BankDetails$$ExternalSyntheticLambda1(this));
        this.binding.selectPassbook.setOnClickListener(new BankDetails$$ExternalSyntheticLambda2(this));
    }

    /* renamed from: lambda$setListeners$5$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48229xff5b5940(View view) {
        ImagePicker.with((Activity) this).crop().compress(1024).maxResultSize(1080, 1080).createIntent(new BankDetails$$ExternalSyntheticLambda7(this));
    }

    /* renamed from: lambda$setListeners$4$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ Unit mo48228xfe250661(Intent intent) {
        this.aadhaarCardResultLauncher.launch(intent);
        return null;
    }

    /* renamed from: lambda$setListeners$7$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48231x1c7fefe(View view) {
        ImagePicker.with((Activity) this).crop().compress(1024).maxResultSize(1080, 1080).createIntent(new BankDetails$$ExternalSyntheticLambda8(this));
    }

    /* renamed from: lambda$setListeners$6$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ Unit mo48230x91ac1f(Intent intent) {
        this.panCardResultLauncher.launch(intent);
        return null;
    }

    /* renamed from: lambda$setListeners$9$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ void mo48233x434a4bc(View view) {
        ImagePicker.with((Activity) this).crop().compress(1024).maxResultSize(1080, 1080).createIntent(new BankDetails$$ExternalSyntheticLambda9(this));
    }

    /* renamed from: lambda$setListeners$8$com-sandy-cosmossoft-activities-profile-BankDetails */
    public /* synthetic */ Unit mo48232x2fe51dd(Intent intent) {
        this.passbookResultLauncher.launch(intent);
        return null;
    }

    private void setMyDrawables() {
        this.binding.selectAadhar.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectAadhar.setCompoundDrawablePadding(20);
        this.binding.selectPan.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectPan.setCompoundDrawablePadding(20);
        this.binding.selectPassbook.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectPassbook.setCompoundDrawablePadding(20);
    }
}
