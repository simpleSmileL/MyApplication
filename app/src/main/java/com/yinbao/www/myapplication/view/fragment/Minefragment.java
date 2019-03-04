package com.yinbao.www.myapplication.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.github.promeg.pinyinhelper.Pinyin;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.adapter.NewsAdapter;
import com.yinbao.www.myapplication.bean.NewsBean;
import com.yinbao.www.myapplication.util.ToastUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import okhttp3.Call;

/**
 * 创建时间:2018/12/24
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.view.fragment
 * 功能描述:
 */
public class Minefragment extends Fragment {

    @BindView(R.id.et_news_type)
    EditText et_news_type;
    @BindView(R.id.btn_submit)
    Button mBtnSubmit;
    @BindView(R.id.rv_news)
    RecyclerView rv_News;
    @BindView(R.id.smart_refresh)
    SmartRefreshLayout smart_fresh;
    Unbinder unbinder;

    private List<NewsBean.ResultEntity.DataEntity> news_list = new ArrayList<>();

    private List<NewsBean.ResultEntity.DataEntity> temp_news_list;

    private NewsAdapter news_adapter;

    private String TAG = "bobo_news";

    private Gson gson = new Gson();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mine_fragment_layout, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        setListener();
        return view;
    }

    private void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rv_News.setLayoutManager(layoutManager);

    }

    private void setListener() {
        smart_fresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                getData();
            }
        });

    }

    private void getData() {
        OkHttpUtils.get()
            .url("http://v.juhe.cn/toutiao/index")
            .addParams("key", "b9be15a283bec3337fa5fdf752431142")
            .addParams("type", Pinyin.toPinyin(et_news_type.getText().toString().trim(), ""))
            .build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(String response, int id) {
                Log.e(TAG, "onResponse: " + response);
                NewsBean newsBean = gson.fromJson(response, NewsBean.class);
                if (newsBean.getError_code() == 0) {
                    news_list = newsBean.getResult().getData();
                    news_adapter = new NewsAdapter(news_list);
                    rv_News.setAdapter(news_adapter);
                    smart_fresh.finishRefresh();
                    smart_fresh.finishLoadMore();
                }

            }
        });

    }


    @OnClick(R.id.btn_submit)
    public void onViewClicked() {

        if (TextUtils.isEmpty(et_news_type.getText().toString().trim())) {
            ToastUtil.ShowMyToast(getActivity(), "输入内容为空");
            return;
        } else {
            getData();
            hideKeyboard(mBtnSubmit);
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    public static void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) view.getContext()
            .getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
