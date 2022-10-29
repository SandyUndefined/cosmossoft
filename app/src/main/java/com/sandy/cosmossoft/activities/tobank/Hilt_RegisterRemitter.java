package com.sandy.cosmossoft.activities.tobank;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

abstract class Hilt_RegisterRemitter extends AppCompatActivity implements GeneratedComponentManagerHolder {
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    Hilt_RegisterRemitter() {
        _initHiltInternal();
    }

    Hilt_RegisterRemitter(int contentLayoutId) {
        super(contentLayoutId);
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() {
            public void onContextAvailable(Context context) {
                Hilt_RegisterRemitter.this.inject();
            }
        });
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    /* access modifiers changed from: protected */
    public ActivityComponentManager createComponentManager() {
        return new ActivityComponentManager(this);
    }

    public final ActivityComponentManager componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.injected) {
            this.injected = true;
            ((RegisterRemitter_GeneratedInjector) generatedComponent()).injectRegisterRemitter((RegisterRemitter) UnsafeCasts.unsafeCast(this));
        }
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }
}
