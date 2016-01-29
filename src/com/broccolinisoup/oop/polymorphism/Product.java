package com.broccolinisoup.oop.polymorphism;

public class Product {
	public String productName;
	public double productPrice;
	
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
