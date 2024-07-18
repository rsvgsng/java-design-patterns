package com.SingletonPattern;

public class OtherWay {

//    Eager way out of the singleton pattern
    private  static  OtherWay otherWay = new OtherWay();

    public static OtherWay getInstance(){
        return otherWay;
    }
}
