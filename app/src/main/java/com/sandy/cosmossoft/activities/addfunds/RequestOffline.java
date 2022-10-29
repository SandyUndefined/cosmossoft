package com.sandy.cosmossoft.activities.addfunds;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.databinding.ActivityRequestOfflineBinding;
import com.sandy.cosmossoft.encoder.Base64Encoder;
import com.sandy.cosmossoft.listeners.ChangerListener;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import java.io.FileNotFoundException;
import java.util.Objects;
import kotlin.Unit;

public class RequestOffline extends Hilt_RequestOffline implements ChangerListener {
    ActivityRequestOfflineBinding binding;
    ActivityResultLauncher<Intent> receiptResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new RequestOffline$$ExternalSyntheticLambda1(this));
    FundViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRequestOfflineBinding inflate = ActivityRequestOfflineBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setTitle((CharSequence) "Request Offline");
        ActionBar supportActionBar2 = getSupportActionBar();
        Objects.requireNonNull(supportActionBar2);
        ActionBar actionBar2 = supportActionBar2;
        supportActionBar2.setDisplayHomeAsUpEnabled(true);
        FundViewModel fundViewModel = (FundViewModel) new ViewModelProvider(this).get(FundViewModel.class);
        this.viewModel = fundViewModel;
        this.binding.setFundViewModel(fundViewModel);
        this.viewModel.listener = this;
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

    private void setListeners() {
        this.binding.selectReceipt.setOnClickListener(new RequestOffline$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setListeners$1$com-sandy-cosmossoft-activities-addfunds-RequestOffline */
    public /* synthetic */ void mo1024x5eb09696(View view) {
        ImagePicker.with((Activity) this).crop().compress(1024).maxResultSize(1080, 1080).createIntent(new RequestOffline$$ExternalSyntheticLambda2(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-addfunds-RequestOffline */
    public /* synthetic */ Unit mo1023x58accb37(Intent intent) {
        this.receiptResult.launch(intent);
        return null;
    }

    private void setMyDrawables() {
        this.binding.selectReceipt.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_baseline_image_24, 0, 0, 0);
        this.binding.selectReceipt.setCompoundDrawablePadding(20);
    }

    /* renamed from: lambda$new$2$com-sandy-cosmossoft-activities-addfunds-RequestOffline */
    public /* synthetic */ void mo1022xa017d50c(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Intent intent = data;
            try {
                this.viewModel.receiptImageEncoded = Base64Encoder.encodeImage(BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData())));
                this.binding.selectReceipt.setText("Receipt Selected");
                this.binding.selectReceipt.setTextColor(Color.parseColor("#008000"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void changeData(String value) {
        this.binding.transactionType.setText(value);
    }

    public void eraseAll() {
        this.binding.selectReceipt.setText("");
        this.binding.transactionType.setText("");
        this.binding.amount.setText("");
        this.binding.remarks.setText("");
        this.binding.transactionID.setText("");
    }
}
