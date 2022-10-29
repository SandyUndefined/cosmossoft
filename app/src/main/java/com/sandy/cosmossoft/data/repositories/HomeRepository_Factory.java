package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class HomeRepository_Factory implements Factory<HomeRepository> {
    private final Provider<APIServices> apiServicesProvider;
    private final Provider<Context> contextProvider;

    public HomeRepository_Factory(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        this.contextProvider = contextProvider2;
        this.apiServicesProvider = apiServicesProvider2;
    }

    public HomeRepository get() {
        return newInstance(this.contextProvider.get(), this.apiServicesProvider.get());
    }

    public static HomeRepository_Factory create(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        return new HomeRepository_Factory(contextProvider2, apiServicesProvider2);
    }

    public static HomeRepository newInstance(Context context, APIServices apiServices) {
        return new HomeRepository(context, apiServices);
    }
}
