package com.company;

public class Main {

    public static void main(String[] args) {
        //output should be 4 9 0 10 -1
        int output = sumFirstAndLastDigit(252);
        System.out.println(output);
        output = sumFirstAndLastDigit(257);
        System.out.println(output);
        output = sumFirstAndLastDigit(0);
        System.out.println(output);
        output = sumFirstAndLastDigit(5);
        System.out.println(output);
        output = sumFirstAndLastDigit(-10);
        System.out.println(output);

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int reverse = 0;
            int originalNum = number;
            while (number > 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number = number / 10;
            }
            int firstNum = originalNum % 10;
            int lastNum = reverse % 10;
            int sumNum = firstNum + lastNum;
            return sumNum;
        }
    }

}

/*
number = 125
digit = 0;

digit = 125%10 = 5
number = 125/10 = 12

digit = 12 % 10 = 2
number = 12/10 = 1

digit = 1 % 10 = 1
number = 1/10 = 0
 */

//could take reverse and just take remainder of both terms.

/*
        int reverse = 0;
        int originalNum = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse*10 + lastDigit;
            number = number/10;
            }
int firstNum = 125 % 10 = 5
int lastNum = reverse % 10 = 521 % 10 = 1
int sumNum = firstNum + lastNum;
 */