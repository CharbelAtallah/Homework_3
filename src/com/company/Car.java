package com.company;



public class Car {
    public void carSpec() {
        String regNr = "YHE 380";
        String märke = "Audi A3 Sportback";
        int årsmodell = 2017;
        int tjänstevikt = 1255;
        int motoreffekt = 116;

        System.out.println("Reg nr: " + regNr + "\n" + "Bil märke: " + märke + "\n" + "Årsmodell: " + årsmodell + "\n" +
                "Totala tjänstevikt: " + tjänstevikt + "\n" + "Antalet hästkrafter: " + motoreffekt);
    }



    public void speed(int maxSpeed) {
        System.out.println("The car is going as fast as it can!");
        System.out.println("Max speed is: " + maxSpeed);
    }

   // public void gear(int gears){

   // }
}

