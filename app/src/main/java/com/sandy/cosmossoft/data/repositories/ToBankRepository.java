package com.sandy.cosmossoft.data.repositories;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.tobank.DMTHome;
import com.sandy.cosmossoft.activities.tobank.RegisterRemitter;
import com.sandy.cosmossoft.activities.tobank.ToAccount;
import com.sandy.cosmossoft.data.model.BankModel;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AddBeneficiaryResponse;
import com.sandy.cosmossoft.data.network.responses.DmtUserData;
import com.sandy.cosmossoft.data.network.responses.QueryRemitterResponse;
import com.sandy.cosmossoft.data.network.responses.RegisterRemitterResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.OtpScreenLayoutBinding;
import com.sandy.cosmossoft.listeners.DMTHomeListeners;
import com.sandy.cosmossoft.listeners.ToBankListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.viewmodel.ToBankViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class ToBankRepository {
    public APIServices apiServices;
    AppDatabase appDatabase;

    @Inject
    public ToBankRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }

    public void getAllBanksFromApi(final ToBankListener listener) {
        this.apiServices.getAllBanks().subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ArrayList<BankModel>>() {
            public void onSubscribe(Disposable d) {
                listener.onStarted("Please Wait..");
            }

            public void onNext(ArrayList<BankModel> bankModelList) {
                listener.setAllBanks(bankModelList);
            }

            public void onError(Throwable e) {
                listener.onCompleted(e.getMessage());
            }

            public void onComplete() {
                listener.onCompleted("Done..");
            }
        });
    }

    public void query_remitter_checking(String mobile, String dob, String pin_code, final Context context) {
        AppDatabase appDatabase2 = AppDatabase.getAppDatabase(context);
        this.appDatabase = appDatabase2;
        User user = appDatabase2.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context);
        this.apiServices.queryRemitter(user.getId(), user.getUserstatus(), pin_code, mobile, dob, "proceeding").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<QueryRemitterResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(QueryRemitterResponse queryRemitterResponse) {
                ToBankViewModel.MyQueryRemitterResponse = queryRemitterResponse;
                if (queryRemitterResponse.isStatus() && (queryRemitterResponse.getResponse_code().equals(1) || queryRemitterResponse.getResponse_code().equals(4))) {
                    ToBankViewModel.remitter_mobile = "";
                    ToBankViewModel.pin_code = "";
                    ToBankViewModel.remitter_dob = "";
                    Intent intent = new Intent(context, DMTHome.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    intent.putExtra("message", queryRemitterResponse.getMessage());
                    context.startActivity(intent);
                } else if (queryRemitterResponse.isStatus() || !queryRemitterResponse.getResponse_code().equals(0)) {
                    MyAlertUtils.showAlertDialog(context, "Result", queryRemitterResponse.getMessage(), C0330R.C0332drawable.failed);
                } else {
                    MyAlertUtils.dismissAlertDialog();
                    ToBankRepository.this.remitterOTPScreen(context);
                }
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void query_remitter(String mobile, String dob, String pin_code, final Context context) {
        AppDatabase appDatabase2 = AppDatabase.getAppDatabase(context);
        this.appDatabase = appDatabase2;
        User user = appDatabase2.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context);
        this.apiServices.queryRemitter(user.getId(), user.getUserstatus(), pin_code, mobile, dob, "proceeding").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<QueryRemitterResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(QueryRemitterResponse queryRemitterResponse) {
                ToBankViewModel.MyQueryRemitterResponse = queryRemitterResponse;
                if (queryRemitterResponse.isStatus() && queryRemitterResponse.getResponse_code().equals(1)) {
                    ToBankViewModel.remitter_mobile = "";
                    ToBankViewModel.pin_code = "";
                    ToBankViewModel.remitter_dob = "";
                    Intent intent = new Intent(context, DMTHome.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    intent.putExtra("message", (String) null);
                    context.startActivity(intent);
                } else if (queryRemitterResponse.isStatus() || !queryRemitterResponse.getResponse_code().equals(0)) {
                    MyAlertUtils.showAlertDialog(context, "Result", queryRemitterResponse.getMessage(), C0330R.C0332drawable.failed);
                } else {
                    MyAlertUtils.dismissAlertDialog();
                    context.startActivity(new Intent(context, RegisterRemitter.class));
                }
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void register_remitter(String otp, String dob, String pin_code, Context context, String remitter_first_name, String remitter_last_name, String remitter_mobile, String remitter_address) {
        AppDatabase appDatabase2 = AppDatabase.getAppDatabase(context);
        this.appDatabase = appDatabase2;
        User user = appDatabase2.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context);
        final String str = remitter_mobile;
        final String str2 = dob;
        final String str3 = pin_code;
        final Context context2 = context;
        this.apiServices.registerRemitter(user.getId(), user.getUserstatus(), otp, dob, ToBankViewModel.MyQueryRemitterResponse.getStateresp(), pin_code, remitter_first_name, remitter_last_name, remitter_mobile, remitter_address).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegisterRemitterResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegisterRemitterResponse registerRemitterResponse) {
                if (!registerRemitterResponse.isStatus() || (!registerRemitterResponse.response_code.equals(1) && !registerRemitterResponse.response_code.equals(4))) {
                    MyAlertUtils.showAlertDialog(context2, "Result", registerRemitterResponse.getMessage(), C0330R.C0332drawable.warning);
                } else {
                    ToBankRepository.this.query_remitter(str, str2, str3, context2);
                }
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(context2, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void addMyBeneficiary(Context context, String nick_name, String phone_number, String holder_name, String ifsc, String account_number, String dateOfBirth, String address, String pin_code, String dmt_mobile) {
        AppDatabase appDatabase2 = AppDatabase.getAppDatabase(context);
        this.appDatabase = appDatabase2;
        User user = appDatabase2.getUserDao().getRegularUser();
        if (user != null) {
            MyAlertUtils.showProgressAlertDialog(context);
            final Context context2 = context;
            this.apiServices.registerBeneficiary(user.getId(), user.getUserstatus(), nick_name, phone_number, holder_name, account_number, ifsc, ToBankViewModel.selectedBank.getBankid(), dateOfBirth, address, pin_code, dmt_mobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AddBeneficiaryResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(AddBeneficiaryResponse response) {
                    if (!response.isStatus() || !response.response_code.equals(1)) {
                        MyAlertUtils.showAlertDialog(context2, "Failed", response.getMessage(), C0330R.C0332drawable.failed);
                        return;
                    }
                    Intent intent = new Intent(context2, ToAccount.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    intent.putExtra("number", ToBankViewModel.globalSelectedMobile);
                    context2.startActivity(intent);
                }

                public void onError(Throwable e) {
                    MyAlertUtils.showServerAlertDialog(context2, e.getMessage());
                }

                public void onComplete() {
                }
            });
            return;
        }
        Context context3 = context;
    }

    public void getAllMyDMTReports(final DMTHomeListeners listeners) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.getAllDMTUsers(user.getId(), user.getUserstatus()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<DmtUserData>>() {
            public void onSubscribe(Disposable d) {
                listeners.initiateStart();
            }

            public void onNext(List<DmtUserData> list) {
                listeners.setWholeRecycler(list);
            }

            public void onError(Throwable e) {
                DMTHomeListeners dMTHomeListeners = listeners;
                dMTHomeListeners.setErrorInFetch("Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    /* access modifiers changed from: private */
    public void remitterOTPScreen(Context context) {
        Dialog dialog = new Dialog(context);
        OtpScreenLayoutBinding binding = OtpScreenLayoutBinding.inflate(LayoutInflater.from(context));
        dialog.setContentView(binding.getRoot());
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        dialog.setCanceledOnTouchOutside(false);
        binding.cancelLayout.setOnClickListener(new ToBankRepository$$ExternalSyntheticLambda0(dialog));
        binding.verifyOtp.setText("Proceed");
        binding.verifyOtp.setOnClickListener(new ToBankRepository$$ExternalSyntheticLambda1(binding, context));
    }

    static /* synthetic */ void lambda$remitterOTPScreen$1(OtpScreenLayoutBinding binding, Context context, View v) {
        Editable text = binding.enterOtpDmt.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        if (text.toString().isEmpty()) {
            MyAlertUtils.showAlertDialog(context, "Warning", "Provide OTP", C0330R.C0332drawable.warning);
            return;
        }
        Intent intent = new Intent(context, RegisterRemitter.class);
        intent.putExtra("enteredOTP", binding.enterOtpDmt.getText().toString());
        context.startActivity(intent);
    }
}
