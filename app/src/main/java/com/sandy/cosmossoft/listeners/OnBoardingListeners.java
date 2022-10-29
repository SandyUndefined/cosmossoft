package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.network.responses.PaySprintMerchant;

public interface OnBoardingListeners {
    void onBegin();

    void onBoardingResponse(String str, String str2);

    void onCheck(PaySprintMerchant paySprintMerchant, String str);

    void onComplete();

    void onFailure(String str);
}
