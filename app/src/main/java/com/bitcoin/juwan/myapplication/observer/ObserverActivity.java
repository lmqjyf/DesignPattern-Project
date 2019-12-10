package com.bitcoin.juwan.myapplication.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bitcoin.juwan.myapplication.R;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

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
    }
}
