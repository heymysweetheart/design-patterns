package com.yuliang.lab11.question2;

public abstract class ListDecorator implements ListProfiler{
    protected ListProfiler listProfiler;

    public ListDecorator(ListProfiler listProfiler) {
        this.listProfiler = listProfiler;
    }

    @Override
    public boolean add(String string) {
        return listProfiler.add(string);
    }

    @Override
    public boolean remobe(String string) {
        return listProfiler.remobe(string);
    }

    @Override
    public boolean contains(String string) {
        return listProfiler.contains(string);
    }

    @Override
    public int size() {
        return listProfiler.size();
    }
}
