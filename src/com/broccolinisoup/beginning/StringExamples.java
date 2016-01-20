package com.broccolinisoup.beginning;

public class StringExamples {
	public static void main(String[] args) {
	
		// These two have the same value
		// new String("test").equals("test") // --> true 

		// ... but they are not the same object
		// new String("test") == "test" // --> false 

		// ... neither are these
		// new String("test") == new String("test") // --> false 

		// ... but these are because literals are interned by 
		// the compiler and thus refer to the same object
		// "test" == "test" // --> true 

		// checks for nulls and calls .equals()
		// Objects.equals("test", new String("test")) // --> true
		// Objects.equals(null, "test") // --> false
		
		String str1 = new String("test"); //always create a new object on the heap
		String str2 = "test"; // uses the String pool
		// To avoid creating unnecesary objects on the heap use the second form.
		String str3 = "test";
		
		
		if(str2 == str3)
			System.out.print("equals");
		else
			System.out.print("not");
		
		
		String start = "Hello";
	    String end = start.concat(" World!");
	    System.out.println(end);
	    
	    if(start == end)
			System.out.print("equals");
		else
			System.out.print("not");
		
		}
	
		// perfect tutorial http://www.javaranch.com/journal/200409/ScjpTipLine-StringsLiterally.html
	
	
	
	

}
