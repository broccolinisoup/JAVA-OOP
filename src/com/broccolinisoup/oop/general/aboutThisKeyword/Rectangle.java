package com.broccolinisoup.oop.general.aboutThisKeyword;

/*
 * Within an instance method or a constructor, "this" is a reference to the current object
 *  the object whose method or constructor is being called. You can refer to any member of 
 *  the current object from within an instance method or a constructor by using this.
 * */

public class Rectangle {
	private int x, y;
    private int width, height;
       
    /*
     * From within a constructor, you can also use the this keyword to call another constructor 
     * in the same class. Doing so is called an explicit constructor invocation.
     * */
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    
    /*
     * This class contains a set of constructors. Each constructor initializes some or all of the 
     * rectangle's member variables. The constructors provide a default value for any member 
     * variable whose initial value is not provided by an argument. For example, the no-argument 
     * constructor creates a 1x1 Rectangle at coordinates 0,0. The two-argument constructor calls 
     * the four-argument constructor, passing in the width and height but always using the 0,0 coordinates. 
     * As before, the compiler determines which constructor to call, based on the number and the type of arguments.
     * */
    public Rectangle(int x, int y, int width, int height) {
    	/*
    	 * The most common reason for using the this keyword is because 
    	 * a field is shadowed by a method or constructor parameter.
    	 * Each argument to the constructor shadows one of the object's 
    	 * fields — inside the constructor x is a local copy of the 
    	 * constructor's first argument. To refer to the Point field x, 
    	 * the constructor must use this.x.
    	 * */
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
