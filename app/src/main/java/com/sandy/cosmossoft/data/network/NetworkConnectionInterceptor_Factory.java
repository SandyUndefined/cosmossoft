package com.sandy.cosmossoft.data.network;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NetworkConnectionInterceptor_Factory implements Factory<NetworkConnectionInterceptor> {
    private final Provider<Context> contextProvider;

    public NetworkConnectionInterceptor_Factory(Provider<Context> contextProvider2) {
        this.contextProvider = contextProvider2;
    }

    public NetworkConnectionInterceptor get() {
        return newInstance(this.contextProvider.get());
    }

    public static NetworkConnectionInterceptor_Factory create(Provider<Context> contextProvider2) {
        return new NetworkConnectionInterceptor_Factory(contextProvider2);
    }

    public static NetworkConnectionInterceptor newInstance(Context context) {
        return new NetworkConnectionInterceptor(context);
    }
}
