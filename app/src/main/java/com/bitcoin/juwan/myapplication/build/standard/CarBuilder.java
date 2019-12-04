package com.bitcoin.juwan.myapplication.build.standard;

/**
 * FileName：CarBuilder
 * Create By：liumengqiang
 * Description：构建类
 */
public class CarBuilder extends Builder{

    private CarStandard carStandard = new CarStandard();

    @Override
    protected void setWheel(String wheel) {
        carStandard.setWheel(wheel);
    }

    @Override
    protected void setEngine(String engine) {
        carStandard.setEngine(engine);
    }

    @Override
    protected void setLampBulb(String lampBulb) {
        carStandard.setLampBulb(lampBulb);
    }

    @Override
    public CarStandard create() {
        return carStandard;
    }
}
