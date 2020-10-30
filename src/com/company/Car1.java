package com.company;

public class Car1 {
    int yearModel;
    String make;
    int speed;

    public int getYearModel() {
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public void accelerate(){
        speed += 5;
    }
    public void brake(){
        speed -= 5;
    }

    public void speed(int maxSpeed) {
        System.out.println("The car can go faster than 25!");
        System.out.println("Max speed is: " + maxSpeed + ". Keep going!!");
    }

    public Car1 (int yearModelGiven, String makeGiven) {
        yearModel = yearModelGiven;
        make = makeGiven;
        speed=0;
    }

}
