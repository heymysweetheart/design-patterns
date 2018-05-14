package com.yuliang.lab10.question1;

public class IceState implements State{
    @Override
    public void left() {

        System.out.println("Control value: 1");
    }

    @Override
    public void right() {

        System.out.println("Control value: 1");
    }

    @Override
    public void accel() {

        System.out.println("Control value: 3");
    }

    @Override
    public void brake() {

        System.out.println("Control value: 1");
    }
}
