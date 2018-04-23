package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        // "new Resolution(2540,1440);" here we are creating instance of the "class:Resolution" without creating variable.
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"V2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // Methods of "Class:Monitor, Motherboard, Case" is accessible through "Class:PC"

        /*
        thePC.getMonitor().drawPixel(1500,1200,"red"); // Identifier changed to private in "Class:PC".
        thePC.getMotherboard().loadProgram("Windows 1.0"); // Identifier changed to private in "Class:PC".
        thePC.getTheCase().pressPowerButton(); // Identifier changed to private in "Class:PC".
        */

        thePC.powerUp();



    }
}
