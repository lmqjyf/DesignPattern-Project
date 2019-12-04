package com.bitcoin.juwan.myapplication.build;

/**
 * FileName：CarEasy
 * Create By：liumengqiang
 * Description：构造者模式(简易版)
 */
public class CarEasy {
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

    protected static class CarBuilder {
        private String wheel; //轮子
        private String engine; //发动机
        private String lampBulb; //车灯
        // ........等等零件

        public CarBuilder setWheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setLampBulb(String lampBulb) {
            this.lampBulb = lampBulb;
            return this;
        }

        public CarEasy create() {
            CarEasy car = new CarEasy();
            initCar(car);
            return car;
        }

        private void initCar(CarEasy car) {
            car.setEngine(engine);
            car.setWheel(wheel);
            car.setLampBulb(lampBulb);
        }
    }
}
