package com.codekata.DesignPatterns.Decorator;

public class Caramel extends Topping{

  public Caramel(IceCream iceCream){
    super(iceCream);

  }

  @Override
  public String getDescription(){
    return "Caramel " + super.getDescription();
  };

  @Override
  public int getPrice(){
    return 2 + super.getPrice();
  }


}
