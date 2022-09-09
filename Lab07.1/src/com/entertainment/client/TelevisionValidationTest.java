package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {

    Television tv = new Television();

    tv.setVolume(Television.MIN_VOLUME);        //stick
    System.out.println(tv.getVolume());         //print 0

    tv.setVolume(Television.MAX_VOLUME);        //stick
    System.out.println(tv.getVolume());         //print 100

    tv.setVolume(-1);                           //error
    System.out.println(tv.getVolume());         //print 100

    tv.setVolume(101);                          //error
    System.out.println(tv.getVolume());         //print 100

    Television tv2 = new Television("Samsung", -1); //error
    System.out.println(tv2);               //Print Toshiba, Volume 100


    tv.setBrand("Samsung");               //stick
    System.out.println(tv.getBrand());    //print Samsung

    tv.setBrand("LG");                    //stick
    System.out.println(tv.getBrand());    //print LG

    tv.setBrand("Sony");                  //stick
    System.out.println(tv.getBrand());    //print Sony

    tv.setBrand("Toshiba");               //stick
    System.out.println(tv.getBrand());    //print Toshiba

    tv.setBrand("INVALID");               //error
    System.out.println(tv);               //Print Toshiba, Volume 100

    Television tv4 = new Television("Zenith", 55);  //error
    System.out.println(tv4);               //Print null, Volume 55

    Television tv5 = new Television("Sanyo", 101);  //error
    System.out.println(tv5);               //Print null, Volume 0

  }
}
