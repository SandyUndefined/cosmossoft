package com.sandy.cosmossoft.viewmodel;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.repositories.UserRepository;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.listeners.ManipulationListener;
import com.sandy.cosmossoft.util.MyAlertUtils;
import com.sandy.cosmossoft.util.ViewUtils;
import java.util.Objects;
import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    public static String editOtp = null;
    public static String email = null;
    public static String first_name = null;
    public static String inputotp = "";
    public static String last_name = null;
    public static String mobile = "";
    public static String password = "";
    public static String password_one = null;
    public static String password_two = null;
    public AuthListener authListener = null;
    public ManipulationListener manipulationListener = null;
    public UserRepository userRepository;
    public boolean withOtp = false;

    @Inject
    public AuthViewModel(UserRepository userRepository2) {
        this.userRepository = userRepository2;
    }

    public void onLoginButtonClick(View view) {
        String str;
        this.authListener.onStarted();
        String str2 = mobile;
        if (str2 == null || str2.isEmpty() || (str = password) == null || str.isEmpty()) {
            String str3 = mobile;
            Objects.requireNonNull(str3);
            String str4 = str3;
            if (str3.length() < 10) {
                this.authListener.onFailure("Enter valid mobile");
            } else {
                this.authListener.onFailure("Check mobile and Password Again..");
            }
        } else if (this.withOtp) {
            this.userRepository.userLoginwithotp(view.getContext(), mobile, inputotp, password, this.authListener);
        } else {
            this.userRepository.userLogin(view.getContext(), mobile, password, this.authListener, this.manipulationListener);
        }
    }

    public void onSignupButtonClick(View view) {
        String str = first_name;
        if (str == null || str.isEmpty()) {
            this.authListener.onFailure("Provide a valid first name");
            return;
        }
        String str2 = last_name;
        if (str2 == null || str2.isEmpty()) {
            this.authListener.onFailure("Provide a valid last name");
            return;
        }
        String str3 = mobile;
        if (str3 == null || str3.isEmpty() || mobile.length() < 10) {
            this.authListener.onFailure("Provide a valid mobile");
            return;
        }
        String str4 = email;
        if (str4 == null || str4.isEmpty() || !ViewUtils.isEmailValid(email)) {
            this.authListener.onFailure("Provide a valid email");
            return;
        }
        this.authListener.onStarted();
        this.userRepository.sendSignUpOtp(mobile, email, this.authListener);
    }

    public void onOTPButtonClick(View view) {
        String str = editOtp;
        if (str == null || str.isEmpty()) {
            this.authListener.onFailure("Provide OTP");
        } else if (!editOtp.equals(UserRepository.receivedOtp)) {
            this.authListener.onFailure("Enter the valid OTP");
        } else if (editOtp.equals(UserRepository.receivedOtp)) {
            this.authListener.onStarted();
            this.authListener.displayMessage("9900");
        }
    }

    public LiveData<User> getLoggedInUser() {
        return this.userRepository.getSignedInUser();
    }

    public void onSignupPageChange(View view) {
        this.authListener.onChangeFragmentPage("register");
    }

    public void onSigninPageChange(View view) {
        this.authListener.onChangeFragmentPage("sign_in");
    }

    public void onForgotPasswordPageChange(View view) {
        this.authListener.onChangeFragmentPage("forgot");
    }

    public void onCreateAccountButtonClick(View view) {
        String str;
        String str2 = password_one;
        if (str2 == null || str2.isEmpty() || (str = password_two) == null || str.isEmpty()) {
            this.authListener.onFailure("Enter both passwords.");
        } else if (!password_one.equals(password_two)) {
            this.authListener.onFailure("Both passwords don't match.");
        } else {
            this.userRepository.userSignup(first_name, last_name, mobile, email, password_one, this.authListener);
            this.authListener.onStarted();
        }
    }

    public void onForgotPasswordButtonClick(View view) {
        this.userRepository.forgotMyPassword(this.authListener, mobile);
    }

    public void onPasswordChangeButtonClick(View view) {
        String str = password_one;
        if (str == null) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter a valid password");
        } else if (str.isEmpty() || password_one.length() < 5) {
            MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter a valid password more the 5 character");
        } else {
            String str2 = password_two;
            if (str2 == null) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter a valid password");
            } else if (str2.isEmpty() || password_two.length() < 5) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Enter a valid password more the 5 character");
            } else if (!password_one.equals(password_two)) {
                MyAlertUtils.showServerAlertDialog(view.getContext(), "Password don't match");
            } else {
                this.userRepository.changeEntirePassword(this.authListener, mobile, editOtp, password_two);
            }
        }
    }
}
