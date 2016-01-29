package com.broccolinisoup.oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	public List<Product> productsInBasket  = new ArrayList<Product>();
	
	
	public void addToBasket(Product product){
		productsInBasket.add(product);
	}
	
	/*The Java virtual machine (JVM) calls the appropriate method
	 * for the object that is referred to in each variable. It does not call
	 * the method that is defined by the variable's type. This behavior is 
	 * referred to as virtual method invocation and demonstrates an aspect of 
	 * the important polymorphism features in the Java language.
	 */
	public double calculateTotalPrice(){
		double totalPrice = 0 ;

		for(Product p: productsInBasket){
			 totalPrice += p.productPrice + p.calculateVat();
		}
		
		return totalPrice;
	}
	
}
