package com.sandy.cosmossoft.activities.microatm;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.paysprint.microatmlib.activities.HostActivity;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.data.model.MicroAtmModel;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.repositories.MicroRepository;
import com.sandy.cosmossoft.databinding.ActivityMicroAtmHomeBinding;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.PopupUtil;
import com.sandy.cosmossoft.util.StartGettingLocation;
import com.sandy.cosmossoft.util.UtilHolder;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.inject.Inject;

public class MicroAtmHome extends Hilt_MicroAtmHome {
    public static final int START_ATM_SERVICE = 786786;
    public static MicroAtmModel microAtmModel;
    @Inject
    APIServices apiServices;
    Integer atm = 0;
    ActivityMicroAtmHomeBinding binding;

    /* renamed from: s */
    String f3444s;
    PaySprintApi sprintApi;
    User user;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMicroAtmHomeBinding inflate = ActivityMicroAtmHomeBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Micro ATM");
        AppDatabase appDatabase = AppDatabase.getAppDatabase(this);
        this.user = appDatabase.getUserDao().getRegularUser();
        this.sprintApi = appDatabase.getPaySprint().getRegularPaySprint();
        onClick();
        ViewUtils.setFocusable(this.binding.edAmount, this);
        StartGettingLocation.setAllTheLocations(this);
    }

    private void onClick() {
        this.binding.btnSubmit.setOnClickListener(new MicroAtmHome$$ExternalSyntheticLambda0(this));
        this.binding.btnWithdraw.setOnClickListener(new MicroAtmHome$$ExternalSyntheticLambda1(this));
        this.binding.selectedBankName.setOnClickListener(new MicroAtmHome$$ExternalSyntheticLambda2(this));
    }

    /* renamed from: lambda$onClick$0$com-sandy-cosmossoft-activities-microatm-MicroAtmHome */
    public /* synthetic */ void mo48209xadc72ddd(View v) {
        if (this.atm.intValue() == 0) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Select your ATM Device", C0330R.C0332drawable.warning);
        } else if (PopupUtil.access) {
            startBalanceEnquiry();
        } else {
            PopupUtil.tPinSystem(this, this.apiServices);
        }
    }

    /* renamed from: lambda$onClick$1$com-sandy-cosmossoft-activities-microatm-MicroAtmHome */
    public /* synthetic */ void mo48210x3ab444fc(View v) {
        Editable text = this.binding.edAmount.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Enter a valid amount", C0330R.C0332drawable.warning);
        } else if (this.atm.intValue() == 0) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Select your ATM Device", C0330R.C0332drawable.warning);
        } else if (PopupUtil.access) {
            startCashWithdraw();
        } else {
            PopupUtil.tPinSystem(this, this.apiServices);
        }
    }

    /* renamed from: lambda$onClick$2$com-sandy-cosmossoft-activities-microatm-MicroAtmHome */
    public /* synthetic */ void mo48211xc7a15c1b(View v) {
        onSpinnerClick();
    }

    private void startBalanceEnquiry() {
        this.f3444s = "INC" + generatedReferenceID();
        Intent intent = new Intent(this, HostActivity.class);
        intent.putExtra("partnerId", this.sprintApi.getPartnerid());
        intent.putExtra("apiKey", this.sprintApi.getJwtkey());
        intent.putExtra("merchantCode", HomeActivity.merchant.getMerchantcode());
        intent.putExtra("transactionType", "BE");
        intent.putExtra("amount", "0");
        intent.putExtra("remarks", "Test Transaction");
        intent.putExtra("mobileNumber", this.user.getMobile());
        intent.putExtra("referenceNumber", this.f3444s);
        intent.putExtra("latitude", UtilHolder.getLatitude());
        intent.putExtra("longitude", UtilHolder.getLongitude());
        intent.putExtra("subMerchantId", HomeActivity.merchant.getMerchantcode());
        intent.putExtra("deviceManufacturerId", this.atm);
        intent.putExtra("email", this.user.getEmail());
        startActivityForResult(intent, START_ATM_SERVICE);
    }

    private void startCashWithdraw() {
        this.f3444s = "INC" + generatedReferenceID();
        Intent intent = new Intent(this, HostActivity.class);
        intent.putExtra("partnerId", this.sprintApi.getPartnerid());
        intent.putExtra("apiKey", this.sprintApi.getJwtkey());
        intent.putExtra("merchantCode", HomeActivity.merchant.getMerchantcode());
        intent.putExtra("transactionType", "CW");
        Editable text = this.binding.edAmount.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        intent.putExtra("amount", text.toString());
        intent.putExtra("remarks", "Micro-ATM Transaction");
        intent.putExtra("mobileNumber", this.user.getMobile());
        intent.putExtra("referenceNumber", this.f3444s);
        intent.putExtra("latitude", UtilHolder.getLatitude());
        intent.putExtra("longitude", UtilHolder.getLongitude());
        intent.putExtra("subMerchantId", HomeActivity.merchant.getMerchantcode());
        intent.putExtra("deviceManufacturerId", this.atm);
        startActivityForResult(intent, START_ATM_SERVICE);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        finish();
        return true;
    }

    private static String generatedReferenceID() {
        int n = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".length();
        StringBuilder result = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            result.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(r.nextInt(n)));
        }
        return String.valueOf(result);
    }

    private String revertMyData(String value) {
        if (value == null) {
            return "No Response for this value";
        }
        return value;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Intent intent = data;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 786786 && resultCode == -1) {
            Objects.requireNonNull(data);
            boolean status = intent.getBooleanExtra("status", false);
            int response = intent.getIntExtra("response", 0);
            String message = intent.getStringExtra("message");
            String dataResponse = intent.getStringExtra("data:response");
            String dataTransAmount = intent.getStringExtra("data:transAmount");
            String dataBalAmount = intent.getStringExtra("data:balAmount");
            String dataBalRrn = intent.getStringExtra("data:bankRrn");
            String dataTxnId = intent.getStringExtra("data:txnid");
            String dataTransType = intent.getStringExtra("data:transType");
            String dataType = intent.getStringExtra("data:type");
            String dataCardNumber = intent.getStringExtra("data:cardNumber");
            String dataCardType = intent.getStringExtra("data:cardType");
            String dataTerminalId = intent.getStringExtra("data:terminalId");
            String dataBankName = intent.getStringExtra("data:bankName");
            microAtmModel = new MicroAtmModel(message, String.valueOf(dataResponse), dataTransAmount, dataBalAmount, dataBalRrn, dataTxnId, dataTransType, dataType, dataCardNumber, dataCardType, dataTerminalId, dataBankName);
            MicroRepository repository = new MicroRepository(this, this.apiServices);
            if (status) {
                Intent intent2 = new Intent(this, MicroAtmResponse.class);
                startActivity(intent2);
                Intent intent3 = intent2;
                String str = message;
                repository.updateTheDatabase(this, message, String.valueOf(response), dataTransAmount, dataBalAmount, dataBalRrn, dataTxnId, dataTransType, dataType, dataCardNumber, dataCardType, dataTerminalId, dataBankName, this.f3444s, "true");
                return;
            }
            String message2 = message;
            MyAlertUtils.showAlertDialog(this, "Warning", revertMyData(message2), C0330R.C0332drawable.warning);
            String str2 = message2;
            repository.updateTheDatabase(this, message2, String.valueOf(response), dataTransAmount, dataBalAmount, dataBalRrn, dataTxnId, dataTransType, dataType, dataCardNumber, dataCardType, dataTerminalId, dataBankName, this.f3444s, "false");
        }
    }

    public void onSpinnerClick() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(C0330R.layout.my_spinner_row);
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        ListView myOperatorListView = (ListView) dialog.findViewById(C0330R.C0333id.MyOperatorListView);
        List<AtmDeviceModels> list = new ArrayList<>();
        ((TextView) dialog.findViewById(C0330R.C0333id.head_title_section)).setText("Micro ATM Device");
        list.add(new AtmDeviceModels("AF60S ", 1));
        list.add(new AtmDeviceModels("MP-63", 2));
        final ArrayAdapter<AtmDeviceModels> adapter = new ArrayAdapter<>(this, 17367043, list);
        myOperatorListView.setAdapter(adapter);
        ((EditText) dialog.findViewById(C0330R.C0333id.SearchOperator)).addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            public void afterTextChanged(Editable s) {
            }
        });
        myOperatorListView.setOnItemClickListener(new MicroAtmHome$$ExternalSyntheticLambda3(this, adapter, dialog));
    }

    /* renamed from: lambda$onSpinnerClick$3$com-sandy-cosmossoft-activities-microatm-MicroAtmHome */
    public /* synthetic */ void mo48212xfc4835fb(ArrayAdapter adapter, Dialog dialog, AdapterView parent, View view1, int position, long id) {
        this.binding.selectedBankName.setText(((AtmDeviceModels) adapter.getItem(position)).getName());
        this.atm = ((AtmDeviceModels) adapter.getItem(position)).getId();
        dialog.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.atm = 0;
        this.binding.selectedBankName.setText("");
    }
}
