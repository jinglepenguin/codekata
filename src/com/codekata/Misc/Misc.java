package com.codekata.Misc;

public class Misc{

  public static void main(String[] args){
    System.out.println("Starting Misc code...");

    Animal a = new Animal();
    Dog d = new Dog();

    a.makeNoise();
    d.makeNoise();

    int num = 10;
    System.out.println("Before changeInt, num is " + num);
    d.changeInt(num);
    System.out.println("After changeInt, num is " + num);

    System.out.println("Before changeDogName, dog name is " + d.getName());
    d.changeDogName(d);
    System.out.println("After changeDogName, dog name is " + d.getName());

    int num2 = 21;
    System.out.println("Before staticChangeInt, num2 is " + num2);
    staticChangeInt(num2);
    System.out.println("After staticChangeInt, num2 is " + num2);

    System.out.println("Before staticChangeDog, dog name is " + d.getName());
    staticChangeDog(d);
    System.out.println("After staticChangeDog, dog name is " + d.getName());
  }


  public static void staticChangeInt(int inNum){
    inNum = 39;

    System.out.println("In staticChangeInt, inNum = " + inNum);
  }

  public static void staticChangeDog(Dog d){
    d.setName("Bobby");

    System.out.println("In staticChangeDog, name = " + d.getName());
  }


}
