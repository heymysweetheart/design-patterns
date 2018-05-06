package com.yuliang.lab6.lab61;

public abstract class AbstractHandler {
    protected AbstractHandler nextHaldler;

    abstract void handleRequest(CallRecord callRecord);

    abstract boolean canHandleRequest(CallRecord callRecord);

    public AbstractHandler getNextHaldler() {
        return nextHaldler;
    }

    public void setNextHaldler(AbstractHandler nextHaldler) {
        this.nextHaldler = nextHaldler;
    }
}
