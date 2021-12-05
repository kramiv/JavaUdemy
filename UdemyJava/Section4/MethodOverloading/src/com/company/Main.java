package com.company;

public class Main {

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


}

/*
overloading method:
using the same variable name but with a varying number of parameters
 */
