package com.codekata.DesignPatterns.SingletonWithThreads;

import java.util.ArrayList;

public class CustomerThread implements Runnable{

  private String name;
  private ArrayList<String> bag;

  public CustomerThread(String name){
    this.name = name;
    this.bag = new ArrayList(3);
  }

  public void run(){

    System.out.println("Customer " + name + " is running to buy bread!!");

    BakeryShelf bakeryShelf = BakeryShelf.getInstance();

    System.out.println("bakeryShelf has ID: " + System.identityHashCode(bakeryShelf) + ", bread options: " + bakeryShelf.breadList);

    storeBread(bakeryShelf.getBread());

    System.out.println(name + " bought: " + bag);
    System.out.println("bakeryShelf has ID: " + System.identityHashCode(bakeryShelf) + ", bread options: " + bakeryShelf.breadList);



  }

  public String getName(){
    return name;
  }

  private void storeBread(String bread){
    bag.add(bread);
  }

  public ArrayList<String> getBag(){
    return bag;
  }
}
