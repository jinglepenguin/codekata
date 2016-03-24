package com.codekata.DesignPatterns.AbstractFactory;

public class BreadFactory implements PastryFactory{

  public Pastry makePastry(){

      return new Bread();

  }

}
