package com.yuliang.lab3.lab31;

public class Adapter implements StackTarget, QueueTarget {

    private Adaptee adaptee;

    @Override
    public void push(String str) {
        adaptee.add(str);
    }

    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String value = adaptee.get(end);
        adaptee.remove(end);
        return value;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }

    @Override
    public void add(String str) {
        adaptee.add(str);
    }

    @Override
    public String remove() {
        String head = adaptee.get(0);
        adaptee.remove(0);
        return head;
    }
}
