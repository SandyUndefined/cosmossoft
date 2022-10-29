package com.sandy.cosmossoft.activities.mobilenumber;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.databinding.ActivitySendMoneyBinding;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel;
import java.util.Objects;

public class SendMoney extends Hilt_SendMoney implements ResetListener {
    ActivitySendMoneyBinding binding;
    MobileNumberPayViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySendMoneyBinding inflate = ActivitySendMoneyBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Send Money");
        this.viewModel = (MobileNumberPayViewModel) new ViewModelProvider(this).get(MobileNumberPayViewModel.class);
        Bundle bundle = getIntent().getExtras();
        String receiver_id = bundle.getString("receiver_id");
        String string = bundle.getString("receiver_name");
        String receiver_mobile = bundle.getString("receiver_mobile");
        this.binding.setSendMoneyViewModel(this.viewModel);
        this.viewModel.resetListener = this;
        this.viewModel.receiver_id = receiver_id;
        this.viewModel.receiver_mobile = receiver_mobile;
        this.binding.amountbalance.setCompoundDrawablesWithIntrinsicBounds(C0330R.C0332drawable.ic_rupee, 0, 0, 0);
        this.binding.amountbalance.setCompoundDrawablePadding(20);
        setListeners();
    }

    private void setListeners() {
        this.binding.one.setOnClickListener(new SendMoney$$ExternalSyntheticLambda0(this));
        this.binding.two.setOnClickListener(new SendMoney$$ExternalSyntheticLambda2(this));
        this.binding.three.setOnClickListener(new SendMoney$$ExternalSyntheticLambda4(this));
        this.binding.four.setOnClickListener(new SendMoney$$ExternalSyntheticLambda5(this));
        this.binding.five.setOnClickListener(new SendMoney$$ExternalSyntheticLambda6(this));
        this.binding.six.setOnClickListener(new SendMoney$$ExternalSyntheticLambda7(this));
        this.binding.seven.setOnClickListener(new SendMoney$$ExternalSyntheticLambda8(this));
        this.binding.eight.setOnClickListener(new SendMoney$$ExternalSyntheticLambda9(this));
        this.binding.nine.setOnClickListener(new SendMoney$$ExternalSyntheticLambda10(this));
        this.binding.zeo.setOnClickListener(new SendMoney$$ExternalSyntheticLambda1(this));
        this.binding.erase.setOnClickListener(new SendMoney$$ExternalSyntheticLambda3(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1354xe8bbb973(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.one.getText().toString());
    }

    /* renamed from: lambda$setListeners$1$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1355xf9718634(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.two.getText().toString());
    }

    /* renamed from: lambda$setListeners$2$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1357xa2752f5(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.three.getText().toString());
    }

    /* renamed from: lambda$setListeners$3$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1358x1add1fb6(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.four.getText().toString());
    }

    /* renamed from: lambda$setListeners$4$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1359x2b92ec77(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.five.getText().toString());
    }

    /* renamed from: lambda$setListeners$5$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1360x3c48b938(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.six.getText().toString());
    }

    /* renamed from: lambda$setListeners$6$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1361x4cfe85f9(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.seven.getText().toString());
    }

    /* renamed from: lambda$setListeners$7$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1362x5db452ba(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.eight.getText().toString());
    }

    /* renamed from: lambda$setListeners$8$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1363x6e6a1f7b(View v) {
        this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.nine.getText().toString());
    }

    /* renamed from: lambda$setListeners$9$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1364x7f1fec3c(View v) {
        if (!this.binding.amountbalance.getText().toString().isEmpty()) {
            this.binding.amountbalance.setText(this.binding.amountbalance.getText().toString() + this.binding.zeo.getText().toString());
        }
    }

    /* renamed from: lambda$setListeners$10$com-sandy-cosmossoft-activities-mobilenumber-SendMoney */
    public /* synthetic */ void mo1356xcb695136(View v) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.binding.amountbalance.getText().toString().length() - 1; i++) {
            builder.append(this.binding.amountbalance.getText().toString().charAt(i));
        }
        this.binding.amountbalance.setText(String.valueOf(builder));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    public void resetRequiredData(boolean result) {
        this.binding.amountbalance.setText("");
        this.viewModel.amount = "";
    }
}
