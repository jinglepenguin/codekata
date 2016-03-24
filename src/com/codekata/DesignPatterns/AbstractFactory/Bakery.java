package com.codekata.DesignPatterns.AbstractFactory;

public class Bakery {

  private PastryFactory factory;

  public Pastry getPastry(String chosenPastry){

    if(chosenPastry.equals("bread")){
      factory = new BreadFactory();

    } else if (chosenPastry.equals("cake")){
      factory = new CakeFactory();

    } else if (chosenPastry.equals("cookie")){
      factory = new CookieFactory();

    } else {
      return null;
    }

    return factory.makePastry();
  }

}
