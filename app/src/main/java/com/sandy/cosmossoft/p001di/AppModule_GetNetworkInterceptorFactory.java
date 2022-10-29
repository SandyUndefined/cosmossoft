package com.sandy.cosmossoft.p001di;

import android.content.Context;
import com.sandy.cosmossoft.data.network.NetworkConnectionInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sandy.cosmossoft.di.AppModule_GetNetworkInterceptorFactory */
public final class AppModule_GetNetworkInterceptorFactory implements Factory<NetworkConnectionInterceptor> {
    private final Provider<Context> contextProvider;
    private final AppModule module;

    public AppModule_GetNetworkInterceptorFactory(AppModule module2, Provider<Context> contextProvider2) {
        this.module = module2;
        this.contextProvider = contextProvider2;
    }

    public NetworkConnectionInterceptor get() {
        return getNetworkInterceptor(this.module, this.contextProvider.get());
    }

    public static AppModule_GetNetworkInterceptorFactory create(AppModule module2, Provider<Context> contextProvider2) {
        return new AppModule_GetNetworkInterceptorFactory(module2, contextProvider2);
    }

    public static NetworkConnectionInterceptor getNetworkInterceptor(AppModule instance, Context context) {
        return (NetworkConnectionInterceptor) Preconditions.checkNotNullFromProvides(instance.getNetworkInterceptor(context));
    }
}
