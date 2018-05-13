package com.yuliang.lab10.question2;

import java.util.List;

public class RevenueCounter {
    private Model model;

    public RevenueCounter(Model model) {
        this.model = model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public long getRevenue(List<Flight> flightList) {
        return model.getRevenue(flightList);
    }
}
