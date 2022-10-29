package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.MobileRechargesRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MobileRechargeViewModel_Factory implements Factory<MobileRechargeViewModel> {
    private final Provider<MobileRechargesRepository> mobileRechargesRepositoryProvider;

    public MobileRechargeViewModel_Factory(Provider<MobileRechargesRepository> mobileRechargesRepositoryProvider2) {
        this.mobileRechargesRepositoryProvider = mobileRechargesRepositoryProvider2;
    }

    public MobileRechargeViewModel get() {
        return newInstance(this.mobileRechargesRepositoryProvider.get());
    }

    public static MobileRechargeViewModel_Factory create(Provider<MobileRechargesRepository> mobileRechargesRepositoryProvider2) {
        return new MobileRechargeViewModel_Factory(mobileRechargesRepositoryProvider2);
    }

    public static MobileRechargeViewModel newInstance(MobileRechargesRepository mobileRechargesRepository) {
        return new MobileRechargeViewModel(mobileRechargesRepository);
    }
}
