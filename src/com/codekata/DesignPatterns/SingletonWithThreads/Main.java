package com.codekata.DesignPatterns.SingletonWithThreads;


public class Main{

  public static void main(String[] args){

    Thread customer1 = new Thread(new CustomerThread("customer1"));
    customer1.start();

    Thread customer2 = new Thread(new CustomerThread("customer2"));
    customer2.start();

  }

}
