package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";//2018a causes error.
            //creating our own parsing method and exception handling
            //will come later in the course for 2018a

        System.out.println("numberAsString= " + numberAsString);
        //one way to convert: parsing method.

        //double number = Double.parseDouble(numberAsString);
        //2018.12
        //float, long, etc. also usable
        int number = Integer.parseInt(numberAsString);
        //class Integer. it is a wrapper class for primitive type Int
        System.out.println("number = " + number);

        numberAsString += 1;//automatically convert 1 to string, concatenates
        number +=1;
        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number = " + number);





    }
}
/*
this can be used to parse data from user input from a text box.
goal is to convert the string into some primitive data type
 */