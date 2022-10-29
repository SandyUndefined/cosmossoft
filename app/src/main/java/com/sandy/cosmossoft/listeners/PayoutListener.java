package com.sandy.cosmossoft.listeners;

public interface PayoutListener {
    void onTransactionTypeChange(String str);

    void resetAll(boolean z);
}
