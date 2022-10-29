package com.sandy.cosmossoft.activities.addfunds;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import com.paytm.pgsdk.Constants;
import com.paytm.pgsdk.PaytmConstants;
import com.paytm.pgsdk.PaytmOrder;
import com.paytm.pgsdk.PaytmPaymentTransactionCallback;
import com.paytm.pgsdk.TransactionManager;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.network.responses.My_Token_Res;
import com.sandy.cosmossoft.data.network.responses.Token_Res;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityPayWithPayTmBinding;
import com.sandy.cosmossoft.listeners.ResponseTypeListener;
import com.sandy.cosmossoft.util.ItemUtils;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.FundViewModel;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class PayActivityWithPayTm extends Hilt_PayActivityWithPayTm implements ResponseTypeListener {
    private final Integer activityRequestCode = 2;
    String amount = "";
    ActivityPayWithPayTmBinding binding;
    String orderId = "";
    User user;
    FundViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPayWithPayTmBinding inflate = ActivityPayWithPayTmBinding.inflate(getLayoutInflater());
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
        this.binding.one.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda3(this));
        this.binding.two.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda4(this));
        this.binding.three.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda6(this));
        this.binding.four.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda7(this));
        this.binding.five.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda8(this));
        this.binding.six.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda9(this));
        this.binding.seven.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda10(this));
        this.binding.eight.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda11(this));
        this.binding.nine.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda1(this));
        this.binding.zeo.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda2(this));
        this.binding.erase.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda5(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo982x90c8ea7(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.one.getText().toString());
    }

    /* renamed from: lambda$setListeners$1$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo983x733c16c6(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.two.getText().toString());
    }

    /* renamed from: lambda$setListeners$2$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo985xdd6b9ee5(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.three.getText().toString());
    }

    /* renamed from: lambda$setListeners$3$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo986x479b2704(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.four.getText().toString());
    }

    /* renamed from: lambda$setListeners$4$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo987xb1caaf23(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.five.getText().toString());
    }

    /* renamed from: lambda$setListeners$5$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo988x1bfa3742(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.six.getText().toString());
    }

    /* renamed from: lambda$setListeners$6$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo989x8629bf61(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.seven.getText().toString());
    }

    /* renamed from: lambda$setListeners$7$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo990xf0594780(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.eight.getText().toString());
    }

    /* renamed from: lambda$setListeners$8$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo991x5a88cf9f(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.nine.getText().toString());
    }

    /* renamed from: lambda$setListeners$9$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo992xc4b857be(View v) {
        if (!this.binding.amountbalance.getText().toString().isEmpty()) {
            this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.zeo.getText().toString());
        }
    }

    /* renamed from: lambda$setListeners$10$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo984x2bbc4584(View v) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.binding.amountbalance.getText().toString().length() - 1; i++) {
            builder.append(this.binding.amountbalance.getText().toString().charAt(i));
        }
        this.binding.amountbalance.setText(String.valueOf(builder));
    }

    private void makeThePayment() {
        this.binding.onRequestMoneyButton.setOnClickListener(new PayActivityWithPayTm$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$makeThePayment$11$com-sandy-cosmossoft-activities-addfunds-PayActivityWithPayTm */
    public /* synthetic */ void mo981xfc888449(View view) {
        if (this.binding.amountbalance.getText().toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Provide Valid Amount", C0330R.C0332drawable.warning);
        } else {
            getTheToken();
        }
    }

    public void onResponseStart() {
        MyAlertUtils.showProgressAlertDialog(this);
    }

    public void onResponse(My_Token_Res my_token_res) {
        if (my_token_res.getToken_res() == null || !my_token_res.getToken_res().getBody().getResultInfo().getResultStatus().equals(ExifInterface.LATITUDE_SOUTH)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Status: ");
            Token_Res token_res = my_token_res.getToken_res();
            Objects.requireNonNull(token_res);
            Token_Res token_Res = token_res;
            sb.append(token_res.getBody().getResultInfo().getResultStatus());
            sb.append("\nMessage: ");
            sb.append(my_token_res.getToken_res().getBody().getResultInfo().getResultMsg());
            MyAlertUtils.showServerAlertDialog(this, sb.toString());
            return;
        }
        MyAlertUtils.dismissAlertDialog();
        startPaytmPayment(my_token_res.getToken_res().getBody().getTxnToken(), my_token_res.getMerchant_id());
    }

    public void onError(String message) {
        MyAlertUtils.showServerAlertDialog(this, message);
    }

    private void getTheToken() {
        this.orderId = ItemUtils.getSaltString();
        this.amount = this.binding.amountbalance.getText().toString();
        this.viewModel.fundRepository.bringPaytmToken(this, "12345", this.orderId, this.amount);
    }

    private void startPaytmPayment(String txnToken, String merchant_id) {
        String str = merchant_id;
        String str2 = txnToken;
        TransactionManager transactionManager = new TransactionManager(new PaytmOrder(this.orderId, str, str2, this.binding.amountbalance.getText().toString(), "https://securegw.paytm.in" + "theia/paytmCallback?ORDER_ID=" + this.orderId), new PaytmPaymentTransactionCallback() {
            public void onTransactionResponse(Bundle bundle) {
                Objects.requireNonNull(bundle);
                Log.e("Payment", bundle.toString());
            }

            public void networkNotAvailable() {
                MyAlertUtils.showServerAlertDialog(PayActivityWithPayTm.this, "Network not available");
            }

            public void onErrorProceed(String s) {
                MyAlertUtils.showServerAlertDialog(PayActivityWithPayTm.this, s);
            }

            public void clientAuthenticationFailed(String s) {
                MyAlertUtils.showServerAlertDialog(PayActivityWithPayTm.this, s);
            }

            public void someUIErrorOccurred(String s) {
            }

            public void onErrorLoadingWebPage(int i, String s, String s1) {
            }

            public void onBackPressedCancelTransaction() {
                MyAlertUtils.showServerAlertDialog(PayActivityWithPayTm.this, "Transaction Canceled");
            }

            public void onTransactionCancel(String s, Bundle bundle) {
                MyAlertUtils.showServerAlertDialog(PayActivityWithPayTm.this, "Transaction Canceled");
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append("https://securegw.paytm.in");
        sb.append("theia/api/vl/showPaymentPage");
        transactionManager.setShowPaymentUrl(sb.toString());
        transactionManager.startTransaction(this, this.activityRequestCode.intValue());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (this.activityRequestCode.intValue() != requestCode || data == null) {
            MyAlertUtils.showServerAlertDialog(this, "Some Error took place");
            return;
        }
        String status = null;
        if (data.getExtras() != null) {
            try {
                status = new JSONObject(data.getStringExtra("response")).getString(PaytmConstants.STATUS);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (status == null || !status.trim().equals("TXN_SUCCESS")) {
                this.viewModel.fundRepository.addFundServices(this, "online fund", this.orderId, this.amount, "failed");
                return;
            }
            this.viewModel.fundRepository.addFundServices(this, "online fund", this.orderId, this.amount, Constants.EVENT_LABEL_SUCCESS);
            this.binding.amountbalance.setText("");
        }
    }
}
