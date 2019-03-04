package com.yinbao.www.myapplication.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.widget.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;

/**
 * 创建时间:2018/12/24
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.view.fragment
 * 功能描述:
 */
public class Test2fragment extends Fragment {

    Banner mBanner;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test2_layout,container,false);
        mBanner = view.findViewById(R.id.banner);
        initData();
        return view;
    }

    private void initData() {


        ArrayList<String> images = new ArrayList<>();

        images.add("http://www.mosaichk.net/app/ad/mosaic/mosaic_ad_zh.jpg");
        images.add("http://www.mosaichk.net/app/ad/mosaic/mosaic_ad_home_zh.jpg");
        images.add("http://www.mosaichk.net/app/ad/mosaic/warmer_ad_zh.jpg");
        images.add("http://www.mosaichk.net/app/ad/mosaic/warmer_two_ad_zh.jpg");
        images.add("http://www.mosaichk.net/app/ad/mosaic/warmer_three_ad_zh.jpg");

        ArrayList<String> titles = new ArrayList<>();

        titles.add("呵呵1");
        titles.add("呵呵2");
        titles.add("呵呵3");
        titles.add("呵呵4");
        titles.add("呵呵5");

        //设置banner样式
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //设置图片加载器
        mBanner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        mBanner.setImages(images);
        //设置banner动画效果
        mBanner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
        mBanner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        mBanner.isAutoPlay(true);
        //设置轮播时间
        mBanner.setDelayTime(2500);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        mBanner.start();


    }
}
