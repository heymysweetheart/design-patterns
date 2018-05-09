package com.yuliang.lab9.lab92;

import java.util.Stack;

public class InputCareTaker {

    private Stack<Memento> mementoStack = new Stack<Memento>();

    public void add(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        return mementoStack.pop();
    }

}
