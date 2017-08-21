package com.example.kk.dididache.model;


import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.PieData;

/**
 * Created by 小吉哥哥 on 2017/8/14.
 */

public class DataKeeper {
    private static DataKeeper keeper;
    private CombinedData combinedData;
    private PieData pieData;

    public PieData getPieData() {
        return pieData;
    }

    public void setPieData(PieData pieData) {
        this.pieData = pieData;
    }

    public static DataKeeper getInstance() {
        if (keeper == null) {
            keeper = new DataKeeper();
        }
        return keeper;
    }


    public CombinedData getCombinedData() {
        return combinedData;
    }

    public void setCombinedData(CombinedData combinedData) {
        this.combinedData = combinedData;
    }
}
