package com.broccolinisoup.oop.general.aboutStaticKeyword;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	private static List<Bicycle> myBikes = new ArrayList<Bicycle>();
	 
	
	public static void main(String[] args) {
		List<Bicycle> myBikes = new ArrayList<Bicycle>();
		
		Bicycle bike1 = new Bicycle(1, 0, 3);
		myBikes.add(bike1);
		Bicycle bike2 = new Bicycle(6, 4, 4);
		myBikes.add(bike2);
		Bicycle bike3 = new Bicycle(3, 0, 2);
		myBikes.add(bike3);
		Bicycle bike4 = new Bicycle(2, 7, 5);
		myBikes.add(bike4);
		
		for (Bicycle bike : myBikes){
			System.out.println("Id of the bike: " + bike.getID());
		}
		
		System.out.println("Total number of my bikes are " + Bicycle.getNumberOfBicycles());
		
		// You also can use this unless the numberOfBicycles is private
		//System.out.println("Total number of my bikes are " + Bicycle.numberOfBicycles);
		
		
		
		
	}

}
