package com.example.alexkaer.http;

import com.example.alexkaer.ApiManager;
import com.example.alexkaer.Config;
import com.example.alexkaer.MainApplication;
import com.example.alexkaer.utils.LogUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class NetManager {
    private static ApiManager mApiManager;
    private static NetManager mNetManager;
    private static NetManager getInstance(){
        if (null == mNetManager) {
            synchronized (NetManager.class) {
                if (null == mNetManager) {
                    mNetManager = new NetManager();
                }
            }
        }
        return mNetManager;
    }

    private NetManager(){}

    public static ApiManager getApiManager(){
        if (mApiManager == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Config.Server)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 添加Rx适配器
                    .addConverterFactory(GsonConverterFactory.create()) // 添加Gson转换器
                    .client(getInstance().getOkHttpClient())
                    .build();
            mApiManager = retrofit.create(ApiManager.class);
        }
        return mApiManager;
    }

    private OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        //手动创建一个OkHttpClient并设置超时时间
        okHttpClientBuilder.connectTimeout(15, TimeUnit.SECONDS);
        okHttpClientBuilder.readTimeout(60, TimeUnit.SECONDS);
        okHttpClientBuilder.sslSocketFactory(HttpsHelper.getSSLSocketFactory(MainApplication.getInstance(),Config.Certificate));
        okHttpClientBuilder.hostnameVerifier(HttpsHelper.getHostnameVerifier(Config.Https_Hosts));
        okHttpClientBuilder.cookieJar(new CookieJar() {
            private final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();

            @Override
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                cookieStore.put(url.host(), cookies);
                LogUtils.d("saveFromResponse cookies:"+cookies.toString());
            }

            @Override
            public List<Cookie> loadForRequest(HttpUrl url) {
                List<Cookie> cookies = cookieStore.get(url.host());
                if (cookies != null) {
                    LogUtils.d("loadForRequest cookies:" + cookies.toString());
                }
                return cookies != null ? cookies : new ArrayList<Cookie>();
            }
        });
        if (Config.DEBUG) {
            okHttpClientBuilder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();


                    long t1 = System.nanoTime();
                    LogUtils.d(String.format("Sending request %s on %s%n%s", request.url(),
                            chain.connection(), request.headers()));


                    Response response = chain.proceed(request);
                    long t2 = System.nanoTime();
                    LogUtils.d(String.format("Received response for %s in %.1fms%n%s",
                            response.request().url(), (t2 - t1) / 1e6d, response.headers()));


                    return response;
                }
            });
        }
        return okHttpClientBuilder.build();
    }

}
