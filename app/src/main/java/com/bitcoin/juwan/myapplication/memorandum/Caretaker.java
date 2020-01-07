package com.bitcoin.juwan.myapplication.memorandum;

/**
 * FileName：Caretaker
 * Create By：liumengqiang
 * Description：负责管理备忘录，但是自己不能操作备忘录
 */
public class Caretaker {
    private Memento memento;

    public void createMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
