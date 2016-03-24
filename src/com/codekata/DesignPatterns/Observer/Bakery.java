package com.codekata.DesignPatterns.Observer;

import java.util.ArrayList;

public class Bakery{

  private String name;

  //list of subscriber
  private ArrayList<Customer> subscribers = new ArrayList<Customer>(5);

  public Bakery(String name){
    this.name = name;
  }

  public void subscribe(Customer newCustomer){
    subscribers.add(newCustomer);
  }

  public void unsubscribe(Customer customer){
    subscribers.remove(customer);
  }

  public void ringBell(){
    for(Customer customer : subscribers){
      customer.update(name);
    }
  }

  public String getName(){
    return name;
  }
}
