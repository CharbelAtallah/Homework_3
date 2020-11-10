package com.company;

import javax.swing.*;

public class Car1Demo {
    public static void main(String[] args) {
        /*
         * Type in
         * 1. year model (2020)
         * 2. car model (Audi)
         * 3. registration (ABC123)
         * 4. Colour (Black)
         * 5. Horsepower (512)
         * 6. gear Type (Manuel // Automatic)
         */
        CreateCar car1 = new CreateCar(2017, "Audi", "ABC123", "Black", 513, "Automatic");


        car1.carSpec();
        car1.Welcome();
        String pace = JOptionPane.showInputDialog("whats the max speed?");
        car1.Speed(pace);
        car1.Accelerate();
        car1.Brake();
    }
}
