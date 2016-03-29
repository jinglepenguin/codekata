package com.codekata.DesignPatterns.Builder;

public class StrawberryDonutRecipe implements DonutRecipe{

  private Donut donut;

  public Donut makeDonut(){
    this.donut = new Donut();

    donut.setDough("Bread Dough");
    donut.setFilling("Strawberry Jam Filling");
    donut.setTopping("Icing Sugar Powder");

    return donut;
  }

}
