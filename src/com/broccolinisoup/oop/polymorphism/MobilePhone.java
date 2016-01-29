package com.broccolinisoup.oop.polymorphism;

public class MobilePhone extends Product {
	
	public String brand;
	public String model ;
	
	public MobilePhone(String productName, double productPrice, String brand,String model){
		super(productName, productPrice);
		this.brand = brand;
		this.model = model;
	}
	
	/* If we do not override this function, dress object will call and use the calculateVat method
	 * in the base class which is Product. We override calculateVat method in subclasses
	 * because every product has different Vat.
	 * This subclass defined their own unique behaviors */
	@Override
	public double calculateVat(){
		return productPrice * 0.1;
	}

}
