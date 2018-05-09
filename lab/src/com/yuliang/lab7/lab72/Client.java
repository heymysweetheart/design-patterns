package com.yuliang.lab7.lab72;

public class Client {
    public static void main(String[] args) {
        Composite html = new Composite("html", "");
        Leaf title = new Leaf("title", "Your Title Here");
        Composite head = new Composite("head", "");

        Composite body = new Composite("body", "");

        Leaf h1 = new Leaf("h1", "This is a Header");
        body.tags.add(h1);

        head.tags.add(title);
        html.tags.add(head);
        html.tags.add(body);

        html.paint();
    }
}
