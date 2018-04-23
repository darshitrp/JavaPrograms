package com.darshitpanchal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
        "Resizing" an array with lots of value will not be productive as we will have to copy large values from old array to new array.
        So Concept of "ArrayList" can be useful here.
        "ArrayList" is the resizable "array" which handles resizing automatically.
    */

    private static Scanner scanner = new Scanner(System.in);
    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        /*
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);
        */

        // ArrayList code begins (GroceryList)

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    private static void getInput(){
        for(int i=0; i<baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray(){
        int[] original = baseData;

        baseData = new int[12];
        for(int i=0; i<original.length; i++){
            baseData[i] = original[i];
        }
    }

    //ArrayList Code Method begins

    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem(){
        //System.out.println("Enter item number: ");
        //int itemNumber = s.nextInt();
        System.out.println("Current item name: ");
        String itemNumber = s.nextLine();
        //s.nextLine();
        //System.out.print("Enter replacement item: ");
        System.out.print("Enter new item: ");
        String newItem = s.nextLine();
        //groceryList.modifyGroceryItem(itemNumber-1, newItem);
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem(){
        //System.out.println("Enter item number: ");
        System.out.println("Enter item name: ");
        //int itemNumber = s.nextInt();
        String itemNumber = s.nextLine();
        //s.nextLine();
        //groceryList.removeGroceryItem(itemNumber-1);
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = s.nextLine();
        /*
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocery list.");
        }else{
            System.out.println(searchItem + " is not in the shopping list.");
        }
        */

        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list.");
        }else{
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }

    /*
        Below are the statements used to copy existingArray to newArray
    */

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); // used to copy entire content of existingArray to newArray.

        // Also used to copy arrayList mostly similar to above one, but here copying is done at the point of calling constructor.
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // Store arrayList into the Array.
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
