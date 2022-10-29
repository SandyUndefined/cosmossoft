package com.sandy.cosmossoft.data.repositories;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.RoomDatabase;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.activities.bbps.BbpsRecharge;
import com.sandy.cosmossoft.data.model.OperatorModel;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.CustomerInfoResponse;
import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;
import com.sandy.cosmossoft.data.network.responses.FetchBillResponse;
import com.sandy.cosmossoft.data.network.responses.MyOfferResponse;
import com.sandy.cosmossoft.data.network.responses.PaymentResponse;
import com.sandy.cosmossoft.data.network.responses.RegularHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.OtpScreenLayoutBinding;
import com.sandy.cosmossoft.listeners.ROfferListener;
import com.sandy.cosmossoft.listeners.RegularHistoryListener;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MobileRechargesRepository {
    public static FetchBillResponse myFetchedBill;
    public APIServices apiServices;
    AppDatabase appDatabase;
    Context context;
    public RegularHistoryListener regularHistoryListener;

    @Inject
    public MobileRechargesRepository(Context context2, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context2);
        this.apiServices = apiServices2;
    }

    public LiveData<List<OperatorModel>> getOperatorsList(String operator, final View view) {
        MyAlertUtils.showProgressAlertDialog(view.getContext());
        final MutableLiveData<List<OperatorModel>> list = new MutableLiveData<>();
        this.apiServices.getOperatorsList(operator).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<OperatorModel>>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(List<OperatorModel> operatorModelList) {
                list.setValue(operatorModelList);
                MyAlertUtils.dismissAlertDialog();
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), e.getMessage());
            }

            public void onComplete() {
            }
        });
        return list;
    }

    public void getPaymentDone(String userId, String number, String userTypeId, String plan, String longCode, View view, ResetListener listener) {
        this.context = view.getContext();
        String myDeviceModel = Provider.getDeviceModel();
        String ip = Provider.getLocalIpAddress();
        User user = this.appDatabase.getUserDao().getRegularUser();
        final String str = userId;
        final String str2 = number;
        final String str3 = userTypeId;
        final String str4 = plan;
        final String str5 = longCode;
        final String str6 = ip;
        final String str7 = myDeviceModel;
        final ResetListener resetListener = listener;
        this.apiServices.reAuthenticateUser(user.getMobile(), user.getPassword(), user.getToken()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(AuthResponse authResponse) {
                if (authResponse.isStatus()) {
                    MobileRechargesRepository.this.accessThePayment(str, str2, str3, str4, str5, str6, str7, resetListener);
                } else {
                    MyAlertUtils.showServerAlertDialog(MobileRechargesRepository.this.context, "Session Expired.");
                }
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    public void accessThePayment(String userId, String number, String userTypeId, String plan, String longCode, String ip, String myDeviceModel, ResetListener listener) {
        final ResetListener resetListener = listener;
        this.apiServices.makeThePayment(userId, number, userTypeId, plan, longCode, ip, myDeviceModel).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PaymentResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(PaymentResponse paymentResponse) {
                if (!paymentResponse.responsecode.equals(100)) {
                    MyAlertUtils.showAlertDialog(MobileRechargesRepository.this.context, "Failed", paymentResponse.getMessage(), C0330R.C0332drawable.failed);
                } else if (paymentResponse.getResponse().toLowerCase().equals("pending")) {
                    MyAlertUtils.showAlertDialog(MobileRechargesRepository.this.context, "Pending", paymentResponse.getMessage(), C0330R.C0332drawable.warning);
                } else {
                    MyAlertUtils.showAlertDialog(MobileRechargesRepository.this.context, "Success", paymentResponse.getMessage(), C0330R.C0332drawable.success);
                    resetListener.resetRequiredData(true);
                }
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(MobileRechargesRepository.this.context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void fetchMyBillOnline(Context context2, String op, String num, String logo, String operator, String serviceType) {
        MyAlertUtils.showProgressAlertDialog(context2);
        final Context context3 = context2;
        final String str = operator;
        final String str2 = num;
        final String str3 = op;
        final String str4 = logo;
        final String str5 = serviceType;
        this.apiServices.fetchMyBillsForBBPS(serviceType, op, num).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<FetchBillInfo>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(FetchBillInfo fetchBillInfo) {
                if (!fetchBillInfo.isStatus() || !fetchBillInfo.response_code.equals(1)) {
                    MyAlertUtils.showAlertDialog(context3, "Warning", fetchBillInfo.getMessage(), C0330R.C0332drawable.warning);
                    return;
                }
                MyAlertUtils.dismissAlertDialog();
                Intent intent = new Intent(context3.getApplicationContext(), BbpsRecharge.class);
                intent.putExtra("name", str);
                intent.putExtra("number", str2);
                intent.putExtra("operatorName", str);
                intent.putExtra("operatorCode", str3);
                intent.putExtra("logo", str4);
                intent.putExtra("serviceType", str5);
                intent.putExtra("fetchBillResponse", fetchBillInfo);
                context3.startActivity(intent);
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(context3, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void getMeMyROffer(String op, String num, final ROfferListener listener, String type) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.getMeROffers(op, num, user.getId(), user.getPassword(), type).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<MyOfferResponse>() {
            public void onSubscribe(Disposable d) {
                listener.onStartLooking();
            }

            public void onNext(MyOfferResponse response) {
                listener.getMeROffer(response);
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(MobileRechargesRepository.this.context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void getMeMyDthROffer(String op, String num, final ROfferListener listener, String type) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.getMeDthROffers(op, num, user.getId(), user.getPassword(), type).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<MyOfferResponse>() {
            public void onSubscribe(Disposable d) {
                listener.onStartLooking();
            }

            public void onNext(MyOfferResponse response) {
                listener.getMeROffer(response);
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(MobileRechargesRepository.this.context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void getMeDthCustomer(String op, String num, String type, final ROfferListener listener) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.getDthCustomerInfo(op, num, user.getId(), user.getPassword(), type).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<CustomerInfoResponse>() {
            public void onSubscribe(Disposable d) {
                listener.onStartLooking();
            }

            public void onNext(CustomerInfoResponse response) {
                listener.onCustomerInfo(response);
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(MobileRechargesRepository.this.context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void creditCardRefundSystem(final Context context2, final String refrence) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.resendOtpForRefund(user.getId(), user.getToken(), refrence, "resend_otp").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
                MyAlertUtils.showProgressAlertDialog(context2);
            }

            public void onNext(RegularResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.getResponse_code().equals(Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT))) {
                    MobileRechargesRepository.this.endTheSession(context2, response.getMessage());
                } else if (!response.isStatus() || !response.getResponse_code().equals(1)) {
                    MyAlertUtils.showWarningAlertDialog(context2, response.getMessage());
                } else {
                    ViewUtils.showToast(context2, response.getMessage());
                    MobileRechargesRepository.this.otpPassingDesign(context2, refrence);
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    /* access modifiers changed from: private */
    public void otpPassingDesign(Context context2, String refrence) {
        Dialog dialog = new Dialog(context2);
        OtpScreenLayoutBinding binding = OtpScreenLayoutBinding.inflate(LayoutInflater.from(context2));
        dialog.setContentView(binding.getRoot());
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        dialog.setCanceledOnTouchOutside(false);
        binding.cancelLayout.setOnClickListener(new MobileRechargesRepository$$ExternalSyntheticLambda0(dialog));
        binding.verifyOtp.setOnClickListener(new MobileRechargesRepository$$ExternalSyntheticLambda1(this, binding, context2, dialog, refrence));
    }

    /* renamed from: lambda$otpPassingDesign$1$com-sandy-cosmossoft-data-repositories-MobileRechargesRepository */
    public /* synthetic */ void mo1231xc6e19237(OtpScreenLayoutBinding binding, Context context2, Dialog dialog, String refrence, View v) {
        Editable text = binding.enterOtpDmt.getText();
        Objects.requireNonNull(text);
        Editable editable = text;
        String otp = text.toString();
        if (otp.isEmpty()) {
            MyAlertUtils.showAlertDialog(context2, "Warning", "Provide OTP", C0330R.C0332drawable.warning);
        } else {
            creditCardRefundNow(dialog, context2, refrence, otp);
        }
    }

    public void creditCardRefundNow(final Dialog dialog, final Context context2, String refrence, String otp) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.ccForRefund(user.getId(), user.getToken(), refrence, otp, "refundTxn").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
                MyAlertUtils.showProgressAlertDialog(context2);
            }

            public void onNext(RegularResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.getResponse_code().equals(Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT))) {
                    dialog.dismiss();
                    MobileRechargesRepository.this.endTheSession(context2, response.getMessage());
                } else if (!response.isStatus() || !response.getResponse_code().equals(1)) {
                    MyAlertUtils.showWarningAlertDialog(context2, response.getMessage());
                } else {
                    dialog.dismiss();
                    MyAlertUtils.showAnotherDialog(context2, "Result", response.getMessage(), C0330R.C0332drawable.success);
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void checkHistoryStatusRegular(final Context context2, String historystatus, String reference) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context2);
        this.apiServices.getRegularHistoryStatus(user.getId(), user.getToken(), historystatus, reference, Provider.getDeviceModel(), Provider.getLocalIpAddress()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.isStatus() && response.getResponse_code().equals(1)) {
                    MyAlertUtils.showAnotherDialog(context2, "Result", response.getMessage(), C0330R.C0332drawable.success);
                    MobileRechargesRepository.this.regularHistoryListener.bringTheHistoryAgain();
                } else if (response.getResponse_code().equals(Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT))) {
                    MobileRechargesRepository.this.endTheSession(context2, response.getMessage());
                } else {
                    MyAlertUtils.showServerAlertDialog(context2, response.getMessage());
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void bringUsualFastAgHistory(final RegularHistoryListener listener, final Context context2, String type) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context2);
        this.apiServices.getRegularHistoryResp(user.getId(), user.getToken(), type).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularHistoryResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularHistoryResponse regularHistoryResponse) {
                MyAlertUtils.dismissAlertDialog();
                if (regularHistoryResponse.isStatus() && regularHistoryResponse.getResponse_code() == 1) {
                    listener.bringTheHistory(regularHistoryResponse.getData());
                } else if (regularHistoryResponse.isStatus() && regularHistoryResponse.getResponse_code() == 2) {
                    listener.thereWasNoData();
                } else if (regularHistoryResponse.getResponse_code() == 999) {
                    MobileRechargesRepository.this.endTheSession(context2, regularHistoryResponse.getMessage());
                } else {
                    MyAlertUtils.showServerAlertDialog(context2, regularHistoryResponse.getMessage());
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    /* access modifiers changed from: private */
    public void endTheSession(Context context2, String message) {
        ViewUtils.showToast(context2, message);
        Intent intent = new Intent(context2, HomeActivity.class);
        intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
        intent.addFlags(268435456);
        context2.startActivity(intent);
    }
}
