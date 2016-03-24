package com.codekata.DesignPatterns.Factory;

public class Bakery {

  public Pastry makePastry(String chosenPastry){

    if(chosenPastry.equals("bread")){
      return new Bread();
    } else if (chosenPastry.equals("cake")){
      return new Cake();
    } else if (chosenPastry.equals("cookie")){
      return new Cookie();
    } else {
      return null;
    }

  }

}
