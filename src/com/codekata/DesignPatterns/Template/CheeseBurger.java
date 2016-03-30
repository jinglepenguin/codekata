package com.codekata.DesignPatterns.Template;


public class CheeseBurger extends BurgerTemplate {

  public void addMeat(){
    System.out.println("Adding burger");
  }

  public void addCheese(){
    System.out.println("Adding cheddar");
  }

  public void addVeggie(){
    System.out.println("Adding Lettuce and Tomatoes");
  }

}
