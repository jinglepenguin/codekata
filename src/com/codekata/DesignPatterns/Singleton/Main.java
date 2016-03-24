package com.codekata.DesignPatterns.Singleton;


public class Main{

  public static void main(String[] args){

    BakeryShelf bakeryShelf1 = BakeryShelf.getInstance();

    System.out.println("Bakery is now opened!");
    System.out.println("bakeryShelf1 has ID: " + System.identityHashCode(bakeryShelf1) + ", bread options: " + bakeryShelf1.breadList);

    Customer customer1 = new Customer("Susan");

    customer1.storeBread(bakeryShelf1.getBread());
    System.out.println("bakeryShelf1 has ID: " + System.identityHashCode(bakeryShelf1) + ", bread options: " + bakeryShelf1.breadList);
    System.out.println(customer1.getName() + " bought: " + customer1.getBag());

    BakeryShelf bakeryShelf2 = BakeryShelf.getInstance();

    Customer customer2 = new Customer("Bobby");

    customer2.storeBread(bakeryShelf2.getBread());
    System.out.println("bakeryShelf2 has ID: " + System.identityHashCode(bakeryShelf2) + ", bread options: " + bakeryShelf2.breadList);
    System.out.println(customer2.getName() + " bought: " + customer2.getBag());
  }

}
