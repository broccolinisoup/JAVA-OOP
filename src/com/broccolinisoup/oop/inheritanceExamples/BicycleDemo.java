package com.broccolinisoup.oop.inheritanceExamples;

public class BicycleDemo {
	
	public static void main(String[] args) {
		
		Bicycle bike = new Bicycle(0,0,1);
		MountainBike mBike = new MountainBike(5, 0, 0, 1);
		Bicycle bike2 = new MountainBike(5, 0, 0, 1);
		
		Bicycle.testClassMethod();
		MountainBike.testClassMethod();
		bike.testInstanceMethod();
		mBike.testInstanceMethod();
		bike2.testInstanceMethod();
		
		mBike.setCadence(3);
		mBike.setGear(2);
		mBike.speedUp(10);
		mBike.applyBrake(3);
		mBike.printStates();
		
		
	}
	
	

}
