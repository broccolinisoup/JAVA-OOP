package com.broccolinisoup.beginning;

public class BicycleDemo {
	public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        SalcanoBicycle bike3 = new SalcanoBicycle();
        // Invoke methods on 
        // those objects
        
        bike1.speedUp(10);
        bike1.changeGear(2);
       // bike1.printStates();

        
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.speedUp(10);
        bike2.changeGear(3);
        //bike2.printStates();
        
        bike3.changeCadence(3);
        bike3.changeGear(2);
        //bike3.speedUp(10);
        bike3.applyBrakes(3);
        bike3.printStates();
    }
}
