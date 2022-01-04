package com.company;

public class Main {

    public static void main(String[] args) {
	    int output = getEvenDigitSum(123456789);
        System.out.println(output);
        output = getEvenDigitSum(252);
        System.out.println(output);
        output = getEvenDigitSum(-22);
        System.out.println(output);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            sum = -1;
        } else {
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
            }
        }
        return sum;
    }

}
