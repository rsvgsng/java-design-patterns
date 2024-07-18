package com.SingletonPattern;

//This demonstrates the Singleton Pattern
public class main {
    public static void main(String[] args) {

        Logger l = Logger.getLogger();
        Logger l2 = Logger.getLogger();

        System.out.println(l.hashCode());
        System.out.println(l2.hashCode());


//        Eager way of implementing the singleton pattern
        System.out.println(OtherWay.getInstance().hashCode());
        System.out.println(OtherWay.getInstance().hashCode());

        l.log("Logging with l as the instance");
        l2.log("Logging with l2 as the same instance of the class");
    }
}
