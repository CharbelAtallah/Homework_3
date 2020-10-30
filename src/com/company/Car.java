package com.company;


import javax.swing.*;

public class Car {

    public static void CarDef(){
       while (true) {
           String make1= JOptionPane.showInputDialog("Whats the name of the car?");
           String make2= JOptionPane.showInputDialog("Whats the reg of the car?");
           String make3= JOptionPane.showInputDialog("Whats the horsepower of the car?");
           System.out.println("the name of the car is :" + make1);
           System.out.println("the reg of the car is :" + make2);
           System.out.println("the horsepower of the car is :" + make3);
           break;
        }



    }





    public void carSpec1() {
        String regNr = "YHE 380";
        String märke = "Audi A3 Sportback";
        int årsmodell = 2017;
        int tjänstevikt = 1255;
        int motoreffekt = 116;

        System.out.println("Reg nr: " + regNr + "\n" + "Bil märke: " + märke + "\n" + "Årsmodell: " + årsmodell + "\n" +
                "Totala tjänstevikt: " + tjänstevikt + "\n" + "Antalet hästkrafter: " + motoreffekt);
    }



    public void speed(int maxSpeed) {

        System.out.println("Max speed is: " + maxSpeed);
    }

   // public void gear(int gears){

   // }
}

