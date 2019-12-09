package com.bitcoin.juwan.myapplication.factory;

/**
 * FileName：AbsCar
 * Create By：liumengqiang
 * Description：TODO
 */
public abstract class AbsCar {

    protected String wheel; //轮子
    protected String engine; //发动机
    protected String lampBulb; //车灯
    // ........等等公共零件

    protected abstract void setWheel(String wheel);

    protected abstract void setEngine(String engine);

    protected abstract void setLampBulb(String lampBulb);
}
