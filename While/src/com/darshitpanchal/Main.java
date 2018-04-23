package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        /*
            "While" loop may or may not get executed according to the condition,
            but "do.. while" loop will always execute for once and then continue as per the condition.
        */

        int count = 0;
        while (count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        }while (count != 6);


        //Chapter Exercise Method calling
        System.out.println("******************");

        int number = 4;
        int finishNumber = 20;
        int whileCount = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue; // "Continue" will bypass any code afterwards and goes back to the start of the loop.
            }
            System.out.println("Even Number " + number);
            whileCount++;
            if(whileCount >= 5){
                break;
            }
        }

        System.out.println("Total Even Numbers found : " + whileCount);

    }

    // Chapter Exercise

    public static boolean isEvenNumber(int checkNumber){

        if((checkNumber % 2) == 0){
            return true;
        }
        else {
            return false;
        }

    }

}
