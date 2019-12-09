package com.bitcoin.juwan.myapplication.factory;

import android.util.Log;

/**
 * FileName：ConcreteToyotaCar
 * Create By：liumengqiang
 * Description：丰田汽车
 */
public class ConcreteToyotaCar extends AbsCar {

    private final static String TAG = "丰田汽车";

    @Override
    protected void setWheel(String wheel) {
        Log.e(TAG, "构造轮子");
    }

    @Override
    protected void setEngine(String engine) {
        Log.e(TAG, "构造发动机");
    }

    @Override
    protected void setLampBulb(String lampBulb) {
        Log.e(TAG, "构造车灯");
    }
}
