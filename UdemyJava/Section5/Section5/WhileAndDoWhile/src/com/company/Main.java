package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while (count != 5) {
            System.out.println("while: count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("while true: count value is " + count);
            count++;
        }

        count = 1;
        do {//guaranteed to execute at least once
            System.out.println("do while: count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;//goes to start of the loop
            }

            System.out.println("even number " + number);
        }

        //challenge question:

        number = 4;
        finishNumber = 20;
        int numEven = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;//goes to start of the loop
            }
            numEven++;//    else statement not needed. "continue;"
            System.out.println("num even: " + number);
            if(numEven >= 5) {
                System.out.println("5 even numbers found");
                break;
            }
        }

    }

        public static boolean isEvenNumber(int number) {
            if(number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }


    }