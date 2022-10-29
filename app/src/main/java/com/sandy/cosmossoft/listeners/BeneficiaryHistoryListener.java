package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryHistoryResponse;

public interface BeneficiaryHistoryListener {
    void bringAllOverHistoryAgain(boolean z);

    void clickOnMoreInfo(View view, BeneficiaryHistoryResponse beneficiaryHistoryResponse);

    void clickOnRefund(View view, BeneficiaryHistoryResponse beneficiaryHistoryResponse);

    void clickOnUpdateInfo(View view, BeneficiaryHistoryResponse beneficiaryHistoryResponse);

    void notifierScreen(boolean z);
}
