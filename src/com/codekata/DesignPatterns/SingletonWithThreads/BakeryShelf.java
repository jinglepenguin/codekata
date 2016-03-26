package com.codekata.DesignPatterns.SingletonWithThreads;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;

public class BakeryShelf{

  // private static BakeryShelf bakeryShelf = null;
  private String[] breadArray = {"baguette", "donut", "croissant", "milk bread", "pumpernickle"};
  public static LinkedList<String> breadList = null;

  private static final BakeryShelf bakeryShelf = new BakeryShelf(); //auto thread-safe since this is loaded only once

  private BakeryShelf(){
    System.out.println("In Bakery Shelf");

    breadList = new LinkedList<String>(Arrays.asList(breadArray));
    Collections.shuffle(breadList);

  }

  public static BakeryShelf getInstance(){

    /* one way to explicitly do thread-safe operation with lazy-initialization
    if(bakeryShelf == null){
      synchronized(BakeryShelf.class){
        if(bakeryShelf == null){
          bakeryShelf = new BakeryShelf();
        }
      }
    }*/

    return bakeryShelf;
  }

  public String getBread(){
    return breadList.remove(0);
  }

}
