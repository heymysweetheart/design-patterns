package com.yuliang.lab13.question1;

import java.util.ArrayList;
import java.util.List;

public class Component implements Node{
    private String name;
    private SIDE side;
    private List<Component> children;

    public void addChild(String name) {
        Component component = new Component(name, this.side, null);
        this.children.add(component);
    }

    public void addChild(Component component) {
        this.children.add(component);
    }

    public Component(String name, SIDE side, List<Component> children) {
        this.name = name;
        this.side = side;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SIDE getSide() {
        return side;
    }

    public void setSide(SIDE side) {
        this.side = side;
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
