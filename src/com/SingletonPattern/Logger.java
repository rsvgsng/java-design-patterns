package com.SingletonPattern;

public class Logger {

// singleton class implementation rsvgsng

        /*
            Creating a private constructor to prevent the creation of objects from outside the class
            this is the first step to implement the singleton pattern!
         */
        private  Logger(){}

//    Creating a private static instance of the class this holds the only instance of the class its like a bucket to keep the instance of the class and by default the value is null.
        private  static  Logger logger;

        public  static  Logger  getLogger(){
            /*
                1. Check if the instance does not exist already
                2. If it does not exist, create a new instance
                3. Return the newly created instance
             */
            if(logger==null){
                logger = new Logger();
                return  logger;
            }
            return  logger;
        }

        public void log(String message){
            System.out.println(message);
        }

}
