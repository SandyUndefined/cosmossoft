package com.sandy.cosmossoft.data.repositories;

import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.listeners.WaitingListener;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UserRepository$2$$ExternalSyntheticLambda0 implements WaitingListener {
    public final /* synthetic */ AuthListener f$0;
    public final /* synthetic */ AuthResponse f$1;

    public /* synthetic */ UserRepository$2$$ExternalSyntheticLambda0(AuthListener authListener, AuthResponse authResponse) {
        this.f$0 = authListener;
        this.f$1 = authResponse;
    }

    public final void taskFinished() {
        this.f$0.onSuccess(this.f$1);
    }
}
