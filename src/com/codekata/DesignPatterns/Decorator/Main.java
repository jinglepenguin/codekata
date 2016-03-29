package com.codekata.DesignPatterns.Decorator;

public class Main{

  public static void main(String[] args){

    IceCream iceCream1 = new Caramel(new BasicIceCream());

    System.out.println("IceCream 1: " + iceCream1.getDescription());
    System.out.println("Price: " + iceCream1.getPrice());
    System.out.println("");

    IceCream iceCream2 = new Chocolate(new Caramel(new BasicIceCream()));

    System.out.println("IceCream 2: " + iceCream2.getDescription());
    System.out.println("Price: " + iceCream2.getPrice());
    System.out.println("");

    IceCream iceCream3 = new BasicIceCream();
    System.out.println("IceCream 3: " + iceCream3.getDescription());
    System.out.println("Price: " + iceCream3.getPrice());
    System.out.println("");

    IceCream iceCream4 = new Chocolate(iceCream3);
    System.out.println("IceCream 4: " + iceCream4.getDescription());
    System.out.println("Price: " + iceCream4.getPrice());
    System.out.println("");


  }

}
