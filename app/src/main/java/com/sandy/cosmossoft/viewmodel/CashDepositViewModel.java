package com.sandy.cosmossoft.viewmodel;

import androidx.lifecycle.ViewModel;
import com.sandy.cosmossoft.data.repositories.CashDepositRepository;
import javax.inject.Inject;

public class CashDepositViewModel extends ViewModel {
    public String acc;
    public String amount;
    public long latitude;
    public long longitude;
    public String mobile;
    CashDepositRepository repository;

    @Inject
    public CashDepositViewModel(CashDepositRepository repository2) {
        this.repository = repository2;
    }
}
