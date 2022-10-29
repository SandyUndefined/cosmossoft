package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.data.repositories.UserRepository;
import com.sandy.cosmossoft.listeners.AuthListener;
import com.sandy.cosmossoft.listeners.WaitingListener;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UserRepository$1$$ExternalSyntheticLambda0 implements WaitingListener {
    public final /* synthetic */ UserRepository.C04161 f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ AuthListener f$2;
    public final /* synthetic */ AuthResponse f$3;

    public /* synthetic */ UserRepository$1$$ExternalSyntheticLambda0(UserRepository.C04161 r1, Context context, AuthListener authListener, AuthResponse authResponse) {
        this.f$0 = r1;
        this.f$1 = context;
        this.f$2 = authListener;
        this.f$3 = authResponse;
    }

    public final void taskFinished() {
        this.f$0.mo1319x18d89d2(this.f$1, this.f$2, this.f$3);
    }
}
