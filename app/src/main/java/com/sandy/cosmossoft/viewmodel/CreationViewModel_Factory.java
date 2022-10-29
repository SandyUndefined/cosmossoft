package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.CreationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CreationViewModel_Factory implements Factory<CreationViewModel> {
    private final Provider<CreationRepository> repositoryProvider;

    public CreationViewModel_Factory(Provider<CreationRepository> repositoryProvider2) {
        this.repositoryProvider = repositoryProvider2;
    }

    public CreationViewModel get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static CreationViewModel_Factory create(Provider<CreationRepository> repositoryProvider2) {
        return new CreationViewModel_Factory(repositoryProvider2);
    }

    public static CreationViewModel newInstance(CreationRepository repository) {
        return new CreationViewModel(repository);
    }
}
