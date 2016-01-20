package com.broccolinisoup.beginning;

/* A Class that implements the Bicycle Interface */
/*
 * You need to fill the empty bodies of interfaces’ 
 * methods in the class. So, you can specify all 
 * implemented methods. Interfaces are like the 
 * contracts. If a class implements an interfaces, 
 * it makes a deal – a contract – with the interface. 
 * 
 * A class accept that I consist of all of the 
 * interface’s methods. In other words, compilation
 * will fail if those methods are missing from the 
 * class that implements the interface.
 * All constant values defined in an interface are
 * implicitly PUBLIC, STATIC and FINAL.
 * Because they must be public in the class
 * that implements the interface.
 * 
 * Interfaces cannot be instantiated. 
 * They can only be implemented by classes and extended by other interfaces. 
 * While a class can extend only one another class, 
 * an interface can extend any number of interfaces.
 * 
 * */

public class SalcanoBicycle implements IBicycle{

	int cadence = 0;
	int gear = 1;
	int speed = 0;
	
	
	@Override
	public void changeCadence(int newValue) {
		this.cadence = newValue;
		
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
		
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
		
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
		
	}
	
	void printStates() {
        System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
   }

}
