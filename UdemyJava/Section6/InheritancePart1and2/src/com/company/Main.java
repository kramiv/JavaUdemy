package com.company;

public class Main {

    public static void main(String[] args) {
        //initialize a superclass Animal:
	    Animal animal = new Animal("Animal",
                1,1,5,5);
        //initialize a subclass Dog
        Dog dog = new Dog("Yorkie", 8,20,
                2,4,1,20,"long silky");

        //note that subclass Dog can use superclass Animal's methods:
        dog.eat();

        //move() in the Dog class, by default, seeks a Dog method
        //next, seeks superclass Animal method
        //or, it goes to an Override method
        dog.run();




    }
}
