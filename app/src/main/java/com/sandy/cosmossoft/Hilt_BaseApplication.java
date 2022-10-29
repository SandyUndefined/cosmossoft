package com.sandy.cosmossoft;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

abstract class Hilt_BaseApplication extends Application implements GeneratedComponentManagerHolder {
    private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() {
        public Object get() {
            return DaggerBaseApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(Hilt_BaseApplication.this)).build();
        }
    });

    Hilt_BaseApplication() {
    }

    public final ApplicationComponentManager componentManager() {
        return this.componentManager;
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public void onCreate() {
        ((BaseApplication_GeneratedInjector) generatedComponent()).injectBaseApplication((BaseApplication) UnsafeCasts.unsafeCast(this));
        super.onCreate();
    }
}
