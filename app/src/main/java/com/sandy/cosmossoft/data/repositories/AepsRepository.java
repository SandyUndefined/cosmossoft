package com.sandy.cosmossoft.data.repositories;

import android.content.Context;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import javax.inject.Inject;

public class AepsRepository {
    public APIServices apiServices;
    AppDatabase appDatabase;

    @Inject
    public AepsRepository(Context context, APIServices apiServices2) {
        this.appDatabase = AppDatabase.getAppDatabase(context);
        this.apiServices = apiServices2;
    }
}
