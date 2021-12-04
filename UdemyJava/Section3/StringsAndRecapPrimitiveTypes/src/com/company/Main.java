package com.company;

public class Main {

    public static void main(String[] args) {
	//8 primitive types: byte, short, int, long, float, double, char, boolean
        // int, double, boolean = most important. sometimes char.
    //I can create my own data types - 'classes'. I can combine these datatypes to
        //create 'super datatypes' in classes.
    //string: a datatype in java. not a primitive type.
    //length of a string is limited by the max value of an int. many chars (2+ billion)
        String myString = "this is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + " and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);//convert type to calculate.

        String lastString = "10.";
        int myInt = 10;
        lastString = lastString + myInt;//allowable = Java converts 50 to a string
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);
        //converts all to string again.

        //strings are very flexible.
        /*
        note. values in a string aren't deleted. new strings are created instead.
        so when 'appending' two strings, a new string is created. Old one got discarded.
         */
        //so, appending strings is not efficient. StringBuffer will be better.
        //summary: string is sort of a 9th primitive type. it is a versatile class.
    }
}
