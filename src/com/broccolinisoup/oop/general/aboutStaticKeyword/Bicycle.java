package com.broccolinisoup.oop.general.aboutStaticKeyword;

/*
 * Each Bicycle object has its own values for these variables, stored in different memory locations.
 * Sometimes, you want to have variables that are common to all objects. This is accomplished with the static modifier.
 * */

public class Bicycle {
    
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;
        
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }
    
    /* A common use for static methods is to access static fields. */
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
    
    /*
     * -Instance methods can access instance variables and instance methods directly.
     * -Instance methods can access class variables and class methods directly.
     * -Class methods can access class variables and class methods directly.
     * -Class methods cannot access instance variables or instance methods directly—they 
     * must use an object reference. Also, class methods cannot use the this keyword as 
     * there is no instance for this to refer to.
     * */

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
        
}