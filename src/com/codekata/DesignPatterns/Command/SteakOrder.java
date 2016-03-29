package com.codekata.DesignPatterns.Command;

public class SteakOrder extends Order{

  Chef chef;

  public SteakOrder(Chef chef){
    this.chef = chef;
  }

  @Override
  public void prepare(){
    this.chef.makeSteak();
  }

  @Override
  public void calculateBill(){
    this.bill += 30;
  }


}
