package com.yinbao.www.myapplication.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.yinbao.www.myapplication.MyApp;
import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.util.ToastUtil;
import com.yinbao.www.myapplication.widget.HorizontalProgressBarWithNumber;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

public class MainActivity extends AppCompatActivity {

    private static final int CODE = 101;
    ListView lv;

    ImageView iv;

    ArrayList<String> datalist;
    @BindView(R.id.start)
    Button mStart;
    @BindView(R.id.stop)
    Button mStop;
    @BindView(R.id.cancel)
    Button mCancel;
    @BindView(R.id.progressBar)
    HorizontalProgressBarWithNumber mProgressBar;
    @BindView(R.id.speed)
    TextView mSpeed;

    //    StartServiceReceiver mStartServiceReceiver;
    private String TAG = "Net";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        lv = findViewById(R.id.lv);
        iv = findViewById(R.id.iv);
        initData();
        lv.setAdapter(new MyAdapter(MainActivity.this));

        setListener();

    }

    private void testGetData() {
        String url = "http://wwww.baidu.com";

        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(10000, TimeUnit.SECONDS).build();

        Request request = new Request.Builder().url(url).get().build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("test",response.body().string());
            }
        });



    }

    private void setListener() {

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtil.ShowMyToast(MainActivity.this, getResources().getString(R.string.cant));
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (MyApp.isMobileNet) {
                    Log.e(TAG, "isMobileNet" + MyApp.isMobileNet);
                    showDialog();
                } else {
                    Log.e(TAG, "isMobileNet" + MyApp.isMobileNet);
                    ToastUtil.ShowMyToast(MainActivity.this, "WiFi，，，嗨起来");
                    Intent intent = new Intent(MainActivity.this, EdActivity.class);
                    startActivityForResult(intent, CODE);
                }
            }
        });

    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.mipmap.ic_launcher).setTitle("当前网络非WiFi，继续浏览吗？")
            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    ToastUtil.ShowMyToast(MainActivity.this, "有的是流量，嗨起来！！");
                    Intent intent = new Intent(MainActivity.this, EdActivity.class);
                    startActivityForResult(intent, CODE);
                }
            })
            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    ToastUtil.ShowMyToast(MainActivity.this, "穷苦人家- . - ");
                }
            });
        builder.show();

    }

    private void initData() {

        datalist = new ArrayList<>();
        String text = "测试内容-----";
        for (int i = 0; i < 40; i++) {
            datalist.add(text + i);
        }


    }

    String url = "http://www.mosaichk.net/app/mx206/mx206.bin";
    String mSDCardPath= Environment.getExternalStorageDirectory().getAbsolutePath();
    File dest = new File(mSDCardPath,   url.substring(url.lastIndexOf("/") + 1));


    @OnClick({R.id.start, R.id.stop, R.id.cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.start:

                downloadFile();
//                Aria.download(this)
//                    .load(url)     //读取下载地址
//                    .setDownloadPath(dest.getAbsolutePath()) //设置文件保存的完整路径
//                    .start();   //启动下载
                Log.e("download",dest.getAbsolutePath());
                ToastUtil.ShowMyToast(this,"开始下载");
                break;
            case R.id.stop:
                ToastUtil.ShowMyToast(this,"暂停下载");
                break;
            case R.id.cancel:
                ToastUtil.ShowMyToast(this,"取消下载");
                break;
        }
    }


    public class MyAdapter extends BaseAdapter {
        Context mContext;

        public MyAdapter(Context context) {
            mContext = context;
        }

        @Override
        public int getCount() {
            return datalist.size();
        }

        @Override
        public Object getItem(int i) {
            return datalist.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View courView;
            if (view == null) {
                courView = LayoutInflater.from(mContext).inflate(R.layout.item_layout, null);
            } else {
                courView = view;
            }

            TextView tv = courView.findViewById(R.id.tv);
            tv.setText(datalist.get(i));

            return courView;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CODE) {
            if (resultCode == Activity.RESULT_OK) {
                ToastUtil.ShowMyToast(MainActivity.this, getResources().getString(R.string.fail));
            }
        }

    }

    private void downloadFile(){
        //下载路径
        final String url = "http://www.mosaichk.net/app/mx206/mx206.bin";
        final long startTime = System.currentTimeMillis();
        Log.i("DOWNLOAD","startTime="+startTime);

        Request request = new Request.Builder().url(url).build();
        new OkHttpClient().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // 下载失败
                e.printStackTrace();
                Log.i("DOWNLOAD","download failed");
                ToastUtil.ShowMyToast(MainActivity.this, "下载失败");
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Sink sink = null;
                BufferedSink bufferedSink = null;
                try {
                    String mSDCardPath= Environment.getExternalStorageDirectory().getAbsolutePath();
                    File dest = new File(mSDCardPath,   url.substring(url.lastIndexOf("/") + 1));
                    if(dest.exists()){
                        dest.delete();
                    }
                    sink = Okio.sink(dest);
                    bufferedSink = Okio.buffer(sink);
                    bufferedSink.writeAll(response.body().source());

                    bufferedSink.close();
                    Log.i("DOWNLOAD","download success");
                    ToastUtil.ShowMyToast(MainActivity.this, "下载完成");
                    Log.i("DOWNLOAD","totalTime="+ (System.currentTimeMillis() - startTime));
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.i("DOWNLOAD","download failed");
                    ToastUtil.ShowMyToast(MainActivity.this, "下载失败");
                } finally {
                    if(bufferedSink != null){
                        bufferedSink.close();
                    }

                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //unregisterReceiver(mStartServiceReceiver);

    }
}
