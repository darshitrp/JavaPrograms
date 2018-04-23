package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }


        /*
            Switch statement is good to use if you are testing different values for the same variable.
            If "break" is not used then it will continue to the next statement until "break" is found or
            end of code block is found.
            Last "break" after "default" is not compulsory as the code block is eventually going to end.
            But it is good practice to use the last "break".
            "Switch" can be used with "byte, short, char and int" primitive data types.
            "Switch" can be used with "strings" in java version 7 and above.
            "Switch" variable check is case sensitive.
            To overcome case sensitivity problem, "methods" of string class can be used. E.g: toLowerCase().
        */


        int switchValue = 1;

        switch (switchValue) {

            case 1:
                System.out.println("Switch value is 1");
                break; // break will exit the entire switch code block.

            case 2:
                System.out.println("Switch value is 2");
                break;

            case 3: case 4: case 5: // If multiple values needs to be tested, this is shortcut for the same.
                System.out.println("Switch value is either 3, 4 or 5");
                System.out.println("Actually value is : " + switchValue);
                break;

            default:
                System.out.println("Switch value is not 1, 2, 3, 4 or 5");
                break;
        }

        // break will take control here and will execute more code that exists here.

        // Chapter Exercise

        char switchChar = 'E';

        switch (switchChar){

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " Character found");
                break;

            default:
                System.out.println("Required character not found");
                break;

        }


        String stringValue = "January";

        switch (stringValue.toLowerCase()){

            case "january":
                System.out.println("Month is : " + stringValue);
                break;

            default:
                System.out.println("Required month not found");

        }

    }
}
