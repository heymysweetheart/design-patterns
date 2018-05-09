package com.yuliang.lab9.lab92;

import java.io.InputStreamReader;

public class InputGUIDemo {

    public static void main(String[] args) {
        InputCareTaker careTaker = new InputCareTaker();
        InputOriginator inputOriginator = new InputOriginator();
        inputOriginator.setText("first memento");
        Memento memento1 = inputOriginator.saveStateToMemento();
        careTaker.add(memento1);
        inputOriginator.setText("second memento");
        careTaker.add(inputOriginator.saveStateToMemento());
        inputOriginator.setText("third memento");
        careTaker.add(inputOriginator.saveStateToMemento());

        inputOriginator.getStateFromMemento(careTaker.getMemento());
        System.out.println(inputOriginator.getText());

        inputOriginator.getStateFromMemento(careTaker.getMemento());
        System.out.println(inputOriginator.getText());

        inputOriginator.getStateFromMemento(careTaker.getMemento());
        System.out.println(inputOriginator.getText());
    }
}
