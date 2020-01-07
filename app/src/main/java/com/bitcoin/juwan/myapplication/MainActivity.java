package com.bitcoin.juwan.myapplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bitcoin.juwan.myapplication.build.BuilderActivity;
import com.bitcoin.juwan.myapplication.factory.FactoryActivity;
import com.bitcoin.juwan.myapplication.memorandum.MemorandumActivity;
import com.bitcoin.juwan.myapplication.observer.ObserverActivity;
import com.bitcoin.juwan.myapplication.observer.reveicer.DynamicReceiver;
import com.bitcoin.juwan.myapplication.prototype.PrototypeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //单例模式
        findViewById(R.id.singleton_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //构造者模式
        findViewById(R.id.build_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuilderActivity.class);
                startActivity(intent);
            }
        });

        //原型模式
        findViewById(R.id.build_propotype).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrototypeActivity.class);
                startActivity(intent);
            }
        });

        //工厂模式
        findViewById(R.id.factory_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FactoryActivity.class);
                startActivity(intent);
            }
        });

        //观察者模式
        findViewById(R.id.observer_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ObserverActivity.class);
                startActivity(intent);
            }
        });

        //注册广播
        IntentFilter intentFilter = new IntentFilter("com.bitcoin.juwan.myapplication.observer.reveicer");
        receiver = new DynamicReceiver();
        registerReceiver(receiver, intentFilter);

        //备忘录模式
        findViewById(R.id.memorandum_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemorandumActivity.class);
                startActivity(intent);
            }
        });
    }

    private DynamicReceiver receiver;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(receiver == null) return;
        //反注册广播
        unregisterReceiver(receiver);
    }
}
