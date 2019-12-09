package com.bitcoin.juwan.myapplication.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bitcoin.juwan.myapplication.R;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        ConcreteCarFactory factory = new ConcreteCarFactory();
        // 方法1：
        ConcreteBenzCar benzCar_1 = factory.createBenz();
        ConcreteToyotaCar toyotaCar_1 = factory.createToyota();
        //方法2：
        ConcreteBenzCar benzCar_2 = factory.createProduct(ConcreteBenzCar.class);
        ConcreteToyotaCar toyotaCar_2 = factory.createProduct(ConcreteToyotaCar.class);
    }
}
