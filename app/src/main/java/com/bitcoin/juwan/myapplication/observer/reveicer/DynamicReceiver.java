package com.bitcoin.juwan.myapplication.observer.reveicer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * FileName：DynamicReceiver
 * Create By：liumengqiang
 * Description：动态广播
 */
public class DynamicReceiver extends BroadcastReceiver {

    private final static String TAG = DynamicReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, intent.getStringExtra("string"));
    }
}
