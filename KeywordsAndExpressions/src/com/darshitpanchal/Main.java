package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

	    /*
        'Keywords' will be in 'blue' colour in 'IntelliJ'.

        int int = 5;
        Above declaration will give error as 'int' is reserved and cannot be used as exact.
        We can use int2 or anything else identical.
        */

	    // Expressions includes variables, values and operators

        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344); // everything except datatype and semi-colon includes expressions

        int highScore = 50;

        // 'highScore == 50' in below statement is expression.

        if(highScore == 50){

            System.out.println("This is an expression"); // Component within brackets is also an expression

        }

        // Chapter Exercise

        int score = 100;
        if(score > 99){
            System.out.println("You got the high score!");
            score = 0;
        }

        /*

        Expressions in above code as belows :

        score = 100
        score > 99
        "You got the high score!"
        score = 0

        */



    }
}
