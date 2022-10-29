package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FundRepository_Factory implements Factory<FundRepository> {
    private final Provider<APIServices> apiServicesProvider;
    private final Provider<Context> contextProvider;

    public FundRepository_Factory(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        this.contextProvider = contextProvider2;
        this.apiServicesProvider = apiServicesProvider2;
    }

    public FundRepository get() {
        return newInstance(this.contextProvider.get(), this.apiServicesProvider.get());
    }

    public static FundRepository_Factory create(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        return new FundRepository_Factory(contextProvider2, apiServicesProvider2);
    }

    public static FundRepository newInstance(Context context, APIServices apiServices) {
        return new FundRepository(context, apiServices);
    }
}
