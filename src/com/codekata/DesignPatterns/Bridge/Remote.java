package com.codekata.DesignPatterns.Bridge;

public class Remote{

  protected TV tv;

  public Remote(TV tv){
    this.tv = tv;
  }

  public void on(){
    tv.on();
  }

  public void off(){
    tv.off();
  }

  public void setVolume(int volume){
    tv.setVolume(volume);
  }

}
