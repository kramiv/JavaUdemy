//copying solution code for practice
//note boolean flag "first"

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);//only the name is lowercase

        int min = 0;
        //how can initializing min be dealt with?
        //one option is a boolean flag to test whether this is the
        //user's first input.
        //another option is to just set min and max to very high
        // and low values manually. use the minimum and maximum int values.
        // (-2 billion, 2 billion)
        //int min = Integer.MIN_VALUE;    use of wrapper class
        //int max = Integer.MAX_VALUE;
        int max = 0;

        //boolean flag option:
        boolean first = true;

        while(true) {
            System.out.println("enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if (first) {//boolean flag
                    // operates only one time when the user first enters
                    // an int.
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {//invalid number
                break;
            }

            scanner.nextLine();
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scanner.close();
    }
}
