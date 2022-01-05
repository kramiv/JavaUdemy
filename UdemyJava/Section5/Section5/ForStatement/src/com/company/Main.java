package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));

        //for-loop structure:
        //for(init; termination; increment) {}
        for(int i = 0; i < 5; i+=2) {//0,1,2,3,4
            System.out.println("loop " + i + " hello");
        }

        for(int i = 8; i >1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,(double) i)));
            //String.format will take the double output and convert it into a string with 2 decimal points
        }

        int numPrime = 0;
            for (int i = 10; i < 100; i++) {
                boolean output = isPrime(i);
                if (output) {// he did if(isPrime(i))
                    numPrime++;
                    System.out.println("number " + i + " is prime");
                    if (numPrime == 3) {
                        break;// note where to put the break
                        //break leaves the for-loop completely
                    }
                }
            }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount*interestRate/100);
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
