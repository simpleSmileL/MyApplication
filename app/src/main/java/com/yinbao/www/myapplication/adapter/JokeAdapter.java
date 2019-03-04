package com.yinbao.www.myapplication.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.bean.JokeBean;

import java.util.List;

/**
 * 创建时间:2018/12/22
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.adapter
 * 功能描述:
 */
public class JokeAdapter extends BaseQuickAdapter<JokeBean.ResultEntity.DataEntity,BaseViewHolder> {


    public JokeAdapter(@Nullable List<JokeBean.ResultEntity.DataEntity> data) {
        super(R.layout.item_joke_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, JokeBean.ResultEntity.DataEntity item) {
      helper.setText(R.id.item_tv_title,item.getContent());
    }

}
