package com.yuliang.lecture13;

public class ShippingFeeVisitor implements Vistor{
    private double totalFee;

    @Override
    public void visit(Book book) {
        totalFee += book.getWeight() * 2;
    }

    @Override
    public void visit(DVD dvd) {
        totalFee += dvd.getWeight() * 1.5;
    }

    public double getTotalFee() {
        return totalFee;
    }
}
