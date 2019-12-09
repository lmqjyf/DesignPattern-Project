package com.bitcoin.juwan.myapplication.factory;

/**
 * FileName：AbsFactory
 * Create By：liumengqiang
 * Description：抽象工程类——规范工厂子类
 */
public abstract class AbsFactory {
    public abstract <T extends AbsCar> T createProduct(Class<T> mClass);
}
