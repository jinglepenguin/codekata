package com.codekata.DesignPatterns.Decorator;

public class Chocolate extends Topping{

  public Chocolate(IceCream iceCream){
    super(iceCream);
  }

  public String getDescription(){
    return "Chocolate " + iceCream.getDescription();
  }

  public int getPrice(){
    return 1 + iceCream.getPrice();
  }

}
