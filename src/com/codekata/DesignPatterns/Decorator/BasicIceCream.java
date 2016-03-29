package com.codekata.DesignPatterns.Decorator;

public class BasicIceCream implements IceCream{

  public String getDescription(){
    return "vanilla ice cream";
  }

  public int getPrice(){
    return 5;
  }

}
