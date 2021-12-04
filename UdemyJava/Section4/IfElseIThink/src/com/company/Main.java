package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000)//this processes only one line after it.

            System.out.println("your score was 5000");
/*
        score = 4000;
        if(score <= 5000) {
            System.out.println("your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println("got here");
        }
*/
        if (gameOver == true) {//if (gameOver)
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("your final score was " + finalScore);
        }//note: variable created in code block is only accessible in code block.
        //this is the scope of the code block's variable

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true) {//if (gameOver)
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("your final score was " + finalScore);
        }
        //advantage: efficient use of memory.
        //disadvantage: final scores not recorded. also, code duplicated.
    }
}
