package com.bitcoin.juwan.myapplication.observer.android;

import android.database.DataSetObserver;
import android.util.Log;

/**
 * FileName：PerpoleAndroidObserver
 * Create By：liumengqiang
 * Description：TODO
 */
public class PerpoleAndroidObserver extends DataSetObserver {
    private final static String TAG = "PerpoleAndroidObserver";
    @Override
    public void onChanged() {
        super.onChanged();
        Log.e(TAG, "Android下观察者模式: 被观察者改变了");
    }

    @Override
    public void onInvalidated() {
        super.onInvalidated();
    }
}
