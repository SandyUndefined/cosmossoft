package com.sandy.cosmossoft.constructor;

import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Construct$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ User f$0;
    public final /* synthetic */ AppDatabase f$1;

    public /* synthetic */ Construct$$ExternalSyntheticLambda3(User user, AppDatabase appDatabase) {
        this.f$0 = user;
        this.f$1 = appDatabase;
    }

    public final void run() {
        Construct.lambda$saveUser$3(this.f$0, this.f$1);
    }
}
