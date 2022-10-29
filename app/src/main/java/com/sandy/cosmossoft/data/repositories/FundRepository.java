package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import android.os.AsyncTask;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.GatewayResponse;
import com.sandy.cosmossoft.data.network.responses.My_Token_Res;
import com.sandy.cosmossoft.data.network.responses.OnlineFundResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.listeners.RazorPayListener;
import com.sandy.cosmossoft.listeners.ResponseTypeListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observable;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class FundRepository {
    public APIServices apiServices;
    public AppDatabase appDatabase;

    @Inject
    public FundRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }

    public void addFundServices(final Context context, String fund_type, String order_id, String amount, String status) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            String ip_address = Provider.getLocalIpAddress();
            String device = Provider.getDeviceModel();
            MyAlertUtils.showProgressAlertDialog(context);
            Context context2 = context;
            this.apiServices.onlineAddFundProcess(fund_type, order_id, user.getMobile(), user.getPassword(), amount, status, device, ip_address).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<OnlineFundResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(OnlineFundResponse onlineFundResponse) {
                    if (onlineFundResponse.isStatus()) {
                        MyAlertUtils.showAlertDialog(context, "Success", onlineFundResponse.getMessage(), C0330R.C0332drawable.success);
                    } else {
                        MyAlertUtils.showAlertDialog(context, "Failed", onlineFundResponse.getMessage(), C0330R.C0332drawable.failed);
                    }
                }

                public void onError(Throwable e) {
                    Context context = context;
                    MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
                }

                public void onComplete() {
                }
            });
            return;
        }
        Context context3 = context;
    }

    public void bringTheRazorPayData(final Context context, final RazorPayListener listener) {
        MyAlertUtils.showProgressAlertDialog(context);
        this.apiServices.getPaymentCredentials("razor_pay").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<GatewayResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(GatewayResponse gatewayResponse) {
                if (!gatewayResponse.isStatus() || gatewayResponse.getRazor_pay() == null) {
                    MyAlertUtils.showServerAlertDialog(context, "Inform Admin to Provide Razorpay credentials to server");
                } else {
                    FundRepository.this.insertPaymentGatewayData(listener, gatewayResponse);
                }
            }

            public void onError(Throwable e) {
                Context context = context;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void insertPaymentGatewayData(final RazorPayListener listener, final GatewayResponse gatewayResponse) {
        Observable.just(gatewayResponse).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<GatewayResponse>() {
            public void onSubscribe(Disposable d) {
                FundRepository.this.appDatabase.getRazorPayDao().insert(gatewayResponse.getRazor_pay());
            }

            public void onNext(GatewayResponse gatewayResponse) {
            }

            public void onError(Throwable e) {
                listener.checkedVerification(false);
            }

            public void onComplete() {
                MyAlertUtils.dismissAlertDialog();
                listener.checkedVerification(true);
            }
        });
    }

    public void bringPaytmToken(final ResponseTypeListener listener, String code, String oid, String amount) {
        this.apiServices.generateTokenCall(code, oid, amount).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<My_Token_Res>() {
            public void onSubscribe(Disposable d) {
                listener.onResponseStart();
            }

            public void onNext(My_Token_Res my_token_res) {
                listener.onResponse(my_token_res);
            }

            public void onError(Throwable e) {
                ResponseTypeListener responseTypeListener = listener;
                responseTypeListener.onError("Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void exchangeWallet(final Context context, String amount) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context);
        this.apiServices.exchangeWallet(user.getMobile(), user.getPassword(), user.getToken(), amount).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(AuthResponse authResponse) {
                if (!authResponse.isStatus()) {
                    MyAlertUtils.showServerAlertDialog(context, authResponse.getMessage());
                    return;
                }
                MyAlertUtils.showAlertDialog(context, "Result", authResponse.getMessage(), C0330R.C0332drawable.success);
                if (authResponse.user != null) {
                    FundRepository.this.saveUser(authResponse.user);
                }
            }

            public void onError(Throwable e) {
                Context context = context;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void saveUser(final User user) {
        final UserDao userDao = this.appDatabase.getUserDao();
        Observable.just("Once").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                userDao.insert(user);
            }

            public void onNext(String s) {
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    public static class InsertUserAsyncTask extends AsyncTask<User, Void, Void> {
        private UserDao userDao;

        private InsertUserAsyncTask(UserDao userDao2) {
            this.userDao = userDao2;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(User... users) {
            this.userDao.insert(users[0]);
            return null;
        }
    }
}
