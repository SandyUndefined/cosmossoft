package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.ToBankRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ToBankViewModel_Factory implements Factory<ToBankViewModel> {
    private final Provider<ToBankRepository> toBankRepositoryProvider;

    public ToBankViewModel_Factory(Provider<ToBankRepository> toBankRepositoryProvider2) {
        this.toBankRepositoryProvider = toBankRepositoryProvider2;
    }

    public ToBankViewModel get() {
        return newInstance(this.toBankRepositoryProvider.get());
    }

    public static ToBankViewModel_Factory create(Provider<ToBankRepository> toBankRepositoryProvider2) {
        return new ToBankViewModel_Factory(toBankRepositoryProvider2);
    }

    public static ToBankViewModel newInstance(ToBankRepository toBankRepository) {
        return new ToBankViewModel(toBankRepository);
    }
}
