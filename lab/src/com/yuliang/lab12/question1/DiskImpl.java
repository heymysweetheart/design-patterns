package com.yuliang.lab12.question1;

public class DiskImpl extends Disc{

    private int indexX;
    private int indexY;



    public DiskImpl(int indexX, int indexY, ReversiMediatorImpl reversiMediator, COLOR color) {
        super(reversiMediator, color);
        this.indexX = indexX;
        this.indexY = indexY;
    }

    @Override
    public void updateColor() {
        color = this.color == COLOR.BLACK ? COLOR.WHITE : COLOR.BLACK;
    }
}
