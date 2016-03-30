package com.codekata.DesignPatterns.Bridge;

public class SonyTV implements TV{

  private int isOn = 0;
  private int volume;

  public void on(){
    isOn = 1;
  }

  public void off(){
    isOn = 0;
  }

  public void isTVOn(){
    if(isOn == 1){
      System.out.println("Sony TV is on");
    } else {
      System.out.println("Sony TV is off");
    }
  }

  public void setVolume(int volume){
    this.volume = volume + 100;
  }

  public int getVolume(){
    return volume;
  }

}
