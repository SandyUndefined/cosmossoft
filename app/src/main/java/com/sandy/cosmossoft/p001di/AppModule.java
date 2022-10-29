package com.sandy.cosmossoft.p001di;

import android.content.Context;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.sandy.cosmossoft.BaseApplication;
import com.sandy.cosmossoft.Provider;
import com.sandy.cosmossoft.constructor.Construct;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.network.NetworkConnectionInterceptor;
import com.sandy.cosmossoft.data.network.RetrofitInstance;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

@Module
/* renamed from: com.sandy.cosmossoft.di.AppModule */
public class AppModule {
    @Singleton
    @Provides
    public BaseApplication provideApplication(Context context) {
        return (BaseApplication) context;
    }

    @Singleton
    @Provides
    public NetworkConnectionInterceptor getNetworkInterceptor(Context context) {
        return new NetworkConnectionInterceptor(context);
    }

    @Singleton
    @Provides
    public HttpLoggingInterceptor getHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

    @Singleton
    @Provides
    public OkHttpClient getOkHttpClient(Context context, HttpLoggingInterceptor httpLoggingInterceptor, NetworkConnectionInterceptor networkConnectionInterceptor) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder().connectTimeout(2, TimeUnit.MINUTES).readTimeout(2, TimeUnit.MINUTES).writeTimeout(2, TimeUnit.MINUTES);
        httpClient.addInterceptor(new AppModule$$ExternalSyntheticLambda0(context));
        httpClient.addInterceptor(networkConnectionInterceptor);
        httpClient.addInterceptor(httpLoggingInterceptor);
        return httpClient.build();
    }

    static /* synthetic */ Response lambda$getOkHttpClient$0(Context context, Interceptor.Chain chain) throws IOException {
        String token;
        try {
            token = AppDatabase.getAppDatabase(context).getUserDao().getRegularUser().getToken();
        } catch (NullPointerException e) {
            token = "login";
        }
        Response response = chain.proceed(chain.request().newBuilder().addHeader("token", token).addHeader("Device", Provider.getDeviceModel()).addHeader("Ip", Provider.getLocalIpAddress()).build());
        if (response.code() == 999) {
            Construct.logoutExecute(context);
        }
        return response;
    }

    @Singleton
    @Provides
    public APIServices getApiServices(OkHttpClient httpClient) {
        return (APIServices) new Retrofit.Builder().addCallAdapterFactory(RxJava3CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create())).addConverterFactory(ScalarsConverterFactory.create()).baseUrl(RetrofitInstance.BASE_URL).client(httpClient).build().create(APIServices.class);
    }
}
