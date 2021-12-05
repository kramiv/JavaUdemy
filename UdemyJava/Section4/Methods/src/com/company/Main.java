package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);//this was commented out from the function since the return
        //...value is assigned as an int to highScore.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        //  exercise: call the methods here
        System.out.println("the following 2 outputs are the exercise");
        displayHighScorePosition("sam", 1000);
        int exerciseOutput = calculateHighScorePosition(1000);
        System.out.println(exerciseOutput);// note input of String "sam"

        System.out.println("more exercise outputs:");
        exerciseOutput = calculateHighScorePosition(50);
        System.out.println(exerciseOutput);
        exerciseOutput = calculateHighScorePosition(400);
        System.out.println(exerciseOutput);
        exerciseOutput = calculateHighScorePosition(900);
        System.out.println(exerciseOutput);
        exerciseOutput = calculateHighScorePosition(1500);
        System.out.println(exerciseOutput);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {//if (gameOver)
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 1000;
            //System.out.println("your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;//-1 is used to indicate a value or value not found.
        }
    }// void means don't send data back.

    //  exercise part 1:
    public static void displayHighScorePosition(String characterName, int characterPosition) {
        System.out.println(characterName + " managed to get into position "
                + characterPosition + " on the high score table.");
    }// note String characterName. String is uppercase.

    //  exercise part 2:
    public static int calculateHighScorePosition(int score) {//this "score" is not
        //defined under the scope of main()
        int position = 4;
        if ((score >= 1000)) {// && (score < 500)
            position = 1;
        } else if ((score >= 500)) {// && (score < 1000)
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }// else { return 4;}
        return position;
    }//     && (score < 500)    can be removed only if the flow is correct.
    //otherwise, the if-statements stop once a condition is met but not necessarily the correct one.


}
//psvm shortcut creates public static void main(String[] args) {}