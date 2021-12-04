package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value = " + myMinFloatValue);
        System.out.println("float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value = " + myMinDoubleValue);
        System.out.println("double max value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;//rounds down
        float myFloatValue = 5.00f / 3.00f;//java assumes float to be a double.
        double myDoubleValue = 5.00 / 3.00;
        //for whole numbers: double is accepted by default as int is.
        //but I can add f and d for extra.
        //generally, doubles are more commonly preferred because float with decimals requires casting.
        //  or, use an f rather than casting.
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);//precision is 8
        System.out.println("myDoubleValue = " + myDoubleValue);//precision is 16
        //double is faster to process for many computers than floats.

        int lbs = 190;
        double kgs = lbs*0.45359237d;
        System.out.println(kgs);

        double pi = 3_000_000.4_567_890d;//this is the same as 3.456...

        /*
        for very precise calculations, Java has a class called BigDecimal.
        float and double are for general calculations.
         */
    }
}
/*floating point numbers: have decimals.
    two primitive types: float and double.
single precision has 32 bits. double precision has 64 bits.
float stores to over 40 decimal points.
double stores over 300 decimal points.
*/