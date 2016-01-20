package com.broccolinisoup.beginning;

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
