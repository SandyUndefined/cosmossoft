package com.sandy.cosmossoft.p001di;

import android.content.Context;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: com.sandy.cosmossoft.di.AppModule$$ExternalSyntheticLambda0 */
/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AppModule$$ExternalSyntheticLambda0 implements Interceptor {
    public final /* synthetic */ Context f$0;

    public /* synthetic */ AppModule$$ExternalSyntheticLambda0(Context context) {
        this.f$0 = context;
    }

    public final Response intercept(Interceptor.Chain chain) {
        return AppModule.lambda$getOkHttpClient$0(this.f$0, chain);
    }
}
