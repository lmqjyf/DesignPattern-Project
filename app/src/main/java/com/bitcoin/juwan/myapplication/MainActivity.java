package com.bitcoin.juwan.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bitcoin.juwan.myapplication.build.BuilderActivity;
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
    }
}
