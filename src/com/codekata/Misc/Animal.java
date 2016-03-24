package com.codekata.Misc;

public class Animal{

  protected String name;
  protected int numOfLegs;

  public Animal(){
    this.name="Animal";
    this.numOfLegs=4;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setNumOfLegs(int legs){
    if(legs > 0){
      numOfLegs = legs;
    } else {
      System.out.println("Invalid number of legs provided");
    }
  }

  public int getNumOfLegs(){
    return numOfLegs;
  }

  public void makeNoise(){
    System.out.println("Some animal sound");
  }

}
