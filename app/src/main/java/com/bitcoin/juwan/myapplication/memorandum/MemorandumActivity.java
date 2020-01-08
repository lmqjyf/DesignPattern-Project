package com.bitcoin.juwan.myapplication.memorandum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bitcoin.juwan.myapplication.R;
import com.bitcoin.juwan.myapplication.memorandum.example.ExampleCaretaker;
import com.bitcoin.juwan.myapplication.memorandum.example.ExampleEditText;
import com.bitcoin.juwan.myapplication.memorandum.example.Memento;

import java.util.ArrayList;
import java.util.List;

public class MemorandumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorandum);
        //示例1
        this.example();

        //示例2
        initView();
    }

    private void example() {
        Originator originator = new Originator();
        //开始玩游戏
        originator.play();

        //
        Caretaker caretaker = new Caretaker();
        //保存数据，并退出游戏
        caretaker.createMemento(originator.quit());

        //再一次开始玩游戏
        Originator newOriginator = new Originator();
        //恢复数据
        newOriginator.restoreStatus(caretaker.getMemento());
    }

    private Button preButton;
    private Button backButon;
    private Button saveButton;
    private ExampleEditText editText;
    ExampleCaretaker  caretaker;

    private void initView() {
        //编辑框
        editText = findViewById(R.id.editText);

        caretaker = new ExampleCaretaker();
        //
        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.resumeData(caretaker.getPreMemento());
            }
        });

        //保存按钮
        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caretaker.saveClick(editText.getMemento());
            }
        });

        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.resumeData(caretaker.getBackMemento());
            }
        });
    }

}
