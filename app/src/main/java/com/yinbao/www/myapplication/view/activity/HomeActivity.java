package com.yinbao.www.myapplication.view.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.yinbao.www.myapplication.R;
import com.yinbao.www.myapplication.view.fragment.Test2fragment;
import com.yinbao.www.myapplication.view.fragment.Test3fragment;
import com.yinbao.www.myapplication.view.fragment.Minefragment;
import com.yinbao.www.myapplication.view.fragment.Testfragment;

import butterknife.ButterKnife;

/**
 * author : HJQ
 * github : https://github.com/getActivity/AndroidProject
 * time   : 2018/10/18
 * desc   : 主页界面
 */
public class HomeActivity extends AppCompatActivity {

    private LinearLayout main_found, main_index, main_msg, main_me;
    private ImageView main_found_img, main_index_img, main_msg_img, main_me_img;
    private Testfragment fragment;
    private Test2fragment fragment2;
    private Test3fragment fragment3;
    private Minefragment mineFragment;
    private FrameLayout activity_main_container;
    private Fragment mContent;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initView();
        setListener();

    }

    private void setListener() {
        main_found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBg(true, false, false, false);
                if (fragment == null) {
                    fragment = new Testfragment();
                }
                switchContent(fragment);
            }
        });
        main_index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBg(false, true, false, false);
                if (fragment2 == null) {
                    fragment2 = new Test2fragment();
                }
                switchContent(fragment2);

            }
        });
        main_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeBg(false, false, true, false);
                if (fragment3 == null) {
                    fragment3 = new Test3fragment();
                }
                switchContent(fragment3);

            }
        });
        main_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBg(false, false, false, true);
                if (mineFragment == null) {
                    mineFragment = new Minefragment();
                }
                switchContent(mineFragment);
            }
        });


    }

    /**
     *
     * */
    private void changeBg(boolean b, boolean b1, boolean b2, boolean b3) {
        main_found_img.setSelected(b);
        main_index_img.setSelected(b1);
        main_msg_img.setSelected(b2);
        main_me_img.setSelected(b3);
    }

    private void initView() {
        main_found = findViewById(R.id.main_found);
        main_index = findViewById(R.id.main_index);
        main_msg = findViewById(R.id.main_msg);
        main_me = findViewById(R.id.main_me);

        main_me_img = findViewById(R.id.main_me_img);
        main_found_img = findViewById(R.id.main_found_img);
        main_index_img = findViewById(R.id.main_index_img);
        main_msg_img = findViewById(R.id.main_msg_img);

        activity_main_container = findViewById(R.id.activity_main_container);
        fragment = new Testfragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.activity_main_container, fragment);
        mContent = fragment;
        fragmentTransaction.commit();

        main_found_img.setSelected(true);

    }

    public void switchContent(Fragment to) {
        if (mContent != to) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (!to.isAdded()) {
                transaction.hide(mContent).add(R.id.activity_main_container, to).commit();
            } else {
                transaction.hide(mContent).show(to).commit();
            }
            mContent = to;
        }
    }


}