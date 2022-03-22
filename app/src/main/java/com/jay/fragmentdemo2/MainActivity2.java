package com.jay.fragmentdemo2;

/**
 * Created by 14646 on 2022/3/15.
 */


import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        /* 显示App icon左侧的back键 */


        Constant.point = new Point();
        getWindowManager().getDefaultDisplay().getSize(Constant.point);//获取屏幕分辨率

        ChartView myView=new ChartView(this);
        setContentView(myView);
        myView.SetInfo(new String[] { "7-11", "7-12", "7-13", "7-14", "7-15",
                        "7-16", "7-17" }, // X轴刻度
                new String[] { "", "50", "100", "150", "200", "250" }, // Y轴刻度
                new String[] { "15", "23", "10", "36", "45", "40", "12" }, // 数据
                "图标的标题");


    }

    // 顶部返回键
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
