package com.codekata.Misc;

public class Dog extends Animal{

  public Dog(){
    super();

    this.name="Dog";
  }

  @Override
  public void makeNoise(){
    System.out.println("Woof!");
  }

  public void changeInt(int inNum){
    inNum = 12;

    System.out.println("In changeInt, inNum = " + inNum);

  }

  public void changeDogName(Dog d){
    d.setName("Jenny");
    System.out.println("In changeDogName, dog name = " + d.getName());
  }

}
