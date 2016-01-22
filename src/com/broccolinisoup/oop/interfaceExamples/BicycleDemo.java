package com.broccolinisoup.oop.interfaceExamples;

public class BicycleDemo {
	public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        BicycleVol2 bike2 = new BicycleVol2();

        bike1.speedUp(10);
        bike1.changeGear(2);
        //bike1.printStates();
        
        bike2.changeCadence(3);
        bike2.changeGear(2);
        bike2.speedUp(10);
        bike2.applyBrakes(3);
        bike2.printStates();
        bike2.didItWork();
    }
}
