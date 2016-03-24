package com.codekata.DesignPatterns.Strategy;

public class Cake{

  private String name;
  private double price;

  private Decoration decoration;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public double getPrice(){
    return price;
  }

  public void decorateWith(Decoration decor){
    this.decoration = decor;
  }

  public void eat(){
    System.out.println("Mmm...." + name);
  }

  public void make(){
    System.out.println("Baking sponge cake");
  }

  public void decorate(){
    this.decoration.decorate();
  }

}
