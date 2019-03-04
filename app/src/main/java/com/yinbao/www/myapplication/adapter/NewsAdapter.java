package com.yinbao.www.myapplication.adapter;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.bean.NewsBean;
import com.yinbao.www.myapplication.widget.WebViewActivity;

import java.util.List;

/**
 * 创建时间:2018/12/25
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.adapter
 * 功能描述:
 */
public class NewsAdapter extends BaseQuickAdapter<NewsBean.ResultEntity.DataEntity, BaseViewHolder> {


    public NewsAdapter(@Nullable List<NewsBean.ResultEntity.DataEntity> data) {
        super(R.layout.item_news_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsBean.ResultEntity.DataEntity item) {
        helper
            .setText(R.id.tv_date, item.getDate())
            .setText(R.id.tv_author, "来源： "+item.getAuthor_name())
            .setText(R.id.tv_type, "类型： "+item.getCategory());

        ImageView iv = helper.getView(R.id.iv_aravt);
        helper.setText(R.id.tv_news_title, Html.fromHtml("<a href="+item.getUrl()+">"+item.getTitle()+"</a>"));
        Glide.with(mContext).load(item.getThumbnail_pic_s()).into(iv);
        final Intent intent = new Intent(mContext, WebViewActivity.class);
        intent.putExtra("url",item.getUrl());
        intent.putExtra("title",item.getTitle());
        helper.getView(R.id.tv_news_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(intent);
            }
        });


    }
}
