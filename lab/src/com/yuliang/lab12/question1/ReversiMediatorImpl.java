package com.yuliang.lab12.question1;

import java.util.List;

public class ReversiMediatorImpl implements ReversiMediator{

    private List<Disc> discList;
    @Override
    public void addDisk() {
        for (Disc disc : discList) {
            disc.updateColor();
        }
    }
}
