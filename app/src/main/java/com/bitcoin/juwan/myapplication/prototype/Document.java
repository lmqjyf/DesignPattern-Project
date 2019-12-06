package com.bitcoin.juwan.myapplication.prototype;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName：Document
 * Create By：liumengqiang
 * Description：原型模式
 */
public class Document implements Cloneable{

    private String content; //内容

    private ArrayList<String> imageList = new ArrayList<>(); //图片

    public Document() {
        Log.e("Document:", "构造方法");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void addImage(String image) {
        this.imageList.add(image);
    }

    @Override
    protected Document clone() {
        Document documentCopy = null;
        try{
            documentCopy = (Document) super.clone();
            ArrayList<String> imageListClone = (ArrayList<String>) this.imageList.clone();
            documentCopy.content = this.content;
            documentCopy.imageList = imageListClone;
        } catch (CloneNotSupportedException e) {

        }
        return documentCopy;
    }

    @Override
    public String toString() {
        String diver = "\n------------start-------------\n";
        String contentString = "content = " + this.content + " \n";
        String imageString = "";
        for(String imageValue : imageList) {
            imageString += "图片：" + imageValue + " \n";
        }
        String end = "------------end-------------\n";
        Log.e("DocumentL:", diver + contentString + imageString + end);
        return diver + contentString + imageString + end;
    }
}
