package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        // Width of Int is 32 (4 bytes)
        int myIntValue = 5;
        int myIntValue2 = 5 / 2;

        // Width of Float is 32 (4 bytes)
        float myFloatValue = 5f;
        float myFloatValue2 = (float) 5.25; // Needs casting if defined as decimal
        float myFloatValue3 = 5.25f;
        float myFloatValue4 = 5;
        float myFloatValue5 = 5f / 2f;
        float myFloatValue6 = 5 / 3; // Result Abnormal
        float myFloatValue7 = 5f / 3f; // 7 Digit Precision after decimal
        float myFloatValue8 = 3.141_59_27f; // Can use underscore to structure long digits only above java version 1.6

        // Width of Double is 64 (8 bytes)
        double myDoubleValue = 5d;
        double myDoubleValue2 = 5.25; // If defined as decimal automatically considered as double
        double myDoubleValue3 = 5;
        double myDoubleValue4 = 5d / 2d;
        double myDoubleValue5 = 5 / 3; // Result Abnormal
        double myDoubleValue6 = 5d / 3d; // 16 Digit Precision after decimal
        double myDoubleValue7 = 3.141_59_27d; // Can use underscore to structure long digits only above java version 1.6

        System.out.println("Int Value : " + myIntValue);
        System.out.println("Int Value2 : " + myIntValue2);

        System.out.println("Float Value : " + myFloatValue);
        System.out.println("Float Value2 : " + myFloatValue2);
        System.out.println("Float Value3 : " + myFloatValue3);
        System.out.println("Float Value4 : " + myFloatValue4);
        System.out.println("Float Value5 : " + myFloatValue5);
        System.out.println("Float Value6 : " + myFloatValue6);
        System.out.println("Float Value7 : " + myFloatValue7);
        System.out.println("Float Value8 : " + myFloatValue8);

        System.out.println("Double Value : " + myDoubleValue);
        System.out.println("Double Value2 : " + myDoubleValue2);
        System.out.println("Double Value3 : " + myDoubleValue3);
        System.out.println("Double Value4 : " + myDoubleValue4);
        System.out.println("Double Value5 : " + myDoubleValue5);
        System.out.println("Double Value6 : " + myDoubleValue6);
        System.out.println("Double Value7 : " + myDoubleValue7);


        // Chapter Exercise [Convert given number of pounds to kilograms]

        double poundValue = 200d;
        double kiloConvert = poundValue * 0.45359237d;
        System.out.println(poundValue + " Pound converted to kilograms : " + kiloConvert);



    }
}
