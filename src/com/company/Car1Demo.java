package com.company;

import javax.swing.*;

public class Car1Demo {
    public static void main(String[] args) {



        Car1 car1 = new Car1(2017, "Audi"); //Type in Year XXXX - then brand/model

        car1.Welcome();

        String mxspd = JOptionPane.showInputDialog("whats the max speed?");


        car1.speed(mxspd);

        Car1.accelerate();

       // System.out.println("No wait... start breaking!");


        Car1.brake();


      //  Car1.CarDef();

    }
}
