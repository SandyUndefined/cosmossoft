package com.sandy.cosmossoft.fragments;

import com.sandy.cosmossoft.data.network.NetworkConnectionInterceptor;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SignUpFragment_MembersInjector implements MembersInjector<SignUpFragment> {
    private final Provider<NetworkConnectionInterceptor> networkConnectionInterceptorProvider;

    public SignUpFragment_MembersInjector(Provider<NetworkConnectionInterceptor> networkConnectionInterceptorProvider2) {
        this.networkConnectionInterceptorProvider = networkConnectionInterceptorProvider2;
    }

    public static MembersInjector<SignUpFragment> create(Provider<NetworkConnectionInterceptor> networkConnectionInterceptorProvider2) {
        return new SignUpFragment_MembersInjector(networkConnectionInterceptorProvider2);
    }

    public void injectMembers(SignUpFragment instance) {
        injectNetworkConnectionInterceptor(instance, this.networkConnectionInterceptorProvider.get());
    }

    public static void injectNetworkConnectionInterceptor(SignUpFragment instance, NetworkConnectionInterceptor networkConnectionInterceptor) {
        instance.networkConnectionInterceptor = networkConnectionInterceptor;
    }
}
