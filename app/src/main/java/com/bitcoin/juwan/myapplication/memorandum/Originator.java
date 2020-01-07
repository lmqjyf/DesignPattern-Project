package com.bitcoin.juwan.myapplication.memorandum;

import android.util.Log;

/**
 * FileName：Originator
 * Create By：liumengqiang
 * Description：需要保存数据的对象
 */
public class Originator {

    private static final String TAG = Originator.class.getSimpleName();

    private int checkPoint = 1; //关卡
    private int lifeValue = 100; //生命值

    /**
     * 玩游戏
     */
    public void play() {
        Log.e(TAG, String.format("当前%d关: ", checkPoint) + String.format(", 当前生命值：%d", lifeValue));
        checkPoint ++;
        lifeValue -= 10;
        Log.e(TAG, String.format("到达%d关: ", checkPoint) + String.format(", 当前生命值：%d", lifeValue));
    }

    /**
     * 创建备忘录
     */
    private Memento storeStatus() {
        Memento memento = new Memento();
        memento.checkPoint = checkPoint;
        memento.lifeValue = lifeValue;
        return memento;
    }

    /**
     * 退出游戏
     */
    public Memento quit() {
        return this.storeStatus();
    }

    /**
     * 恢复状态
     */
    public void restoreStatus(Memento memento) {
        this.checkPoint = memento.checkPoint;
        this.lifeValue = memento.lifeValue;

        Log.e(TAG, String.format("恢复游戏后，当前闯关等级：%d，当前生命值：%d", checkPoint, lifeValue));
    }
}
