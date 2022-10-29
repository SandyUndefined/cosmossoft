package com.sandy.cosmossoft.constructor;

import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.data.p000db.entities.UserProfile;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Construct$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ User f$0;
    public final /* synthetic */ AppDatabase f$1;
    public final /* synthetic */ UserProfile f$2;

    public /* synthetic */ Construct$$ExternalSyntheticLambda4(User user, AppDatabase appDatabase, UserProfile userProfile) {
        this.f$0 = user;
        this.f$1 = appDatabase;
        this.f$2 = userProfile;
    }

    public final void run() {
        Construct.lambda$refreshData$4(this.f$0, this.f$1, this.f$2);
    }
}
