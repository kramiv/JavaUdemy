package com.company;

public class Main {

    public static void main(String[] args) {
	    printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("invalid value");
        } else {
            for (int r = 0; r < number; r++) {//row: 0 to 4 (when number=5)

                for (int c = 0; c < number; c++){//column: 0 to 4
                    //System.out.print("r"+ r + ",c" + c + " ");
                    if (r == 0 || r == (number-1) || c == 0 || c == (number-1)) {
                        System.out.print("r" + r + ",c" + c + " ");
                    } else if (c == r) {
                        System.out.print("r" + r + ",c" + c + " ");
                    } else if (c == (number - 1 - r)) {
                        System.out.print("r" + r + ",c" + c + " ");
                    }
                    else {
                        System.out.print("      ");
                    }
                    //remove ln in sout to remove automatic newline in output
                }
                System.out.print("\n");
            }
        }
    }
}
/*
first, print out a number*number matrix of *
 */

/*
example: 5
r0,c0 r0,c1 r0,c2 r0,c3 r0,c4
r1,c0 r1,c1             r1,c4
r2,c0       r2,c2       r2,c4
r3,c0             r3,c3 r3,c4
r4,c0 r4,c1 r4,c2 r4,c3 r4,c4

want to print out a slope:
    r1,c6
    r6,c1
    c == (number - 1 - r)
 */