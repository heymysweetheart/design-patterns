package com.yuliang.lab13.question1;

public class VisitorMain {
    public static void main(String[] args) {
        Component topic = new Component("Topic", SIDE.NONE, null);

        Component a = new Component("A", SIDE.RIGHT, null);
        Component b = new Component("B", SIDE.RIGHT, null);
        Component c = new Component("C", SIDE.RIGHT, null);

        Component d = new Component("D", SIDE.LEFT, null);
        Component e = new Component("E", SIDE.LEFT, null);
        Component f = new Component("F", SIDE.LEFT, null);

        a.addChild("A1");
        a.addChild("A2");

        Component a1 = a.getChildren().get(0);
        a1.addChild("AA1");
        a1.addChild("AA2");
        a1.addChild("AA3");

        b.addChild("B1");
        b.addChild("B2");

        c.addChild("C1");
        c.addChild("C2");

        d.addChild("D1");
        d.addChild("D2");

        e.addChild("E1");
        e.addChild("E2");
        e.addChild("E3");

        f.addChild("F1");
        f.addChild("F2");

        topic.addChild(a);
        topic.addChild(b);
        topic.addChild(c);
        topic.addChild(d);
        topic.addChild(e);
        topic.addChild(f);

        DisplayNodeVisitor displayNodeVisitor = new DisplayNodeVisitor();
        topic.accept(displayNodeVisitor);
    }
}
