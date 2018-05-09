package com.yuliang.lab7.lab72;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ComponentTAG {

    public ComponentTAG(String title, String content) {
        this.title = title;
        this.content = content;
    }

    protected String title;
    protected String content;

    protected Collection<ComponentTAG> tags = new ArrayList<>();

    public abstract void paint();

    public void addItem(ComponentTAG item){
        tags.add(item);
    }
}
