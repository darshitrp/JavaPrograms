package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        // "Main" is a method and all code in middle is the statements that forms the method.

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 10000, 8, 200);

        int highScore = newCalculateScore(true, 10000, 8, 200);
        System.out.println("You high score is : " + highScore);

        // Chapter exercise method called

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Darshit", highScorePosition);

        int highScorePosition2 = calculateHighScorePosition(900);
        displayHighScorePosition("Dipen", highScorePosition2);

        int highScorePosition3 = calculateHighScorePosition(400);
        displayHighScorePosition("Jainit", highScorePosition3);

        int highScorePosition4 = calculateHighScorePosition(50);
        displayHighScorePosition("Mayank", highScorePosition4);

    }

    /*
        Parameters are the definitions. But arguments are the actual values,
        not the data type and not the variable name but the values that we want to send to the method.
    */

    // "Void" means don't send any value back.
    // "Void" method can also be known as procedure.
    // A "method" generally speaking can also be known as function.

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }

    /*
        When we return back the value to method it is necessary to return value in all cases.
        For example in below method we can't return the value only if the "If" condition is true.
        We need to return the value even if the condition is not true.

        In programming terms "-1" is used to indicate an error and in searching algorithms "-1"
        indicates an invalid value or a value not found.
    */

    public static int newCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else{
            return -1;
        }

        // return -1;
        // If we don't want to use "else" statement we can simply "return -1" after the "if" condition.

    }


    // Chapter exercise

    public static void displayHighScorePosition(String playerName, int playerPosition){

        System.out.println(playerName + " managed to get into position " + playerPosition +
                " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if (playerScore >= 100 && playerScore < 500){
            return 3;
        }else {
            return 4;
        }

    }

}
