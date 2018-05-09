package com.yuliang.lab9.lab92;

public class InputOriginator {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento saveStateToMemento() {
        return new Memento(text);
    }

    public void getStateFromMemento(Memento memento) {
        this.text = memento.getText();
    }
}
