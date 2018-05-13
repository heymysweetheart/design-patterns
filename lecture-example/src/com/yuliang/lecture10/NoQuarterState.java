package com.yuliang.lecture10;

public class NoQuarterState implements State{
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        if(gumballMachine.getCount() < 1) {
            System.out.println("Already sold out...");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        System.out.println("Insert a quarter...");
        this.gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Could not eject a quarter...");
    }

    @Override
    public void turnCrank() {
        System.out.println("There is no quarter...");
    }

    @Override
    public void dispense() {
        System.out.println("There is no quarter...");
    }

    @Override
    public String toString() {
        return "NoQuarterState";
    }
}
