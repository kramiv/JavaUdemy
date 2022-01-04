package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

         */
        System.out.println("output should be:" +
                "\n zero" +
                "\n one two three" +
                "\n one zero one zero" +
                "\n one zero zero zero" +
                "\n invalid value");
        System.out.println(numberToWords(0));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(1000));
        System.out.println(numberToWords(-12));

 /*
        System.out.println(reverseNum(-121));
        System.out.println(reverseNum(1212));
        System.out.println(reverseNum(1234));
        System.out.println(reverseNum(100));

  */

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int i = 1;
            if (number > 10) {
                i = 0;
                while (number > 0) {
                    number = number / 10;
                    i++;
                }
            }
            return i;
        }
    }

    public static int reverseNum(int number) {
        boolean isNeg = false;
        if (number < 0) {
            number = number * (-1);
            isNeg = true;
        }
        int reverse = 0;
        int i = 1;
        int numberCopy = number;
        while (numberCopy >= 10) {
            i = i * 10;
            numberCopy = numberCopy / 10;
        }
        while (number > 0) {//1234
            int rem = number % 10;//4   3
            reverse = reverse + (rem * i);// 4000     300
            i = i / 10;//100
            number = number / 10;//123
        }
        if (isNeg) {
            reverse = reverse * (-1);
        }
        return reverse;
    }

    public static String toString(int number) {
        String returnVal = "";
        switch (number) {
            case 0:
                returnVal = "zero";
                break;
            case 1:
                returnVal = "one";
                break;
            case 2:
                returnVal = "two";
                break;
            case 3:
                returnVal = "three";
                break;
            case 4:
                returnVal = "four";
                break;
            case 5:
                returnVal = "five";
                break;
            case 6:
                returnVal = "six";
                break;
            case 7:
                returnVal = "seven";
                break;
            case 8:
                returnVal = "eight";
                break;
            case 9:
                returnVal = "nine";
                break;
            default:
                returnVal = "";
        }
        return returnVal;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "invalid value";
        } else if (number == 0) {
            return "zero";
        } else {
            int digs = getDigitCount(number);
            int numberNew = reverseNum(number);
            int digsRev = getDigitCount(numberNew);
            String nums = "";
            while (numberNew > 0) {
                int rem = numberNew % 10;
                nums = nums + toString(rem);
                numberNew = numberNew / 10;
            }
            if (digsRev < digs) {//add trailing zeroes
                for (int i = 0; i < (digs-digsRev); i++) {
                    nums = nums + "zero";
                }
            }
            return nums;
        }
    }
}

/*
switch statement
 */

    /*
    reverse number:

    35
    int i = 1;
    while (number > 0) {

    35 % 10 = 5
    reverse = reverse + 5*i     i = 1
    i = i*10--> i = 10
    number = number/10;

    3 % 10 = 3
    reverse = reverse + 3*i     i = 10
    number = number/10;
    }
     */

    /*
    int i = 0;
    while (number > 0) {    //1234

    number = 1234/10 = 123
    i++ = 1
    number = 123/10 = 12
    i = 2
    number = 12/10 = 1
    i = 3
    number = 1/10 = 0
    i = 4
    number = 0/10 = 0
    i = ?

//100
    number = 100/10 = 10
    i++ = 1
    number = 10/10 = 1
    i = 2
    number = 1/10 = 0
    i = 3
     */























