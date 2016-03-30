package com.codekata.DesignPatterns.Adapter;

public class PrinceCharming implements Prince{

  public void walk(){
    System.out.println("Walking like a prince");
  }

  public void kiss(){
    System.out.println("Smooch!");
  }

  public void greet(){
    System.out.println("Hello there princess!");
  }

}
