package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        //sort the type of input the user enters with boolean
        //initialize max number
        int maxNum = 0;
        int inputNumber = 0;
        int minNum = 1000;
        //a better way to get minNum could be to get user input once
        //and initialize that way before going into the while(true) loop
        while (true) {
            System.out.println("Enter number:");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                inputNumber = scanner.nextInt();
                if (inputNumber > maxNum) {//check for bigger number
                    maxNum = inputNumber;
                }
                if (inputNumber < minNum) {
                    minNum = inputNumber;
                }

            } else {
                System.out.println("invalid value");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("max number entered was " + maxNum);
        System.out.println("min number entered was " + minNum);

    }
}
