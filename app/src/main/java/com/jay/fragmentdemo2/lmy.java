package com.jay.fragmentdemo2;

/**
 * Created by 14646 on 2022/3/14.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class lmy extends AppCompatActivity {
    private LineChartView mLineChartView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma);
        mLineChartView = (LineChartView) findViewById(R.id.lineChart);
        //X轴
        String[] xItem = {"1","2","3","4","5","6","7","8","9","10","11","12",
                "13","14","15","16","17","18","19","20","21","22","23","24"
                ,"25","26","27","28","29","30"};
        ArrayList xItemArray = new ArrayList();
        for (int i = 0; i < xItem.length; i++) {
            xItemArray.add(xItem[i]);
        }
        //Y轴
        int[] yItem = {9,7,19,7,20,19,27,8,18,19,21,20,19,20,8,18,19,21,20,22,21,24,26,24,20,22,21,24,26,24};
        ArrayList<Integer> yItemArray = new ArrayList<>();
        for (int i = 0; i < yItem.length; i++) {
            yItemArray.add(yItem[i]);
        }
        int yMax = findMax(yItem);
        mLineChartView.setXItem(xItemArray);
        mLineChartView.setYItem(yItemArray);
        mLineChartView.setMaxYValue(yMax);

    }

    // 获得数组中最大值
    private int findMax(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max) max=array[i];
        }
        return max;
    }
}
