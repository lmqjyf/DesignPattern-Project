package com.bitcoin.juwan.myapplication.build.standard;

/**
 * FileName：Assemble
 * Create By：liumengqiang
 * Description：组装类——将Builder内部的组件组装成成品
 */
public class Assemble {
    private Builder builder;

    public Assemble() {
        this.builder = new CarBuilder();
    }

    public Assemble(Builder builder) {
        this.builder = builder;
    }

    public void construct(String wheel, String engine, String lampBulb) {
        builder.setEngine(wheel);
        builder.setWheel(wheel);
        builder.setLampBulb(lampBulb);
    }

    public CarStandard create(String wheel, String engine, String lampBulb) {
        builder.setEngine(wheel);
        builder.setWheel(wheel);
        builder.setLampBulb(lampBulb);

        /**
         * 实际上我觉得，这里直接调用：builder.create()比较合适，做到了真正封闭Builder组装细节
         */
        return builder.create();
    }
}
