package com.codekata.DesignPatterns.Decorator;

public class Topping implements IceCream{

  protected IceCream iceCream;

  public Topping(IceCream iceCream){
    this.iceCream = iceCream;
  }

  public String getDescription(){
    return this.iceCream.getDescription();
  };

  public int getPrice(){
    return this.iceCream.getPrice();
  }


}
