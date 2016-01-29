package com.broccolinisoup.oop.Inheritance.interfaceMethods;

public interface IFlyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
