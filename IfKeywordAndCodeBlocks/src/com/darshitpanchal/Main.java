package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000){
            System.out.println("Your score was 5000");
        }

        // We can get rid of the braces if there is only one statement that needs to be executed after the test.

        if (score == 5000)
            System.out.println("Your score was 5000");

        /*

        If there are multiple statements after the test and no braces are used then all other statements
        will not be included in test.

        */

        if (score == 4000)
            System.out.println("Your score was 4000");
        System.out.println("This is also executed");


        // Code block will help to include the statements in the test.

        if (score == 4000){
            System.out.println("Your score was 4000");
            System.out.println("This is also executed");
        }

        if(score < 5000){
            System.out.println("Your score is less than 5000");
        }
        else {
            System.out.println("Your score is greater than or equal to 5000");
        }

        if(score < 5000 && score > 1000){
            System.out.println("Your score is less than 500 and greater than 1000");
        }else if (score < 1000){
            System.out.println("Your score is less than 1000");
        }else {
            System.out.println("Your score is greater than or equal to 5000");
        }


        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is : " + finalScore);
        }

        int card;

        // System.out.println("Final score is : " + finalScore);
        // Above statement will give error.

        /*
        Code blocks can access the variables created before entering into the code blocks.
        But the variables created in code blocks cannot be used outside.
        */

        if(gameOver){
            // abbreviated form to check if value of "gameOver" is "true".
            // Alternative to "gameOver = true".
        }

        // Chapter Exercise

        /*
            If we reuse the same variables then we are manipulating the original values which may create issue if the
            same variables are to be used further.

            Also we are copying the same code which can crete problem if we decide to change the code and we forget to
            change the code at every copied space.

        */

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is : " + finalScore);
        }

        // If we are creating the new variables then we are using excessive memory.

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score is : " + finalScore);
        }

    }
}
