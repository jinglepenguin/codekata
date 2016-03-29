package com.codekata.DesignPatterns.Command;

public abstract class Order{

  protected int bill = 0;

  public abstract void prepare();

  public abstract void calculateBill();

  public int getBill(){
    return bill;
  };

}
