package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.AuthResponse;

public interface NumberPayListener {
    void isNumberValid(AuthResponse authResponse);

    void showMessage(String str);

    void showProgress(String str);
}
