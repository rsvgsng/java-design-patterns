package com.factoryPattern;
public class WebDeveloper implements  Employee{

        @Override
        public  int salary(){
            System.out.println("Getting salary for Web Developer");
            return  20000;
        }
}
