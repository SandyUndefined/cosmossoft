package com.sandy.cosmossoft.viewmodel;

import com.sandy.cosmossoft.viewmodel.PayoutViewModel_HiltModules;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class PayoutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    public String get() {
        return provide();
    }

    public static PayoutViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(PayoutViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PayoutViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PayoutViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
