package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryModel;
import com.sandy.cosmossoft.data.network.responses.PBeneficiaryResponse;

public interface PDMTListener {
    void bringWholePDMTData(PBeneficiaryResponse pBeneficiaryResponse);

    void causedError(String str);

    void onClickBeneficiary(View view, PBeneficiaryModel pBeneficiaryModel);

    void onDeleteBeneficiary(View view, PBeneficiaryModel pBeneficiaryModel);

    void reAssignData();

    void startOperation();
}
