package com.company;

public class Main {

    public static void main(String[] args) {
        int output = getGreatestCommonDivisor(25,15);
        System.out.println(output);
        output = getGreatestCommonDivisor(12,30);
        System.out.println(output);
        output = getGreatestCommonDivisor(9,18);
        System.out.println(output);
        output = getGreatestCommonDivisor(81,153);
        System.out.println(output);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = 1;
        if ((first < 10) || (second < 10)) {
            gcd = -1;
        } else {
            for (int i = 1; i < first; i++) {
                int rem1 = first % i;
                int rem2 = second % i;
                if ((rem1 == 0) && (rem2 == 0)) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
/*
int gcd = 1;
int (i = 1; i < first; i++) {
    int rem1 = first % i;
    int rem2 = second % i;
    if ((rem1 == 0) && (rem2 == 0)) {
        gcd = i;
        }
}
 */