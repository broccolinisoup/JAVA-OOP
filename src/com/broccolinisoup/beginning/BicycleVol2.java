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

public class BicycleVol2 implements IBicycle{

	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;
	
	/* Setters and Getters */
	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	// Compare to Bicycle Class all these below methods came here with the interface implementation.
	// You can override it (Specify)

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
	
	// You can override the default method, if not you call the default method in the interface.
	@Override
	public void didItWork(){
		System.out.println("I am coming from BicycleVol2 class not from the interface");
	}
	
	void printStates() {
        System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
   }

	
}
