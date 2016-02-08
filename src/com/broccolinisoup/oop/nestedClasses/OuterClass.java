package com.broccolinisoup.oop.nestedClasses;

// Documentation and examples about accessing to members of enclosing class.
// This is my favourite document!

/* The Java programming language allows you to define a class within another class. 
 * Such a class is called a NESTED CLASS 
 * Nested classes are divided into two categories: static and non-static. Nested 
 * classes that are declared static are called STATIC NESTED CLASSES.  
 * NON - STATIC NESTED CLASSES are called INNER classes.
 */

public class OuterClass {
	private String var1 = "I am a private variable in the outer class";
	protected String var2 = "I am a protected variable in the outer class";
	public String var3 = "I am a public variable in the outer class";
	static String varS = "I am a static variable in the outer class";
	
	static void doSth(){
		class LocalClass{
			/*
			 * Local classes in static methods can 
			 * only refer to static members of the enclosing class.
			 * You can not access var1, var2, var3
			 * */
			String varString = varS;			
		}
	}
	 void doStm(String parameter){
		final String var4 = "I am a final local variable in the outer class";
		String var5 = "I am a local variable in the outer class";
		
		/*
		 * Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces.
		 * You typically find local classes defined in the body of a method.
		 * They cannot define or declare any static members
		 * Local classes are non-static because they have access to instance members of the enclosing block. 
		 * */
		class LocalClass{
			
			void doSth(){	
				/*
				 * A local class has access to the members of its enclosing class.(var1 , var2 , var3)
				 * A local class has access to local variables that are declared final! (var4)
				 * */
				String result = var1 + var2 + var3 + var4;
				/*
				 * However, starting in Java SE 8, a local class can access local variables and parameters 
				 * of the enclosing block that are final or effectively final. A variable or parameter whose
				 * value is never changed after it is initialized is effectively final. 
				 * */
				result = var5; // It is Okay
				// But if you try to change var5, you will get a compile time error
				// var5 = "armagan";
				//Starting in Java SE 8, if you declare the local class in a method, it can access the method's parameters. 
				result = parameter;	
			}
		}
	}
	
	static class StaticNestedClass {
        String lastString;
        
        /*
         * If you try to write this belov function, you will get a compile time error.
         * Because;
         * Static nested classes do not have access to other members of the enclosing class. 
        public void writeSmt(){
        	var3 = var1 + var2;
        }
        */
        /*
         * If you create an instance of the outer class you can access all members of it! 
         * I found it interesting and send a twit about this :)
         * */
		public void write(){
			OuterClass oc = new OuterClass();
			lastString = oc.var1 + oc.var2 + oc.var3 + oc.varS;
	    }
		
    }
    class InnerClass {
        /*
         * Non-static nested classes (inner classes) have access to other 
         * members of the enclosing class, even if they are declared private.
         * They cannot define or declare any static members
         * */
    	public void write(){
        	var3 = var1 + var2 + varS;
        }
    	
    }

}
