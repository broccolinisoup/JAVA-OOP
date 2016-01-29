package com.broccolinisoup.oop.interfaceExamples;

/*
 * Encapsulation means that variables and methods of 
 * a class are wrapped and hidden from other classes 
 * and these classes can be accessed only through the 
 * methods of their class.
 * Encapsulation is also know as 'data hiding'.
 * */

public class Bicycle {

	/* If we do not write any access modifiers to a variable, 
	 * it takes no-modifier type which can be accessed from the class and the package that the variable is defined in.
	* */
	
	// If we do not want our variables to be changed by others, we should make them private.
	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;
	
	/* After you define your variables private, 
	* them can never be accessed by any other classes.
	* If you want to be accessed, the only thing you 
	* need to do create public get (to read) and set (to write) methods.*/
	
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

	// You can not see these methods (changeGear, speedUp and applyBrakes) in Vol2.
	// We will do all this stuff with interface
	void changeGear(int newValue) {
		speed = newValue;

	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	/* Print Statement */
	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:"
				+ gear);
	}

	
}
