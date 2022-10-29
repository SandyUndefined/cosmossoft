package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProfileRepository_Factory implements Factory<ProfileRepository> {
    private final Provider<APIServices> apiServicesProvider;
    private final Provider<Context> contextProvider;

    public ProfileRepository_Factory(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        this.contextProvider = contextProvider2;
        this.apiServicesProvider = apiServicesProvider2;
    }

    public ProfileRepository get() {
        return newInstance(this.contextProvider.get(), this.apiServicesProvider.get());
    }

    public static ProfileRepository_Factory create(Provider<Context> contextProvider2, Provider<APIServices> apiServicesProvider2) {
        return new ProfileRepository_Factory(contextProvider2, apiServicesProvider2);
    }

    public static ProfileRepository newInstance(Context context, APIServices apiServices) {
        return new ProfileRepository(context, apiServices);
    }
}
