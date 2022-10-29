package com.sandy.cosmossoft.listeners;

import android.view.View;
import com.sandy.cosmossoft.data.model.BankModel;

public interface BanksListener {
    void selectedBanks(View view, BankModel bankModel);
}
