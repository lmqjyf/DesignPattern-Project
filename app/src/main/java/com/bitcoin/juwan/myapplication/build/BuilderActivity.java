package com.bitcoin.juwan.myapplication.build;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bitcoin.juwan.myapplication.R;
import com.bitcoin.juwan.myapplication.build.standard.Assemble;
import com.bitcoin.juwan.myapplication.build.standard.Builder;
import com.bitcoin.juwan.myapplication.build.standard.CarBuilder;
import com.bitcoin.juwan.myapplication.build.standard.CarStandard;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        /**
         * 构造者模式1（简易版）
         */
        CarEasy carEasy = new CarEasy.CarBuilder()
                .setEngine("我是发动机")
                .setWheel("我是轮子")
                .setLampBulb("我是车灯")
                .create();

        /**
         * 构造者模式2（标准版）
         */
        Builder carBuilder = new CarBuilder();
        Assemble assemble = new Assemble(carBuilder);
        assemble.construct("我是轮子", "我是发送机", "我是车灯");
        CarStandard carStandard = carBuilder.create(); //构建汽车成功

        /**
         * 构造者模式3（标准版）
         */
        Assemble assembleReplace = new Assemble();
        //直接构建成功
        CarStandard carStandardReplace = assembleReplace.create("我是轮子", "我是发送机", "我是车灯");
    }
}
