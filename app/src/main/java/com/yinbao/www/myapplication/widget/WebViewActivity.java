package com.yinbao.www.myapplication.widget;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yinbao.www.myapplication.R;

/**
 * web页面
 * Created by guobin on 2018/4/28.
 */
public class WebViewActivity extends AppCompatActivity {

    private WebView activity_web_webview;
    private String web_url;
    private ImageView activity_web_back;
    private TextView activity_web_title;

    private ProgressBar progressBar;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        initView();
        setWebview();
    }

    private void initView(){
        activity_web_title = (TextView) findViewById(R.id.activity_web_title);

        activity_web_back = (ImageView) findViewById(R.id.activity_web_back);
        activity_web_webview = (WebView) findViewById(R.id.activity_web_webview);
        progressBar = (ProgressBar) findViewById(R.id.prog);

        activity_web_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void setWebview(){
        Intent intent = getIntent();
        web_url = intent.getExtras().getString("url");
        title = intent.getStringExtra("title");
        activity_web_webview.loadUrl(web_url);
        activity_web_webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                activity_web_title.setText(title);

            }

        });


        //测试使用的注释-----
        activity_web_webview.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    // 网页加载完成
                    progressBar.setVisibility(View.GONE);//加载完网页进度条消失
                } else {
                    // 加载中
                    progressBar.setVisibility(View.VISIBLE);//开始加载网页时显示进度条
                    progressBar.setProgress(newProgress);//设置进度值
                }
            }
        });



        // http请求的时候，模拟为火狐的UA会造成实时公交那边的页面存在问题，所以模拟iPhone的ua来解决这个问题
        String user_agent = "Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en) AppleWebKit/124 (KHTML, like Gecko) Safari/125.1";
        activity_web_webview.getSettings().setUserAgentString(user_agent);
        activity_web_webview.getSettings().setDomStorageEnabled(true);
        activity_web_webview.getSettings().setJavaScriptEnabled(true);
        activity_web_webview.getSettings().setBuiltInZoomControls(false); // 支持内置缩放控制
        activity_web_webview.getSettings().setSavePassword(false);
        activity_web_webview.setVerticalScrollBarEnabled(false);
        activity_web_webview.setHorizontalScrollBarEnabled(false);
        activity_web_webview.getSettings().setSupportZoom(false);// 设置可以支持缩放
        activity_web_webview.getSettings().setUseWideViewPort(true);// 扩大比例的缩放
        activity_web_webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);// 自适应屏幕
        activity_web_webview.getSettings().setLoadWithOverviewMode(true);
        activity_web_webview.getSettings().setLoadsImagesAutomatically(true);

    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        //改写物理返回键的逻辑
        if(keyCode== KeyEvent.KEYCODE_BACK) {
            if(activity_web_webview.canGoBack()) {
                activity_web_webview.goBack();
                return true;
            } else {
                finish();
            }
        }
        return super.onKeyUp(keyCode, event);
    }
}
