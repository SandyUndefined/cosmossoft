package com.sandy.cosmossoft.p001di;

import android.content.Context;
import com.sandy.cosmossoft.data.network.NetworkConnectionInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* renamed from: com.sandy.cosmossoft.di.AppModule_GetOkHttpClientFactory */
public final class AppModule_GetOkHttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<Context> contextProvider;
    private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;
    private final AppModule module;
    private final Provider<NetworkConnectionInterceptor> networkConnectionInterceptorProvider;

    public AppModule_GetOkHttpClientFactory(AppModule module2, Provider<Context> contextProvider2, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider2, Provider<NetworkConnectionInterceptor> networkConnectionInterceptorProvider2) {
        this.module = module2;
        this.contextProvider = contextProvider2;
        this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider2;
        this.networkConnectionInterceptorProvider = networkConnectionInterceptorProvider2;
    }

    public OkHttpClient get() {
        return getOkHttpClient(this.module, this.contextProvider.get(), this.httpLoggingInterceptorProvider.get(), this.networkConnectionInterceptorProvider.get());
    }

    public static AppModule_GetOkHttpClientFactory create(AppModule module2, Provider<Context> contextProvider2, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider2, Provider<NetworkConnectionInterceptor> networkConnectionInterceptorProvider2) {
        return new AppModule_GetOkHttpClientFactory(module2, contextProvider2, httpLoggingInterceptorProvider2, networkConnectionInterceptorProvider2);
    }

    public static OkHttpClient getOkHttpClient(AppModule instance, Context context, HttpLoggingInterceptor httpLoggingInterceptor, NetworkConnectionInterceptor networkConnectionInterceptor) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(instance.getOkHttpClient(context, httpLoggingInterceptor, networkConnectionInterceptor));
    }
}
