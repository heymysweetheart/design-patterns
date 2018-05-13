package com.yuliang.lab13.question1;

import java.util.List;

public class SubNodeVisistor implements Visitor{
    private int nodesNum = 0;
    @Override
    public void visit(Component component) {
        List<Component> children = component.getChildren();
        for (Component child : children) {
            nodesNum++;
            child.accept(this);
        }
    }

    public int getNodesNum() {
        return nodesNum;
    }
}
