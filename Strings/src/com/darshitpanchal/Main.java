package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("Initial String : " + myString);

        myString = myString + ", and this is added now";
        System.out.println("Added String : " + myString);

        myString = myString + "\u00A9 2018";
        System.out.println("Unicode added to previous string : " + myString);

        String numberString = "250.25";
        numberString = numberString + "50.25";
        System.out.println("Numbers used as string : " + numberString);

        String lastString = "10";
        int myInt = 25;
        lastString = lastString + myInt;
        System.out.println("Integer used along with string : " + lastString);
        double myDouble = 125.22;
        lastString = lastString + myDouble;
        System.out.println("Double used along with string : " + lastString);

    }
}
