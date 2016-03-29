package com.codekata.DesignPatterns.Builder;

public class Main{

  public static void main(String[] args){

    Baker baker = new Baker();
    DonutRecipe chocolateDonutRecipe = new ChocolateDonutRecipe();
    DonutRecipe strawberryDonutRecipe = new StrawberryDonutRecipe();

    Donut chocolateDonut = baker.makeDonut(chocolateDonutRecipe);
    Donut strawberryDonut = baker.makeDonut(strawberryDonutRecipe);

    System.out.println("Chocolate Donut has:");
    System.out.println(chocolateDonut.getDough() + ", " + chocolateDonut.getFilling() + ", " + chocolateDonut.getTopping() );

    System.out.println("Strawberry Donut has:");
    System.out.println(strawberryDonut.getDough() + ", " + strawberryDonut.getFilling() + ", " + strawberryDonut.getTopping() );
  }

}
