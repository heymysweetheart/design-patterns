package com.yuliang.lab10.question2;

import java.util.List;

public interface Model {
    long basicTicketPrice = 300l;
    long fixedCost = 50_000l;
    long getRevenue(List<Flight> flights);
}
