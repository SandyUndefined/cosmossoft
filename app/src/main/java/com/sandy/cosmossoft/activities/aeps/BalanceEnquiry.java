package com.sandy.cosmossoft.activities.aeps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProvider;
import com.paytm.pgsdk.Constants;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.ActivityBalanceEnquiryBinding;
import com.sandy.cosmossoft.listeners.BankNameListener;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.model.DeviceInfo;
import com.sandy.cosmossoft.model.Opts;
import com.sandy.cosmossoft.model.PidData;
import com.sandy.cosmossoft.model.PidOptions;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.PopupUtil;
import com.sandy.cosmossoft.util.StartGettingLocation;
import com.sandy.cosmossoft.util.UtilHolder;
import com.sandy.cosmossoft.util.ViewUtils;
import com.sandy.cosmossoft.viewmodel.AepsViewModel;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class BalanceEnquiry extends Hilt_BalanceEnquiry implements BankNameListener, ResetListener {
    ActivityBalanceEnquiryBinding binding;
    private long mLastClickTime = 0;
    private PidData pidData = null;
    private ArrayList<String> positions;
    private Serializer serializer = null;
    private AepsViewModel viewModel;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBalanceEnquiryBinding inflate = ActivityBalanceEnquiryBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        ActionBar supportActionBar = getSupportActionBar();
        Objects.requireNonNull(supportActionBar);
        ActionBar actionBar = supportActionBar;
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle((CharSequence) "Balance Enquiry..");
        AepsViewModel aepsViewModel = (AepsViewModel) new ViewModelProvider(this).get(AepsViewModel.class);
        this.viewModel = aepsViewModel;
        this.binding.setBalanceEnquiryViewModel(aepsViewModel);
        this.viewModel.bankNameListener = this;
        this.positions = new ArrayList<>();
        this.serializer = new Persister();
        setListeners();
        ViewUtils.setFocusable(this.binding.aadhaarNumber, this);
        StartGettingLocation.setAllTheLocations(this);
    }

    private void setListeners() {
        this.binding.captureFingerPrintButton.setOnClickListener(new BalanceEnquiry$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$setListeners$0$com-sandy-cosmossoft-activities-aeps-BalanceEnquiry */
    public /* synthetic */ void mo47814xa82a8090(View v) {
        Editable text = this.binding.aadhaarNumber.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().length() != 12) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Enter a valid Aadhaar Number", C0330R.C0332drawable.warning);
            return;
        }
        Editable text2 = this.binding.mobileNumber.getText();
        Objects.requireNonNull(text2);
        Editable editable2 = text2;
        if (text2.toString().length() != 10) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Enter a valid Mobile Number", C0330R.C0332drawable.warning);
            return;
        }
        Editable text3 = this.binding.selectedBankName.getText();
        Objects.requireNonNull(text3);
        Editable editable3 = text3;
        if (text3.toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(this, "Warning", "Select Your Bank", C0330R.C0332drawable.warning);
        } else if (PopupUtil.access) {
            captureFingerprint();
        } else {
            PopupUtil.tPinSystem(this, this.viewModel.aepsRepository.apiServices);
        }
    }

    private void discoverDeviceFunction() {
        try {
            Intent intent = new Intent();
            intent.setAction("in.gov.uidai.rdservice.fp.INFO");
            startActivityForResult(intent, 1);
        } catch (Exception e) {
            MyAlertUtils.showServerAlertDialog(this, "Failed due to exception\n" + e.getMessage());
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.mantra.rdservice")));
            ViewUtils.showToast(this, "Install RD Mantra from Play Store..");
        }
    }

    private void captureFingerprint() {
        try {
            String pidOption = getPIDOptions();
            if (pidOption != null) {
                Log.e("PidOptions", pidOption);
                Intent intent2 = new Intent();
                intent2.setAction("in.gov.uidai.rdservice.fp.CAPTURE");
                intent2.putExtra("PID_OPTIONS", pidOption);
                startActivityForResult(intent2, 2);
            }
        } catch (Exception e) {
            MyAlertUtils.showServerAlertDialog(this, "Failed due to exception\n" + e.getMessage());
            Log.e(Constants.EVENT_ACTION_ERROR, e.toString());
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode != -1) {
                    ViewUtils.showToast(this, "Left in the middle...");
                    return;
                } else if (data != null) {
                    try {
                        String result = data.getStringExtra("DEVICE_INFO");
                        String rdService = data.getStringExtra("RD_SERVICE_INFO");
                        String display = "";
                        if (rdService != null) {
                            display = "RD Service Info :" + rdService + "";
                        }
                        if (result != null) {
                            DeviceInfo info2 = (DeviceInfo) this.serializer.read(DeviceInfo.class, result);
                            String display2 = (display + "Device Code: " + info2.f10dc + "Serial No: " + info2.rdsId + "dpId: " + info2.dpId + "MC: " + info2.f11mc + "MI: " + info2.f12mi + "rdsId: " + info2.rdsId + "rdsVer: " + info2.rdsVer) + "Device Info :" + result;
                            if (info2.f10dc.isEmpty()) {
                                MyAlertUtils.showAlertDialog(this, "Warning", "Device not connected", C0330R.C0332drawable.warning);
                                return;
                            } else {
                                ViewUtils.showToast(this, "Device is connected");
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        Log.e(Constants.EVENT_ACTION_ERROR, "Error while deserialze device info", e);
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                if (resultCode == -1 && data != null) {
                    try {
                        String result2 = data.getStringExtra("PID_DATA");
                        if (result2 != null) {
                            PidData pidData2 = (PidData) this.serializer.read(PidData.class, result2);
                            this.pidData = pidData2;
                            if (pidData2._Resp.errCode.equals("720")) {
                                ViewUtils.showToast(this, this.pidData._Resp.errInfo);
                                return;
                            } else if (this.pidData._Resp.errCode.equals("200")) {
                                ViewUtils.showToast(this, this.pidData._Resp.errInfo);
                                return;
                            } else {
                                startService(result2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Exception e2) {
                        MyAlertUtils.showServerAlertDialog(this, "Failed due to exception\n" + e2.getMessage());
                        Log.e(Constants.EVENT_ACTION_ERROR, "Error while deserialze pid data", e2);
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private String getPIDOptions() {
        String posh = "UNKNOWN";
        try {
            if (this.positions.size() > 0) {
                posh = this.positions.toString().replace("[", "").replace("]", "").replaceAll("[\\s+]", "");
            }
            Opts opts = new Opts();
            opts.fCount = String.valueOf(1);
            opts.fType = String.valueOf(0);
            opts.iCount = "0";
            opts.iType = "0";
            opts.pCount = "0";
            opts.pType = "0";
            opts.format = String.valueOf(0);
            opts.pidVer = "2.0";
            opts.timeout = "10000";
            opts.posh = posh;
            opts.env = org.apache.xml.security.utils.Constants._TAG_P;
            PidOptions pidOptions = new PidOptions();
            pidOptions.ver = "1.0";
            pidOptions.Opts = opts;
            Serializer serializer2 = new Persister();
            StringWriter writer = new StringWriter();
            serializer2.write((Object) pidOptions, (Writer) writer);
            return writer.toString();
        } catch (Exception e) {
            Log.e(Constants.EVENT_ACTION_ERROR, e.toString());
            return null;
        }
    }

    private void startService(String fingerprint) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            User user = AppDatabase.getAppDatabase(this).getUserDao().getRegularUser();
            AepsViewModel aepsViewModel = this.viewModel;
            String userstatus = user.getUserstatus();
            String id = user.getId();
            Editable text = this.binding.aadhaarNumber.getText();
            Objects.requireNonNull(text);
            Editable editable = text;
            String obj = text.toString();
            Editable text2 = this.binding.mobileNumber.getText();
            Objects.requireNonNull(text2);
            Editable editable2 = text2;
            aepsViewModel.startAEPSServices(this, userstatus, id, obj, fingerprint, text2.toString(), "BE", UtilHolder.getLongitude(), UtilHolder.getLatitude(), "0", this);
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void setBankName(String bankName) {
        this.binding.selectedBankName.setText(bankName);
    }

    public void resetRequiredData(boolean result) {
        this.binding.aadhaarNumber.setText("");
        this.binding.mobileNumber.setText("");
    }
}
