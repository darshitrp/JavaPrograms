package com.darshitpanchal;

public class Dog extends Animal {

    /*
        "super" is used to call the constructor of the "class" we are "extending / inheriting" from, here the "Class: Animal".
        By "inheriting" from "Class:Animal" we are using the "fields" of "Class:Animal" but we can also define the "fields" specific
        to "class:Dog".

        We can also specify static values for the "super" without using the "fields" as parameters/arguments.

    */

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called!");
        chew();
        super.eat(); //"super" will check for the "super class:Animal" for "current class:Dog" and call "Method:eat" in the super class.
    }

    public void walk(){
        System.out.println("Dog.walk() called!");
        super.move(5);

        /*
            "Method:move" will be executed from "Super Class:Animal" because "super" is used.
        */

    }

    public void run(){
        System.out.println("Dog.run() called!");
        move(10);
        /*
            "Method:move" will be searched in "Current Class:Dog" if found will be executed or
            else "Method:Move" will be executed from "Super Class:Animal".
        */
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called!");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called!");
        moveLegs(5);
        super.move(speed);
    }
}
