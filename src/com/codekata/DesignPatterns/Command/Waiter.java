package com.codekata.DesignPatterns.Command;

public class Waiter{

  private Order order;

  public void setOrder(Order order){
    this.order = order;
  }

  public void submitOrder(){
    order.prepare();
    order.calculateBill();
  }

  public int getBill(){
    return order.getBill();
  }

}
