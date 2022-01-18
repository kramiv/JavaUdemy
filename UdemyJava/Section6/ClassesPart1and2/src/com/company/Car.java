package com.company;

public class Car {

    //state components of object Car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //create a method to update the model rather than
    //changing the variable directly
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        //this method makes it so only two options can be assigned to model
        //data for objects can be validated this way. this is encapsulation.
    }

    public String getModel() {
        return this.model;
    }

}

//access modifiers:
//public: other classes can use it
//private: not public
//protected: same package can use it
//none

//generally, when defining fields, access modifiers are private
//this is adhering to "encapsulation". this hides fields and methods
//from being accessed publicly

