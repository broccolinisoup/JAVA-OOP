package com.broccolinisoup.beginning;

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
