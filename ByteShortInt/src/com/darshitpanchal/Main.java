package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
        int intMin = -2_147_483_648;
        int intMax = 2_147_483_647;

        int myIntValue = (intMin/2);
        System.out.println("Integer Value : " + myIntValue);


        // Byte has a width of 8
        byte byteMin = -128;
        byte byteMax = 127;

        byte myByteValue = (byte) (byteMin/2);
        System.out.println("Byte Value : " + myByteValue);


        // Short has a width of 16
        short shortMin = -32768;
        short shortMax = 32767;

        short myShortValue = (short) (shortMin/2);
        System.out.println("Short Value : " + myShortValue);


        // Long has a width of 64
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;

        long myLongValue = (long) (longMin/2);
        System.out.println("Long Value : " + myLongValue);

        // Tutorial Exercise

        byte byteNumber = 25;
        short shortNumber = 2564;
        int intNumber = 98526;

        long longNumber = 50000L + (10L * (byteNumber + shortNumber + intNumber));
        System.out.println("Tutorial Exercise Result : " + longNumber);

        short shortResult = (short) (500 + (byteNumber + shortNumber));
        System.out.println("Tutorial Exercise Result 2 : " + shortResult);

    }
}
