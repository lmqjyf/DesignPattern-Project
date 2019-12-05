package com.bitcoin.juwan.myapplication.build.standard;

/**
 * FileName：CarStandard
 * Create By：liumengqiang
 * Description：构造者模式（标准版）——产品类
 */
public class CarStandard {
    private String wheel; //轮子
    private String engine; //发动机
    private String lampBulb; //车灯
    // ........等等零件

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLampBulb() {
        return lampBulb;
    }

    public void setLampBulb(String lampBulb) {
        this.lampBulb = lampBulb;
    }
}
