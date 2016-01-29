package com.broccolinisoup.oop.polymorphism;

public class Product {
	public String productName;
	public double productPrice;
	
	/*
	 * Variables are not polymorphic in Java; they do not override one another.
	 * When you make a variable of the same name in a subclass, that's called hiding. 
	 * You can see the example in Demo class
	 * */
	public String trialConstant = "I am a trial in Product";
	
	public Product(){}
	public Product(String productName, double productPrice){
		this.productName = productName;
		this.productPrice  = productPrice;
	}
	/*
	 * This is a calculateVat. We will override this method in subclasses
	 * If you have a method in base class which is overrided and used in different types 
	 * in the subclasses, this method has a polymorphic sructure.
	 * For more formal definition;
	 * Polymorphisim ; subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.
	 * */
	public double calculateVat(){
		return productPrice * 0.08;
	}

}
