package com.sandy.cosmossoft.data.network;

import android.content.Context;
import android.net.ConnectivityManager;
import com.sandy.cosmossoft.util.Exceptions;
import java.io.IOException;
import javax.inject.Inject;
import okhttp3.Interceptor;
import okhttp3.Response;

public class NetworkConnectionInterceptor implements Interceptor {
    Context context;

    @Inject
    public NetworkConnectionInterceptor(Context context2) {
        this.context = context2;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (isInternetAvailable()) {
            return chain.proceed(chain.request());
        }
        throw Exceptions.noInternetException("Make sure you are connected to internet");
    }

    public boolean isInternetAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            return false;
        }
        return true;
    }
}
