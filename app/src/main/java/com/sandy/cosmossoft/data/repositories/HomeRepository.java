package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import com.fingpay.microatmsdk.utils.Constants;
import com.sandy.cosmossoft.activities.MainActivity;
import com.sandy.cosmossoft.activities.addfunds.FundDetailedAnalytic;
import com.sandy.cosmossoft.activities.aeps.AepsDetailedAnalytic;
import com.sandy.cosmossoft.activities.aeps.MiniStatementAnalytic;
import com.sandy.cosmossoft.activities.bbps.BBPSDetailedAnalytic;
import com.sandy.cosmossoft.activities.microatm.MicroAtmDetailedAnalytic;
import com.sandy.cosmossoft.activities.payoutpaysprint.PayoutDetailedAnalytic;
import com.sandy.cosmossoft.activities.rechargeactivities.RechargeDetailedAnalytic;
import com.sandy.cosmossoft.activities.tobank.DMTDetailedAnalytic;
import com.sandy.cosmossoft.activities.tobank.QueryRemitter;
import com.sandy.cosmossoft.activities.tobank.ToAccount;
import com.sandy.cosmossoft.data.model.HistoryModel;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AnalyticsResponseModel;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.DetailedHistoryResponse;
import com.sandy.cosmossoft.data.network.responses.PaySprintMerchant;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.listeners.AnalyticOperationListener;
import com.sandy.cosmossoft.listeners.BringHistoryListener;
import com.sandy.cosmossoft.listeners.OnBoardingListeners;
import com.sandy.cosmossoft.util.DisplayMessageUtil;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.List;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class HomeRepository {
    public APIServices apiServices;
    public AppDatabase appDatabase;
    Context context;

    @Inject
    public HomeRepository(Context context2, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context2);
        this.context = context2;
        this.apiServices = apiServices2;
    }

    public void reAuthenticateTheUser(final Context context2) {
        this.context = context2;
        User user = this.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            this.apiServices.reAuthenticateUser(user.getMobile(), user.getPassword(), user.getToken()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(AuthResponse authResponse) {
                    if (authResponse.isStatus()) {
                        HomeRepository.this.saveUser(authResponse.getUser());
                    } else {
                        HomeRepository.this.deleteUser();
                    }
                }

                public void onError(Throwable e) {
                    ViewUtils.showToast(context2, e.getMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void getMyHistories(final BringHistoryListener listener, String indexing, String fromDate, String toDate, String transType, String result, String id) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        BringHistoryListener bringHistoryListener = listener;
        this.apiServices.getHistory(user.getId(), user.getUserstatus(), indexing, fromDate, toDate, transType, result, id).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<HistoryModel>>() {
            public void onSubscribe(Disposable d) {
                listener.onStart("Please wait, While Loading...");
            }

            public void onNext(List<HistoryModel> historyModels) {
                listener.onHistoryBrought(historyModels);
            }

            public void onError(Throwable e) {
                listener.onFailure(e.toString());
            }

            public void onComplete() {
                listener.onComplete("Completed..");
            }
        });
    }

    public void getOnBoardingStore(final OnBoardingListeners listeners, String mobile, String owner, String owner_id, String partner_id, String merchant_code, String code) {
        this.apiServices.onSuccessOnBoarding(mobile, owner, owner_id, partner_id, merchant_code, code).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                listeners.onBegin();
            }

            public void onNext(String result) {
                listeners.onBoardingResponse(result, "insertion");
            }

            public void onError(Throwable e) {
                listeners.onFailure(e.getMessage());
            }

            public void onComplete() {
                listeners.onComplete();
            }
        });
    }

    public void checkValidity(final OnBoardingListeners listeners, String mobile, final String activity) {
        this.apiServices.isValidAccount(mobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PaySprintMerchant>() {
            public void onSubscribe(Disposable d) {
                listeners.onBegin();
            }

            public void onNext(PaySprintMerchant merchant) {
                listeners.onCheck(merchant, activity);
            }

            public void onError(Throwable e) {
                listeners.onFailure(e.getMessage());
            }

            public void onComplete() {
                listeners.onComplete();
            }
        });
    }

    public void saveUser(User user) {
        new InsertUserAsyncTask(this.appDatabase.getUserDao()).execute(new User[]{user});
    }

    public void deleteUser() {
        new DeleteUserAsyncTask(this.appDatabase.getUserDao(), this.appDatabase.getPaySprint(), this.context).execute(new Void[0]);
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

    public static class DeleteUserAsyncTask extends AsyncTask<Void, Void, Void> {
        private Context context;
        private final PaySprintDao paySprintDao;
        private final UserDao userDao;

        private DeleteUserAsyncTask(UserDao userDao2, PaySprintDao paySprintDao2, Context context2) {
            this.userDao = userDao2;
            this.paySprintDao = paySprintDao2;
            this.context = context2;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voids) {
            this.userDao.loggedOutUser();
            this.paySprintDao.loggedOut();
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            Intent intent = new Intent(this.context.getApplicationContext(), MainActivity.class);
            intent.setFlags(268468224);
            ViewUtils.showToast(this.context, "Session Expired.");
            this.context.startActivity(intent);
        }
    }

    public void checkDmtExistence(final Context context2) {
        AppDatabase appDatabase2 = AppDatabase.getAppDatabase(context2);
        this.appDatabase = appDatabase2;
        User user = appDatabase2.getUserDao().getRegularUser();
        if (user != null) {
            MyAlertUtils.showProgressAlertDialog(context2);
            this.apiServices.isThereAnyDMT(user.getId(), user.getUserstatus()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Integer>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(Integer code) {
                    if (code.equals(1)) {
                        context2.startActivity(new Intent(context2, ToAccount.class));
                        return;
                    }
                    context2.startActivity(new Intent(context2, QueryRemitter.class));
                }

                public void onError(Throwable e) {
                    Context context = context2;
                    MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
                }

                public void onComplete() {
                    MyAlertUtils.dismissAlertDialog();
                }
            });
        }
    }

    public void getAnalyticsData(final BringHistoryListener listener, String indexing, String fromDate, String toDate, String transType, String result, String id) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            BringHistoryListener bringHistoryListener = listener;
            this.apiServices.getAllAnalytics(user.getId(), user.getUserstatus(), indexing, fromDate, toDate, transType, result, id).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<AnalyticsResponseModel>>() {
                public void onSubscribe(Disposable d) {
                    listener.onStart("Please wait.. loading data");
                }

                public void onNext(List<AnalyticsResponseModel> analyticsResponseModels) {
                    listener.onAnalyticsBrought(analyticsResponseModels);
                }

                public void onError(Throwable e) {
                    listener.onFailure(e.getMessage());
                }

                public void onComplete() {
                    listener.onComplete("Finished..");
                }
            });
            return;
        }
        BringHistoryListener bringHistoryListener2 = listener;
    }

    public void fullDetailsOfAnalytics(final Context context2, String report_id, final AnalyticsResponseModel model) {
        String user_id = this.appDatabase.getUserDao().getRegularUser().getId();
        if (report_id != null && user_id != null) {
            MyAlertUtils.showProgressAlertDialog(context2);
            this.apiServices.getMyAnalyticDetailed(report_id, user_id).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<DetailedHistoryResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(DetailedHistoryResponse detailedHistoryResponse) {
                    Intent intent;
                    MyAlertUtils.dismissAlertDialog();
                    if (!detailedHistoryResponse.isStatus() || detailedHistoryResponse.getResponse_code().equals(Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT))) {
                        MyAlertUtils.showServerAlertDialog(context2, detailedHistoryResponse.getMessage());
                    } else if (detailedHistoryResponse.getTrans_type() == null) {
                    } else {
                        if (detailedHistoryResponse.getTrans_type().equals("recharge")) {
                            Intent intent2 = new Intent(context2, RechargeDetailedAnalytic.class);
                            intent2.putExtra("detailed", detailedHistoryResponse);
                            intent2.putExtra("regular", model);
                            context2.startActivity(intent2);
                        } else if (detailedHistoryResponse.getTrans_type().equals("bbps")) {
                            Intent intent3 = new Intent(context2, BBPSDetailedAnalytic.class);
                            intent3.putExtra("detailed", detailedHistoryResponse);
                            intent3.putExtra("regular", model);
                            context2.startActivity(intent3);
                        } else if (detailedHistoryResponse.getTrans_type().equals("atm")) {
                            Intent intent4 = new Intent(context2, MicroAtmDetailedAnalytic.class);
                            intent4.putExtra("detailed", detailedHistoryResponse);
                            intent4.putExtra("regular", model);
                            context2.startActivity(intent4);
                        } else if (detailedHistoryResponse.getTrans_type().equals("dmt")) {
                            Intent intent5 = new Intent(context2, DMTDetailedAnalytic.class);
                            intent5.putExtra("detailed", detailedHistoryResponse);
                            intent5.putExtra("regular", model);
                            context2.startActivity(intent5);
                        } else if (detailedHistoryResponse.getTrans_type().equals("payout")) {
                            Intent intent6 = new Intent(context2, PayoutDetailedAnalytic.class);
                            intent6.putExtra("detailed", detailedHistoryResponse);
                            intent6.putExtra("regular", model);
                            context2.startActivity(intent6);
                        } else if (detailedHistoryResponse.getTrans_type().equals("fund")) {
                            Intent intent7 = new Intent(context2, FundDetailedAnalytic.class);
                            intent7.putExtra("detailed", detailedHistoryResponse);
                            intent7.putExtra("regular", model);
                            context2.startActivity(intent7);
                        } else if (detailedHistoryResponse.getTrans_type().equals("aeps") && detailedHistoryResponse.getType_response() != null) {
                            if (detailedHistoryResponse.getType_response().equals(Constants.MICROATM_MS)) {
                                intent = new Intent(context2, MiniStatementAnalytic.class);
                            } else {
                                intent = new Intent(context2, AepsDetailedAnalytic.class);
                            }
                            intent.putExtra("detailed", detailedHistoryResponse);
                            intent.putExtra("regular", model);
                            context2.startActivity(intent);
                        }
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
    }

    public void updatePendingStatus(String reference_id, String type, final Context context2, final AnalyticOperationListener listener) {
        this.apiServices.getUpdatesOnTransaction(type, reference_id).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
                MyAlertUtils.showProgressAlertDialog(context2);
            }

            public void onNext(RegularResponse response) {
                DisplayMessageUtil.dismissDialog();
                if (!response.isStatus() || !response.getResponse_code().equals(1)) {
                    DisplayMessageUtil.error(context2, response.getMessage());
                    return;
                }
                DisplayMessageUtil.anotherDialogSuccess(context2, response.getMessage());
                listener.resetAllData();
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public LiveData<UserProfile> getUserProfileLiveData() {
        return this.appDatabase.getUserProfileDao().getUserProfile();
    }
}
