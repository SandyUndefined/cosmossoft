package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.viewmodel.MobileNumberPayViewModel_HiltModules;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class MobileNumberPayViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public String get() {
        return provide();
    }

    public static MobileNumberPayViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(MobileNumberPayViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MobileNumberPayViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MobileNumberPayViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
