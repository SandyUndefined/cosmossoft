package com.sandy.cosmossoft.listeners;

import com.sandy.cosmossoft.data.model.BankModel;
import java.util.ArrayList;

public interface ToBankListener {
    void onCompleted(String str);

    void onError(String str);

    void onStarted(String str);

    void setAllBanks(ArrayList<BankModel> arrayList);
}
