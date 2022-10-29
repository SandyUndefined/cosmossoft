package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.HomeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
    private final Provider<HomeRepository> homeRepositoryProvider;

    public HomeViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider2) {
        this.homeRepositoryProvider = homeRepositoryProvider2;
    }

    public HomeViewModel get() {
        return newInstance(this.homeRepositoryProvider.get());
    }

    public static HomeViewModel_Factory create(Provider<HomeRepository> homeRepositoryProvider2) {
        return new HomeViewModel_Factory(homeRepositoryProvider2);
    }

    public static HomeViewModel newInstance(HomeRepository homeRepository) {
        return new HomeViewModel(homeRepository);
    }
}
