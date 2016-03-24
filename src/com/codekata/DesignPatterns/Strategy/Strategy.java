package com.codekata.DesignPatterns.Strategy;

public class Strategy{

  public static void main(String[] args){

    Cake chocolateCake = new ChocolateCake();
    Cake strawberryCake = new StrawberryCake();

    System.out.println("Make chocolate cake: ");

    chocolateCake.make();
    chocolateCake.decorate();
    chocolateCake.eat();

    System.out.println("Make strawberry cake: ");

    strawberryCake.make();
    strawberryCake.decorate();
    strawberryCake.eat();

    System.out.println("Creating new type of chocolate cake: ");

    chocolateCake.decorateWith(new Piping());
    chocolateCake.decorate();

  }

}
