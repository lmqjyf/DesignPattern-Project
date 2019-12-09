package com.bitcoin.juwan.myapplication.factory;

/**
 * FileName：ConcreteCarFactory
 * Create By：liumengqiang
 * Description：工厂实现类
 */
public class ConcreteCarFactory extends AbsFactory {

    //***********************方法1*************************//
    public ConcreteBenzCar createBenz() {
        ConcreteBenzCar car = new ConcreteBenzCar();
        //TODO: 构造
        return car;
    }

    public ConcreteToyotaCar createToyota() {
        ConcreteToyotaCar car = new ConcreteToyotaCar();
        //TODO：构造
        return car;
    }

    //***********************方法2*************************//
    @Override
    public <T extends AbsCar> T createProduct(Class<T> mClass) {
        T object = null;
        try {
            object = (T) Class.forName(mClass.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return object;
    }
}
