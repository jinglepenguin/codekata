package com.codekata.DesignPatterns.Bridge;

public class GERemote extends Remote{

  public GERemote(TV tv){
    super(tv);
  }

  public void mute(){
    super.setVolume(0);
    System.out.println("GE Remote mute: Volume is now: " + tv.getVolume());
  }


}
