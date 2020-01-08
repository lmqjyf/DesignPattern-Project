package com.bitcoin.juwan.myapplication.memorandum;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bitcoin.juwan.myapplication.R;

public class MemorandumActivity extends AppCompatActivity {

    @Override
    public void onSaveInstanceState(Bundle outState) {
        /**
         * TODO 保存数据
         */

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        /**
         * TODO 取出数据
         */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorandum);

        Originator originator = new Originator();
        //开始玩游戏
        originator.play();

        //
        Caretaker caretaker = new Caretaker();
        //保存数据，并退出游戏
        caretaker.createMemento(originator.quit());

        //再一次开始玩游戏
        Originator newOriginator = new Originator();
        //恢复数据
        newOriginator.restoreStatus(caretaker.getMemento());
    }
}
