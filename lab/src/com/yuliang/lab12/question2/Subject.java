package com.yuliang.lab12.question2;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers(String name, String operation);
}
