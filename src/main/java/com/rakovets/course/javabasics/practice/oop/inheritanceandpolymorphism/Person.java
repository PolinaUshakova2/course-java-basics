package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Person {
    public double happiness;

    public Person(double happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(double percentHappiness) {
        this.happiness -= percentHappiness;
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }
}
