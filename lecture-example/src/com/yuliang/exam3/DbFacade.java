package com.yuliang.exam3;

public class DbFacade implements DBFacadeInterface{
  @Override
  public boolean save(User user) {
    try {
      //save logic
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public boolean remove(User user) {
    try {
      //remove logic
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
