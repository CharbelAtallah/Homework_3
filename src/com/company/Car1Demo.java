package com.company;

public class Car1Demo {
    public static void main(String[] args) {

        //Mfix something that makes the user put in.-Terminal or dialogue 
        Car1 car1 = new Car1(2017, "Audi");


        for (int seconds = 1; seconds <= 5; seconds++) {
            car1.accelerate();
            System.out.println("The current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is: " + car1.speed + " KM/H");
        }


        car1.speed(200);
        System.out.println("No wait... start breaking!");

        for (int seconds = 1; seconds <= 5; seconds++) {
            car1.brake();
            System.out.println("The current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is: " + car1.speed + " KM/H");

            if (car1.speed == 0) {
                System.out.println("The car has halted to a stop!");
            }
        }


    }
}
