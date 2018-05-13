package com.yuliang.lab12.question2;

import java.util.ArrayList;
import java.util.List;

public class GuiPannel implements Observer{

    private List<String> names = new ArrayList<>();
    private Object MUTEX = new Object();

    @Override
    public void updateName(String name, String operation) {

        if(operation.equalsIgnoreCase("Add")) {
            synchronized (MUTEX) {
                names.add(name);
            }
        } else if(operation.equalsIgnoreCase("Delete")) {
            if(names.contains(name)) {
                synchronized (MUTEX) {
                    names.remove(name);
                }
            }
        }

        System.out.println("After update: ");

        for (String s : names) {
            System.out.println(s);
        }
    }
}
