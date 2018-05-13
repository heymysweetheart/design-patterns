package com.yuliang.lab10.question2;

import java.util.List;

public class MultiClass implements Model{
    @Override
    public long getRevenue(List<Flight> flights) {
        long revenue = 0l;
        for (Flight flight : flights) {
            int passagerNum = flight.getPassagerNum();
            revenue += basicTicketPrice * 10 * passagerNum * (1 / 10) + (basicTicketPrice * 1.5) * passagerNum * (1 / 5) + (basicTicketPrice * 0.75) * passagerNum * 0.7 - fixedCost * 1.2;
        }
        return revenue;
    }
}
