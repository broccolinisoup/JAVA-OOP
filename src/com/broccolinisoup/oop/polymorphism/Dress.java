package com.broccolinisoup.oop.polymorphism;

public class Dress extends Product {
	public String fabricType;
	public int size;
	public String trialConstant = "I am a trial in Dress";
	
	public Dress(String productName, double productPrice, String fabricType,int size){
		super(productName, productPrice);
		this.fabricType = fabricType;
		this.size = size;
	}
	
	/* If we do not override this function, dress object will call and use the calculateVat method
	 * in the base class which is Product. We override calculateVat method in subclasses
	 * because every product has different Vat.
	 * This subclass defined their own unique behaviors */
	
	@Override
	public double calculateVat(){
		return productPrice * 0.03;
	}

}
