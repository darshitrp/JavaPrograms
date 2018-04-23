package com.darshitpanchal;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Allows to type input into the console

    public static void main(String[] args) {
        int[] myIntArray = new int[10]; // '10' elements starting from '0' to '9'.
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
            Can also be initialised as below :
            int[] myIntArray;
            myIntArray = new int [10];

            myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            We can also assign values in this way, but this can be done only when initialising the variable first time.
        */
        myIntArray[5] = 50; // '50' is being saved in element 6, because array start counting positions from zero.
        System.out.println(myIntArray[5]);

        System.out.println(myIntArray2[5]);
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[8]);

        int[] myIntArray3 = new int[25];

        for(int i = 0; i < myIntArray3.length; i++){
            myIntArray3[i] = i * 10;
        }
        printArray(myIntArray3);

        double[] myDoubleArray = new double[10];

        // Using the Scanner to get input from console

        int[] myIntVariables = getIntegers(5);
        for(int i=0; i<myIntVariables.length; i++){
            System.out.println("Element " + i + ", typed value was : " + myIntVariables[i]);
        }
        System.out.println("The average is : " + getAverage(myIntVariables));

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("myIntArray3[" + i + "] : " + array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
