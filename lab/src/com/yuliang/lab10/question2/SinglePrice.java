package com.yuliang.lab10.question2;

import java.util.List;

public class SinglePrice implements Model{
    @Override
    public long getRevenue(List<Flight> flights) {
        long revenue = 0l;
        for (Flight flight : flights) {
            revenue += basicTicketPrice * flight.getPassagerNum() - fixedCost;
        }
        return revenue;
    }
}
