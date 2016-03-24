package com.codekata.DesignPatterns.Strategy;

public class StrawberryCake extends Cake{

  public StrawberryCake(){
    super();

    this.setName("StrawberryCake");
    this.setPrice(10d);
    this.decorateWith(new Piping());
  }

  @Override
  public void make(){
    System.out.println("Cutting Strawberries...");
  }

}
