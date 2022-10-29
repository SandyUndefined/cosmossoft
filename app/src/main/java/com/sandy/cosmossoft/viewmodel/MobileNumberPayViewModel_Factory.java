package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.MobileNumberPayRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MobileNumberPayViewModel_Factory implements Factory<MobileNumberPayViewModel> {
    private final Provider<MobileNumberPayRepository> repositoryProvider;

    public MobileNumberPayViewModel_Factory(Provider<MobileNumberPayRepository> repositoryProvider2) {
        this.repositoryProvider = repositoryProvider2;
    }

    public MobileNumberPayViewModel get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static MobileNumberPayViewModel_Factory create(Provider<MobileNumberPayRepository> repositoryProvider2) {
        return new MobileNumberPayViewModel_Factory(repositoryProvider2);
    }

    public static MobileNumberPayViewModel newInstance(MobileNumberPayRepository repository) {
        return new MobileNumberPayViewModel(repository);
    }
}
