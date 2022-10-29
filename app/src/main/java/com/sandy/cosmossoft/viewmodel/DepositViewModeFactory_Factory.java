package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.CashDepositRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DepositViewModeFactory_Factory implements Factory<DepositViewModeFactory> {
    private final Provider<CashDepositRepository> repositoryProvider;

    public DepositViewModeFactory_Factory(Provider<CashDepositRepository> repositoryProvider2) {
        this.repositoryProvider = repositoryProvider2;
    }

    public DepositViewModeFactory get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static DepositViewModeFactory_Factory create(Provider<CashDepositRepository> repositoryProvider2) {
        return new DepositViewModeFactory_Factory(repositoryProvider2);
    }

    public static DepositViewModeFactory newInstance(CashDepositRepository repository) {
        return new DepositViewModeFactory(repository);
    }
}
