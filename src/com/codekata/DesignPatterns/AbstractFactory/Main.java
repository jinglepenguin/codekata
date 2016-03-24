package com.codekata.DesignPatterns.AbstractFactory;

import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Bakery bakery = new Bakery();
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the bakery, please choose what you want to buy, we have bread/cake/cookie: ");

    if(sc.hasNextLine()){
      String input = sc.nextLine();

      Pastry pastry = bakery.getPastry(input);

      if(pastry == null){
        System.out.println("Invalid input, please try again");
      } else {
        pastry.bake();

      }
    }



  }

}
