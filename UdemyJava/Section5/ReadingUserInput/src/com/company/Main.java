package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //     .in takes input from console to program
        //scanner is a built-in class that allows reading user input
        //new creates an instance of scanner. a new object of type scanner.

        //handle user's date of birth
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();//check to see if next input
        //entered is an integer. It won't remove it from the scanner though
        //if it doesn't qualify, method returns false.
        //now: check to see if boolean is true.
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();//scanner.nextInt()

            //scanner needs a line separator. some number and enter key
            //are treated as such.
            scanner.nextLine();//   handle next line character (enter key)

            //handle user's name
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();//scanner.nextLine()

            int age = (2022 - yearOfBirth);

            if(age >= 0 && age <= 100) {//number out of range
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("invalid year of birth");
            }
        } else {//non-number
            System.out.println("unable to parse year of birth");
        }

        scanner.close();

        //potential problems: user enters negative numbers
        // or letters instead of numbers
        //an exception occurs. 'input mismatch exception'

        //note that I can convert int to string but not vice-versa.
        //I can enter 123 as a name in the console.
    }
}
/*
goal of program: create interactive application.
calculate current age of the user.
in previous video: we learned parse int and parse double methods.
in this video: next line method
and class scanner. it scans text for both primitive types and strings
store input as a variable
 */