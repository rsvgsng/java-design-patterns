package com.factoryPattern;

public class AndroidDeveloper implements  Employee{

    @Override
    public  int salary(){
        System.out.println("Getting salary for Android Developer");
        return  12300;
    }
}
