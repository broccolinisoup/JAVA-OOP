package com.broccolinisoup.beginning;

/* An example of "INTERFACE" */

/*
 * An interface is a group of constants, method signatures that
 * means empty body, default methods and static methods. Interfaces
 * provide abilities to classes that implements them. So, a class 
 * become more formal about the behaviours it promises to provide.
 * 
 * */

public interface IBicycle {
	
	final int a  = 0;
	
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
	
	/*
	 * If you want to add another method to your interface, then all the classes that that implement the old 
	 * interface version will break. So, you have 2 options.
	 * 1) You could create a new interface that extends the old one (There is no example about this which is so clear)
	 * 2) You could define 'default' or 'static' method. - This feature has came with Java 8 -
	 * 
     * Default methods enable you to add new functionality 
     * to the interfaces of your libraries and ensure binary 
     * compatibility with code written for older versions of those interfaces.
     * You can override the default method like the other all interface method
     * */
	
	default void didItWork() {
	       System.out.print("I am a default method that will save your life! Thanks Java 8");
	   }
	

}
