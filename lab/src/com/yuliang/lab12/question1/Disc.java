package com.yuliang.lab12.question1;

public abstract class Disc {
    protected ReversiMediator reversiMediator;
    protected COLOR color;

    public Disc(ReversiMediator reversiMediator, COLOR color) {
        this.reversiMediator = reversiMediator;
        this.color = color;
    }

    public ReversiMediator getReversiMediator() {
        return reversiMediator;
    }

    public void setReversiMediator(ReversiMediator reversiMediator) {
        this.reversiMediator = reversiMediator;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public abstract void updateColor();
}
