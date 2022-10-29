package com.sandy.cosmossoft.data.p000db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.sandy.cosmossoft.data.p000db.dao.PaySprintDao;
import com.sandy.cosmossoft.data.p000db.dao.ProfileDao;
import com.sandy.cosmossoft.data.p000db.dao.RazorPayDao;
import com.sandy.cosmossoft.data.p000db.dao.UserDao;

/* renamed from: com.sandy.cosmossoft.data.db.AppDatabase */
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase appDatabase = null;

    public abstract PaySprintDao getPaySprint();

    public abstract RazorPayDao getRazorPayDao();

    public abstract UserDao getUserDao();

    public abstract ProfileDao getUserProfileDao();

    public static synchronized AppDatabase getAppDatabase(Context context) {
        AppDatabase appDatabase2;
        Class<AppDatabase> cls = AppDatabase.class;
        synchronized (cls) {
            if (appDatabase == null) {
                appDatabase = Room.databaseBuilder(context.getApplicationContext(), cls, "myDB").allowMainThreadQueries().addMigrations(new Migration[0]).fallbackToDestructiveMigration().build();
            }
            appDatabase2 = appDatabase;
        }
        return appDatabase2;
    }
}
