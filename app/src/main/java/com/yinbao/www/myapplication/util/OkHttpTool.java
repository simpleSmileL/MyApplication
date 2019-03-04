package com.yinbao.www.myapplication.util;

import android.support.annotation.NonNull;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * 通过OkHttp3获取服务端数据工具类
 *
 * @author XuBo
 */
public class OkHttpTool {

    /**
     * 单例实例
     */
    private static OkHttpTool mInstance;
    /**
     * OkHttp请求类
     */
    private OkHttpClient mHttpClient;
    /**
     * 文件类型: 图片类
     */
    private final MediaType MEDIA_TYPE_JPEG = MediaType.parse("image/jpeg");

    /**
     * 私有化构造
     */
    private OkHttpTool() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(10, TimeUnit.SECONDS);//默认10秒太少,上传数据时有超时的情况
        builder.writeTimeout(10, TimeUnit.SECONDS);
        mHttpClient = builder.build();
    }

    /**
     * 获取单例实例
     */
    public static OkHttpTool getInstance() {
        if (mInstance == null) {
            mInstance = new OkHttpTool();
        }
        return mInstance;
    }

    /**
     * 网络数据异步请求
     *
     * @param path     请求地址
     * @param params   参数Map
     * @param tag      请求的标志(取消请求时用到)
     * @param callBack 结果回调实例
     * @param isGet    true_get请求 false_post请求
     */
    public void doRequest(String path, Map<String, String> params, Object tag, HttpResult callBack, boolean isGet) {
        Request.Builder builder = new Request.Builder().tag(tag);
        if (isGet) {
            try {
                path = path + spliceParamsByGet(params);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            FormBody.Builder body = new FormBody.Builder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                body.add(entry.getKey(), entry.getValue());
            }
            builder.post(body.build());
        }
        builder.url(path);
        httpRequest(builder.build(), callBack);
    }

    /**
     * 拼接参数_Get方式
     *
     * @param params 参数集合
     * @return 字符串
     * @throws UnsupportedEncodingException 转码出错异常
     */
    private String spliceParamsByGet(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder builder = new StringBuilder();
        if (params != null && !params.isEmpty()) {
            builder.append("?");
            for (Map.Entry<String, String> entry : params.entrySet()) {
                builder.append(entry.getKey());
                builder.append("=");
                builder.append(URLEncoder.encode(entry.getValue(), "UTF-8"));// 这里一定要,不然提交的会是乱码
                builder.append("&");
            }
            builder.deleteCharAt(builder.length() - 1);// 去掉最后一个'&'
        }
        return builder.toString();
    }

    /**
     * 执行OkHttp请求
     *
     * @param request  OkHttp的请求参数
     * @param callBack 请求结果回调实例
     */
    private void httpRequest(Request request, final HttpResult callBack) {
        Call call = mHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.d("bobo", "call.onFailure()");
                callBack.onResult(null);
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                ResponseBody body = response.body();
                callBack.onResult(body == null ? null : body.string());
            }
        });
    }

    /**
     * 网络数据异步请求(多参数带图片)
     *
     * @param path     请求地址
     * @param params   普通参数Map
     * @param files    图片文件列表
     * @param tag      请求的标志(取消请求时用到)
     * @param callBack 结果回调实例
     */
    public void doRequestMulti(String path, Map<String, String> params, List<File> files, Object tag, HttpResult
            callBack) {
        Request.Builder builder = new Request.Builder().tag(tag);
        MultipartBody.Builder body = new MultipartBody.Builder();
        body.setType(MultipartBody.FORM);
        for (Map.Entry<String, String> entry : params.entrySet()) {// 先加普通参数
            body.addFormDataPart(entry.getKey(), entry.getValue());
        }
        if (files != null) {
            for (File file : files) {
                body.addFormDataPart("f_file[]", file.getName(), RequestBody.create(MEDIA_TYPE_JPEG, file));
            }
        }
        builder.post(body.build());
        builder.url(path);
        httpRequest(builder.build(), callBack);
    }
	
    /**
     * 根据标志取消请求
     *
     * @param tag 标志_可以是Activity或Fragment
     */
    public void cancelCall(Object tag) {
        Dispatcher dispatcher = mHttpClient.dispatcher();
        for (Call call : dispatcher.queuedCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call : dispatcher.runningCalls()) {
            if (tag.equals(call.request().tag())) {
                call.cancel();
            }
        }
    }

    /**
     * Http请求结果回调接口
     */
    public interface HttpResult {
        /**
         * 请求结果
         */
        void onResult(String result);
    }

}
