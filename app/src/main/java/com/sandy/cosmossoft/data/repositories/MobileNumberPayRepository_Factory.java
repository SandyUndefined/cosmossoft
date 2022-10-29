package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MobileNumberPayRepository_Factory implements Factory<MobileNumberPayRepository> {
    private final Provider<APIServices> apiServicesProvider;
    private final Provider<Context> contextProvider;

    public MobileNumberPayRepository_Factory(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        this.contextProvider = contextProvider2;
        this.apiServicesProvider = apiServicesProvider2;
    }

    public MobileNumberPayRepository get() {
        return newInstance(this.contextProvider.get(), this.apiServicesProvider.get());
    }

    public static MobileNumberPayRepository_Factory create(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        return new MobileNumberPayRepository_Factory(contextProvider2, apiServicesProvider2);
    }

    public static MobileNumberPayRepository newInstance(Context context, APIServices apiServices) {
        return new MobileNumberPayRepository(context, apiServices);
    }
}
