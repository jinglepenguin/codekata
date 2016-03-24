package com.codekata.DesignPatterns.AbstractFactory;

public class CookieFactory implements PastryFactory{

  public Pastry makePastry(){

      return new Cookie();

  }

}
