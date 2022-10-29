package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.listeners.NumberPayListener;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class MobileNumberPayRepository {
    public APIServices apiServices;
    AppDatabase appDatabase;

    @Inject
    public MobileNumberPayRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }

    public void isNumberValidCheck(String mobile, final NumberPayListener listener) {
        this.apiServices.numberAuthenticate(mobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
                listener.showProgress("Please Wait, Loading..");
            }

            public void onNext(AuthResponse authResponse) {
                listener.isNumberValid(authResponse);
            }

            public void onError(Throwable e) {
                listener.showMessage(e.getMessage());
            }

            public void onComplete() {
            }
        });
    }
}
