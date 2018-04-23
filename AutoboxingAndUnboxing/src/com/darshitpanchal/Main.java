package com.darshitpanchal;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("darshit");

        /*
            ArrayList<int> intArrayList = new ArrayList<int>();
            Above code gives Error : Type argument cannot be of primitive type.
            Error is because a primitive type is not a class.
            As a work around we can create "Class:IntClass" then use below code.
            By using below code we are wrapping "primitiveType:int" into class. This is a concept of wrapper.

            Now this would become messy with constructor, getter, setter, and class. So we need functionality for
            primitive datatypes to be stored in ArrayList.

            Solution to above problem is "Autoboxing".


        */

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Wrapper Classes (Autoboxing)
        Integer integer = new Integer(54);
        Double doubleValue = new Double(54.54);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i));

            // "Integer.valueOf(i)" is "Autoboxing", converting "primitiveType:int" value to "Class:Integer".
        }

        for(int i=0; i<=10; i++){
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());

            // "integerArrayList.get(i).intValue()" is "UnBoxing", converting "Class:Integer" value to "primitiveType:int".
        }

        // Short way of Autoboxing
        Integer myIntValue = 58; // At compile time code "Integer.valueOf(58);" will run.

        // Short way of UnBoxing
        int myInt = myIntValue; // At compile time code myIntValue.intValue();" will run.

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl+=0.5){
            doubleArrayList.add(Double.valueOf(dbl)); // Autoboxing
            // "doubleArrayList.add(dbl);" shortcut for Autoboxing
        }

        for(int i=0; i<doubleArrayList.size(); i++){
            System.out.println(i + " -> " + doubleArrayList.get(i).doubleValue()); // UnBoxing
            // "doubleArrayList.get(i);" shortcut for UnBoxing
        }
    }
}