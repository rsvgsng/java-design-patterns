package com.factoryPattern;

public class EmployeeFactory {
//    get the employee
    public   static  Employee getEmployee(String empType){
        if(empType == null){
            return  null;
        }
        if(empType.equalsIgnoreCase("Android")){
            return  new AndroidDeveloper();
        } else if(empType.equalsIgnoreCase("Web")){
            return  new WebDeveloper();
        }
        return  null;
    }
}