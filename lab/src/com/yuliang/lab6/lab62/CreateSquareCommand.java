package com.yuliang.lab6.lab62;

public class CreateSquareCommand implements Command{

    int squareLength;

    public CreateSquareCommand(int squareLength) {
        this.squareLength = squareLength;
    }

    @Override
    public boolean execute() {
        System.out.println("Create a square with length: " + squareLength);
        return true;
    }

    @Override
    public boolean undo() {
        System.out.println("Destroy a square with length: " + squareLength);
        return true;
    }
}
