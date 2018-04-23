package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        /*
            Creating "object : porsche" for "Class : Car" and initialising the new "object : porsche".
            Here we have created a new "datatype : porsche" which is of "Type : Car".
            Or we can say that we have created "Object : porsche" based on "Template : Car".
        */

        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

    }
}
