package com.sandy.cosmossoft.p001di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

/* renamed from: com.sandy.cosmossoft.di.AppModule_GetHttpLoggingInterceptorFactory */
public final class AppModule_GetHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
    private final AppModule module;

    public AppModule_GetHttpLoggingInterceptorFactory(AppModule module2) {
        this.module = module2;
    }

    public HttpLoggingInterceptor get() {
        return getHttpLoggingInterceptor(this.module);
    }

    public static AppModule_GetHttpLoggingInterceptorFactory create(AppModule module2) {
        return new AppModule_GetHttpLoggingInterceptorFactory(module2);
    }

    public static HttpLoggingInterceptor getHttpLoggingInterceptor(AppModule instance) {
        return (HttpLoggingInterceptor) Preconditions.checkNotNullFromProvides(instance.getHttpLoggingInterceptor());
    }
}
