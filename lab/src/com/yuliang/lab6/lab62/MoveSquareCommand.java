package com.yuliang.lab6.lab62;

public class MoveSquareCommand implements Command{

    int distance;

    public MoveSquareCommand(int squareLength) {
        this.distance = squareLength;
    }

    @Override
    public boolean execute() {
        System.out.println("Move a square to right: " + distance);
        return true;
    }

    @Override
    public boolean undo() {
        System.out.println("Remove a square to left: " + distance);
        return true;
    }
}
