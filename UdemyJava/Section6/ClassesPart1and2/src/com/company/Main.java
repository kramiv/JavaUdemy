package com.company;

public class Main {

    public static void main(String[] args) {
        //create an object: it is now treated as a datatype
        Car porsche = new Car();//  "porsche" is the keyword
        //initialize car with 'new Car'
        Car holden = new Car();
        //Car class has inherited new methods from base Java class
        //so porsche. gets some automatic options for methods
        //this only suggests non-private classes
        //porsche.model = "Carrera";//this technically violates the rules of encapsulation

        porsche.setModel("Carrera");

        System.out.println("model is " + porsche.getModel());

        //classes and strings are, by default, null


    }
}
