package com.broccolinisoup.oop.Inheritance.returningValueExamples;

/* RETURNING A CLASS*/

/*
 * When a method uses a class name as its return type, 
 * the class of the type of the returned object must be
 * either a subclass of, or the exact class of, the return type. 
 * Suppose that you have a class hierarchy in which ImaginaryNumber
 * is a subclass of java.lang.Number, which is in turn a subclass of Object.
 * */

public class ImaginaryNumber extends Number {

	private int yourImaginaryNumber;
	private String yourImaginaryNumber2;

	public ImaginaryNumber(int yourSecretNumber) {
		int randomValue = (int) Math.random();
		this.yourImaginaryNumber = randomValue / yourSecretNumber;
	}
	
    // Now suppose that you have a method declared to return a Number
	public Number returnYourImaginaryNumber() {

		return yourImaginaryNumber;
		/* The returnYourImaginaryNumber method returns an ImaginaryNumber but not an Object. 
		 * ImaginaryNumber is a Number because it's a subclass of Number. 
		 * However, an Object is not necessarily a Number */
	}
	
	/* This technique, called covariant return type, means that the return type is allowed to
	 * vary in the same direction as the subclass. */

	/* You should implement the abstract methods of the Number Class which is an abstract class
	 * They are invisible on Github to increase readability . */

}
