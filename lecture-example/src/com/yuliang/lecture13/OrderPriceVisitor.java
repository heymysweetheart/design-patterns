package com.yuliang.lecture13;

public class OrderPriceVisitor implements Vistor{

    private double totalPrice;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(DVD dvd) {
        totalPrice += dvd.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
