//memorize the new commands from this document.
//note use of while(true) and break

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int numCount = 1;
        int sum = 0;
        while (numCount < 11) {
            System.out.println("Enter number #" + numCount);//   change x
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {//valid input
                int currentNum = scanner.nextInt();
                sum = sum + currentNum;
                //scanner.nextLine();//   handles enter key

                numCount++;

            } else {//non-valid input
                System.out.println("invalid number");
                //okay I need to figure out a way to not make this loop infinitely
                //scanner.nextLine();//this line does that.
            }
            scanner.nextLine();
            //move this outside of the if-else blocks to avoid duplicating code
        }
        System.out.println("sum is " + sum);
        scanner.close();
    }
}

/*
read 10 numbers from the console entered by the user and print the
sum of those numbers
 */

/*
another way to do this code:


Scanner scanner = new Scanner(system.in);

int counter = 0;
int sum = 0;
while(true) {
//      note that while(true) can be used with a break statement
    int order = counter + 1;
    sout("enter number#" + order + ":");
    boolean isAnInt = scanner.hasNextInt();
    if (isAnInt) {
        int number = scanner.nextInt();
        counter++;
        sum += number;
        if (counter == 10) {
            break;
        }
    } else {
        sout("invalid number");
    }
    scanner.nextLine();//handles enter key
}
sout("sum = " + sum);
scanner.close();


 */