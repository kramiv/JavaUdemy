package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';//maybe use it to store the last digit used or keypress in a game.
        //char is not a string. string is text in double quotes.
        //char can store characters, but it stores only a single one.
        //char is also used to store data in arrays.

        /*
        char occupies 2 bytes i.e. 16 bits. it can store unicode characters.
        the 2 bytes can store a lot of letters for each language.
        note website: unicode-table.com
        example: 'D'
            row 0040 and column 4 --> 0044.
         */
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        //Boolean: allows for True or False, Yes or No, 1 or 0.
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        //know whether a particular customer is over the age of 21 or not.
        boolean isCustomerOverTwentyOne = true;
    }
}
