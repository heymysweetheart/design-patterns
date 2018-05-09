package com.yuliang.lab9.lab92;

public class Memento {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento(String text) {
        this.text = text;
    }
}
