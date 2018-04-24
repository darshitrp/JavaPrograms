package com.darshitpanchal;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }

    /*
        Suppose if we need to change the parameter's input type from "string" to "boolean" it will create an issue
        if the same code is used at other places.

        This "Class:Gearbox" is created to show the importance of "Interfaces".
    */
}
