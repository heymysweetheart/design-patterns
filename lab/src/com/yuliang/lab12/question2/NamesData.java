package com.yuliang.lab12.question2;

import java.util.ArrayList;
import java.util.List;

public class NamesData implements Subject{

    private List<String> names;

    private List<Observer> observers;

    private final Object MUTEX = new Object();

    public NamesData() {
        this.names = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
        notifyObservers(name, "add");
    }

    public void deleteName(String name) {
        names.remove(name);
        notifyObservers(name, "delete");
    }

    @Override
    public void attach(Observer observer) {
        synchronized (MUTEX) {
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }

    }

    @Override
    public void detach(Observer observer) {
        synchronized (MUTEX) {
            if(observers.indexOf(observer) != -1) {
                observers.remove(observer);
            }
        }

    }

    @Override
    public void notifyObservers(String name, String operation) {

        for (Observer observer : observers) {
            observer.updateName(name, operation);
        }
    }
}
