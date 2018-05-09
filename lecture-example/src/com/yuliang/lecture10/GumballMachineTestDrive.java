package com.yuliang.lecture10;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

        //Beginning state, no quarterState
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        //Insert quarter, has quarterState
        gumballMachine.insertQuarter();
        System.out.println(gumballMachine);

        //Eject quarter, no quarterState
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);

        //Eject quarter again, print error message
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine);

        //Turn crank, print error message
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        //Dispense, print error message
        gumballMachine.dispense();
        System.out.println(gumballMachine);

        //Has quarter state, then turn crank, the state changed to SoldState
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.dispense();
    }
}
