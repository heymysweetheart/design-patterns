package com.yuliang.lab10.question1;

public class WetState implements State{
    @Override
    public void left() {

        System.out.println("Control value: 5");
    }

    @Override
    public void right() {
        System.out.println("Control value: 5");

    }

    @Override
    public void accel() {
        System.out.println("Control value: 5");

    }

    @Override
    public void brake() {
        System.out.println("Control value: 5");

    }
}
