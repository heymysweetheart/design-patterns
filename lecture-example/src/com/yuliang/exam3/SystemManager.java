package com.yuliang.exam3;

import static com.sun.tools.javadoc.Main.execute;

import java.util.Stack;

import javax.jws.soap.SOAPBinding;

public class SystemManager {
  private Command currentCommand = null;

  private Stack<Command> commandStack = new Stack<Command>();

  public void creat(User user) {

    CreateUserCommand createUserCommand = new CreateUserCommand(user);
    if(createUserCommand.execute()) {
      commandStack.push(createUserCommand);

    } else {

    }
  }
}
