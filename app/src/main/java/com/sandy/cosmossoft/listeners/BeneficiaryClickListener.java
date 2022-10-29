package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.network.responses.BeneficiaryBank;

public interface BeneficiaryClickListener {
    void onItemClicked(View view, BeneficiaryBank beneficiaryBank);

    void onMoreClickListener(View view, BeneficiaryBank beneficiaryBank);
}
