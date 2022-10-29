package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MobileRechargesRepository_Factory implements Factory<MobileRechargesRepository> {
    private final Provider<APIServices> apiServicesProvider;
    private final Provider<Context> contextProvider;

    public MobileRechargesRepository_Factory(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        this.contextProvider = contextProvider2;
        this.apiServicesProvider = apiServicesProvider2;
    }

    public MobileRechargesRepository get() {
        return newInstance(this.contextProvider.get(), this.apiServicesProvider.get());
    }

    public static MobileRechargesRepository_Factory create(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        return new MobileRechargesRepository_Factory(contextProvider2, apiServicesProvider2);
    }

    public static MobileRechargesRepository newInstance(Context context, APIServices apiServices) {
        return new MobileRechargesRepository(context, apiServices);
    }
}
