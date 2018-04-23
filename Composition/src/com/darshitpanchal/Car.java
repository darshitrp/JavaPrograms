package com.darshitpanchal;

public class Car extends Vehicle {


    /*
        There is "is-a" relationship between "Class:car" and "Class:vehicle".
        i.e: Car "is-a" Vehicle.

        Inheritance deals with "is-a" relationship.

        Composition deals with "has-a" relationship.
        for e.g : a computer has a motherboard, a case and a monitor.

    */

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
