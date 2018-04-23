package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie",8, 20, 2, 4, 1, 20, "Long Silky");

        dog.eat(); // "Method:eat" is defined in "Class:Animal" but we can use it with "Class:dog" because of "inheritance".
        dog.walk();
       // dog.run();

    }
}
