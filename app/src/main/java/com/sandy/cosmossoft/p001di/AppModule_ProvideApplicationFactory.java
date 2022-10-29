package com.sandy.cosmossoft.p001di;

import android.content.Context;
import com.sandy.cosmossoft.BaseApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sandy.cosmossoft.di.AppModule_ProvideApplicationFactory */
public final class AppModule_ProvideApplicationFactory implements Factory<BaseApplication> {
    private final Provider<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvideApplicationFactory(AppModule module2, Provider<Context> contextProvider2) {
        this.module = module2;
        this.contextProvider = contextProvider2;
    }

    public BaseApplication get() {
        return provideApplication(this.module, this.contextProvider.get());
    }

    public static AppModule_ProvideApplicationFactory create(AppModule module2, Provider<Context> contextProvider2) {
        return new AppModule_ProvideApplicationFactory(module2, contextProvider2);
    }

    public static BaseApplication provideApplication(AppModule instance, Context context) {
        return (BaseApplication) Preconditions.checkNotNullFromProvides(instance.provideApplication(context));
    }
}
