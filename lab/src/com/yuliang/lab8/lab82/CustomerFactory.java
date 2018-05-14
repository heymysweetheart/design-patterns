package com.yuliang.lab8.lab82;

import java.util.HashMap;

public class CustomerFactory {

    private static final HashMap<Image, Customer> customerHashMap = new HashMap<>();

    public static Customer getCustomer(Image image) {
        Customer customer = customerHashMap.get(image);
        if(customer == null) {
           customer = new Customer(image);
            customerHashMap.put(image, customer);
        }

        return customer;
    }
}
