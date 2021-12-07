package com.company;

public class Main {
    //create a variable that can be used in multiple methods:
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    //final means it can't be changed now
    //variables defined outside of static functions must also be defined static
    //repeated words = make a constant
    // repeated multiple lines of code - make a method

    public static void main(String[] args) {
        //call the method with 2 parameters
        int newScore = calculateScore("Tim", 500);
        System.out.println("new score is " + newScore);

        //call the method with 1 parameter
        calculateScore(75);

        //call the method with no parameters
        calculateScore();

        //call exercise method
        double output = calcFeetAndInchesToCentimeters(17);
        System.out.println("17 inches to cm: " + output);//43.18

        output = calcFeetAndInchesToCentimeters(6,1);
        System.out.println("6 feet 0 inches to cm: " + output);//185.42

        output = calcFeetAndInchesToCentimeters(-100);
        System.out.println("negative value to cm " + output);//185.42

        //challenge output
        getDurationString(120,1);
        getDurationString(60);
        getDurationString(61,0);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score);
        return score*1000;
    }

    public static int calculateScore(int score) {//remove one parameter
        System.out.println("Unnamed player scored " + score);
        return score*1000;
    }

    public static int calculateScore() {//remove one parameter
        System.out.println("Unnamed player, no score");
        return 0;
    }

    //  exercise
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double returnValue = -1d;
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            double inchesFeet = feet*12d;
            double inchesTotal = inches + inchesFeet;
            returnValue = inchesTotal*2.54d;
        } else {
            returnValue = -1d;
        }
        return returnValue;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double returnValue = -1d;
        if (inches >= 0) {
            int inchesToFeet = (int) inches/12;//in video, he did this:
            //double feet = (int) inches/12.
            //double remainingInches = (int) inches % 12;
            //casting lasts for only one line? seems so.
            double inchesFromFeet = inches % 12d;
            returnValue = calcFeetAndInchesToCentimeters((double) inchesToFeet, inchesFromFeet);
        } else {
            returnValue = -1d;
        }
        return returnValue;
    }

    //challenge
    public static void getDurationString(int minutes, int seconds) {//he did public static String
        if ((minutes < 0) || (seconds > 60 || seconds < 0)) {
            System.out.println("Invalid value");//  he did return "Invalid value";
        } else {//I made my method capable of handling 'incorrect' times (like 2 minutes and 70 seconds)
            int totalTime = seconds + minutes*60;
            int hours = (totalTime/60)/60;
            totalTime = totalTime - hours*60*60;
            minutes = totalTime/60;
            totalTime = totalTime - minutes*60;
            seconds = totalTime;//bonus challenge: to display a leading zero if
            //minutes = 1 or hours = 1 or seconds = 1, then create an if-else for this sout and add it into the string.
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds > 60) {
            System.out.println("Invalid value");
        } else {
            int minutes = seconds/60;
            seconds = seconds % 60;
            getDurationString(minutes, seconds);
        }
    }
}

/*
bonus challenge solution:
String hoursString = hours + "h";
if (hours < 10) {
    hoursString = "0" + hoursString;
}
and so on
and then you return the strings
*/

/*
overloading method:
using the same variable name but with a varying number of parameters
 */
