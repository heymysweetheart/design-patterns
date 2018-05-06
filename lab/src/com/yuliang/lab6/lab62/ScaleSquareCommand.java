package com.yuliang.lab6.lab62;

public class ScaleSquareCommand implements Command{

    int squareLength;

    public ScaleSquareCommand(int squareLength) {
        this.squareLength = squareLength;
    }

    @Override
    public boolean execute() {
        System.out.println("Scale a square to length: " + squareLength * 2);
        return true;
    }

    @Override
    public boolean undo() {
        System.out.println("Rescale a square to length: " + squareLength);
        return true;
    }
}
