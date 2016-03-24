package com.codekata.DesignPatterns.Strategy;

public class ChocolateCake extends Cake{

  public ChocolateCake(){
    super();

    this.setName("Chocolate Cake");
    this.setPrice(30d);
    this.decorateWith(new Flooding());
  }

  @Override
  public void make(){
    System.out.println("Melting chocolate...");
  }

}
