package com.yuliang.lecture10;

public class SoldOutState implements State{
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        if(gumballMachine.getCount() > 0) {
        }
        System.out.println("Product dispensed...");
        this.gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
