package com.codekata.DesignPatterns.Bridge;

public class Main{

  public static void main(String[] args){

    TV samsungTV = new SamsungTV();
    TV sonyTV = new SonyTV();

    LGRemote lgRemote = new LGRemote(samsungTV);
    GERemote geRemote = new GERemote(samsungTV);

    lgRemote.on();
    samsungTV.isTVOn();

    lgRemote.right();
    lgRemote.right();
    lgRemote.right();
    lgRemote.left();
    lgRemote.left();

    System.out.println("Samsung TV volume is now: " + samsungTV.getVolume());

    lgRemote.setVolume(100);
    System.out.println("Samsung TV volume should now be 100: " + samsungTV.getVolume());

    geRemote.mute();
    System.out.println("Samsung TV volume should now be 0: " + samsungTV.getVolume());

    System.out.println("");
    System.out.println("Using same remote to control Sony TV");
    lgRemote = new LGRemote(sonyTV);
    geRemote = new GERemote(sonyTV);

    lgRemote.on();
    sonyTV.isTVOn();

    lgRemote.right();
    lgRemote.right();
    lgRemote.left();

    System.out.println("TV volume is now: " + sonyTV.getVolume());
    System.out.println("");

    geRemote.setVolume(500);
    System.out.println("Sony TV volume should now be 600: " + sonyTV.getVolume());

    geRemote.mute();
    System.out.println("Sony TV volume should now be 100: " + sonyTV.getVolume());


  }

}
