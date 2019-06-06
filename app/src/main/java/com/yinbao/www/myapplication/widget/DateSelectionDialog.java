package com.yinbao.www.myapplication.widget;


import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.yinbao.www.myapplication.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DateSelectionDialog extends Dialog implements WheelView.OnSelectListener, View.OnClickListener {
    @BindView(R.id.staff_birthday_selection_cancel)
    TextView mStaffBirthdaySelectionCancel;
    @BindView(R.id.staff_birthday_selection_confrim)
    TextView mStaffBirthdaySelectionConfrim;
    @BindView(R.id.month)
    WheelView mMonth;
    @BindView(R.id.day)
    WheelView mDay;

    private TextView tv_today, tv_tomorrow,tv_hour,tv_min;
    private String day;
    private String hour;
    private String min;

    private OnClickListener positiveButtonClickListener;
    private OnClickListener negativeButtonClickListener;

    public void setNegativeButton(OnClickListener listener) {
        this.negativeButtonClickListener = listener;
    }

    public void setPositiveButton(OnClickListener listener) {
        this.positiveButtonClickListener = listener;
    }

    public DateSelectionDialog(@NonNull Context context) {
        super(context, R.style.CustomDialog);
    }

    public DateSelectionDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected DateSelectionDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_date_selection_dialog);
        ButterKnife.bind(this);
        day = "tody";
        tv_today = findViewById(R.id.tv_today);
        tv_tomorrow = findViewById(R.id.tv_tomorrow);
        tv_hour = findViewById(R.id.tv_hour);
        tv_min = findViewById(R.id.tv_min);

        tv_today.setBackgroundResource(R.drawable.bg_sleect_press);
        tv_today.setTextColor(Color.parseColor("#ffffff"));

        // 格式化当前时间，并转换为年月日整型数据
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm", Locale.getDefault());
        String[] split = sdf.format(new Date()).split("-");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        int currentMonth = Integer.parseInt(split[3]);
        int currentDay = Integer.parseInt(split[4]);

        mMonth.setData(getMonthData());
        mMonth.setDefault(currentMonth);
        mDay.setData(getDayData());
        mDay.setDefault(currentDay);

        mMonth.setOnSelectListener(this);
        mDay.setOnSelectListener(this);
        tv_today.setOnClickListener(this);
        tv_tomorrow.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            window.getDecorView().setSystemUiVisibility(uiOptions);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }
    }

    @OnClick({R.id.staff_birthday_selection_cancel, R.id.staff_birthday_selection_confrim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.staff_birthday_selection_cancel:
                negativeButtonClickListener.onClick(this, DialogInterface.BUTTON_NEGATIVE);
                break;
            case R.id.staff_birthday_selection_confrim:
                positiveButtonClickListener.onClick(this, DialogInterface.BUTTON_POSITIVE);
                break;
        }
    }

    private ArrayList<String> getMonthData() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= 23; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    private ArrayList<String> getDayData() {
        //ignore condition
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= 59; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    public String getMonth() {
        if (mMonth == null) {
            return null;
        }
        return mMonth.getSelectedText();
    }

    public String getDay() {
        if (mDay == null) {
            return null;
        }
        return mDay.getSelectedText();
    }

    public String getDate() {
        return day + getMonth() + ":" + getDay();
    }

    @Override
    public void endSelect(View view, int id, String text) {
        // 滚轮滑动停止后调用
        switch (view.getId()) {
            case R.id.month:
                hour = text;
                break;
            case R.id.day:
                min = text;
                break;
        }
    }

    @Override
    public void selecting(int id, String text) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.tv_today:
                tv_today.setBackgroundResource(R.drawable.bg_sleect_press);
                tv_today.setTextColor(Color.parseColor("#ffffff"));

                tv_tomorrow.setBackgroundResource(R.drawable.bg_normal);
                tv_tomorrow.setTextColor(Color.parseColor("#878787"));
                day = "tody";
                break;
            case R.id.tv_tomorrow:
                tv_tomorrow.setBackgroundResource(R.drawable.bg_sleect_press);
                tv_tomorrow.setTextColor(Color.parseColor("#ffffff"));

                tv_today.setBackgroundResource(R.drawable.bg_normal);
                tv_today.setTextColor(Color.parseColor("#878787"));
                day = "tomorrow";
                break;

        }
    }

}
