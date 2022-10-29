package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.activities.MainActivity;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.ConfirmationResponse;
import com.sandy.cosmossoft.data.network.responses.DetailResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao;
import com.sandy.cosmossoft.data.p000db.dao.ProfileDao;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observable;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class ProfileRepository {
    APIServices apiServices;
    AppDatabase appDatabase;
    Context context;

    @Inject
    public ProfileRepository(Context context2, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context2);
        this.apiServices = apiServices2;
    }

    public void bringUser(final Context context2) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        this.apiServices.getUserProfileData(user.getMobile(), user.getPassword()).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<DetailResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(DetailResponse profileResponse) {
                if (profileResponse.isStatus()) {
                    ProfileRepository.this.insertUserDetails(profileResponse.getData());
                }
            }

            public void onError(Throwable e) {
                Context context = context2;
                ViewUtils.showToast(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void deleteUser(Context context2) {
        this.context = context2;
        new DeleteUserAsyncTask(this.appDatabase.getUserDao(), this.appDatabase.getPaySprint(), this.appDatabase.getUserProfileDao(), context2).execute(new Void[0]);
    }

    public static class DeleteUserAsyncTask extends AsyncTask<Void, Void, Void> {
        private final Context context;
        private final PaySprintDao paySprintDao;
        private final ProfileDao profileDao;
        private final UserDao userDao;

        private DeleteUserAsyncTask(UserDao userDao2, PaySprintDao paySprintDao2, ProfileDao profileDao2, Context context2) {
            this.userDao = userDao2;
            this.paySprintDao = paySprintDao2;
            this.profileDao = profileDao2;
            this.context = context2;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            this.userDao.loggedOutUser();
            this.paySprintDao.loggedOut();
            this.profileDao.deleteUserProfile();
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voids) {
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

    public void insertUserDetails(final UserProfile userProfile) {
        Observable.just("one").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                ProfileRepository.this.appDatabase.getUserProfileDao().insertUserProfile(userProfile);
            }

            public void onNext(String s) {
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    public void updateProfileDetails(Context context2, UserProfile userProfile, User user) {
        MyAlertUtils.showProgressAlertDialog(context2);
        final Context context3 = context2;
        final User user2 = user;
        this.apiServices.updateMyInformation(user.getId(), user.getUserstatus(), user.getPassword(), user.getName(), user.getLastname(), userProfile.getALTERNATE_PHONE_NO(), userProfile.getDOB(), userProfile.getGENDER(), userProfile.getCOUNTRY(), userProfile.getSTATE(), user.getPin(), user.getAddress(), user.getToken(), user.getMobile(), "update_profile_details").subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ConfirmationResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(ConfirmationResponse confirmationResponse) {
                if (confirmationResponse.isstatus()) {
                    MyAlertUtils.showAlertDialog(context3, "Success", confirmationResponse.getMessage(), C0330R.C0332drawable.success);
                    ProfileRepository.this.bringUser(context3);
                    ProfileRepository.this.userLogin(user2.getMobile(), user2.getPassword());
                    return;
                }
                MyAlertUtils.showAlertDialog(context3, "Failed", confirmationResponse.getMessage(), C0330R.C0332drawable.failed);
            }

            public void onError(Throwable e) {
                Context context = context3;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void updateSocialMediaDetails(Context context2, UserProfile userProfile, User user) {
        UserProfile userProfile2 = userProfile;
        MyAlertUtils.showProgressAlertDialog(context2);
        final Context context3 = context2;
        this.apiServices.updateMySocialMedia(user.getId(), user.getUserstatus(), user.getPassword(), user.getToken(), user.getMobile(), "update_social_media", userProfile2.FACEBOOK_URL, userProfile2.TWITTER_URL, userProfile2.LINKEDIN_URL, userProfile2.INSTAGRAM_URL, userProfile2.DRIBBLE_BOX_URL, userProfile2.DROPBOX_URL, userProfile2.GOOGLE_PLUS_URL, userProfile2.PINTEREST_URL, userProfile2.SKYPE_URL, userProfile2.VINE_URL).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ConfirmationResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(ConfirmationResponse confirmationResponse) {
                if (confirmationResponse.isstatus()) {
                    MyAlertUtils.showAlertDialog(context3, "Success", confirmationResponse.getMessage(), C0330R.C0332drawable.success);
                    ProfileRepository.this.bringUser(context3);
                    return;
                }
                MyAlertUtils.showAlertDialog(context3, "Failed", confirmationResponse.getMessage(), C0330R.C0332drawable.failed);
            }

            public void onError(Throwable e) {
                Context context = context3;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void updateMyPassword(final Context context2, final User user, String new_password) {
        MyAlertUtils.showProgressAlertDialog(context2);
        this.apiServices.changeMyPassword(user.getId(), user.getUserstatus(), user.getPassword(), user.getToken(), user.getMobile(), "update_my_password", new_password).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ConfirmationResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(ConfirmationResponse confirmationResponse) {
                if (confirmationResponse.isstatus()) {
                    MyAlertUtils.showAlertDialog(context2, "Success", confirmationResponse.getMessage(), C0330R.C0332drawable.success);
                    ProfileRepository.this.userLogin(user.getMobile(), user.getPassword());
                    return;
                }
                MyAlertUtils.showAlertDialog(context2, "Failed", confirmationResponse.getMessage(), C0330R.C0332drawable.failed);
            }

            public void onError(Throwable e) {
                Context context = context2;
                MyAlertUtils.showServerAlertDialog(context, "Failed due to: " + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public void userLogin(String mobile, String password) {
        this.apiServices.getUserSignIn(mobile, password).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
            }

            public void onNext(AuthResponse authResponse) {
                if (authResponse.isStatus()) {
                    ProfileRepository.this.saveUser(authResponse.getUser());
                }
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    /* access modifiers changed from: private */
    public void saveUser(final User user) {
        Observable.just("Once").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            public void onSubscribe(Disposable d) {
                ProfileRepository.this.appDatabase.getUserDao().insert(user);
            }

            public void onNext(String s) {
            }

            public void onError(Throwable e) {
            }

            public void onComplete() {
            }
        });
    }

    public void updateProfilePicture(final Context context2, String image_encoded) {
        User user = this.appDatabase.getUserDao().getRegularUser();
        MyAlertUtils.showProgressAlertDialog(context2);
        if (user != null) {
            this.apiServices.updateProfilePicture(image_encoded, user.getId(), user.getPassword(), user.getToken()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegularResponse>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(RegularResponse response) {
                    MyAlertUtils.dismissAlertDialog();
                    if (response.getResponse_code().equals(1)) {
                        MyAlertUtils.showAlertDialog(context2, "Result", response.getMessage(), C0330R.C0332drawable.success);
                        ProfileRepository.this.bringUser(context2);
                        return;
                    }
                    MyAlertUtils.showAlertDialog(context2, "Result", response.getMessage(), C0330R.C0332drawable.warning);
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
}
