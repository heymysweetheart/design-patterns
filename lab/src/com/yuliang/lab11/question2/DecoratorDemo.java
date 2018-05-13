package com.yuliang.lab11.question2;

import java.util.ArrayList;
import java.util.LinkedList;

public class DecoratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        ExecutingTimeListDecorator linkListDecorator = new ExecutingTimeListDecorator(new LinkedListProfiler());
        linkListDecorator.add("hi");
        linkListDecorator.size();

        ExecutingTimeListDecorator timeListDecorator = new ExecutingTimeListDecorator(new ArrayListProfiler());
        timeListDecorator.add("hi");
        timeListDecorator.size();


    }
}
