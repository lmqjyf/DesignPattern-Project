package com.bitcoin.juwan.myapplication.observer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bitcoin.juwan.myapplication.R;
import com.bitcoin.juwan.myapplication.observer.android.PerpoleAndroidObservable;
import com.bitcoin.juwan.myapplication.observer.android.PerpoleAndroidObserver;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        //**************Java下的观察者模式**************//
        //创建观察者
        PeopleObserver zhangsan = new PeopleObserver("张三");
        PeopleObserver lisi = new PeopleObserver("李四");
        PeopleObserver wangwu = new PeopleObserver("王五");

        //创建被观察者
        TaobaoProductObservable observable = new TaobaoProductObservable();
        observable.addObserver(zhangsan);
        observable.addObserver(lisi);
        observable.addObserver(wangwu);

        //通知观察者，货物到货了
        observable.noticeAllObserver("阿米洛键盘");

        //**************Android下的观察者模式**************//
        PerpoleAndroidObserver perpoleAndroidObserver = new PerpoleAndroidObserver();
        PerpoleAndroidObservable perpoleAndroidObservable = new PerpoleAndroidObservable();
        perpoleAndroidObservable.registerObserver(perpoleAndroidObserver);
        perpoleAndroidObservable.notifyDataOnChanged();

        //**************广播学习**************//
        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =  new Intent("com.bitcoin.juwan.myapplication.observer.reveicer");
                intent.putExtra("string", "我是动态广播");
                intent.setPackage(getPackageName());
                sendBroadcast(intent);
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.bitcoin.juwan.myapplication.observer.reveicer");
                intent.putExtra("string","我是静态广播");
                intent.setPackage(getPackageName());
                sendBroadcast(intent, "StaticReceiver");
            }
        });
    }
}
