package com.codekata.DesignPatterns.Observer;

public class BreadLover extends Customer{

  public BreadLover(String name){
    super();

    this.name = name;

  }

  public void update(String bakeryName){
      System.out.println(bakeryName + " updated Bread Lover - " + name);
  }


}
