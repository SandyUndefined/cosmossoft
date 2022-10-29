package com.sandy.cosmossoft.activities.bbps;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.databinding.ActivityBbpsEnterBinding;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.Objects;

public class BbpsEnter extends Hilt_BbpsEnter {
    ActivityBbpsEnterBinding binding;
    String logo;
    String opCode;
    String opName;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new BbpsEnter$$ExternalSyntheticLambda1(this));

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBbpsEnterBinding inflate = ActivityBbpsEnterBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) MobileRechargeViewModel.service);
        MobileRechargeViewModel viewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.binding.setDirectToHomeViewModel(viewModel);
        this.opName = getIntent().getStringExtra("name");
        this.opCode = getIntent().getStringExtra("operatorCode");
        this.logo = getIntent().getStringExtra("logo");
        viewModel.serviceType = getIntent().getStringExtra("serviceType");
        viewModel.longCode = this.opCode;
        viewModel.operator = this.opName;
        viewModel.logo = this.logo;
        setListeners();
        ViewUtils.setFocusable(this.binding.customerId, this);
        setFragment(new SliderFragment(), this.binding.selectNumberSliders);
    }

    public void setFragment(Fragment fragment, View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(view.getId(), fragment);
        fragmentTransaction.commit();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void setListeners() {
        this.binding.getTheContacts.setOnClickListener(new BbpsEnter$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-bbps-BbpsEnter */
    public /* synthetic */ void mo1032xf3c2c088(View v) {
        this.someActivityResultLauncher.launch(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI));
    }

    /* renamed from: lambda$new$1$com-sandy-cosmossoft-activities-bbps-BbpsEnter  reason: not valid java name */
    public /* synthetic */ void m1076lambda$new$1$comsandycosmossoftactivitiesbbpsBbpsEnter(ActivityResult result) {
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
                this.binding.customerId.setText(String.valueOf(builder));
            }
            Objects.requireNonNull(cursor);
            cursor.close();
        }
    }
}
