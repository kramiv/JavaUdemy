package com.company;

public class Main {

    public static void main(String[] args) {
	sumDigits(135);
    sumDigits(-135);
    sumDigits(4);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            int num = 10;
            while( number > 0) {
                int leftover = number - (number/num)*10;
                number = number/num;
                sum = leftover + sum;
            }
        } else {
            sum = -1;
        }
        System.out.println(sum);
        return sum;
    }
}
/*
235:
235/10 = 23     rounds down
235 - 23*10 = 5

23/10 = 2
23 - 10*2 = 3

2/10 = 0
2 - 10*0 = 2
 */