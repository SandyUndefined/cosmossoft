package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.CashDepositRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CashDepositViewModel_Factory implements Factory<CashDepositViewModel> {
    private final Provider<CashDepositRepository> repositoryProvider;

    public CashDepositViewModel_Factory(Provider<CashDepositRepository> repositoryProvider2) {
        this.repositoryProvider = repositoryProvider2;
    }

    public CashDepositViewModel get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static CashDepositViewModel_Factory create(Provider<CashDepositRepository> repositoryProvider2) {
        return new CashDepositViewModel_Factory(repositoryProvider2);
    }

    public static CashDepositViewModel newInstance(CashDepositRepository repository) {
        return new CashDepositViewModel(repository);
    }
}
