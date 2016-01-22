package com.broccolinisoup.oop.inheritanceExamples.basic;

/*
 * Excepting Object, which has no superclass, every class has one and 
 * only one direct superclass (single inheritance). In the absence of 
 * any other explicit superclass, every class is implicitly a subclass of Object.
 * 
 * A subclass inherits all the members (fields, methods, and nested classes) from 
 * its superclass. Constructors are not members, so they are not inherited by subclasses,
 * but the constructor of the superclass can be invoked from the subclass with super keyword.
 * */

// Subclass of the parent class Bicycle
public class MountainBike extends Bicycle {
	
	// the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }  
    
    @Override
    public void applyBrake(int decrement) {
    	speed = 0;
    	super.applyBrake(decrement);
    }
    
    
    /*
     * You can write a new static method in the subclass that has the same signature as the one
     *  in the superclass, thus hiding it.
     * */
    public static void testClassMethod() {
        System.out.println("The static method in MountainBike");
    }
    
    /*
     * You can write a new instance method in the subclass that has the same signature as the one in the superclass,
     *  thus overriding it.
     * */
    public void testInstanceMethod() {
        System.out.println("The instance method in MountainBikes");
    }

}
