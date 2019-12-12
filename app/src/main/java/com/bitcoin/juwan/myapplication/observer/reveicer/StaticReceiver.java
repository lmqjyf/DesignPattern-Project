package com.bitcoin.juwan.myapplication.observer.reveicer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * FileName：StaticReceiver
 * Create By：liumengqiang
 * Description：静态广播
 */
public class StaticReceiver extends BroadcastReceiver {
    private final static String TAG = StaticReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, intent.getStringExtra("string"));
    }
}
