package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.PayoutRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class PayoutViewModel_Factory implements Factory<PayoutViewModel> {
    private final Provider<PayoutRepository> repositoryProvider;

    public PayoutViewModel_Factory(Provider<PayoutRepository> repositoryProvider2) {
        this.repositoryProvider = repositoryProvider2;
    }

    public PayoutViewModel get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static PayoutViewModel_Factory create(Provider<PayoutRepository> repositoryProvider2) {
        return new PayoutViewModel_Factory(repositoryProvider2);
    }

    public static PayoutViewModel newInstance(PayoutRepository repository) {
        return new PayoutViewModel(repository);
    }
}
