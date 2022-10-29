package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import android.view.View;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.UserTypeResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.listeners.CreationListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class CreationRepository {
    APIServices apiServices;
    AppDatabase appDatabase;

    @Inject
    public CreationRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }

    public void bringUserType(final CreationListener listener, final View view) {
        MyAlertUtils.showProgressAlertDialog(view.getContext());
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.bringAllSuitableUserType(user.getId(), user.getUserstatus()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<UserTypeResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(UserTypeResponse userTypeResponse) {
                MyAlertUtils.dismissAlertDialog();
                if (userTypeResponse.isStatus()) {
                    listener.achieveUserType(userTypeResponse.getData());
                } else {
                    MyAlertUtils.showServerAlertDialog(view.getContext(), userTypeResponse.getMessage());
                }
            }

            public void onError(Throwable e) {
                Context context = view.getContext();
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }
}
