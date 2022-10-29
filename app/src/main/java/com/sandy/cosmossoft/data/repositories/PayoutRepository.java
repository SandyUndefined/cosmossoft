package com.sandy.cosmossoft.data.repositories;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.activities.HomeActivity;
import com.sandy.cosmossoft.activities.Payouts.PayoutHome;
import com.sandy.cosmossoft.activities.payoutpaysprint.PaysprintPayout;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryResponse;
import com.sandy.cosmossoft.data.network.responses.PayoutAddResponse;
import com.sandy.cosmossoft.data.network.responses.PayoutListResponse;
import com.sandy.cosmossoft.data.network.responses.PayoutResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.listeners.PDMTListener;
import com.sandy.cosmossoft.listeners.PayoutHomeListener;
import com.sandy.cosmossoft.listeners.PayoutListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class PayoutRepository {
    public APIServices apiServices;
    AppDatabase appDatabase;
    Context context;

    @Inject
    public PayoutRepository(Context context2, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context2);
        this.apiServices = apiServices2;
    }

    public void reAuthenticateTheUser(String loc, Context context2, String amount, String bank, String ifsc, String trans_type, PayoutListener listener) {
        this.context = context2;
        MyAlertUtils.showProgressAlertDialog(context2);
        User user = this.appDatabase.getUserDao().getRegularUser();
        final String str = loc;
        final String str2 = amount;
        final String str3 = bank;
        final String str4 = ifsc;
        final String str5 = trans_type;
        final PayoutListener payoutListener = listener;
        final Context context3 = context2;
        this.apiServices.reAuthenticateUser(user.getMobile(), user.getPassword(), user.getToken()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(AuthResponse authResponse) {
                if (authResponse.isStatus()) {
                    PayoutRepository.this.saveUser(authResponse.getUser());
                    if (str.equals("dmt")) {
                        PayoutRepository.this.payThroughPayouts(str2, str3, str4, str5, payoutListener);
                    } else if (str.equals("payout")) {
                        PayoutRepository.this.payThroughPayoutsPayTm(str2, str3, str4, str5, payoutListener);
                    }
                } else {
                    MyAlertUtils.showServerAlertDialog(context3, "Session Expired");
                    PayoutRepository.this.deleteUser();
                }
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(context3, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void payThroughPayoutsPayTm(String amount, String bank, String ifsc, String trans_type, PayoutListener listener) {
        String myDeviceModel = Build.MODEL;
        String ip = Provider.getLocalIpAddress();
        User user = this.appDatabase.getUserDao().getRegularUser();
        final PayoutListener payoutListener = listener;
        this.apiServices.payThroughPayoutsPayTm(amount, bank, ifsc, trans_type, user.getId(), user.getUserstatus(), ip, myDeviceModel).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PayoutResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(PayoutResponse payoutResponse) {
                if (payoutResponse.getStatusCode().equals("DE_002")) {
                    payoutListener.resetAll(true);
                    MyAlertUtils.showAlertDialog(PayoutRepository.this.context, payoutResponse.getStatus(), payoutResponse.getStatusMessage(), C0330R.C0332drawable.success);
                    return;
                }
                MyAlertUtils.showAlertDialog(PayoutRepository.this.context, payoutResponse.getStatus(), payoutResponse.getStatusMessage(), C0330R.C0332drawable.failed);
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(PayoutRepository.this.context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void saveUser(User user) {
        new InsertUserAsyncTask(this.appDatabase.getUserDao()).execute(new User[]{user});
    }

    public void deleteUser() {
        new DeleteUserAsyncTask(this.appDatabase.getUserDao(), this.appDatabase.getPaySprint()).execute(new Void[0]);
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
        private PaySprintDao paySprintDao;
        private UserDao userDao;

        private DeleteUserAsyncTask(UserDao userDao2, PaySprintDao paySprintDao2) {
            this.userDao = userDao2;
            this.paySprintDao = paySprintDao2;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voids) {
            this.userDao.loggedOutUser();
            this.paySprintDao.loggedOut();
            return null;
        }
    }

    public void payThroughPayouts(String amount, String bank, String ifsc, String trans_type, PayoutListener listener) {
        String myDeviceModel = Build.MODEL;
        String ip = Provider.getLocalIpAddress();
        User user = this.appDatabase.getUserDao().getRegularUser();
        final PayoutListener payoutListener = listener;
        this.apiServices.payThroughPayouts(amount, bank, ifsc, trans_type, user.getId(), user.getUserstatus(), ip, myDeviceModel).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PayoutResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(PayoutResponse payoutResponse) {
                if (payoutResponse.getStatusCode().equals("DE_002")) {
                    payoutListener.resetAll(true);
                    MyAlertUtils.showAlertDialog(PayoutRepository.this.context, payoutResponse.getStatus(), payoutResponse.getStatusMessage(), C0330R.C0332drawable.success);
                    return;
                }
                MyAlertUtils.showAlertDialog(PayoutRepository.this.context, payoutResponse.getStatus(), payoutResponse.getStatusMessage(), C0330R.C0332drawable.failed);
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(PayoutRepository.this.context, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void addPDMTBeneficiary(final Context context2, String acc, String ifsc, String name) {
        MyAlertUtils.showProgressAlertDialog(context2);
        User user = this.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            this.apiServices.addPDmtBeneficiary(user.getId(), user.getPassword(), user.getToken(), acc, ifsc, name).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(RegularResponse regularResponse) {
                    if (regularResponse.response_code.equals(2)) {
                        Intent intent = new Intent(context2, HomeActivity.class);
                        intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                        intent.addFlags(268435456);
                        context2.startActivity(intent);
                    } else if (!regularResponse.isStatus() || !regularResponse.response_code.equals(1)) {
                        MyAlertUtils.showServerAlertDialog(context2, regularResponse.getMessage());
                    } else {
                        ViewUtils.showToast(context2, regularResponse.getMessage());
                        Intent intent2 = new Intent(context2, PayoutHome.class);
                        intent2.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                        intent2.addFlags(268435456);
                        context2.startActivity(intent2);
                    }
                }

                public void onError(Throwable e) {
                    Context context = context2;
                    MyAlertUtils.showServerAlertDialog(context, "Failed due to\n" + e.getLocalizedMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void paySprintPayoutList(final PayoutHomeListener listener) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.paySprintPayoutList(user.getId(), user.getToken(), "list").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PayoutListResponse>() {
            public void onSubscribe(Disposable d) {
                listener.initiateStart();
            }

            public void onNext(PayoutListResponse response) {
                if (!response.isStatus() || response.getResponse_code() != 1) {
                    listener.setErrorInFetch(response.getMessage());
                } else {
                    listener.setWholeRecycler(response.getData());
                }
            }

            public void onError(Throwable e) {
                PayoutHomeListener payoutHomeListener = listener;
                payoutHomeListener.setErrorInFetch("Failed due to\n" + e.getLocalizedMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void addPayoutAccount(final Context context2, String bank_id, String acc, String ifsc, String name, String bank_name) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context2);
        Context context3 = context2;
        this.apiServices.paySprintPayoutAddAccount(user.getId(), user.getToken(), bank_id, acc, ifsc, name, bank_name, "add_acc").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PayoutAddResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(PayoutAddResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.getStatuscode() == 999) {
                    ViewUtils.showToast(context2, response.getMessage());
                    Intent intent = new Intent(context2, HomeActivity.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    context2.startActivity(intent);
                } else if (response.isStatus()) {
                    ViewUtils.showToast(context2, response.getMessage());
                    Intent intent2 = new Intent(context2, PaysprintPayout.class);
                    intent2.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent2.addFlags(268435456);
                    context2.startActivity(intent2);
                } else {
                    MyAlertUtils.showWarningAlertDialog(context2, response.getMessage());
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "failed due to\n" + e.getLocalizedMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void verifyAccount(final Context context2, String pan, String faadhar, String baadhar, String passbook, String doc_type, String row_id, String bene_id) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context2);
        Context context3 = context2;
        this.apiServices.verifyPayoutAccount(user.getId(), user.getToken(), pan, faadhar, baadhar, passbook, doc_type, row_id, bene_id, "verification").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.getResponse_code().intValue() == 999) {
                    ViewUtils.showToast(context2, response.getMessage());
                    Intent intent = new Intent(context2, HomeActivity.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    context2.startActivity(intent);
                } else if (!response.isStatus() || response.getResponse_code().intValue() != 1) {
                    MyAlertUtils.showWarningAlertDialog(context2, response.getMessage());
                } else {
                    ViewUtils.showToast(context2, response.getMessage());
                    Intent intent2 = new Intent(context2, PaysprintPayout.class);
                    intent2.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent2.addFlags(268435456);
                    context2.startActivity(intent2);
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "failed due to\n" + e.getLocalizedMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void sendMoneyPayouts(final Context context2, final Dialog dialog, String bene_id, String mode, String amount) {
        MyAlertUtils.showProgressAlertDialog(context2);
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.sendMoneyOnPayAmount(user.getId(), user.getToken(), bene_id, amount, mode, Provider.getLocalIpAddress(), Provider.getDeviceModel(), "do_transaction").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse response) {
                MyAlertUtils.dismissAlertDialog();
                if (response.getResponse_code().intValue() == 999) {
                    ViewUtils.showToast(context2, response.getMessage());
                    Intent intent = new Intent(context2, HomeActivity.class);
                    intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                    intent.addFlags(268435456);
                    context2.startActivity(intent);
                } else if (!response.isStatus() || response.getResponse_code().intValue() != 1) {
                    MyAlertUtils.showWarningAlertDialog(context2, response.getMessage());
                } else {
                    dialog.dismiss();
                    MyAlertUtils.showAlertDialog(context2, "Success", response.getMessage(), C0330R.C0332drawable.success);
                }
            }

            public void onError(Throwable e) {
                MyAlertUtils.showServerAlertDialog(context2, e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void deleteTheBeneficiary(final PDMTListener listener, String given_id) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            this.apiServices.deletePDmtBeneficiary(user.getId(), user.getPassword(), user.getToken(), given_id).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
                public void onSubscribe(Disposable d) {
                    listener.startOperation();
                }

                public void onNext(RegularResponse regularResponse) {
                    if (!regularResponse.isStatus() || !regularResponse.response_code.equals(1)) {
                        listener.causedError(regularResponse.getMessage());
                    } else {
                        listener.reAssignData();
                    }
                }

                public void onError(Throwable e) {
                    PDMTListener pDMTListener = listener;
                    pDMTListener.causedError("Failed due to\n" + e.getLocalizedMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void getPDmtList(final PDMTListener listener) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            this.apiServices.getPDmtBeneficiary(user.getId(), user.getPassword(), user.getToken()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PBeneficiaryResponse>() {
                public void onSubscribe(Disposable d) {
                    listener.startOperation();
                }

                public void onNext(PBeneficiaryResponse pBeneficiaryResponse) {
                    listener.bringWholePDMTData(pBeneficiaryResponse);
                }

                public void onError(Throwable e) {
                    PDMTListener pDMTListener = listener;
                    pDMTListener.causedError("Failed due to\n" + e.getLocalizedMessage());
                }

                public void onComplete() {
                }
            });
        }
    }
}
