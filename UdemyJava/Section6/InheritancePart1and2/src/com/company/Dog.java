package com.company;

public class Dog extends Animal {
    //create subclass with "extends Animal"

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);//note super
        //note: removing brain from Dog(String...) call and substitutiong
        //"brain" with 1 in super(name...) means all dogs have brains.
        //and etc
        //then, add the private Dog class's variables into Dog(...)

        //initialize non-super class variables:
        // note super(...) above initializes superclass variables
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //suppose Dogs eat differently than other Animals:
    //this method exists only for Dogs
    //if it's public, can superclass Animal use chew?
    //no...I tested it. Then what's the point of private?
    private void chew() {
        System.out.println("Dog.chew() called");
    }
    //next: override the eat() method in the Animal class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();//call out the method unique to the Dog class
        super.eat();//why is this after sout?
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }


    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }



}
