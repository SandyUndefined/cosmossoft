package com.sandy.cosmossoft.data.repositories;

import com.sandy.cosmossoft.listeners.AuthListener;
import p006io.reactivex.rxjava3.functions.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UserRepository$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ AuthListener f$0;

    public /* synthetic */ UserRepository$$ExternalSyntheticLambda2(AuthListener authListener) {
        this.f$0 = authListener;
    }

    public final void accept(Object obj) {
        this.f$0.onFailure(((Throwable) obj).getLocalizedMessage());
    }
}
