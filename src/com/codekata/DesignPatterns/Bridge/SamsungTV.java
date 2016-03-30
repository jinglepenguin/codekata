package com.codekata.DesignPatterns.Bridge;

public class SamsungTV implements TV{

  private boolean isOn;
  private int volume = 0;

  public void on(){
    isOn = true;
  }

  public void off(){
    isOn = false;
  }

  public void isTVOn(){
    if(isOn){
      System.out.println("Samsung TV is on");
    } else {
      System.out.println("Samsung TV is off");
    }
  }

  public void setVolume(int volume){
    this.volume = volume;
  }

  public int getVolume(){
    return volume;
  }

}
