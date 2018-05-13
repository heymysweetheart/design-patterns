package com.yuliang.lecture13;

import java.util.List;

public class ShoppingCart {
    private List<OrderItem> orders;
    public double calculateShippingFee(List<OrderItem> orders) {
        ShippingFeeVisitor shippingFeeVisitor = new ShippingFeeVisitor();
        for (OrderItem order : orders) {
            order.accept(shippingFeeVisitor);
        }
        return shippingFeeVisitor.getTotalFee();
    }

    public double calculatePrice(List<OrderItem> orders) {
        OrderPriceVisitor orderPriceVisitor = new OrderPriceVisitor();
        for (OrderItem order : orders) {
            order.accept(orderPriceVisitor);
        }
        return orderPriceVisitor.getTotalPrice();
    }
}
