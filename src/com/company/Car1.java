package com.company;

import javax.swing.*;

public class Car1 {
    private static int speed; //Varför private?
    private static int yearModel;
    private static String make;
    //int yearModel;
    //String make;
    //int speed;

    public static int getYearModel() {
        return yearModel;
    }

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

    public Car1(int yearModelGiven, String makeGiven) {
        yearModel = yearModelGiven;
        make = makeGiven;
        speed = 0;
    }


}
