package com.company;


import javax.swing.*;

public class CreateCar {

    //instancevariables
    private static int yearModel;//Anything inside this class is private. nothing outside this class can access it.
    private static String carModel;
    private static int speed = 0;
    private static String regNumber;
    private static String colour;
    private static int horsePower;
    private static String gearType;


    /**
     *
     * @param yearModelGiven Setting the year model to whatever the user typed in as year.
     * @param carModelGiven Setting the car model to whatever the user typed in as model.
     * @param reg_numberGiven Setting the registration number to whatever the user typed in as registration.
     * @param colourGiven Setting the colour of the car to whatever the user typed in as colour.
     * @param horsePowerGiven Setting the horse power of the car to whatever the user typed in as horsepower.
     * @param gearTypeGiven Setting the gear type of the car to whatever the user typed in as gear type.
     */
    public CreateCar(int yearModelGiven, String carModelGiven, String reg_numberGiven, String colourGiven, int horsePowerGiven, String gearTypeGiven) { //No static and no return type for this constructor. It's giving us/initialize the value from above.
        yearModel = yearModelGiven; //Setting the year model to whatever they typed in for model.
        carModel = carModelGiven;
        regNumber = reg_numberGiven;
        colour = colourGiven;
        horsePower = horsePowerGiven;
        gearType = gearTypeGiven;
    }

    //Method 1
    // Get the information
    public static int getYearModel() { return yearModel;}
    //Method 2
    public static String getCarModel() { return carModel;}
    //Method 3
    public static String getRegNumber() {return regNumber;}
    //Method 4
    public static String getColour() {return colour;}
    //Method 5
    public static int getHorsePower() {return horsePower;}
    //Method 6
    public static String getGearType() {return gearType;}

    /**
     * Prints the car specifications typed in by the user
     */
    public void carSpec(){
        System.out.println("-----Your car specifications-----\n");
        System.out.println("\tCar model: >|" + getCarModel() + "|");
        System.out.println("\tReg.numb:  >|" + getRegNumber() + "|");
        System.out.println("\tYear:      >|" + getYearModel() + "|");
        System.out.println("\tColour:    >|" + getColour() + "|");
        System.out.println("\tH.Power:   >|" + getHorsePower() + "|");
        System.out.println("\tGear:      >|" + getGearType() + "|\n");

    }

    /**
     * Greets the user to the car speed test
     */
    public void Welcome() {
        System.out.println("Welcome to the car speed test");
        JOptionPane.showMessageDialog(null, "Welcome to the car speed test");
    }

    /**
     * @param maxSpeed User puts in the max speed of the car
     * if it goes faster than 60 = first message appear
     * slower than 60 = second message appear
     */
    public void Speed(String maxSpeed) {

            try {
                int snabb = Integer.parseInt(maxSpeed);

                if (snabb > 60) {
                    System.out.println("The max speed of the: " + getYearModel() + " " + getCarModel() + " is: " + snabb + ". It can go faster!");
                } else {
                    System.out.println("The max speed is " + snabb + ". Its to slow");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You typed in wrong characters. \nUse numbers!");
            }
    }

    /**
     * Configure the acceleration to make the car go faster
     * shows the current speed
     */
    public void Accelerate() {
        for (int seconds = 1; seconds <= 3; seconds++) { //"3" the number decides how many loops to do.
            speed += 20; //Decides the interval of the speed ex. 20, 40, 60
            System.out.println("\t>The current speed of the " + getYearModel() + " " + getCarModel() + " is: " + speed + " KM/H");
        }
    }

    /**
     * Slow the car down, and shows the current speed of the car
     */
    public void Brake() {
        System.out.println("\nNo wait... start breaking!\n");
        for (int seconds = 1; seconds <= 3; seconds++) {
            speed -= 20;
            System.out.println("\t>The current speed of the " + getYearModel() + " " + getCarModel() + " is: " + speed + " KM/H");

            if (speed == 0) {
                System.out.println("The car has halted to a stop!\n"); //this is to prevent the same output in every loop.
            }
        }
    }
}
