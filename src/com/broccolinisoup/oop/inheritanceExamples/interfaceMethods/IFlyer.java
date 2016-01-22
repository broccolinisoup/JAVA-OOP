package com.broccolinisoup.oop.inheritanceExamples.interfaceMethods;

public interface IFlyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
