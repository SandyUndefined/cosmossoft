package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.viewmodel.CreationViewModel_HiltModules;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class CreationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public String get() {
        return provide();
    }

    public static CreationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(CreationViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CreationViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CreationViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
