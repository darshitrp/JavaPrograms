package com.darshitpanchal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1,2);
        /*
            Above statement will add "value:2" at the "index:1".
            In order to do so it will move-down all other values by single index.
            i.e index of each value after "value:2" will increment by 1.
            Similarly, if one of the item/value is to be removed, it will decrement index value by 1.
            Now, this is not efficient for the list with large number of records.

            Here "LinkedList" comes into use. "LinkedList" is an alternative to "ArrayList".
            "LinkedList" stores the actual link to the next item in the list as well as the actual data.
            Hence it is called "LinkedList".

        */

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }
    }
}
