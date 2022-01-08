package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long average = 0l;

        while (true) {
            System.out.println("enter number");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                count++;
                average = (long) Math.round((double)sum/(double)count);
                //instructions said to input numbers into Math.round as double
                //and to make average type long
                //user input is int
                //not sure why this all is done besides Math.round.
                //Math.round requires double as input
            } else {
                break;
            }

            scanner.nextLine();
        }
        //calculate average
        System.out.println("sum = " + sum + " avg = " + average);
        scanner.close();
    }
}
