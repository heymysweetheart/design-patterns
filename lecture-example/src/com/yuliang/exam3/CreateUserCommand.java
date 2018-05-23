package com.yuliang.exam3;

public class CreateUserCommand implements Command{

  private DBFacadeInterface dbFacade = new DbFacade();

  private User user;

  public CreateUserCommand(User user) {
    this.user = user;
  }

  @Override
  public boolean execute() {
    return dbFacade.save(user);
  }

  @Override
  public boolean undo() {
    return dbFacade.remove(user);
  }
}
