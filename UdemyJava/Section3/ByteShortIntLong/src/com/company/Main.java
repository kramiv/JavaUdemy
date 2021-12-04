package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
//wrapper types. min_value, max_value give range of values that can be stored in a data type
        System.out.println("busted max value = " + (myMaxIntValue+1));
        //overflow error above. +1 did not fit: value overflowed.
        //underflow is vice versa: min value - 1 = large positive number.

        int myMaxIntTest = 2_147_483_647;//one more number = too large. literal number for integer.
        System.out.println(myMaxIntTest);//underscores are valid in int.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value " + myMinByteValue);
        System.out.println("byte max value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value " + myMinShortValue);
        System.out.println("Short max value " + myMaxShortValue);
        /*
        byte occupies 8 bits. short occupies 16 bits.
        int occupies 32 bits. long occupies 64 bits.
         */
        long myLongValue = 100L;//L indicates to the computer that this number is a long
        //otherwise, 100 is stored as an int and a memory error will occur.
        long bigLongLiteralValue = 2_147_483_647_111L;
        System.out.println(bigLongLiteralValue);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long min value " + myMinlongValue);
        System.out.println("long max value " + myMaxlongValue);

        //Java also communicates if a value requires more storage space.
        //note 32767 vs. 32768:
        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);//the value is treated as int by computer. casting fixes this
        //casting converts one type into another. add (byte).
        short myNewShortValue = (short) (myMinShortValue / 2);
        //note: if you don't specify type, java assumes it is an int.
        //general advice: use an int when possible.

        byte val1 = 5;
        short val2 = 10;
        int val3 = 20;
        long val4 = (50000L + 10L*(val1+val2+val3));
        //longs and ints work well. casting not needed. But:
        short shortTotal = (short) (1000 + 10*(val1+val2+val3));
        System.out.println(val4);
        System.out.println(shortTotal);
    }
}
