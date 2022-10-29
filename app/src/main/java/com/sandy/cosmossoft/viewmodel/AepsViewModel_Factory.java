package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.AepsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AepsViewModel_Factory implements Factory<AepsViewModel> {
    private final Provider<AepsRepository> aepsRepositoryProvider;

    public AepsViewModel_Factory(Provider<AepsRepository> aepsRepositoryProvider2) {
        this.aepsRepositoryProvider = aepsRepositoryProvider2;
    }

    public AepsViewModel get() {
        return newInstance(this.aepsRepositoryProvider.get());
    }

    public static AepsViewModel_Factory create(Provider<AepsRepository> aepsRepositoryProvider2) {
        return new AepsViewModel_Factory(aepsRepositoryProvider2);
    }

    public static AepsViewModel newInstance(AepsRepository aepsRepository) {
        return new AepsViewModel(aepsRepository);
    }
}
