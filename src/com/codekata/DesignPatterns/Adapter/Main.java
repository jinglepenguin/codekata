package com.codekata.DesignPatterns.Adapter;

public class Main{

  public static void main(String[] args){

    System.out.println("Here is....the Frog!");

    Frog frog = new Frog();
    frog.ribbit();
    frog.hop();
    frog.eatBugs();

    System.out.println("Here is Prince Charming!");

    PrinceCharming princeCharming = new PrinceCharming();

    princeCharming.walk();
    princeCharming.greet();
    princeCharming.kiss();

    System.out.println("Here's some magical powder to turn a frog into a prince!");

    MagicAdapter princeFrog = new MagicAdapter(frog);

    princeFrog.walk();
    princeFrog.greet();
    princeFrog.kiss();

  }

}
