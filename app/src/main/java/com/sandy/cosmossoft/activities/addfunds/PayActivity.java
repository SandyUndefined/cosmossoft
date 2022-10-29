package com.sandy.cosmossoft.activities.addfunds;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.itextpdf.text.xml.xmp.DublinCoreProperties;
import com.paytm.pgsdk.Constants;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.RazorpayData;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityPayBinding;
import com.sandy.cosmossoft.listeners.RazorPayListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class PayActivity extends Hilt_PayActivity implements PaymentResultListener, RazorPayListener {
    ActivityPayBinding binding;
    String description = "Failed";
    User user;
    FundViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPayBinding inflate = ActivityPayBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Desired Amount");
        FundViewModel fundViewModel = (FundViewModel) new ViewModelProvider(this).get(FundViewModel.class);
        this.viewModel = fundViewModel;
        this.binding.setFundViewModel(fundViewModel);
        this.binding.amountbalance.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_rupee, 0, 0, 0);
        this.binding.amountbalance.setCompoundDrawablePadding(20);
        setListeners();
        Checkout.preload(this);
        this.user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
        makeThePayment();
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
        this.binding.one.setOnClickListener(new PayActivity$$ExternalSyntheticLambda3(this));
        this.binding.two.setOnClickListener(new PayActivity$$ExternalSyntheticLambda4(this));
        this.binding.three.setOnClickListener(new PayActivity$$ExternalSyntheticLambda6(this));
        this.binding.four.setOnClickListener(new PayActivity$$ExternalSyntheticLambda7(this));
        this.binding.five.setOnClickListener(new PayActivity$$ExternalSyntheticLambda8(this));
        this.binding.six.setOnClickListener(new PayActivity$$ExternalSyntheticLambda9(this));
        this.binding.seven.setOnClickListener(new PayActivity$$ExternalSyntheticLambda10(this));
        this.binding.eight.setOnClickListener(new PayActivity$$ExternalSyntheticLambda11(this));
        this.binding.nine.setOnClickListener(new PayActivity$$ExternalSyntheticLambda1(this));
        this.binding.zeo.setOnClickListener(new PayActivity$$ExternalSyntheticLambda2(this));
        this.binding.erase.setOnClickListener(new PayActivity$$ExternalSyntheticLambda5(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo954x16e4bbd4(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.one.getText().toString());
    }

    /* renamed from: lambda$setListeners$1$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo955x3c78c4d5(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.two.getText().toString());
    }

    /* renamed from: lambda$setListeners$2$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo957x620ccdd6(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.three.getText().toString());
    }

    /* renamed from: lambda$setListeners$3$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo958x87a0d6d7(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.four.getText().toString());
    }

    /* renamed from: lambda$setListeners$4$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo959xad34dfd8(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.five.getText().toString());
    }

    /* renamed from: lambda$setListeners$5$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo960xd2c8e8d9(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.six.getText().toString());
    }

    /* renamed from: lambda$setListeners$6$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo961xf85cf1da(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.seven.getText().toString());
    }

    /* renamed from: lambda$setListeners$7$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo962x1df0fadb(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.eight.getText().toString());
    }

    /* renamed from: lambda$setListeners$8$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo963x438503dc(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.nine.getText().toString());
    }

    /* renamed from: lambda$setListeners$9$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo964x69190cdd(View v) {
        if (!this.binding.amountbalance.getText().toString().isEmpty()) {
            this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.zeo.getText().toString());
        }
    }

    /* renamed from: lambda$setListeners$10$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo956xc88b6857(View v) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.binding.amountbalance.getText().toString().length() - 1; i++) {
            builder.append(this.binding.amountbalance.getText().toString().charAt(i));
        }
        this.binding.amountbalance.setText(String.valueOf(builder));
    }

    private void makeThePayment() {
        this.binding.onRequestMoneyButton.setOnClickListener(new PayActivity$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$makeThePayment$11$com-sandy-cosmossoft-activities-addfunds-PayActivity */
    public /* synthetic */ void mo953xc6a987f2(View view) {
        if (this.binding.amountbalance.getText().toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Provide Valid Amount", C0330R.C0332drawable.warning);
        } else if (AppDatabase.getAppDatabase(this).getRazorPayDao().getRazorPayData() != null) {
            checkingOut();
        } else {
            this.viewModel.fundRepository.bringTheRazorPayData(this, this);
        }
    }

    private void checkingOut() {
        RazorpayData razorpayData = AppDatabase.getAppDatabase(this).getRazorPayDao().getRazorPayData();
        Checkout checkout = new Checkout();
        checkout.setKeyID(razorpayData.getApi_key());
        checkout.setImage(C0330R.C0332drawable.ic_rupee);
        try {
            JSONObject options = new JSONObject();
            options.put("name", razorpayData.getName());
            options.put(DublinCoreProperties.DESCRIPTION, razorpayData.getDescription());
            options.put("image", razorpayData.getImage());
            options.put("theme.color", C0330R.C0331color.iconColor);
            options.put("currency", razorpayData.getCurrency());
            options.put("amount", this.binding.amountbalance.getText().toString() + "00");
            options.put("prefill.email", this.user.getEmail());
            options.put("prefill.contact", this.user.getMobile());
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);
            checkout.open(this, options);
        } catch (Exception e) {
            ViewUtils.showToast(this, "Error in starting Razorpay Checkout: " + e);
            Log.e("ContentValues", "Error in starting Razorpay Checkout", e);
        }
    }

    public void onPaymentSuccess(String razorpayPaymentID) {
        try {
            this.viewModel.fundRepository.addFundServices(this, "online fund", razorpayPaymentID, this.binding.amountbalance.getText().toString(), Constants.EVENT_LABEL_SUCCESS);
            this.binding.amountbalance.setText("");
        } catch (Exception e) {
            this.viewModel.fundRepository.addFundServices(this, "online fund", "failed due to exception android", this.binding.amountbalance.getText().toString(), "failed");
            MyAlertUtils.showAlertDialog(this, "Failed", e.getMessage(), C0330R.C0332drawable.failed);
        }
    }

    public void onPaymentError(int code, String response) {
        this.viewModel.fundRepository.addFundServices(this, "online fund", "failed", this.binding.amountbalance.getText().toString(), "failed");
        try {
            String string = new JSONObject(response).getJSONObject("error").getString(DublinCoreProperties.DESCRIPTION);
            this.description = string;
            MyAlertUtils.showAlertDialog(this, "Failed", string, C0330R.C0332drawable.failed);
        } catch (JSONException e) {
            MyAlertUtils.showAlertDialog(this, "Failed", e.getMessage(), C0330R.C0332drawable.failed);
            e.printStackTrace();
        }
    }

    public void onTransactionResponse(Bundle inResponse) {
        Context applicationContext = getApplicationContext();
        Toast.makeText(applicationContext, "Payment Transaction response " + inResponse.toString(), 1).show();
    }

    public void checkedVerification(boolean result) {
        if (result) {
            checkingOut();
        }
    }
}
