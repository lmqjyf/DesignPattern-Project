package com.bitcoin.juwan.myapplication.observer;

import java.util.Observable;

/**
 * FileName：TaobaoProductObservable
 * Create By：liumengqiang
 * Description：淘宝内的商品
 */
public class TaobaoProductObservable extends Observable {
    public void noticeAllObserver(String goodsName) {
        setChanged();

        notifyObservers(goodsName);
    }
}
