package com.sandy.cosmossoft.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

public final class ProfileViewModel_HiltModules {
    private ProfileViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @StringKey("com.sandy.cosmossoft.viewmodel.ProfileViewModel")
        @IntoMap
        public abstract ViewModel binds(ProfileViewModel profileViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @IntoSet
        @Provides
        public static String provide() {
            return "com.sandy.cosmossoft.viewmodel.ProfileViewModel";
        }
    }
}
