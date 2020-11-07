package com.company;

import javax.swing.*;

public class Car1Demo {
    public static void main(String[] args) {
//Todo lägg till fler egenskaper för bilen. följ spåret från regnummer.


        CreateCar car1 = new CreateCar(2017, "Audi", "ABC123"); //Type in Year XXXX - then brand/model
       // CreateCar car2 = new CreateCar(1995, "Toyota", );

        car1.carSpec();
        car1.Welcome();
        String mxspd = JOptionPane.showInputDialog("whats the max speed?");
        car1.Speed(mxspd);
        car1.Accelerate();
        car1.Brake();

        /*
        car2.Welcome();
        JOptionPane.showInputDialog("Whats the max speed? ");
        car2.Speed(mxspd);
        car2.Accelerate();
        car2.Brake();

         */


        //Fattar inte varför de båda skrivs samma sak.

    }
}
