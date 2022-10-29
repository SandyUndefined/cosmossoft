package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.viewmodel.FundViewModel_HiltModules;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FundViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public String get() {
        return provide();
    }

    public static FundViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(FundViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final FundViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new FundViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
