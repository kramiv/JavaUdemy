package com.company;

public class Main {

    public static void main(String[] args) {
        //should be true true false false
        boolean output = isPerfectNumber(6);
        System.out.println(output);
        output = isPerfectNumber(28);
        System.out.println(output);
        output = isPerfectNumber(5);
        System.out.println(output);
        output = isPerfectNumber(-1);
        System.out.println(output);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i <= number/2; i++) {
                if (number%i == 0) {
                    sum = sum + i;
                }
            }
            if (number == sum) {
                return true;
            } else {
                return false;
            }
        }
    }

}
/*
28


 */