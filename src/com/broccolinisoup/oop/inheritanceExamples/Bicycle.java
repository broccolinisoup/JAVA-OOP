package com.broccolinisoup.oop.inheritanceExamples;

// Parent Class
public class Bicycle {
	
	// the Bicycle class has three fields
	
	/*
	 * A subclass inherits all of the public and protected members 
	 * of its parent, no matter what package the subclass is in.
	 * If the subclass is in the same package as its parent, 
	 * it also inherits the package-private(no-modifier) members of the parent. 
	 * */
	
	public int gear;
	public int cadence;
	public int speed;
	
	// the Bicycle class has one constructor
	public Bicycle(int startCadence, int startSpeed, int startGear){
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;	
	}
	
	 // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    //Static method. Class method. You should call the static methods by class not by an instance. (Static way)
    public static void testClassMethod() {
    	System.out.println("The static method in Bicycle");
    }
    
    // Instance method -usual method-
    public void testInstanceMethod() {
    	System.out.println("The instance method in Bicycle");
    }
    
    /* Print Statement */
	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:"
				+ gear);
	}

}
