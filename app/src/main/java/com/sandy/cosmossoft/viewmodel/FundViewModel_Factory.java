package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.FundRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FundViewModel_Factory implements Factory<FundViewModel> {
    private final Provider<FundRepository> fundRepositoryProvider;

    public FundViewModel_Factory(Provider<FundRepository> fundRepositoryProvider2) {
        this.fundRepositoryProvider = fundRepositoryProvider2;
    }

    public FundViewModel get() {
        return newInstance(this.fundRepositoryProvider.get());
    }

    public static FundViewModel_Factory create(Provider<FundRepository> fundRepositoryProvider2) {
        return new FundViewModel_Factory(fundRepositoryProvider2);
    }

    public static FundViewModel newInstance(FundRepository fundRepository) {
        return new FundViewModel(fundRepository);
    }
}
