package com.codekata.DesignPatterns.Template;


public abstract class BurgerTemplate {

  public void makeSandwich(){

    cutBread();

    if(customerWantsMeat()){
      addMeat();
    }

    if(customerWantsCheese()){
      addCheese();
    }

    if(customerWantsVeggie()){
      addVeggie();
    }

    wrapSandwich();

  }

  public void cutBread(){
    System.out.println("Cutting the bread");
  }

  public boolean customerWantsMeat(){return true;}
  public boolean customerWantsCheese(){return true;}
  public boolean customerWantsVeggie(){return true;}

  public abstract void addMeat();
  public abstract void addCheese();
  public abstract void addVeggie();

  public void wrapSandwich(){
    System.out.println("Wrapping the sandwich");
  }

}
