package com.sandy.cosmossoft.activities.payoutpaysprint;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.databinding.ActivityVerifyAccountsBinding;
import com.sandy.cosmossoft.encoder.Base64Encoder;
import com.sandy.cosmossoft.viewmodel.PayoutViewModel;
import java.io.FileNotFoundException;
import java.util.Objects;
import kotlin.Unit;

public class VerifyAccounts extends Hilt_VerifyAccounts {
    ActivityResultLauncher<Intent> backAadhaarResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new VerifyAccounts$$ExternalSyntheticLambda10(this));
    ActivityVerifyAccountsBinding binding;
    ActivityResultLauncher<Intent> frontAadhaarResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new VerifyAccounts$$ExternalSyntheticLambda9(this));
    ActivityResultLauncher<Intent> panCardResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new VerifyAccounts$$ExternalSyntheticLambda11(this));
    ActivityResultLauncher<Intent> passbookResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new VerifyAccounts$$ExternalSyntheticLambda8(this));
    PayoutViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityVerifyAccountsBinding inflate = ActivityVerifyAccountsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Verify Accounts");
        PayoutViewModel payoutViewModel = (PayoutViewModel) new ViewModelProvider(this).get(PayoutViewModel.class);
        this.viewModel = payoutViewModel;
        this.binding.setPayoutViewModel(payoutViewModel);
        this.viewModel.bene_id = getIntent().getStringExtra("bene_id");
        this.viewModel.account_no = getIntent().getStringExtra("account_no");
        startConditionals();
        setMyDrawables();
        setListeners();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    private void startConditionals() {
        this.binding.docSelection.setOnCheckedChangeListener(new VerifyAccounts$$ExternalSyntheticLambda7(this));
    }

    /* renamed from: lambda$startConditionals$0$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1097x1a2009e5(RadioGroup group, int checkedId) {
        if (checkedId == C0330R.C0333id.pan) {
            this.binding.panSectionLayout.setVisibility(0);
            this.binding.aadhaarSectionLayout.setVisibility(8);
            this.viewModel.doc_type = "PAN";
            return;
        }
        this.binding.panSectionLayout.setVisibility(8);
        this.binding.aadhaarSectionLayout.setVisibility(0);
        this.viewModel.doc_type = "AADHAAR";
    }

    private void setMyDrawables() {
        this.binding.selectFrontAadhaar.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectFrontAadhaar.setCompoundDrawablePadding(20);
        this.binding.selectBackAadhaar.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectBackAadhaar.setCompoundDrawablePadding(20);
        this.binding.selectPan.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectPan.setCompoundDrawablePadding(20);
        this.binding.selectPassbook.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectPassbook.setCompoundDrawablePadding(20);
    }

    private void setListeners() {
        this.binding.selectFrontAadhaar.setOnClickListener(new VerifyAccounts$$ExternalSyntheticLambda0(this));
        this.binding.selectBackAadhaar.setOnClickListener(new VerifyAccounts$$ExternalSyntheticLambda4(this));
        this.binding.selectPan.setOnClickListener(new VerifyAccounts$$ExternalSyntheticLambda5(this));
        this.binding.selectPassbook.setOnClickListener(new VerifyAccounts$$ExternalSyntheticLambda6(this));
    }

    /* renamed from: lambda$setListeners$2$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1090x36fdfe8f(View view) {
        ImagePicker.with((Activity) this).crop().compress(256).maxResultSize(480, 480).createIntent(new VerifyAccounts$$ExternalSyntheticLambda12(this));
    }

    /* renamed from: lambda$setListeners$1$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ Unit mo1089x5b3c82ce(Intent intent) {
        this.frontAadhaarResultLauncher.launch(intent);
        return null;
    }

    /* renamed from: lambda$setListeners$4$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1092xee80f611(View view) {
        ImagePicker.with((Activity) this).crop().compress(256).maxResultSize(480, 480).createIntent(new VerifyAccounts$$ExternalSyntheticLambda1(this));
    }

    /* renamed from: lambda$setListeners$3$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ Unit mo1091x12bf7a50(Intent intent) {
        this.backAadhaarResultLauncher.launch(intent);
        return null;
    }

    /* renamed from: lambda$setListeners$6$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1094xa603ed93(View view) {
        ImagePicker.with((Activity) this).crop().compress(256).maxResultSize(480, 480).createIntent(new VerifyAccounts$$ExternalSyntheticLambda2(this));
    }

    /* renamed from: lambda$setListeners$5$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ Unit mo1093xca4271d2(Intent intent) {
        this.panCardResultLauncher.launch(intent);
        return null;
    }

    /* renamed from: lambda$setListeners$8$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1096x5d86e515(View view) {
        ImagePicker.with((Activity) this).crop().compress(256).maxResultSize(480, 480).createIntent(new VerifyAccounts$$ExternalSyntheticLambda3(this));
    }

    /* renamed from: lambda$setListeners$7$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ Unit mo1095x81c56954(Intent intent) {
        this.passbookResultLauncher.launch(intent);
        return null;
    }

    /* renamed from: lambda$new$9$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1088x74e895df(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectPan.setText("Pan Card Selected");
                this.binding.selectPan.setTextColor(Color.parseColor("#008000"));
                this.viewModel.panCardEncodedImage = encodedImage;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }

    /* renamed from: lambda$new$10$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1085xeb2897e7(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectPassbook.setText("Passbook Selected");
                this.binding.selectPassbook.setTextColor(Color.parseColor("#008000"));
                this.viewModel.passbookEncodedImage = encodedImage;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }

    /* renamed from: lambda$new$11$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1086xc6ea13a8(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectFrontAadhaar.setText("Front Aadhaar Selected");
                this.binding.selectFrontAadhaar.setTextColor(Color.parseColor("#008000"));
                this.viewModel.frontAadhaarEncodedImage = encodedImage;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }

    /* renamed from: lambda$new$12$com-sandy-cosmossoft-activities-payoutpaysprint-VerifyAccounts */
    public /* synthetic */ void mo1087xa2ab8f69(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            String encodedImage = null;
            try {
                encodedImage = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectBackAadhaar.setText("Back Aadhaar Selected");
                this.binding.selectBackAadhaar.setTextColor(Color.parseColor("#008000"));
                this.viewModel.backAadhaarEncodedImage = encodedImage;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Log.d("ImageEncoded", encodedImage);
        }
    }
}
