package com.sandy.cosmossoft.viewmodel;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SearchView;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.GridLayoutManager;
import com.paytm.pgsdk.Constants;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.activities.facilityresponses.AePSSuccessMiniStatementResponse;
import com.sandy.cosmossoft.activities.facilityresponses.AePSSuccessResponseScreen;
import com.sandy.cosmossoft.activities.facilityresponses.AepsFailureReponseScreen;
import com.sandy.cosmossoft.adapters.AEPSBankAdapter;
import com.sandy.cosmossoft.data.model.AEPSBanksModel;
import com.sandy.cosmossoft.data.network.responses.AePSBalanceEnquiryResponse;
import com.sandy.cosmossoft.data.network.responses.MiniStatementResponse;
import com.sandy.cosmossoft.data.repositories.AepsRepository;
import com.sandy.cosmossoft.databinding.MyRecyclerSpinnerBinding;
import com.sandy.cosmossoft.listeners.AepsBankListener;
import com.sandy.cosmossoft.listeners.BankNameListener;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import java.util.List;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class AepsViewModel extends ViewModel implements AepsBankListener {
    public static AePSBalanceEnquiryResponse globalAePSBalanceEnquiryResponse;
    public static MiniStatementResponse globalMiniStatementResponse;
    public static AEPSBanksModel selectedAepsBankModel = null;
    public String aadhaar = null;
    public List<AEPSBanksModel> aepsBanksList = null;
    public AepsRepository aepsRepository;
    public String amount = null;
    public BankNameListener bankNameListener;
    Dialog dialog;
    public String mobile = null;
    public String selectedBank = null;
    public String transactionType = "";

    @Inject
    public AepsViewModel(AepsRepository aepsRepository2) {
        this.aepsRepository = aepsRepository2;
    }

    public void selectBankList(final View view) {
        if (this.aepsBanksList == null) {
            final ProgressDialog dialog2 = new ProgressDialog(view.getContext());
            dialog2.setTitle("Loading");
            dialog2.setMessage("Getting banks.");
            this.aepsRepository.apiServices.getBankList("123").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<AEPSBanksModel>>() {
                public void onSubscribe(Disposable d) {
                    dialog2.show();
                }

                public void onNext(List<AEPSBanksModel> aepsBanksModels) {
                    AepsViewModel.this.aepsBanksList = aepsBanksModels;
                }

                public void onError(Throwable e) {
                    dialog2.setTitle(Constants.EVENT_ACTION_ERROR);
                    ProgressDialog progressDialog = dialog2;
                    progressDialog.setMessage("Failed due to: " + e.getMessage());
                }

                public void onComplete() {
                    dialog2.dismiss();
                    AepsViewModel.this.setAepsBanksOnScreen(view);
                }
            });
            return;
        }
        setAepsBanksOnScreen(view);
    }

    public void setAepsBanksOnScreen(View view) {
        MyRecyclerSpinnerBinding binding = MyRecyclerSpinnerBinding.inflate(LayoutInflater.from(view.getContext()));
        Dialog dialog2 = new Dialog(view.getContext(), C0330R.C0337style.BottomSheetDialogTheme);
        this.dialog = dialog2;
        dialog2.setContentView(binding.getRoot());
        this.dialog.getWindow().setLayout(-1, -2);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.dialog.setCanceledOnTouchOutside(false);
        this.dialog.show();
        binding.headTitleSection.setText("Select Bank");
        final AEPSBankAdapter aepsBankAdapter = new AEPSBankAdapter(this.aepsBanksList, this);
        binding.MyOperatorListView.setLayoutManager(new GridLayoutManager(view.getContext(), 1, 1, false));
        binding.MyOperatorListView.setAdapter(aepsBankAdapter);
        binding.SearchOperator.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                aepsBankAdapter.getFilter().filter(query);
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                aepsBankAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    public void selectedAepsBanks(View view, AEPSBanksModel model) {
        String bankname = model.getBankname();
        this.selectedBank = bankname;
        this.bankNameListener.setBankName(bankname);
        selectedAepsBankModel = model;
        Dialog dialog2 = this.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    public void startAEPSServices(Context context, String userTpeId, String id, String aadhar, String fingerData, String mobile2, String transType, String longitude, String latitude, String amount2, ResetListener listener) {
        MyAlertUtils.showProgressAlertDialog(context);
        String myDeviceModel = Provider.getDeviceModel();
        String ip = Provider.getLocalIpAddress();
        final Context context2 = context;
        final ResetListener resetListener = listener;
        this.aepsRepository.apiServices.AEPSResponse(userTpeId, id, aadhar, fingerData.trim(), mobile2, transType, selectedAepsBankModel.getIinno(), longitude, latitude, amount2, ip, myDeviceModel).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AePSBalanceEnquiryResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(AePSBalanceEnquiryResponse aePSBalanceEnquiryResponse) {
                AepsViewModel.globalAePSBalanceEnquiryResponse = aePSBalanceEnquiryResponse;
                MyAlertUtils.dismissAlertDialog();
                if (!aePSBalanceEnquiryResponse.isStatus() || !aePSBalanceEnquiryResponse.response_code.equals(1)) {
                    context2.startActivity(new Intent(context2, AepsFailureReponseScreen.class));
                    return;
                }
                resetListener.resetRequiredData(true);
                context2.startActivity(new Intent(context2, AePSSuccessResponseScreen.class));
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void startAepsResponseStatement(Context context, String userTpeId, String id, String aadhar, String fingerData, String mobile2, String transType, String longitude, String latitude, String amount2, ResetListener listener) {
        MyAlertUtils.showProgressAlertDialog(context);
        String myDeviceModel = Provider.getDeviceModel();
        String ip = Provider.getLocalIpAddress();
        final Context context2 = context;
        final ResetListener resetListener = listener;
        this.aepsRepository.apiServices.startAepsResponseMiniStatement(userTpeId, id, aadhar, fingerData, mobile2, transType, selectedAepsBankModel.getIinno(), longitude, latitude, amount2, ip, myDeviceModel).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<MiniStatementResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(MiniStatementResponse miniStatementResponse) {
                AepsViewModel.globalMiniStatementResponse = miniStatementResponse;
                MyAlertUtils.dismissAlertDialog();
                if (miniStatementResponse.isStatus()) {
                    resetListener.resetRequiredData(true);
                    context2.startActivity(new Intent(context2, AePSSuccessMiniStatementResponse.class));
                } else if (!miniStatementResponse.isStatus()) {
                    MyAlertUtils.showServerAlertDialog(context2, miniStatementResponse.getMessage());
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }
}
