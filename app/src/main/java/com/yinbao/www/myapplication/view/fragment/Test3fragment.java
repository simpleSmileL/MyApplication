package com.yinbao.www.myapplication.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yinbao.www.myapplication.R;

/**
 * 创建时间:2018/12/24
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.view.fragment
 * 功能描述:
 */
public class Test3fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test3_layout,container,false);
        return view;
    }
}
