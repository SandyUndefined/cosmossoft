package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CreationRepository_Factory implements Factory<CreationRepository> {
    private final Provider<APIServices> apiServicesProvider;
    private final Provider<Context> contextProvider;

    public CreationRepository_Factory(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        this.contextProvider = contextProvider2;
        this.apiServicesProvider = apiServicesProvider2;
    }

    public CreationRepository get() {
        return newInstance(this.contextProvider.get(), this.apiServicesProvider.get());
    }

    public static CreationRepository_Factory create(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        return new CreationRepository_Factory(contextProvider2, apiServicesProvider2);
    }

    public static CreationRepository newInstance(Context context, APIServices apiServices) {
        return new CreationRepository(context, apiServices);
    }
}
