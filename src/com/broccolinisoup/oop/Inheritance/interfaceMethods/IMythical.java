package com.broccolinisoup.oop.Inheritance.interfaceMethods;

public interface IMythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
