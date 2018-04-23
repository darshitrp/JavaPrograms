package com.darshitpanchal;

public class Car {

    /*
        "Class" consists of objects which have "state" and "behaviour".
        Below is the example of "state".
        Below defined variables are also known as "fields".
        Here only "class" is defined with name "car".
        "Class" is just a blue print. Now we need to define "object" for this "Class".
        "Object" is defined in "Main" Class.
        "Private" access identifier means, don't allow any other "Class" outside "Class : Car" to access this variables or fields.
        If we need to access any field to be accessed outside "Class : Car" then change Access identifier to "Public".
    */

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    /*
        "Field : model" defined in "Class : Car" and "Parameter : model" defined for "Method : setModel" are different.
        Now we want to modify/update the "Field : model" with the content of the "Parameter : model".
        In order to achieve above we can use "this".
        "this" refers to the "fields" defined for the "class".
        "get" method and "set" method are called "getters" and "setters" in java.
    */

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "UnKnown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
