package com.sandy.cosmossoft.constructor;

import android.content.Context;
import android.content.Intent;
import com.sandy.cosmossoft.activities.MainActivity;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.listeners.WaitingListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import p006io.reactivex.rxjava3.core.Completable;
import p006io.reactivex.rxjava3.core.CompletableObserver;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class Construct {
    public static void logoutExecute(final Context context) {
        Completable.fromRunnable(new Construct$$ExternalSyntheticLambda0(AppDatabase.getAppDatabase(context))).subscribeOn(Schedulers.m547io()).subscribe((CompletableObserver) new CompletableObserver() {
            public void onSubscribe(Disposable d) {
            }

            public void onComplete() {
                Intent intent = new Intent(context, MainActivity.class);
                intent.setFlags(32768);
                intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
                intent.addFlags(268435456);
                MyAlertUtils.dismissAlertDialog();
                context.startActivity(intent);
            }

            public void onError(Throwable e) {
            }
        });
    }

    static /* synthetic */ void lambda$logoutExecute$0(AppDatabase appDatabase) {
        appDatabase.getUserDao().loggedOutUser();
        appDatabase.getUserProfileDao().deleteUserProfile();
        appDatabase.getPaySprint().loggedOut();
    }

    public static void LoginUser(Context context, User user, final WaitingListener listener) {
        Completable.fromRunnable(new Construct$$ExternalSyntheticLambda2(user, AppDatabase.getAppDatabase(context))).subscribeOn(Schedulers.m547io()).subscribe((CompletableObserver) new CompletableObserver() {
            public void onSubscribe(Disposable d) {
            }

            public void onComplete() {
                WaitingListener.this.taskFinished();
                MyAlertUtils.dismissAlertDialog();
            }

            public void onError(Throwable e) {
            }
        });
    }

    static /* synthetic */ void lambda$LoginUser$1(User user, AppDatabase appDatabase) {
        if (user != null) {
            appDatabase.getUserDao().insert(user);
        }
    }

    public static void savePaysprintData(Context context, PaySprintApi api, final WaitingListener listener) {
        Completable.fromRunnable(new Construct$$ExternalSyntheticLambda1(api, AppDatabase.getAppDatabase(context))).subscribeOn(Schedulers.m547io()).subscribe((CompletableObserver) new CompletableObserver() {
            public void onSubscribe(Disposable d) {
            }

            public void onComplete() {
                WaitingListener.this.taskFinished();
                MyAlertUtils.dismissAlertDialog();
            }

            public void onError(Throwable e) {
            }
        });
    }

    static /* synthetic */ void lambda$savePaysprintData$2(PaySprintApi api, AppDatabase appDatabase) {
        if (api != null) {
            appDatabase.getPaySprint().insert(api);
        }
    }

    public static void saveUser(Context context, User user) {
        Completable.fromRunnable(new Construct$$ExternalSyntheticLambda3(user, AppDatabase.getAppDatabase(context))).subscribeOn(Schedulers.m547io()).subscribe((CompletableObserver) new CompletableObserver() {
            public void onSubscribe(Disposable d) {
            }

            public void onComplete() {
            }

            public void onError(Throwable e) {
            }
        });
    }

    static /* synthetic */ void lambda$saveUser$3(User user, AppDatabase appDatabase) {
        if (user != null) {
            appDatabase.getUserDao().insert(user);
        }
    }

    public static void refreshData(Context context, User user, UserProfile profile) {
        MyAlertUtils.dismissAlertDialog();
        Completable.fromRunnable(new Construct$$ExternalSyntheticLambda4(user, AppDatabase.getAppDatabase(context), profile)).subscribeOn(Schedulers.m547io()).subscribe((CompletableObserver) new CompletableObserver() {
            public void onSubscribe(Disposable d) {
            }

            public void onComplete() {
            }

            public void onError(Throwable e) {
            }
        });
    }

    static /* synthetic */ void lambda$refreshData$4(User user, AppDatabase appDatabase, UserProfile profile) {
        if (user != null) {
            appDatabase.getUserDao().insert(user);
        }
        if (profile != null) {
            appDatabase.getUserProfileDao().insertUserProfile(profile);
        }
    }
}
