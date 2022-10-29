package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
    private final Provider<UserRepository> userRepositoryProvider;

    public AuthViewModel_Factory(Provider<UserRepository> userRepositoryProvider2) {
        this.userRepositoryProvider = userRepositoryProvider2;
    }

    public AuthViewModel get() {
        return newInstance(this.userRepositoryProvider.get());
    }

    public static AuthViewModel_Factory create(Provider<UserRepository> userRepositoryProvider2) {
        return new AuthViewModel_Factory(userRepositoryProvider2);
    }

    public static AuthViewModel newInstance(UserRepository userRepository) {
        return new AuthViewModel(userRepository);
    }
}
