package com.yuliang.lab7.lab72;

public class Composite extends ComponentTAG{

    public Composite(String tagName, String content) {
        super(tagName, content);
    }

    @Override
    public void paint() {
        for(ComponentTAG tag : tags) {
            tag.paint();
        }
    }
}
