package com.yuliang.lab13.question1;

import java.util.List;

public class DisplayNodeVisitor implements Visitor{
    @Override
    public void visit(Component component) {
        List<Component> children = component.getChildren();
        for (Component child : children) {
            int num = 0;
            num++;
            SubNodeVisistor subNodeVisistor = new SubNodeVisistor();
            child.accept(subNodeVisistor);
            num += subNodeVisistor.getNodesNum();
            System.out.println(num +" " + child.getName() + " nodes");
        }
    }

}
