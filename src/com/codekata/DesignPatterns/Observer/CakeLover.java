package com.codekata.DesignPatterns.Observer;

public class CakeLover extends Customer{

  public CakeLover(String name){
    super();

    this.name = name;
  }

  public void update(String bakeryName){
    System.out.println(bakeryName + " updated Cake Lover - " + name);
  }

}
