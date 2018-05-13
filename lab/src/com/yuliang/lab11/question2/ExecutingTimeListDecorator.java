package com.yuliang.lab11.question2;

public class ExecutingTimeListDecorator extends ListDecorator{
    public ExecutingTimeListDecorator(ListProfiler listProfiler) {
        super(listProfiler);
    }

    @Override
    public boolean add(String string) {
        long start = System.currentTimeMillis();
        boolean add = super.add(string);
        System.out.println("Executing time: " + (System.currentTimeMillis() - start));
        return add;
    }

    @Override
    public boolean remobe(String string) {
        long start = System.currentTimeMillis();
        boolean remobe = super.remobe(string);
        System.out.println("Executing time: " + (System.currentTimeMillis() - start));
        return remobe;
    }

    @Override
    public boolean contains(String string) {
        long start = System.currentTimeMillis();
        boolean contains = super.contains(string);
        System.out.println("Executing time: " + (System.currentTimeMillis() - start));
        return contains;
    }

    @Override
    public int size() {
        long start = System.currentTimeMillis();
        int size = super.size();
        System.out.println("Executing time: " + (System.currentTimeMillis() - start));
        return size;
    }
}
