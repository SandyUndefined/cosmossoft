package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import com.sandy.cosmossoft.constructor.Construct;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.listeners.ManipulationListener;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observable;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {
    public static String receivedOtp;
    APIServices apiServices;
    AppDatabase appDatabase;

    @Inject
    public UserRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }

    public User getRegularUser() {
        return this.appDatabase.getUserDao().getRegularUser();
    }

    public void userLogin(final Context context, String mobile, String password, final AuthListener authListener, final ManipulationListener manipulationListener) {
        this.apiServices.getUserSignIn(mobile, password).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(AuthResponse authResponse) {
                if (authResponse.isStatus() && authResponse.response_code().equals(1)) {
                    Construct.LoginUser(context, authResponse.getUser(), new UserRepository$1$$ExternalSyntheticLambda0(this, context, authListener, authResponse));
                } else if (!authResponse.isStatus() || !authResponse.response_code().equals(3)) {
                    authListener.onFailure(authResponse.getMessage());
                } else {
                    manipulationListener.doManipulate(true);
                }
            }

            /* renamed from: lambda$onNext$0$com-sandy-cosmossoft-data-repositories-UserRepository$1 */
            public /* synthetic */ void mo1319x18d89d2(Context context, AuthListener authListener, AuthResponse authResponse) {
                UserRepository.this.mo1311xf8400690(context, authListener, authResponse);
            }

            public void onError(Throwable e) {
                AuthListener authListener = authListener;
                authListener.onFailure("Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void userLoginwithotp(Context context, String mobile, String otp, String password, AuthListener authListener) {
        this.apiServices.getuserLoginwithotp(mobile, otp, password).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new UserRepository$$ExternalSyntheticLambda1(this, context, authListener), new UserRepository$$ExternalSyntheticLambda2(authListener));
    }

    /* renamed from: lambda$userLoginwithotp$1$com-sandy-cosmossoft-data-repositories-UserRepository */
    public /* synthetic */ void mo1312x852d1daf(Context context, AuthListener authListener, AuthResponse authResponse) throws Throwable {
        if (!authResponse.isStatus() || !authResponse.response_code().equals(1)) {
            authListener.onFailure(authResponse.getMessage());
        } else {
            Construct.LoginUser(context, authResponse.getUser(), new UserRepository$$ExternalSyntheticLambda0(this, context, authListener, authResponse));
        }
    }

    /* renamed from: getPaySprintInfo */
    public void mo1311xf8400690(final Context context, final AuthListener listener, final AuthResponse authResponse) {
        this.apiServices.getPaySprintApi("dataforinsertion").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<PaySprintApi>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(PaySprintApi paySprintApi) {
                if (paySprintApi != null) {
                    Construct.savePaysprintData(context, paySprintApi, new UserRepository$2$$ExternalSyntheticLambda0(listener, authResponse));
                }
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    public void userSignup(String first_name, String last_name, String mobile, String email, String password, final AuthListener authListener) {
        this.apiServices.userSignup(first_name, last_name, mobile, email, password).enqueue(new Callback<String>() {
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    authListener.displayMessage(response.body());
                }
            }

            public void onFailure(Call<String> call, Throwable t) {
                authListener.onFailure(t.getMessage());
            }
        });
    }

    public void sendSignUpOtp(String mobile, String email, final AuthListener authListener) {
        this.apiServices.sendSignupOTP(mobile, email).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(RegularResponse response) {
                if (response.status) {
                    UserRepository.receivedOtp = response.getMessage().trim();
                    authListener.otp_verification(response);
                    return;
                }
                authListener.onFailure(response.getMessage());
            }

            public void onError(Throwable e) {
                AuthListener authListener = authListener;
                authListener.onFailure("Failed Bad: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void saveUser(User user) {
        new InsertUserAsyncTask(this.appDatabase.getUserDao()).execute(new User[]{user});
    }

    public void savePaySprint(final PaySprintApi paySprintApi) {
        final PaySprintDao sprintDao = this.appDatabase.getPaySprint();
        Observable.just("ones").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                sprintDao.insert(paySprintApi);
            }

            public void onNext(String s) {
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    public LiveData<User> getSignedInUser() {
        return this.appDatabase.getUserDao().getUser();
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

    public void forgotMyPassword(final AuthListener listener, String mobile) {
        if (mobile == null) {
            listener.onFailure("Provide a valid mobile");
        } else if (mobile.isEmpty()) {
            listener.onFailure("Provide a valid mobile");
        } else if (mobile.length() < 10) {
            listener.onFailure("Provide a valid mobile");
        } else {
            listener.onStarted();
            this.apiServices.forgotMyPassword(mobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(RegularResponse response) {
                    listener.otp_verification(response);
                }

                public void onError(Throwable e) {
                    listener.onFailure(e.getMessage());
                }

                public void onComplete() {
                }
            });
        }
    }

    public void changeEntirePassword(final AuthListener listener, String mobile, String otp, String password) {
        this.apiServices.changeMyPasswordStart(mobile, otp, password).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
            public void onSubscribe(Disposable d) {
                listener.onStarted();
            }

            public void onNext(RegularResponse response) {
                listener.otp_verification(response);
            }

            public void onError(Throwable e) {
                AuthListener authListener = listener;
                authListener.onFailure("Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }
}
