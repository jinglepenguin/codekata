package com.codekata.DesignPatterns.Template;

public class Main{

  public static void main(String[] args){

    System.out.println("Cheese burger please!");

    CheeseBurger cheeseBurger = new CheeseBurger();
    cheeseBurger.makeSandwich();

    System.out.println("Veggie burger please!");

    VeggieBurger veggieBurger = new VeggieBurger();
    veggieBurger.makeSandwich();
  }

}
