package com.bitcoin.juwan.myapplication.observer;

import java.util.Observable;

/**
 * FileName：TaobaoPruductObservable
 * Create By：liumengqiang
 * Description：淘宝内的商品
 */
public class TaobaoPruductObservable extends Observable {
    public void noticeAllObserver(String goodsName) {
        setChanged();

        notifyObservers(goodsName);
    }
}
