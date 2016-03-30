package com.codekata.DesignPatterns.Template;


public class VeggieBurger extends BurgerTemplate {

  @Override
  public boolean customerWantsMeat(){return false;}

  @Override
  public boolean customerWantsCheese(){return false;}

  public void addMeat(){ }

  public void addCheese(){ }

  public void addVeggie(){
    System.out.println("Adding Veggie Burger");
  }

}
