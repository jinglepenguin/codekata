package com.codekata.DesignPatterns.Observer;

public abstract class Customer{

  protected String name;

  public abstract void update(String bakeryName);

  public void follow(Bakery b){
    b.subscribe(this);
    System.out.println(name + " is now following " + b.getName());
  }

  public void unfollow(Bakery b){
    b.unsubscribe(this);
    System.out.println(name + " stopped following " + b.getName());
  }
}
