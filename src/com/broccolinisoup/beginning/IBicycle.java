package com.broccolinisoup.beginning;

/* An example of "INTERFACE" */

/*
 * An interface is a group of constants, method signatures that
 * means empty body, default methods and static methods. Interfaces
 * provide abilities to classes that implements them. So, a class 
 * become more formal about the behaviours it promises to provide.
 * 
 * */

public interface IBicycle {
	
	final int a  = 0;
	
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
	
	default void didItWork(int i, double x, String s) {
	       // Method body 
	   }

}
