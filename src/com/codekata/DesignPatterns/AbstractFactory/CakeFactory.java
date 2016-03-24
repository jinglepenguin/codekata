package com.codekata.DesignPatterns.AbstractFactory;

public class CakeFactory implements PastryFactory{

  public Pastry makePastry(){

      return new Cake();

  }

}
