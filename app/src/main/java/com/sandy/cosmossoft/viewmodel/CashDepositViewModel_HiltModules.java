package com.sandy.cosmossoft.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

public final class CashDepositViewModel_HiltModules {
    private CashDepositViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @StringKey("com.sandy.cosmossoft.viewmodel.CashDepositViewModel")
        @IntoMap
        public abstract ViewModel binds(CashDepositViewModel cashDepositViewModel);

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
            return "com.sandy.cosmossoft.viewmodel.CashDepositViewModel";
        }
    }
}
