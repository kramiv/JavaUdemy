package com.company;

public class Main {


    public static void main(String[] args) {
        //should return true false true
        boolean output = hasSharedDigit(12,23);
        System.out.println(output);
        output = hasSharedDigit(9,99);
        System.out.println(output);
        output = hasSharedDigit(15,55);
        System.out.println(output);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 <= 99 && num1 >= 10) && (num2 <= 99 && num2 >= 10)) {
            int rem1 = num1/10;
            int rem2 = num1/100;
            int rem3 = num2/10;
            int rem4 = num2/100;
            if ((rem1 == rem3) || (rem1 == rem4) || (rem2 == rem3) || (rem2 == rem4)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
