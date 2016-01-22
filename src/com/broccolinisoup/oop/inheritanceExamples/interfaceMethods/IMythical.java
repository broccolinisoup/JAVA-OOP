package com.broccolinisoup.oop.inheritanceExamples.interfaceMethods;

public interface IMythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
