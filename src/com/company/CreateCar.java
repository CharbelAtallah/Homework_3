package com.company;


import javax.swing.*;

public class CreateCar {

    //instancevariables
    private static int yearModel;//Anything inside this class is private. nothing outside this class can access it.
    private static String carModel;
    private static int speed = 0;
    private static String reg_number;

    public CreateCar(int yearModelGiven, String carModelGiven, String reg_numberGiven) { //No static and no return type for this constructor. Both given because they are gonna give us/initialize the value from above.
        yearModel = yearModelGiven; //Setting the year model to whatever they typed in for model.
        carModel = carModelGiven;
        reg_number = reg_numberGiven;
    }

    //Method 1
    public static int getYearModel() { //Get the information
        return yearModel;
    }

    //Method 2
    public static String getCarModel() {
        return carModel;
    }

    public static String getReg_number() {return reg_number;}


    public void carSpec(){
        System.out.println(getCarModel());
        System.out.println(getReg_number());
        System.out.println(getYearModel());

    }

    public void Welcome() {
        System.out.println("Welcome to the car speed test");
        JOptionPane.showMessageDialog(null, "Welcome to the car speed test");
    }


    public void Speed(String maxSpeed) {
        // System.out.println("Max speed is: " + maxSpeed);
        int snabb = Integer.parseInt(maxSpeed);

        if (snabb > 60) {
            System.out.println("The max speed of the: " + getYearModel() + " " + getCarModel() + " is: " + snabb + ". it can go faster!");
        } else {
            System.out.println("The max speed is " + snabb + ". Its to slow");
        }
    }


    public void Accelerate() {
        for (int seconds = 1; seconds <= 3; seconds++) { //"3" bestämmer hur många loopar det är
            speed += 20; //Bestämmer intervallen på hastigheten t.ex 20, 40, 60
            System.out.println("\t>The current speed of the " + getYearModel() + " " + getCarModel() + " is: " + speed + " KM/H");
        }
    }


    public void Brake() {
        System.out.println("\nNo wait... start breaking!\n");
        for (int seconds = 1; seconds <= 3; seconds++) {
            speed -= 20;
            System.out.println("\t>The current speed of the " + getYearModel() + " " + getCarModel() + " is: " + speed + " KM/H");

            if (speed == 0) {
                System.out.println("The car has halted to a stop!\n"); //Så att man inte får en utskrift i varje rad.
            }
        }
    }
}
