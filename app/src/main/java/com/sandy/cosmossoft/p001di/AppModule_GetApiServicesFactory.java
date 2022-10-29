package com.sandy.cosmossoft.p001di;

import com.sandy.cosmossoft.data.network.APIServices;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* renamed from: com.sandy.cosmossoft.di.AppModule_GetApiServicesFactory */
public final class AppModule_GetApiServicesFactory implements Factory<APIServices> {
    private final Provider<OkHttpClient> httpClientProvider;
    private final AppModule module;

    public AppModule_GetApiServicesFactory(AppModule module2, Provider<OkHttpClient> httpClientProvider2) {
        this.module = module2;
        this.httpClientProvider = httpClientProvider2;
    }

    public APIServices get() {
        return getApiServices(this.module, this.httpClientProvider.get());
    }

    public static AppModule_GetApiServicesFactory create(AppModule module2, Provider<OkHttpClient> httpClientProvider2) {
        return new AppModule_GetApiServicesFactory(module2, httpClientProvider2);
    }

    public static APIServices getApiServices(AppModule instance, OkHttpClient httpClient) {
        return (APIServices) Preconditions.checkNotNullFromProvides(instance.getApiServices(httpClient));
    }
}
