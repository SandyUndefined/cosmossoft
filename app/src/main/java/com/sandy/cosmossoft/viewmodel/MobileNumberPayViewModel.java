package com.sandy.cosmossoft.viewmodel;

import android.view.View;
import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.data.network.responses.NumberPayResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.repositories.MobileNumberPayRepository;
import com.sandy.cosmossoft.listeners.NumberPayListener;
import com.sandy.cosmossoft.listeners.ResetListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MobileNumberPayViewModel extends ViewModel {
    public String amount = null;
    public NumberPayListener listener;
    public String receiver_id = null;
    public String receiver_mobile = null;
    public String receiver_status = null;
    MobileNumberPayRepository repository;
    public ResetListener resetListener;

    @Inject
    public MobileNumberPayViewModel(MobileNumberPayRepository repository2) {
        this.repository = repository2;
    }

    public void checkIfAccountExists(String mobile) {
        this.repository.isNumberValidCheck(mobile, this.listener);
    }

    public void sendMoneyToContact(final View view) {
        String str = this.amount;
        if (str == null || str.isEmpty()) {
            MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Enter a valid amount", C0330R.C0332drawable.warning);
            return;
        }
        String ip = Provider.getLocalIpAddress();
        String device = Provider.getDeviceModel();
        User user = AppDatabase.getAppDatabase(view.getContext()).getUserDao().getRegularUser();
        if (user != null && this.receiver_mobile != null) {
            this.repository.apiServices.numberAuthenticatePay(this.receiver_mobile, user.getId(), user.getUserstatus(), user.getToken(), user.getPassword(), ip, device, this.amount).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<NumberPayResponse>() {
                public void onSubscribe(Disposable d) {
                    MyAlertUtils.showProgressAlertDialog(view.getContext());
                }

                public void onNext(NumberPayResponse numberPayResponse) {
                    if (numberPayResponse.isStatus()) {
                        MyAlertUtils.showAlertDialog(view.getContext(), "Success", numberPayResponse.getMessage(), C0330R.C0332drawable.success);
                        MobileNumberPayViewModel.this.resetListener.resetRequiredData(true);
                        return;
                    }
                    MyAlertUtils.showAlertDialog(view.getContext(), "Failed", numberPayResponse.getMessage(), C0330R.C0332drawable.failed);
                }

                public void onError(Throwable e) {
                    MyAlertUtils.showServerAlertDialog(view.getContext(), e.getMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void requestMoneyToContact(View view) {
        MyAlertUtils.showAlertDialog(view.getContext(), "Warning", "Coming soon, Currently in work..", C0330R.C0332drawable.warning);
    }
}
