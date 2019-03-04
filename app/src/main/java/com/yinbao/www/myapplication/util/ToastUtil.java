package com.yinbao.www.myapplication.util;

import android.content.Context;
import android.widget.Toast;

/**
 * 创建时间:2018/12/19
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.util
 * 功能描述:
 */
public class ToastUtil {

   static Toast mToast;

    public static void ShowMyToast(Context context, String msg){
        if(mToast == null){
            mToast = Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }else {
            mToast.setText(msg);
        }

        mToast.show();

    }



}
