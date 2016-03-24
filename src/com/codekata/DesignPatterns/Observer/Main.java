package com.codekata.DesignPatterns.Observer;

public class Main{

  public static void main(String[] args){

    Bakery bakery = new Bakery("Breadtopia");
    Bakery bakery2 = new Bakery("Cake Paradise");

    Customer customer1 = new BreadLover("Susan");
    Customer customer2 = new CakeLover("Mary");
    Customer customer3 = new BreadLover("Bobby");

    customer1.follow(bakery);
    customer2.follow(bakery2);
    customer2.follow(bakery);
    customer3.follow(bakery);

    System.out.println(bakery.getName() + " ring bell....");
    bakery.ringBell();

    System.out.println(bakery2.getName() + " ring bell....");
    bakery2.ringBell();

    customer2.unfollow(bakery);
    System.out.println(bakery.getName() + " ring bell....");
    bakery.ringBell();

  }

}
