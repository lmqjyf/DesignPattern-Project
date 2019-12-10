package com.bitcoin.juwan.myapplication.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * FileName：PeopleObserver
 * Create By：liumengqiang
 * Description：TODO
 */
public class PeopleObserver implements Observer {
    private String peopleName;

    public PeopleObserver(String peopleName) {
        this.peopleName = peopleName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.e("PeopleObserver", "你好，" + peopleName + "：你关注的" + arg + "到货啦，赶快下单吧");
    }
}
