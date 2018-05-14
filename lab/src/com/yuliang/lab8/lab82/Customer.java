package com.yuliang.lab8.lab82;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private Address residenceAddress;
    private HealthProfile profile;
    //city map with a red dot representing residence location
    private Image locationMap;

    public Customer(Image locationMap) {
        this.locationMap = locationMap;
    }
}
