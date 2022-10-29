package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.network.responses.RegularResponse;

public interface AuthListener {
    void displayMessage(String str);

    void onChangeFragmentPage(String str);

    void onFailure(String str);

    void onStarted();

    void onSuccess(AuthResponse authResponse);

    void otp_verification(RegularResponse regularResponse);
}
