package com.company;

import javax.swing.*;

public class Car1 {

    private static int yearModel;//Anything inside this class is private. nothing outside this class can access it.
    private static String make;
    private static int speed = 0;

    public Car1(int yearModelGiven, String makeGiven) { //No static and no return type for this constructor. Both given because they are gonna give us/initialize the value from above.
        yearModel = yearModelGiven; //Setting the year model to whatever they typed in for model.
        make = makeGiven;
    }

    //Method 1
    public static int getYearModel() { //Get the information
        return yearModel;
    }

    //Method 2
    public static String getMake() {
        return make;
    }



    public static void accelerate() {
        for (int seconds = 1; seconds <= 3; seconds++) { //"3" bestämmer hur många loopar det är
            speed += 20; //Bestämmer intervallen på hastigheten t.ex 20, 40, 60
            System.out.println("The current speed of the " + getYearModel() + " " + getMake() + " is: " + speed + " KM/H");
        }
    }

    public void speed(String maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed + ". Keep going! The car gan go faster"); //IKNTEGRERA
    }

    public static void brake() {
        for (int seconds = 1; seconds <= 3; seconds++) {
            speed -= 20;
            System.out.println("The current speed of the " + getYearModel() + " " + getMake() + " is: " + speed + " KM/H");

            if (speed == 0) {
                System.out.println("The car has halted to a stop!"); //Så att man inte får en utskrift i varje rad.
            }
        }
    }
}
