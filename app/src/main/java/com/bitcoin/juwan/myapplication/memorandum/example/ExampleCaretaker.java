package com.bitcoin.juwan.myapplication.memorandum.example;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName：ExampleCaretaker
 * Create By：liumengqiang
 * Description：TODO
 */
public class ExampleCaretaker {
    private int mIndex; //最后一个索引
    private static final int MAX_LENGTH = 30;
    private List<Memento> mementoList = new ArrayList<>(); //保存书写的记录

    public void saveClick(Memento memento) {
        if (mIndex > MAX_LENGTH) {
            mementoList.remove(0);
        }
        mementoList.add(memento);
        mIndex = mementoList.size() - 1;
    }

    public Memento getPreMemento() {
        mIndex = mIndex <= 0 ? mIndex : --mIndex;
        return mementoList.get(mIndex);
    }

    public Memento getBackMemento() {
        mIndex = mIndex < mementoList.size() - 1 ?  ++mIndex: mIndex;
        return mementoList.get(mIndex);
    }
}
