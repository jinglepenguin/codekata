package com.codekata.DesignPatterns.Command;

public class PastaOrder extends Order{

  Chef chef;

  public PastaOrder(Chef chef){
    this.chef = chef;
  }

  @Override
  public void prepare(){
    this.chef.makePasta();
  }

  @Override
  public void calculateBill(){
    this.bill += 15;
  }

}
