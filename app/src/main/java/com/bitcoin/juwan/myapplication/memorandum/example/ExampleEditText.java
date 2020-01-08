package com.bitcoin.juwan.myapplication.memorandum.example;

import android.content.Context;
import android.util.AttributeSet;

/**
 * FileName：ExampleEditText
 * Create By：liumengqiang
 * Description：TODO
 */
public class ExampleEditText extends android.support.v7.widget.AppCompatEditText {
    public ExampleEditText(Context context) {
        super(context);
    }

    public ExampleEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExampleEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //恢复数据
    public void resumeData(Memento memento) {
        setText(memento.content);
        setSelection(memento.selectionPoint);
    }

    public Memento getMemento() {
        Memento memento = new Memento();
        memento.content = getText().toString();
        memento.selectionPoint = getSelectionStart();
        return memento;
    }
}
