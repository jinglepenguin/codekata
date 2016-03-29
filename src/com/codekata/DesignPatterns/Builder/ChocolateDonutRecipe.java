package com.codekata.DesignPatterns.Builder;

public class ChocolateDonutRecipe implements DonutRecipe{

  private Donut donut;

  public Donut makeDonut(){
    this.donut = new Donut();

    donut.setDough("Cake Dough");
    donut.setFilling("Chocolate Filling");
    donut.setTopping("Icing Sugar Coating");

    return donut;
  }

}
