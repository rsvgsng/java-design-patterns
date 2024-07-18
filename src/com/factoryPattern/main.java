package com.factoryPattern;



public class main {


    public static void main(String[] args) {
   Employee  e =  EmployeeFactory.getEmployee("Android");
    e.salary();
    }


}


