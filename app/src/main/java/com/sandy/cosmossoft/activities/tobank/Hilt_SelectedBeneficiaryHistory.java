package com.sandy.cosmossoft.activities.tobank;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

abstract class Hilt_SelectedBeneficiaryHistory extends AppCompatActivity implements GeneratedComponentManagerHolder {
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    Hilt_SelectedBeneficiaryHistory() {
        _initHiltInternal();
    }

    Hilt_SelectedBeneficiaryHistory(int contentLayoutId) {
        super(contentLayoutId);
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() {
            public void onContextAvailable(Context context) {
                Hilt_SelectedBeneficiaryHistory.this.inject();
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
            ((SelectedBeneficiaryHistory_GeneratedInjector) generatedComponent()).injectSelectedBeneficiaryHistory((SelectedBeneficiaryHistory) UnsafeCasts.unsafeCast(this));
        }
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }
}
