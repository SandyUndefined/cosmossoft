package com.sandy.cosmossoft.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.sandy.cosmossoft.data.repositories.CashDepositRepository;
import javax.inject.Inject;

public class DepositViewModeFactory extends ViewModelProvider.NewInstanceFactory {
    CashDepositRepository repository;

    @Inject
    public DepositViewModeFactory(CashDepositRepository repository2) {
        this.repository = repository2;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        return new CashDepositViewModel(this.repository);
    }
}
