package com.sandy.cosmossoft.util;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.sandy.cosmossoft.activities.MainActivity;
import com.sandy.cosmossoft.data.p000db.AppDatabase;

public class ExecuteUtil {
    public static void ThrowOut(Context context) {
        MyAlertUtils.dismissAlertDialog();
        new LogoutTask(context).execute(new Void[0]);
    }

    static class LogoutTask extends AsyncTask<Void, Void, Void> {
        Context context;

        public LogoutTask(Context context2) {
            this.context = context2;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voids) {
            Log.d("MyApp", Thread.currentThread().getName());
            AppDatabase.getAppDatabase(this.context).getUserDao().loggedOutUser();
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            Log.d("MyApp", Thread.currentThread().getName());
            Intent intent = new Intent(this.context, MainActivity.class);
            intent.addFlags(PagedChannelRandomAccessSource.DEFAULT_TOTAL_BUFSIZE);
            intent.addFlags(268435456);
            this.context.startActivity(intent);
        }
    }
}
