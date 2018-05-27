package com.Manbir;

public class Car {

    private int doors; // private is a access modifier
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase(); // adding validation to aa setter method
        if(validModel.equals("carerra") || validModel.equals("commodore")) {  //.equals is a way to test that a particular value of string is equal to anothher string
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}
