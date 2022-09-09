package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();

    tv1.setBrand("Zenith");
    tv1.setVolume(125);

    tv1.turnOn();
    tv1.turnOff();
    System.out.println(tv1);

    System.out.printf("%d television instances created. %n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 50);

    tv2.turnOn();
    tv2.turnOff();
    System.out.println(tv2);

    System.out.printf("%d television instances created. %n", Television.getInstanceCount());

    Television tv3 = new Television("LG");
    tv3.setDisplay(DisplayType.OLED);

    System.out.println(tv3);

    System.out.printf("%d television instances created. %n", Television.getInstanceCount());


    Television tv4 = new Television("Toshiba", 66, DisplayType.LCD);

    System.out.println(tv4);

    System.out.printf("%d television instances created. %n", Television.getInstanceCount());

  }

}
