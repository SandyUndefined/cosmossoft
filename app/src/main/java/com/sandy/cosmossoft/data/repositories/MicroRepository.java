package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.util.ViewUtils;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MicroRepository {
    APIServices apiServices;
    AppDatabase appDatabase;

    public MicroRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }

    public void updateTheDatabase(Context context, String message, String response, String transAmount, String balAmount, String balRrn, String txnId, String transType, String type, String cardNumber, String cardType, String terminalId, String bankName, String reference, String boolstatus) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        final Context context2 = context;
        this.apiServices.insertReportForMicroAtm(message, response, transAmount, balAmount, balRrn, txnId, transType, type, cardNumber, cardType, terminalId, bankName, user.getId(), user.getUserstatus(), reference, boolstatus).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(String s) {
                ViewUtils.showToast(context2, s);
            }

            public void onError(Throwable e) {
                Context context = context2;
                ViewUtils.showToast(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }
}
