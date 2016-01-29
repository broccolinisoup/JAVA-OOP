package com.broccolinisoup.oop.polymorphism;

public class Demo {
	public static void main(String[] args) {
		Product dress = new Dress("Vintage", 100, "Coton", 12);
		Product phone = new MobilePhone("Iphone", 2000, "Apple", "6S");
		
		Basket basket = new Basket();
		
		basket.addToBasket(phone);
		basket.addToBasket(dress);
		
		System.out.println("The total proce of the basket is: " + basket.calculateTotalPrice() );
		System.out.println("Within a class, a field that has the same name as a field"
						 + " in the superclass hides the superclass's field, even if their"
						 + " types are different. So the trialConstant in Product class is"
						 + " hiding the trialConstant in Dress" + dress.trialConstant);
	}

}
