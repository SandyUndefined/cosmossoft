package com.sandy.cosmossoft.activities.tobank;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityAddBeneficiaryBinding;
import com.sandy.cosmossoft.listeners.RemitterListener;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.Objects;

public class AddBeneficiary extends Hilt_AddBeneficiary implements RemitterListener {
    ActivityAddBeneficiaryBinding binding;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new AddBeneficiary$$ExternalSyntheticLambda1(this));

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAddBeneficiaryBinding inflate = ActivityAddBeneficiaryBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Add Bank Account");
        ToBankViewModel viewModel = (ToBankViewModel) new ViewModelProvider(this).get(ToBankViewModel.class);
        this.binding.setBeneficiaryViewModel(viewModel);
        viewModel.remitterListener = this;
        setListener();
        watcher();
        ViewUtils.setFocusable(this.binding.accountNumber, this);
    }

    public void setListener() {
        this.binding.getTheContacts.setOnClickListener(new AddBeneficiary$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setListener$0$com-sandy-cosmossoft-activities-tobank-AddBeneficiary */
    public /* synthetic */ void mo3xf50bdd7e(View v) {
        this.someActivityResultLauncher.launch(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    /* renamed from: lambda$new$1$com-sandy-cosmossoft-activities-tobank-AddBeneficiary */
    public /* synthetic */ void mo2x22b2f0f3(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, new String[]{"data1"}, (String) null, (String[]) null, (String) null);
            if (cursor != null && cursor.moveToFirst()) {
                StringBuilder builder = new StringBuilder(cursor.getString(cursor.getColumnIndex("data1")).replaceAll("[^\\w]", ""));
                if (builder.charAt(0) == '9' && builder.charAt(1) == '1') {
                    builder.deleteCharAt(0);
                    builder.deleteCharAt(0);
                }
                this.binding.phoneNumber.setText(String.valueOf(builder));
            }
            Objects.requireNonNull(cursor);
            cursor.close();
        }
    }

    private void watcher() {
        this.binding.confirmAccountNumber.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Editable text = AddBeneficiary.this.binding.confirmAccountNumber.getText();
                Objects.requireNonNull(text);
                Editable editable = text;
                String obj = text.toString();
                Editable text2 = AddBeneficiary.this.binding.accountNumber.getText();
                Objects.requireNonNull(text2);
                Editable editable2 = text2;
                if (!obj.equals(text2.toString())) {
                    AddBeneficiary.this.binding.confirmAccountNumber.setError("Account Numbers don't match");
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void afterTextChanged(Editable s) {
            }
        });
    }

    public void dateSetter(String date) {
        this.binding.beneDob.setText(date);
    }
}
