package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        // Width of Char is 16 (2 bytes)
        char myChar = 'D';
        char myChar2 = 'd';
        char myChar3 = '3';
        char myChar4 = '$';
        char myChar5 = '\u00A9'; // Unicode character

        System.out.println("My Char1 : " + myChar);
        System.out.println("My Char2 : " + myChar2);
        System.out.println("My Char3 : " + myChar3);
        System.out.println("My Char4 : " + myChar4);
        System.out.println("My Char5 : " + myChar5);

        boolean myBoolean = true;
        boolean myBoolean2 = false;

        System.out.println("My Boolean : " + myBoolean);
        System.out.println("My Boolean2 : " + myBoolean2);

        // Chapter Exercise (Print registered symbol using unicode)

        char registeredChar = '\u00AE';
        System.out.println("Registered Symbol : " + registeredChar);

    }
}
