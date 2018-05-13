package com.yuliang.lab10.question2;

import java.util.ArrayList;
import java.util.List;

public class StrategyDemoMain {
    public static void main(String[] args) {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight(300));
        flightList.add(new Flight(400));
        flightList.add(new Flight(500));
        flightList.add(new Flight(600));
        flightList.add(new Flight(700));
        flightList.add(new Flight(800));

        System.out.println(new RevenueCounter(new SinglePrice()).getRevenue(flightList));
        System.out.println(new RevenueCounter(new TwoClasses()).getRevenue(flightList));
        System.out.println(new RevenueCounter(new MultiClass()).getRevenue(flightList));
    }
}
