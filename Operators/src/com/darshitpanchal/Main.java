package com.darshitpanchal;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {

        // =
        // +
        int result = 1 + 2;
        System.out.println("1 + 2 : " + result);

        // -
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 : " + result);

        // *
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 : " + result);

        // /
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 : " + result);

        // %
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 : " + result);

        // +
        previousResult = result;
        result = result + 1;
        System.out.println(previousResult + " + 1 : " + result);

        // ++
        previousResult = result;
        result++;
        System.out.println(previousResult + " ++ : " + result);

        // --
        previousResult = result;
        result--;
        System.out.println(previousResult + " -- : " + result);

        // +=
        previousResult = result;
        result += 2;
        System.out.println(previousResult + " += 2 : " + result);

        // *=
        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " *= 10 : " + result);

        // -=
        previousResult = result;
        result -= 10;
        System.out.println(previousResult + " -= 10 : " + result);

        // /=
        previousResult = result;
        result /= 10;
        System.out.println(previousResult + " /= 10 : " + result);

        boolean isAlien = false; // Assignment Operator
        if (isAlien == false) {
            System.out.println("It is not an alien, Value False!");
        }

        if (isAlien == true) {
            System.out.println("It is an alien, Value True!");
        }


        int topScore = 80;
        if (topScore == 100) {
            System.out.println(topScore + " Is Equal to 100.");
        }

        if (topScore != 100) {
            System.out.println(topScore + " Is Not equal to 100.");
        }

        if (topScore > 100) {
            System.out.println(topScore + " Is Greater then 100.");
        }

        if (topScore >= 100) {
            System.out.println(topScore + " Greater then or equal to 100.");
        }

        if (topScore < 100) {
            System.out.println(topScore + " Less then 100.");
        }

        if (topScore <= 100) {
            System.out.println(topScore + " Less then or equal to 100.");
        }


        int secondScore = 90;
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println(topScore + " is greater then " + secondScore + " AND less then 100.");
        }

        if ((topScore > secondScore) || (topScore < 100)) {
            System.out.println(topScore + " is greater then " + secondScore + " OR less then 100.");
        }


        /*

        Assignment operator always returns the value to the right side.
        So in below 'if' condition boolean is required but it is getting int value '9'.
        Hence error is thrown.

        int intCheck = 5;
        if(intCheck = 9) {
            System.out.println("This will throw error!!");
        }

        */

        /*
        Assignment operator always returns the value to the right side.
        So in below 'if' condition boolean is required and it is getting boolean value 'true'.
        Hence no error is thrown and statement is always found to be true.
        */
        boolean isFalse = false;
        if (isFalse = true) {
            System.out.println("This is not supposed to happen!!");
        }

        boolean isTrue = true;
        if (isTrue == true) {
            System.out.println("This is supposed to happen!!");
        }

        boolean trueValue = true;
        boolean falseValue = false;
        if (trueValue) {
            System.out.println("This statement will print because value assigned is true!!");
        }

        if (falseValue) {
            System.out.println("This statement will not print because value assigned is false");
        }


        // Ternary operator

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;

        /*
        In above declaration value of 'isCar' is 'false' so ternary operator will assign value 'false' to 'wasCar'.
        Hence below 'If' condition is not satisfied and below statement will not get printed.
        */

        if (wasCar) {
            System.out.println("Value of isCar is false and if condition is not satisfied so this statement will not be printed!");
        }

        /*
        In above declaration value of 'isCar' is 'false' so ternary operator will assign value 'false' to 'wasCar'.
        Now below 'If' condition is satisfied so below statement will  get printed.
        */

        if (wasCar == false) {
            System.out.println("Value of isCar is false and if condition is satisfied so Value of " +
                    "wasCar will be second value after ternary operator " +
                    "is not fulfilled  : " + wasCar);
        }


        isCar = true;
        wasCar = isCar ? true : false;


        /*
        In above declaration value of 'isCar' is 'true' so ternary operator will assign value 'true' to 'wasCar'.
        Now below 'If' condition is satisfied so below statement will  get printed.
        */

        if (wasCar) {
            System.out.println("Value of isCar is true so this statement will be printed! Value of " +
                    "wasCar will be first value after ternary operator : " + wasCar);
        }

        wasCar = isCar ? false : true;

        /*
        In above declaration value of 'isCar' is 'true' so ternary operator will assign value 'false' to 'wasCar'.
        Now below 'If' condition is satisfied so below statement will  get printed.
        */

        if (wasCar == false) {
            System.out.println("Value of isCar is true so this statement will be printed! Value of " +
                    "wasCar will be first value after ternary operator : " + wasCar);
        }


        // Chapter Exercise

        double firstValue = 20d;
        double secondValue = 80d;
        double finalValue = (firstValue + secondValue) * 25d; // First addition and then multiplication
        System.out.println("Value with precedence : " + finalValue);
        double finalValue2 = firstValue + secondValue * 25d; // First multiplication and then addition
        System.out.println("Value without precedence : " + finalValue2);
        double remValue = finalValue % 40d;

        if (remValue <= 20)
            System.out.println(remValue + " Total was over the limit!");

    }
}

