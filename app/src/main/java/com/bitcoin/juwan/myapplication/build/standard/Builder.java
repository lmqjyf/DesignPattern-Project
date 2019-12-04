package com.bitcoin.juwan.myapplication.build.standard;

/**
 * FileName：Builder
 * Create By：liumengqiang
 * Description：抽象类
 */
public abstract class Builder {

    protected abstract void setWheel(String wheel);

    protected abstract void setEngine(String engine);

    protected abstract void setLampBulb(String lampBulb);

    public abstract CarStandard create();
}
