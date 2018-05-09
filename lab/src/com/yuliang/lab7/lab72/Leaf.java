package com.yuliang.lab7.lab72;

public class Leaf extends ComponentTAG{

    public Leaf(String title, String content) {
        super(title, content);
    }

    @Override
    public void paint() {
        System.out.println("Print leaf: " + content);
    }
}
