package com.darshitpanchal;

public class Main {

    // Method overloading means using same method name but with different number of parameters.

    public static void main(String[] args) {

        int newScore = calculateScore("Darshit", 500);
        System.out.println("New Score is : " + newScore);

        calculateScore(75);
        calculateScore();

        // Chapter Exercise method calling

        double cmCheck = calcFeetAndInchesToCentimeters(6,0);
        if(cmCheck < 0.0){
            System.out.println("Invalid parameters entered!");
        }

        double finalCheck = calcFeetAndInchesToCentimeters(157);
        if(finalCheck < 0.0){
            System.out.println("Invalid Inches!!!");
        }


    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    /*
        Changing the datatype of the return value doesn't make the method different.
        Change in Method Name / Parameters make the method different.
    */

    public static int calculateScore(){
        System.out.println("No player name, no player score!");
        return 0;
    }

    // Chapter Exercise

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet >= 0 && (inches >=0 && inches <= 12)){

            double feetToCm = (feet * 12) * 2.54;
            double inchesToCm = inches * 2.54;
            double totalCm = feetToCm + inchesToCm;
            System.out.println(feet + " Feet to CM : " + feetToCm);
            System.out.println(inches + " Inches to CM : " + inchesToCm);
            System.out.println("Total CM : " + totalCm);
            return totalCm;

        }else {
            System.out.println("Invalid Feet or Inches!!!");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >= 0){

            double inchesToFeet = (int) inches / 12;
            double remainderInches = (int) inches % 12;
            System.out.println(inches + " Inches to Feet : " + inchesToFeet + " and remainder Inches : " + remainderInches);
            return calcFeetAndInchesToCentimeters(inchesToFeet, remainderInches);

        }else{
            System.out.println("Invalid Inches!!!");
            return -1;
        }

    }

}
