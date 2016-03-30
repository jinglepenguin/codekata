package com.codekata.DesignPatterns.Adapter;

public class MagicAdapter implements Prince{

  private Frog frog;

  public MagicAdapter(Frog frog){
    this.frog = frog;
  }

  public void walk(){
    this.frog.hop();
  }

  public void kiss(){
    this.frog.eatBugs();
  }

  public void greet(){
    this.frog.ribbit();
  }

}
