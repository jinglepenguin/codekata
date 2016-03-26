package com.codekata.DesignPatterns.SingletonWithThreads;

import java.util.ArrayList;

public class Customer{

  private String name;
  private ArrayList<String> bag;

  public Customer(String name){
    this.name = name;
    this.bag = new ArrayList<String>(3);
  }

  private void storeBread(String bread){
    bag.add(bread);
  }

  public ArrayList<String> getBag(){
    return bag;
  }

  public String getName(){
    return name;
  }

}
