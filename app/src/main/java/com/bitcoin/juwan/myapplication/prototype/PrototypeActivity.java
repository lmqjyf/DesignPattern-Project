package com.bitcoin.juwan.myapplication.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bitcoin.juwan.myapplication.R;

/**
 * 原型模式
 */
public class PrototypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);

        Document  document = new Document();
        document.setContent("我是内容");
        document.addImage("我是图片1");
        document.addImage("我是图片2");
        document.toString();

        //clone
        Document documentClone = document.clone();
        documentClone.setContent("我是修改后的内容");
        documentClone.addImage("我是图片3");
        documentClone.toString();

        //再次打印原版
        document.toString();
    }
}
