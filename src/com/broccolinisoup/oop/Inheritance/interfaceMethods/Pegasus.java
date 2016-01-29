package com.broccolinisoup.oop.Inheritance.interfaceMethods;

/*Default methods and abstract methods in interfaces are inherited 
 * like instance methods. However, when the supertypes of a class 
 * or interface provide multiple default methods with the same signature,
 * the Java compiler follows inheritance rules to resolve the name conflict.
 */

/* Extend a Horse class, implements two interfaces which are IFlyer, IMythical
 ********
 * Instance methods are preferred over interface default methods.
 * */


public class Pegasus extends Horse implements IFlyer, IMythical {
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
    
    // So the output is 'I am a horse' which is come from Horse Class (instance method)
}
