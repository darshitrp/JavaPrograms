package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        /*
            for(init; termination; increment){

            }
        */

        for(int i = 0; i < 5; i++){

            System.out.println("Loop " + i + " hello!");

        }

        // Chapter Exercise Method Calling
        System.out.println("***************************");

        for(int i = 2; i < 9.0; i++){

            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000.0, i)));

            // To format output decimals we have used "format" method of "String" class.

        }


        // Chapter Exercise Method Calling
        System.out.println("***************************");


        for(int i = 8; i > 1; i--){

            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000.0, i)));

            // To format output decimals we have used "format" method of "String" class.

        }

        // Chapter Exercise Method Calling
        System.out.println("***************************");

        int count=0;
        for(int i = 10; i < 50; i++){

            if(isPrime(i)){

                System.out.println(i + " is a prime number!");
                count++;

                if(count == 4){
                    System.out.println("Exiting the for loop!");
                    break;

                    /*
                        When the break statement is encountered inside a loop, the loop is immediately terminated
                        and the program control resumes at the next statement following the loop.
                    */

                }

            }

        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate/100));

    }


    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        /*
            for(int i = 2; i <= (long) Math.sqrt(n); i++)
            Above statement can be also used, it will reduce the calculation steps and time of program.
            Run the program using both statements and check the looping count for both,
            you will find less looping in the above statement.
        */

        for(int i = 2; i <= n/2; i++){

            System.out.println("Looping " + i );
            if(n % i == 0){
                return false;
            }

        }

        return true;

    }

}
