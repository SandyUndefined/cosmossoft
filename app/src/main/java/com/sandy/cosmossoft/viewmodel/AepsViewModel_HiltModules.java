package com.sandy.cosmossoft.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

public final class AepsViewModel_HiltModules {
    private AepsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @StringKey("com.sandy.cosmossoft.viewmodel.AepsViewModel")
        @IntoMap
        public abstract ViewModel binds(AepsViewModel aepsViewModel);

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
            return "com.sandy.cosmossoft.viewmodel.AepsViewModel";
        }
    }
}
