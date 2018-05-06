package com.yuliang.lab6.lab62;

import java.util.Stack;

public class SquareManager {
    private Command currentCommand = null;
    private Stack<Command> commandsExecuted = new Stack<Command>();

    public void processSquare(int length) {
        CreateSquareCommand createSquareCommand = new CreateSquareCommand(length);
        ScaleSquareCommand scaleSquareCommand = new ScaleSquareCommand(length);
        MoveSquareCommand moveSquareCommand = new MoveSquareCommand(length);
        if(createSquareCommand.execute()) {
            commandsExecuted.push(createSquareCommand);
        }

        if(scaleSquareCommand.execute()) {
            commandsExecuted.push(scaleSquareCommand);
        }

        if(moveSquareCommand.execute()) {
            commandsExecuted.push(moveSquareCommand);
        }

        while (!commandsExecuted.empty()) {
            Command pop = commandsExecuted.pop();
            pop.undo();
        }
    }
}
