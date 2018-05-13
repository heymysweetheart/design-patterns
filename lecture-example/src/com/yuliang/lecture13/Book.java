package com.yuliang.lecture13;

public class Book implements OrderItem{

    private double price;
    private double weight;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
