package com.codekata.DesignPatterns.Command;

public class Main{

  public static void main(String[] args){

    Waiter waiter = new Waiter();
    Chef chef = new Chef();

    System.out.println("Ordered a steak...");
    waiter.setOrder(new SteakOrder(chef));
    waiter.submitOrder();
    System.out.println("Receipt: " + waiter.getBill());

    System.out.println("---------");

    System.out.println("Ordered some pasta...");
    waiter.setOrder(new PastaOrder(chef));
    waiter.submitOrder();

    System.out.println("Receipt: " + waiter.getBill());

  }

}
