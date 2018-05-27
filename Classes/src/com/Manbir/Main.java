package com.Manbir;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();  //created an object of Class - Car
        Car holden = new Car();
        porsche.setModel("Carerra");
        System.out.println("model is " + porsche.getModel());
    }
}
