package com.yinbao.www.myapplication.view.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnTimeSelectChangeListener;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.TimePickerView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.adapter.JokeAdapter;
import com.yinbao.www.myapplication.bean.JokeBean;
import com.yinbao.www.myapplication.util.OkHttpTool;
import com.yinbao.www.myapplication.util.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * 创建时间:2018/12/19
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication
 * 功能描述:
 */
public class EdActivity extends AppCompatActivity {

    EditText et;
    private RecyclerView rv_joke;
    Button mBtnChoose, mBtnHttpTest, mBtn;
    private TimePickerView pvTime;
    private String TAG = "bobo";
    private List<JokeBean.ResultEntity.DataEntity> mJokeBeans = new ArrayList<>();
    private Gson mGson = new Gson();
    private JokeAdapter mAdapter;
    private int page = 0;
    private SmartRefreshLayout smart_refresh;
    private List<JokeBean.ResultEntity.DataEntity> list2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ed_activity_layout);
        ButterKnife.bind(this);
        initView();

        initTimePicker();

        setListener();


    }

    private void setListener() {
        mBtnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pvTime.show(view);
                startActivity(new Intent(EdActivity.this, HomeActivity.class));
            }
        });
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et.getText().toString().trim())) {
                    ToastUtil.ShowMyToast(EdActivity.this, getResources().getString(R.string.fish));
                    return;
                }
                setResult(Activity.RESULT_OK);
                finish();
            }
        });


        mBtnHttpTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smart_refresh.autoRefresh();
            }
        });

        smart_refresh.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                getJokeData();
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 0;
                getJokeData();
            }
        });
    }

    private void initView() {
        et = findViewById(R.id.et);
        mBtn = findViewById(R.id.btn);
        mBtnHttpTest = findViewById(R.id.btn_http_test);
        mBtnChoose = findViewById(R.id.btn_choose);
        rv_joke = findViewById(R.id.rv_test);
        smart_refresh = findViewById(R.id.smart_refresh);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv_joke.setLayoutManager(layoutManager);
        list2 = new ArrayList<>();
        mAdapter = new JokeAdapter(list2);
        rv_joke.setAdapter(mAdapter);
    }

    private void getJokeData() {
        Map<String, String> params = new HashMap<>();
        params.put("consName","双鱼座");
        params.put("type","tomorrow");
        params.put("key","1e17e45ab357fdac10b9c3cc889f2467");

        //测试网络请求  OKhttp
        OkHttpTool.getInstance().doRequest("http://web.juhe.cn:8080/constellation/getAll", params, this, new OkHttpTool.HttpResult() {
            @Override
            public void onResult(String result) {
                Log.e("bobo",result);
            }
        },true);


        OkHttpUtils.get().url("http://v.juhe.cn/joke/content/list.php")
            .addParams("key", "472a8c83e25a1b1a7391688059e62606")
            .addParams("time", String.valueOf(System.currentTimeMillis()).substring(0, 10))
            .addParams("pagesize", "10")
            .addParams("page", String.valueOf(page))
            .build()
            .execute(new StringCallback() {
                @Override
                public void onError(Call call, Exception e, int id) {

                }

                @Override
                public void onResponse(String response, int id) {
                    Log.e(TAG, "onResponse: " + response);
                    try {
                        JokeBean jokeBean = mGson.fromJson(response, JokeBean.class);
                        if (jokeBean.getError_code() == 0) {
                            mJokeBeans = jokeBean.getResult().getData();
                            if (page == 0) {
                                mAdapter.setNewData(mJokeBeans);
                            } else {
                                mAdapter.addData(mJokeBeans);
                            }
                            page++;
                            smart_refresh.finishRefresh();
                            smart_refresh.finishLoadMore();
                            list2 = mAdapter.getData();
                        } else {
                            smart_refresh.finishRefresh();
                            smart_refresh.finishLoadMore();
                            ToastUtil.ShowMyToast(EdActivity.this, "今天先看这么多了哦");
                        }

                    } catch (JsonSyntaxException e) {
                        e.printStackTrace();
                    }
                }
            });
    }

    private void initTimePicker() {//Dialog 模式下，在底部弹出

        pvTime = new TimePickerBuilder(this, new OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                Toast.makeText(EdActivity.this, getTime(date), Toast.LENGTH_SHORT).show();
                Log.i("pvTime", "onTimeSelect");

            }
        })
            .setTimeSelectChangeListener(new OnTimeSelectChangeListener() {
                @Override
                public void onTimeSelectChanged(Date date) {
                    Log.i("pvTime", "onTimeSelectChanged");
                }
            })
            .setType(new boolean[]{true, true, true, true, true, true})//年 月 日 时 分 秒
            .isDialog(true) //默认设置false ，内部实现将DecorView 作为它的父控件。
            .build();

        Dialog mDialog = pvTime.getDialog();
        if (mDialog != null) {

            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                Gravity.BOTTOM);

            params.leftMargin = 0;
            params.rightMargin = 0;
            pvTime.getDialogContainerLayout().setLayoutParams(params);

            Window dialogWindow = mDialog.getWindow();
            if (dialogWindow != null) {
                dialogWindow.setWindowAnimations(com.bigkoo.pickerview.R.style.picker_view_slide_anim);//修改动画样式
                dialogWindow.setGravity(Gravity.BOTTOM);//改成Bottom,底部显示
            }
        }

    }

    private String getTime(Date date) {//可根据需要自行截取数据显示
        Log.d("getTime()", "choice date millis: " + date.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
