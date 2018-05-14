package com.yuliang.lab10.question1;

public class GameController {
    private State gravelState;
    private State iceState;
    private State regularState;
    private State wetState;
    private State state;

    public GameController() {
        gravelState = new GravelState();
        iceState = new IceState();
        regularState = new RegularState();
        wetState = new WetState();
        state = regularState;
    }

    public void left() {
        state.left();
    }

    public void right() {
        state.right();
    }

    public void accel() {
        state.accel();
    }

    public void brake() {
        state.brake();
    }
}
