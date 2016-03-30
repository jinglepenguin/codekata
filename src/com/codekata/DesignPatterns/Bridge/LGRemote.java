package com.codekata.DesignPatterns.Bridge;

public class LGRemote extends Remote{

  private int volume = 0;

  public LGRemote(TV tv){
    super(tv);
  }

  public void left(){
    volume--;
    super.setVolume(volume);
    System.out.println("LG Remote Left pressed, volume is now: " + tv.getVolume());
  }

  public void right(){
    volume++;
    super.setVolume(volume);
    System.out.println("LG Remote Right pressed, volume is now: " + tv.getVolume());
  }

}
