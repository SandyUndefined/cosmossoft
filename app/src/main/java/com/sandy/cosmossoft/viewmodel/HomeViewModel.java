package com.sandy.cosmossoft.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.activities.addfunds.AddFundList;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.repositories.HomeRepository;
import com.sandy.cosmossoft.listeners.BringHistoryListener;
import com.sandy.cosmossoft.listeners.NumberPayListener;
import com.sandy.cosmossoft.listeners.OnBoardingListeners;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class HomeViewModel extends ViewModel {
    public static String aepsBalance = "AEPS : ";
    public static String mainBalance = "Main: ";
    public BringHistoryListener historyListener;
    public HomeRepository homeRepository;
    public String news = null;
    public OnBoardingListeners onBoardingListeners;

    @Inject
    public HomeViewModel(HomeRepository homeRepository2) {
        this.homeRepository = homeRepository2;
    }

    public void getDefaultHistory() {
    }

    public void getOnBoardingStore(String mobile, String owner, String owner_id, String partner_id, String merchant_code, String code) {
        this.homeRepository.getOnBoardingStore(this.onBoardingListeners, mobile, owner, owner_id, partner_id, merchant_code, code);
    }

    public void checkPaySprintExistence(String mobile, String activity) {
        this.homeRepository.checkValidity(this.onBoardingListeners, mobile, activity);
    }

    public void checkDmtExistence(Context context) {
        this.homeRepository.checkDmtExistence(context);
    }

    public void onAddFundClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), AddFundList.class));
    }

    public void checkIfAccountExists(String mobile, final NumberPayListener listener) {
        this.homeRepository.apiServices.numberAuthenticate(mobile).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<AuthResponse>() {
            public void onSubscribe(Disposable d) {
                listener.showProgress("Please Wait, Loading..");
            }

            public void onNext(AuthResponse authResponse) {
                listener.isNumberValid(authResponse);
            }

            public void onError(Throwable e) {
                NumberPayListener numberPayListener = listener;
                numberPayListener.showMessage("Failed due to\n" + e.getMessage());
            }

            public void onComplete() {
            }
        });
    }

    public LiveData<User> getSignedInUser() {
        return this.homeRepository.appDatabase.getUserDao().getUser();
    }

    public void bringTheNews(final TextView textView, final CardView cardView) {
        User user = this.homeRepository.appDatabase.getUserDao().getRegularUser();
        if (user != null) {
            String str = this.news;
            if (str == null) {
                this.homeRepository.apiServices.getMeLatestNews(user.getUserstatus()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
                    public void onSubscribe(Disposable d) {
                    }

                    public void onNext(String s) {
                        HomeViewModel.this.news = s;
                        textView.setText(HomeViewModel.this.news);
                        textView.setSelected(true);
                        if (!s.isEmpty()) {
                            cardView.setVisibility(0);
                        } else {
                            cardView.setVisibility(4);
                        }
                    }

                    public void onError(Throwable e) {
                        HomeViewModel.this.news = e.getLocalizedMessage();
                        textView.setText(HomeViewModel.this.news);
                    }

                    public void onComplete() {
                    }
                });
                return;
            }
            textView.setText(str);
            textView.setSelected(true);
        }
    }
}
