package com.codekata.DesignPatterns.Singleton;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;

public class BakeryShelf{

  private static BakeryShelf bakeryShelf = null;

  private String[] breadArray = {"baguette", "donut", "croissant", "milk bread", "pumpernickle"};
  public static LinkedList<String> breadList = null;

  private BakeryShelf(){

    breadList = new LinkedList<String>(Arrays.asList(breadArray));
    Collections.shuffle(breadList);

  }

  public static BakeryShelf getInstance(){
    if(bakeryShelf == null){
      bakeryShelf = new BakeryShelf();
    }

    return bakeryShelf;
  }

  public String getBread(){
    return breadList.remove(0);
  }

}
