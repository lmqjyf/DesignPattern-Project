package com.bitcoin.juwan.myapplication.observer.android;

import android.database.DataSetObservable;
import android.database.DataSetObserver;

/**
 * FileName：PerpoleAndroidObservable
 * Create By：liumengqiang
 * Description：TODO
 */
public class PerpoleAndroidObservable {
    private DataSetObservable dataSetObservable = new DataSetObservable();
    public void registerObserver(DataSetObserver dataSetObserver) {
        dataSetObservable.registerObserver(dataSetObserver);
    }

    public void unRegisterObserver(DataSetObserver dataSetObserver) {
        dataSetObservable.unregisterObserver(dataSetObserver);
    }

    public void notifyDataOnChanged() {
        dataSetObservable.notifyChanged();
    }
}
