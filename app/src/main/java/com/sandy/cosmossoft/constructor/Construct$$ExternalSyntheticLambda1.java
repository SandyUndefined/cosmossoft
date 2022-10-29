package com.sandy.cosmossoft.constructor;

import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.PaySprintApi;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Construct$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ PaySprintApi f$0;
    public final /* synthetic */ AppDatabase f$1;

    public /* synthetic */ Construct$$ExternalSyntheticLambda1(PaySprintApi paySprintApi, AppDatabase appDatabase) {
        this.f$0 = paySprintApi;
        this.f$1 = appDatabase;
    }

    public final void run() {
        Construct.lambda$savePaysprintData$2(this.f$0, this.f$1);
    }
}
