package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.responses.AuthResponse;
import com.sandy.cosmossoft.listeners.AuthListener;
import p006io.reactivex.rxjava3.functions.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UserRepository$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ UserRepository f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ AuthListener f$2;

    public /* synthetic */ UserRepository$$ExternalSyntheticLambda1(UserRepository userRepository, Context context, AuthListener authListener) {
        this.f$0 = userRepository;
        this.f$1 = context;
        this.f$2 = authListener;
    }

    public final void accept(Object obj) {
        this.f$0.mo1312x852d1daf(this.f$1, this.f$2, (AuthResponse) obj);
    }
}
