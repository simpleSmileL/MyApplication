package com.yinbao.www.myapplication;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

import com.yinbao.www.myapplication.receiver.StartServiceReceiver;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 创建时间:2018/12/17
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication
 * 功能描述:
 */
public class MyApp extends Application {

    public static boolean isMobileNet = false;

    StartServiceReceiver mStartServiceReceiver;


    @Override
    public void onCreate() {
        super.onCreate();
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new LoggerInterceptor("TAG"))
            .connectTimeout(10000L, TimeUnit.MILLISECONDS)
            .readTimeout(10000L, TimeUnit.MILLISECONDS)
            //其他配置
            .build();

        OkHttpUtils.initClient(okHttpClient);

        final IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);//网络的连接（包括wifi和移动网络）

        mStartServiceReceiver = new StartServiceReceiver(getApplicationContext());

        registerReceiver(mStartServiceReceiver, filter);//注册网络状态广播监听

    }

}
