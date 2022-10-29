package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.data.repositories.ProfileRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
    private final Provider<ProfileRepository> profileRepositoryProvider;

    public ProfileViewModel_Factory(Provider<ProfileRepository> profileRepositoryProvider2) {
        this.profileRepositoryProvider = profileRepositoryProvider2;
    }

    public ProfileViewModel get() {
        return newInstance(this.profileRepositoryProvider.get());
    }

    public static ProfileViewModel_Factory create(Provider<ProfileRepository> profileRepositoryProvider2) {
        return new ProfileViewModel_Factory(profileRepositoryProvider2);
    }

    public static ProfileViewModel newInstance(ProfileRepository profileRepository) {
        return new ProfileViewModel(profileRepository);
    }
}
