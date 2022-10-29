package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.viewmodel.ToBankViewModel_HiltModules;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ToBankViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public String get() {
        return provide();
    }

    public static ToBankViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(ToBankViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ToBankViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ToBankViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
