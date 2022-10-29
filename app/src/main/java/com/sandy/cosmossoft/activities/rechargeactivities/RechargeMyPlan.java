package com.sandy.cosmossoft.activities.rechargeactivities;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoResponse;
import com.sandy.cosmossoft.data.network.responses.MyOfferResponse;
import com.sandy.cosmossoft.data.network.responses.PaymentResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityRechargeMyPlanBinding;
import com.sandy.cosmossoft.fragments.sliders.SliderFragment;
import com.sandy.cosmossoft.listeners.PaymentListener;
import com.sandy.cosmossoft.listeners.ROfferListener;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.util.BindingUtils;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.MobileRechargeViewModel;
import java.util.Objects;
import java.util.regex.Pattern;

public class RechargeMyPlan extends Hilt_RechargeMyPlan implements PaymentListener, ResetListener, ROfferListener {
    ActivityRechargeMyPlanBinding binding;
    InputFilter filter = RechargeMyPlan$$ExternalSyntheticLambda0.INSTANCE;
    ActivityResultLauncher<Intent> rOfferActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new RechargeMyPlan$$ExternalSyntheticLambda6(this));
    MobileRechargeViewModel rechargeViewModel;
    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new RechargeMyPlan$$ExternalSyntheticLambda5(this));

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRechargeMyPlanBinding inflate = ActivityRechargeMyPlanBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Select Plan");
        MobileRechargeViewModel mobileRechargeViewModel = (MobileRechargeViewModel) new ViewModelProvider(this).get(MobileRechargeViewModel.class);
        this.rechargeViewModel = mobileRechargeViewModel;
        this.binding.setRechargeViewModel(mobileRechargeViewModel);
        Bundle bundle = getIntent().getExtras();
        String opName = bundle.getString("name");
        String opCode = bundle.getString("operatorCode");
        BindingUtils.loadSvgUrl(this.binding.contactsImage, bundle.getString("logo"));
        this.rechargeViewModel.longCode = opCode;
        this.rechargeViewModel.operator = opName;
        this.rechargeViewModel.name = "";
        this.rechargeViewModel.number = "";
        this.rechargeViewModel.listener = this;
        this.rechargeViewModel.resetListener = this;
        User user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
        this.rechargeViewModel.userTypeId = user.getUserstatus();
        this.rechargeViewModel.userId = user.getId();
        setFragment(new SliderFragment(), this.binding.selectNumberSliders);
        setListeners();
        ViewUtils.setFocusable(this.binding.customerId, this);
        conditionals();
        rOffer();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void paymentResult(PaymentResponse paymentResponse) {
        if (paymentResponse.responsecode.equals(100)) {
            MyAlertUtils.showAlertDialog(this, "Success", paymentResponse.getMessage(), C0330R.C0332drawable.success);
            this.binding.customerPlan.setText("");
            this.binding.customerId.setText("");
            return;
        }
        MyAlertUtils.showAlertDialog(this, "Failed", paymentResponse.getMessage(), C0330R.C0332drawable.failed);
    }

    public void paymentMessage(String message) {
        ViewUtils.showToast(this, message);
    }

    public void errorResult(String error) {
        MyAlertUtils.showServerAlertDialog(this, error);
    }

    private void setFragment(Fragment fragment, View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(view.getId(), fragment);
        fragmentTransaction.commit();
    }

    public void setListeners() {
        this.binding.getTheContacts.setOnClickListener(new RechargeMyPlan$$ExternalSyntheticLambda4(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-rechargeactivities-RechargeMyPlan */
    public /* synthetic */ void mo48297x6052fd38(View v) {
        this.someActivityResultLauncher.launch(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI));
    }

    /* renamed from: lambda$new$1$com-sandy-cosmossoft-activities-rechargeactivities-RechargeMyPlan */
    public /* synthetic */ void mo48292x51af202e(ActivityResult result) {
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

    public void resetRequiredData(boolean result) {
        if (result) {
            this.binding.customerPlan.setText("");
            this.binding.customerId.setText("");
            this.rechargeViewModel.number = "";
            this.rechargeViewModel.plan = "";
        }
    }

    private void conditionals() {
        if (MobileRechargeViewModel.service != null && MobileRechargeViewModel.service.equals("DTH")) {
            this.binding.customerId.setFilters(new InputFilter[]{this.filter, new InputFilter.LengthFilter(12)});
        }
    }

    static /* synthetic */ CharSequence lambda$new$2(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        for (int i = start; i < end; i++) {
            if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(source.charAt(i))).matches()) {
                return "";
            }
        }
        return null;
    }

    private void rOffer() {
        if (MobileRechargeViewModel.service.equals("DTH")) {
            this.binding.browsePlan.setText("Customer Info.");
            this.binding.ROffer.setOnClickListener(new RechargeMyPlan$$ExternalSyntheticLambda1(this));
            this.binding.browsePlan.setOnClickListener(new RechargeMyPlan$$ExternalSyntheticLambda2(this));
            return;
        }
        this.binding.ROffer.setOnClickListener(new RechargeMyPlan$$ExternalSyntheticLambda3(this));
    }

    /* renamed from: lambda$rOffer$3$com-sandy-cosmossoft-activities-rechargeactivities-RechargeMyPlan */
    public /* synthetic */ void mo48294x451747a8(View v) {
        Editable text = this.binding.customerId.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            myWarnings("Provide Number");
            return;
        }
        Intent intent = new Intent(this, ROffer.class);
        intent.putExtra("op", this.rechargeViewModel.longCode);
        intent.putExtra("num", this.binding.customerId.getText().toString());
        intent.putExtra("type", "dth_rOffer");
        this.rOfferActivityResultLauncher.launch(intent);
    }

    /* renamed from: lambda$rOffer$4$com-sandy-cosmossoft-activities-rechargeactivities-RechargeMyPlan */
    public /* synthetic */ void mo48295x7df7a847(View v) {
        Editable text = this.binding.customerId.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            myWarnings("Provide Number");
        } else {
            this.rechargeViewModel.mobileRechargesRepository.getMeDthCustomer(this.rechargeViewModel.longCode, this.binding.customerId.getText().toString(), "dth_customer_info", this);
        }
    }

    /* renamed from: lambda$rOffer$5$com-sandy-cosmossoft-activities-rechargeactivities-RechargeMyPlan */
    public /* synthetic */ void mo48296xb6d808e6(View v) {
        Editable text = this.binding.customerId.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            myWarnings("Provide Number");
            return;
        }
        Intent intent = new Intent(this, ROffer.class);
        intent.putExtra("op", this.rechargeViewModel.longCode);
        intent.putExtra("num", this.binding.customerId.getText().toString());
        intent.putExtra("type", "mobile_r");
        this.rOfferActivityResultLauncher.launch(intent);
    }

    private void myWarnings(String message) {
        MyAlertUtils.showAlertDialog(this, "Warning", message, C0330R.C0332drawable.warning);
    }

    /* renamed from: lambda$new$6$com-sandy-cosmossoft-activities-rechargeactivities-RechargeMyPlan */
    public /* synthetic */ void mo48293x6e110349(ActivityResult result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Objects.requireNonNull(data);
            this.binding.customerPlan.setText(data.getExtras().getString("Price"));
        }
    }

    public void onStartLooking() {
        MyAlertUtils.showProgressAlertDialog(this);
    }

    public void getMeROffer(MyOfferResponse response) {
    }

    public void onCausedError(String message) {
        MyAlertUtils.showServerAlertDialog(this, message);
    }

    public void onCustomerInfo(CustomerInfoResponse response) {
        if (response.getCode() == 1) {
            MyAlertUtils.dismissAlertDialog();
            Intent intent = new Intent(this, CustomerInfoActivity.class);
            intent.putExtra("infoDetails", response.getoffers().get(0));
            this.rOfferActivityResultLauncher.launch(intent);
            return;
        }
        MyAlertUtils.showServerAlertDialog(this, "Failed due to API Issue");
    }
}
