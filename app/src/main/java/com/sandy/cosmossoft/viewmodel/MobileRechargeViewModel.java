package com.sandy.cosmossoft.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.activities.rechargeactivities.RechargeMyPlan;
import com.sandy.cosmossoft.data.model.CircleModel;
import com.sandy.cosmossoft.data.model.OperatorModel;
import com.sandy.cosmossoft.data.network.bbp_send_response.BBPSSendResponse;
import com.sandy.cosmossoft.data.network.responses.BBPSPaymentResponse;
import com.sandy.cosmossoft.data.network.responses.FetchBillInfo;
import com.sandy.cosmossoft.data.repositories.MobileRechargesRepository;
import com.sandy.cosmossoft.listeners.CircleListener;
import com.sandy.cosmossoft.listeners.PaymentListener;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.PopupUtil;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.List;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MobileRechargeViewModel extends ViewModel implements CircleListener {
    public static String service = null;
    boolean access = false;
    public String customer_name = null;
    public String enteredNumber = null;
    public PaymentListener listener = null;
    public String logo = null;
    public String longCode = null;
    private long mLastClickTime = 0;
    public MobileRechargesRepository mobileRechargesRepository;
    public String monthly_amount = null;
    public FetchBillInfo myFetchedBill;
    public String name = null;
    public String number = null;
    public String operator = null;
    public String plan = null;
    public ResetListener resetListener;
    public String serviceType = "";
    public String userId = null;
    public String userTypeId = null;

    @Inject
    public MobileRechargeViewModel(MobileRechargesRepository mobileRechargesRepository2) {
        this.mobileRechargesRepository = mobileRechargesRepository2;
    }

    public void onRechargeButtonClick(View view) {
        if (SystemClock.elapsedRealtime() - this.mLastClickTime >= 1000) {
            if (PopupUtil.access) {
                String str = this.number;
                if (str == null || str.isEmpty()) {
                    MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide a valid number", C0330R.C0332drawable.warning);
                } else {
                    String str2 = this.plan;
                    if (str2 == null || str2.isEmpty()) {
                        MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Provide a valid plan", C0330R.C0332drawable.warning);
                    } else {
                        StringBuilder builder = new StringBuilder(this.number.replaceAll("[^\\w]", ""));
                        if (service.equals("prepaid") && builder.charAt(0) == '9' && builder.charAt(1) == '1') {
                            builder.deleteCharAt(0);
                            builder.deleteCharAt(0);
                        }
                        Log.d("IamRecharging", "Once");
                        MyAlertUtils.showProgressAlertDialog(view.getContext());
                        this.mobileRechargesRepository.getPaymentDone(this.userId, String.valueOf(builder), this.userTypeId, this.plan, this.longCode, view, this.resetListener);
                    }
                }
            } else {
                PopupUtil.tPinSystem(view.getContext(), this.mobileRechargesRepository.apiServices);
            }
            this.mLastClickTime = SystemClock.elapsedRealtime();
        }
    }

    public void onSelectedNumberClick(View view) {
        String str = this.enteredNumber;
        if (str == null || str.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Enter a valid number in search box", C0330R.C0332drawable.warning);
        } else if (this.enteredNumber.length() != 10) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Enter a valid number in search box", C0330R.C0332drawable.warning);
        } else {
            try {
                String replaceAll = this.enteredNumber.replaceAll("[^\\w]", "");
                this.enteredNumber = replaceAll;
                Long.parseLong(replaceAll);
                Intent intent = new Intent(view.getContext(), RechargeMyPlan.class);
                intent.putExtra("name", "Unknown");
                intent.putExtra("number", this.enteredNumber);
                intent.putExtra("operatorName", this.operator);
                intent.putExtra("operatorCode", this.longCode);
                intent.putExtra("logo", this.logo);
                view.getContext().startActivity(intent);
            } catch (NumberFormatException e) {
                ViewUtils.showToast(view.getContext(), "Enter a valid number in search box");
            }
        }
    }

    public LiveData<List<OperatorModel>> getOperators(String type, View view) {
        return this.mobileRechargesRepository.getOperatorsList(type, view);
    }

    public void MyCircleListener(View view, CircleModel model) {
        ViewUtils.showToast(view.getContext(), model.getCircle());
    }

    public void onFetchTheBill(View view) {
        if (this.number == null) {
            ViewUtils.showToast(view.getContext(), "Enter a valid Consumer ID");
        } else {
            this.mobileRechargesRepository.fetchMyBillOnline(view.getContext(), this.longCode, this.number, this.logo, this.operator, this.serviceType);
        }
    }

    public void payMyBBPSBill(Context context, String longitude, String latitude, String userTypeId2, String id, ResetListener listener2) {
        final Context context2 = context;
        String myDeviceModel = Provider.getDeviceModel();
        try {
            final ResetListener resetListener2 = listener2;
            try {
                this.mobileRechargesRepository.apiServices.payMyBBPSBill(new BBPSSendResponse(longitude, latitude, this.myFetchedBill.getAmount(), this.myFetchedBill, this.longCode, this.number, this.userId, userTypeId2, Provider.getLocalIpAddress(), myDeviceModel)).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<BBPSPaymentResponse>() {
                    public void onSubscribe(Disposable d) {
                        MyAlertUtils.showProgressAlertDialog(context2);
                    }

                    public void onNext(BBPSPaymentResponse bbpsPaymentResponse) {
                        if (!bbpsPaymentResponse.isStatus() || !bbpsPaymentResponse.getResponse_code().equals(1)) {
                            MyAlertUtils.showAlertDialog(context2, "Failed", bbpsPaymentResponse.getMessage(), C0330R.C0332drawable.failed);
                            return;
                        }
                        MyAlertUtils.showAlertDialog(context2, "Success", bbpsPaymentResponse.getMessage(), C0330R.C0332drawable.success);
                        resetListener2.resetRequiredData(true);
                    }

                    public void onError(Throwable e) {
                        MyAlertUtils.showServerAlertDialog(context2, e.getMessage());
                    }

                    public void onComplete() {
                    }
                });
            } catch (NullPointerException e) {
            }
        } catch (NullPointerException e2) {
            ResetListener resetListener3 = listener2;
            MyAlertUtils.dismissAlertDialog();
            ViewUtils.showToast(context2, this.myFetchedBill.getMessage());
        }
    }
}
