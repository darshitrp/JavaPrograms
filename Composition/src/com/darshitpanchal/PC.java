package com.darshitpanchal;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    /*
        When using "Inheritance" we can extend only one class but here in "composition" we have three "classes:Case, Monitor, Motherboard"
        under one "class:PC".

        "PC" has "Case" , "Motherboard" and "Monitor".

        "Composition" is like creating objects within objects.

        When programming in java try to look into "composition" first and then if needed use "inheritance".
    */

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton(); //same as "getTheCase().pressPowerButton();"
        drawLogo();
    }

    private void drawLogo(){
        // Graphics
        monitor.drawPixel(1200,50,"yellow"); //same as "getMonitor().drawPixel(1200,50,"yellow");"
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
