package com.yuliang.lab10.question2;

import java.util.List;

public class TwoClasses implements Model{
    @Override
    public long getRevenue(List<Flight> flights) {
        long revenue = 0l;
        for (Flight flight : flights) {
            int passagerNum = flight.getPassagerNum();
            revenue += passagerNum / 3 * (basicTicketPrice * 1.5) + (2 / 3 * passagerNum) * (basicTicketPrice * 0.75) - fixedCost * 1.1;
        }
        return revenue;
    }

}
