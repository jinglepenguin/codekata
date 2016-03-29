package com.codekata.DesignPatterns.Builder;

public class Donut {
  private String filling;
  private String dough;
  private String topping;

  public void setFilling(String filling){
    this.filling = filling;
  }

  public String getFilling(){
    return this.filling;
  }

  public void setDough(String dough){
    this.dough = dough;
  }

  public String getDough(){
    return dough;
  }

  public void setTopping(String topping){
    this.topping = topping;
  }

  public String getTopping(){
    return topping;
  }
}
